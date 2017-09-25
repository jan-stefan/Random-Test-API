package de.jgehrmann.main.random.number;

import de.jgehrmann.main.utils.RandomFloatGenerator;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class FloatController {

    /**
     * Defines an endpoint for receiving random floating numbers.
     * @param min minimal value.
     * @param max maximum value.
     * @return random floating number.
     */
    @RequestMapping(path = "/float", method = RequestMethod.GET)
    public float randomFloat(@RequestParam(value = "min", defaultValue = "0f") String min, @RequestParam(value = "max", defaultValue = "10f") String max ) {
        return RandomFloatGenerator.generate(Float.parseFloat(min),Float.parseFloat(max));
    }
}
