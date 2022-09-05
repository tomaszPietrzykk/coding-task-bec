package dk.bec.codingtask.services;

import java.util.HashMap;
import java.util.Map;

public abstract class LoginService {

    protected final Map<String, String> loginData = new HashMap<>();

    public LoginService() {
        loginData.put("admin", "admin");
    }

    public boolean validateLoginAndPassword(String login, String password) {
        return false;
    }
}
