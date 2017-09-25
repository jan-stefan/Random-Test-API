package de.jgehrmann.main.random.name;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * Created by jgehrmann on 13.09.17.
 */
@RestController
@CrossOrigin
public class NameController {
    private Faker faker = new Faker();

    @RequestMapping(path = "/firstname",method = RequestMethod.GET)
    public String randomFirstName() {
        return this.faker.name().firstName();
    }

    @RequestMapping(path = "/lastname",method = RequestMethod.GET)
    public String randomSurName(){
        return this.faker.name().lastName();
    }

}
