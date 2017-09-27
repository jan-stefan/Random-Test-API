package de.jgehrmann.main.authenticate;

import org.springframework.web.bind.annotation.*;

/**
 * Created by jgehrmann on 13.09.17.
 */
@RestController
@CrossOrigin
public class AuthController {

    /**
     * Defines a endpoint to test your authentication mechanism.
     *
     * @param authentication header containing username:password
     * @return successmessage
     */
    @RequestMapping(path = "/authenticate", method = RequestMethod.GET)
    public String authenticate(@RequestHeader(value = "authentication") String authentication) {

        if (!authentication.isEmpty() && !authentication.equals("")) {

        String creadentials[] = authentication.split(":");
        String username = creadentials[0];
        String passphrase = creadentials[1];

        return new String("You tried to authenticate using the following header: \nHeadername: authentication\nusername: " + username + "\npassphrase: " + passphrase);
        }else {
            return "Please specify a authentication header to test your basic auth mechanism.";
        }
    }
}
