package de.jgehrmann.main.random.color;

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
public class ColorController {

    @RequestMapping(path = "/color-name",method = RequestMethod.GET)
    public String randomColor(){
        Faker faker = new Faker();
        return faker.color().name();
    }
}
