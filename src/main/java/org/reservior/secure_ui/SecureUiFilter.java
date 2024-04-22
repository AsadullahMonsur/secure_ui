package org.reservior.secure_ui;


import java.io.IOException;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter
public class SecureUiFilter implements Filter {
    private int ice_bar = 1;
    private int ice = 0;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                                                throws IOException, ServletException {

        System.out.println("pre-filter beggins");

        HttpServletRequest hsrequest = (HttpServletRequest) request;
        HttpServletResponse hsresponse = (HttpServletResponse) response;
        HttpSession session = hsrequest.getSession(false);

        System.out.println("Remote Host:"+hsrequest.getRemoteHost());
        System.out.println("Remote Address:"+hsrequest.getRemoteAddr());
        System.out.println("Requested Path:"+hsrequest.getRequestURI());

        hsresponse.setHeader("cache-control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        hsresponse.setHeader("pragma", "no-cache"); // HTTP 1.0.
        hsresponse.setDateHeader("expires", 0); // Proxies.

        if(session!=null){
            if(session.getAttribute("ice")==null){
                session.setAttribute("ice",0);
            }
            ice = (int) session.getAttribute("ice");
            System.out.println("ice_bar: "+ice_bar+" ^^^ ice:"+ice);

            if(!hsrequest.getRequestURI().contains(".")){
                if(ice==ice_bar) {
                    System.out.println("ice = icebar");

                }
                else {
                    System.out.println("ice not = icebar");
                    ice_bar = ice;
                }
            }

        }
        else {
            System.out.println("null session");
        }

        if(hsrequest.getCookies()!=null){
            for(int i= 0; i<hsrequest.getCookies().length;i++){
                hsrequest.getCookies()[i] = eliminate_cookies(hsrequest.getCookies()[i]);
            }
        }

        System.out.println("pre-filter ends  \n" +" filter begins");
        chain.doFilter(request, response);
        System.out.println("filter ends  \n  *****  \n \n");
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
