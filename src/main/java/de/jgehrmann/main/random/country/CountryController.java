package de.jgehrmann.main.random.country;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jgehrmann on 25.09.17.
 */
@RestController
@CrossOrigin
public class CountryController {

    @RequestMapping(path = "/country", method = RequestMethod.GET)
    public String randomCountry(){
        Faker faker = new Faker();
        return faker.address().country();
    }
}
