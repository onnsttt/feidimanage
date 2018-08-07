package fdweb.springboot.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        String username = (String) request.getSession().getAttribute("username");
//        String random  = (String) request.getSession().getAttribute("random");
//        String rank = (String) request.getSession().getAttribute("rank");
//        if(username==null||random==null||rank==null){
//            response.sendRedirect("/");
//            return false;
//        }
//        if(Integer.parseInt(rank)>5){
//            response.sendRedirect("/");
//            return false;
//        }
//        if(Integer.parseInt(random)<1234){
//            response.sendRedirect("/");
//            return false;
//        }
        if(username==null){
            response.sendRedirect("/");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}
