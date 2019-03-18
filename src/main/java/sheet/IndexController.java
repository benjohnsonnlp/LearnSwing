package sheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @Autowired
    private CharacterRepository repository;

    @GetMapping("/")
    public String landing(@RequestParam(name="name", required=false, defaultValue="Adam") String name, Model model) {
        Character character = repository.findByName(name).get(0);
        model.addAttribute("character", character);
        return "index";
    }

}
