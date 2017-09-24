package de.jgehrmann.main.random.number;

import de.jgehrmann.main.utils.RandomIntegerGenerator;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class IntegerController {

    /**
     * Defines an endpoint where you can request random numbers using a range between min and max.
     * @param min minimal value
     * @param max maximum value
     * @return The generated Random number.
     */
    @RequestMapping(path = "/int", method = RequestMethod.GET)
    public int randomInteger(@RequestParam(value = "min", defaultValue = "0") String min, @RequestParam(value = "max", defaultValue = "10") String max) {
        return RandomIntegerGenerator.generateInteger(Integer.parseInt(max), Integer.parseInt(min));
    }
}