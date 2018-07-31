package fdweb.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControlle {

//    @Value("${name}")
//    private String name;
//
//    @Value("${age}")
//    private Integer age;

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("now","123");
        return "hello";
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("main");
        modelAndView.addObject("test","tets");
        return modelAndView;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String tt(){
        return "ttfdsafdsa";
    }
}
