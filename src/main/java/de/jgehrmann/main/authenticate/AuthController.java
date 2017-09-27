package de.jgehrmann.main.authenticate;

import org.springframework.web.bind.annotation.*;

/**
 * Created by jgehrmann on 13.09.17.
 */
@RestController
@CrossOrigin
public class AuthController {

    /**
     * Defines a endpoint to test your Authorization mechanism.
     *
     * @param authorization header containing username:password
     * @return successmessage
     */
    @RequestMapping(path = "/authorization", method = RequestMethod.GET)
    public String authenticate(@RequestHeader(value = "authorization") String authorization) {

        if (!authorization.isEmpty() && !authorization.equals("")) {

            String creadentials[] = authorization.split(":");
            String username = creadentials[0];
            String passphrase = creadentials[1];

            return "You tried to authenticate using the following header: \nHeadername: Authorization\nusername: " + username + "\npassphrase: " + passphrase;
        } else {
            return "Please specify a Authorization header to test your basic auth mechanism.";
        }
    }
}
