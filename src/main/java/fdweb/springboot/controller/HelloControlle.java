package fdweb.springboot.controller;

import fdweb.springboot.server.AgentsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloControlle {

    @Autowired
    AgentsServiceImp agentsServiceImp;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(agentsServiceImp.login(username,password)){
            ModelAndView modelAndView = new ModelAndView("main");
            session.setAttribute("username",username);
            session.setAttribute("rank","1");
            return modelAndView;
        }
        return new ModelAndView("index");
    }


    @RequestMapping("/test")
    @ResponseBody
    public String tt(){
        return "ttfdsafdsa";
    }
}
