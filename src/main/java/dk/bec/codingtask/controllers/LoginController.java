package dk.bec.codingtask.controllers;

import dk.bec.codingtask.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private LoginService loginService;
    private boolean failedToLogin = false;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = {"", "/", "/login"}, method = RequestMethod.GET)
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(value = {"", "/", "/login"}, method = RequestMethod.POST)
    public String getPage(@RequestParam("login") String login, @RequestParam("password") String password, Model model) {

        if (!loginService.validateLoginAndPassword(login, password)) {
            failedToLogin = true;
            model.addAttribute("failedToLogin", failedToLogin);
            return "login";
        }

        failedToLogin = false;
        return "index";


    }


}
