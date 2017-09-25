package de.jgehrmann.main.random.address;

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
public class AdressController {

    @RequestMapping(path = "/adress", method = RequestMethod.GET)
    public AdressDTO randomAdress(){
        Faker faker = new Faker();

        String prename = faker.name().firstName();
        String surname = faker.name().lastName();
        String place = faker.address().cityName();
        String country = faker.address().country();
        String postalCode = faker.address().zipCode();
        String street = faker.address().streetName();
        String number = faker.address().buildingNumber();

        return new AdressDTO(prename,surname,place,country,postalCode,street,number);
    }
}
