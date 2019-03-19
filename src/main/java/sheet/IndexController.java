package sheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private CharacterRepository repository;

    @GetMapping("/")
    public String landing(@RequestParam(name="name", required=false, defaultValue="") String name, Model model) {
        List<Character> characters = repository.findByName(name);
        Character character;
        if (name.equalsIgnoreCase("")) {
            character = new Character("");
        } else if (characters.isEmpty()) {
            character = new Character(name);
        } else {
            character = characters.get(0);
        }
        model.addAttribute("character", character);
        return "index";
    }

    @GetMapping("/character/")
    public @ResponseBody Character getCharacter(@RequestParam(name="name") String name) {
        return repository.findByName(name).get(0);
    }
}
