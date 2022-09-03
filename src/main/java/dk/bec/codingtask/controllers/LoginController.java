package dk.bec.codingtask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value = {"", "/", "/login"}, method = RequestMethod.GET)
    public String getLoginPage(){
        return "login";
    }

    @RequestMapping(value = {"", "/", "/login"}, method = RequestMethod.POST)
    public String getPage(@RequestParam("login") String login){
        if(login.equals("siema")){
            System.out.println("login prawidlowy");
        }else{
            System.out.println("źle");
        }
        return "index";
    }

}
