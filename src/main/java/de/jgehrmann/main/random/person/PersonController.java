package de.jgehrmann.main.random.person;

import com.github.javafaker.Faker;
import de.jgehrmann.main.utils.RandomIntegerGenerator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.HashPrintJobAttributeSet;

/**
 * Created by jgehrmann on 25.09.17.
 */
@RestController
@CrossOrigin
public class PersonController {

    @RequestMapping(path = "/person", method = RequestMethod.GET)
    public Person randomPerson() {
        Faker faker = new Faker();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();

        int age = RandomIntegerGenerator.generateInteger(100, 1);
        int height = RandomIntegerGenerator.generateInteger(230, 60);
        int weight = RandomIntegerGenerator.generateInteger(300, 45);

        return new Person(firstname, lastname, age, height, weight);
    }
}
