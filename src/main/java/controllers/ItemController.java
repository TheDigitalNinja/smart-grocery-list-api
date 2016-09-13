package controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ItemController {

    @RequestMapping("/item")
    public String resp(@RequestParam(value="id", required=true) String id, Model model) {
        model.addAttribute("id", id);
        return "item data";
    }

}
