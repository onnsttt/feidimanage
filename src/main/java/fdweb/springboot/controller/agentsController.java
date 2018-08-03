package fdweb.springboot.controller;

import fdweb.springboot.server.AgentsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/agent")
public class agentsController {

    @Autowired
    private AgentsServiceImp agentsServiceImp;


}
