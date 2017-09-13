package de.jgehrmann.main.random.number;

import de.jgehrmann.main.utils.RandomNumberGenerator;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class NumberController {

    @RequestMapping(path = "/int", method = RequestMethod.GET)
    public int randomInteger() {
        return RandomNumberGenerator.generateInteger();
    }

    @RequestMapping(path = "/int", method = RequestMethod.GET)
    public int randomInteger(@RequestParam(value = "size", defaultValue = "10") String size) {
        return RandomNumberGenerator.generateInteger(Integer.parseInt(size), 0);
    }

    @RequestMapping(path = "/int", method = RequestMethod.GET)
    public int randomInteger(@RequestParam(value = "min", defaultValue = "0") String min, @RequestParam(value = "max", defaultValue = "10") String max) {
        return RandomNumberGenerator.generateInteger(Integer.parseInt(max), Integer.parseInt(min));
    }
}