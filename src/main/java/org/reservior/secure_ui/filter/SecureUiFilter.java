package org.reservior.secure_ui.filter;


import java.io.IOException;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;

@WebFilter
public class SecureUiFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                                                throws IOException, ServletException {

//        System.out.println("pre-filter beggins");

        HttpServletRequest hsrequest = (HttpServletRequest) request;
        HttpServletResponse hsresponse = (HttpServletResponse) response;
        HttpSession session = hsrequest.getSession(false);

//        System.out.println("Remote Host:"+hsrequest.getRemoteHost());
//        System.out.println("Remote Address:"+hsrequest.getRemoteAddr());
//        System.out.println("Requested Path:"+hsrequest.getRequestURI());
//        System.out.println("Requested URL:"+hsrequest.getRequestURL());

        String secure_url = "";

        if(!hsrequest.isSecure()){
            String data = hsrequest.getRequestURL().toString();
            String []range = data.split(":");

            if(range[0].equals("http")){
                 String modification = data.replace("http","https");
                 if(data.contains("8080")){
                     modification = modification.replace("8080","7298");
                 }

                 secure_url = modification;
            }
            else {
                secure_url = data;
            }

//            System.out.println("Redirected URL:"+secure_url);
            hsresponse.sendRedirect(secure_url);
            return;
        }


        for (String s:FilterRestrictedSites.get_restricted_page_list()){
            if (hsrequest.getRequestURL().toString().contains(s)){
                System.out.println("Found it as restriction");
                //hsresponse.sendRedirect("/account");
            }
        }

        hsresponse.setHeader("cache-control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        hsresponse.setHeader("pragma", "no-cache"); // HTTP 1.0.
        hsresponse.setDateHeader("expires", 0); // Proxies.

        if(session!=null){
            System.out.println("Active session");
        }
        else {
            System.out.println("Null session");
        }

        if(hsrequest.getCookies()!=null){
            for(int i= 0; i<hsrequest.getCookies().length;i++){
                hsrequest.getCookies()[i] = eliminate_cookies(hsrequest.getCookies()[i]);
            }
        }

//        System.out.println("pre-filter ends  \n" +" filter begins");
        chain.doFilter(request, response);
//        System.out.println("filter ends  \n  *****  \n \n");
    }

    public Cookie eliminate_cookies(Cookie cookie) {
        cookie.setValue("");
        cookie.setPath("/");
        cookie.setMaxAge(0);

        return cookie;
    }


    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

}
