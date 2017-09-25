package de.jgehrmann.main.random.person;

import com.github.javafaker.Faker;
import de.jgehrmann.main.utils.RandomIntegerGenerator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jgehrmann on 25.09.17.
 */
@RestController
@CrossOrigin
public class PersonController {

    @RequestMapping(path = "/person",method = RequestMethod.GET)
    public Person randomPerson(){
        Faker faker = new Faker();
        RandomIntegerGenerator randomInteger = new RandomIntegerGenerator();

        return null;
    }
}