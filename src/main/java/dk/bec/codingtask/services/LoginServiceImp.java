package dk.bec.codingtask.services;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp extends LoginService{


    private boolean validateLogin(String login){
        return super.loginData.containsKey(login);
    }

    public boolean validateLoginAndPassword(String login, String password){
        if(!validateLogin(login)){
            return false;
        }
        return loginData.get(login).equals(password);
    }
}
