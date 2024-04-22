package org.reservior.secure_ui.zones;

public class Notes {
// for JSP we need to add library Tomcat Jasper as additional in maven or gradle
// version of tomcat can be found from terminal after run
/* for jsp :
  spring.mvc.view.prefix = /
  spring.mvc.view.suffix = .jsp
*/

/*
thymeleaf needs web link at the top
normal html does not require extra action,

if we use post mapping-
thymeleaf form require th:action="@{the name of the view that is called}"

 */

/*
css file placed under path:  resources/static/css
    <link rel="stylesheet"
          href="../static/css/file_name.css"
          th:href="@{/css/file_name.css}">
*/

/*
comment in html:
< !╌  write here ╌>
*/


/*
  css comments
*/

/*
security.require-ssl=true
server.ssl.key-store-type=jks
server.ssl.key-store=classpath:secureui.jks
server.ssl.key-store-password=11Bb5t23
server.ssl.key-alias=secureui
server.ssl.key-password=11Bb5t23

server.error.path=/too_much_curious
spring.thymeleaf.enabled =true


spring.thymeleaf.cache=false
spring.cache.type=none

spring.web.resources.chain.cache=false
spring.web.resources.cache-period=0
spring.web.resources.cache.cachecontrol.cache-private=true
spring.web.resources.cache.cachecontrol.no-cache=true
spring.web.resources.cache.cachecontrol.no-store=true
spring.web.resources.cache.cachecontrol.max-age=0
spring.web.resources.cache.cachecontrol.must-revalidate=true
spring.web.resources.cache.use-last-modified=false
spring.web.resources.static-locations=classpath:/static/

spring.session.timeout=0
spring.session.store-type=none

server.servlet.session.cookie.http-only=true
server.servlet.session.cookie.max-age=0
server.servlet.session.timeout=0
server.servlet.session.tracking-modes=cookie  //url tracking off  -> options cookie, SSL, URL
server.servlet.session.cookie.secure=true    //http vs https/SSL

server.port=7298
server.address=192.168.22.37

*/

/*
    <meta http-equiv="cache-Control" content="max-age=0,no-cache, no-store, must-revalidate,private">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="expires" content="-1">  //-1 for browser exit, 0 for tab exit
*/
}
