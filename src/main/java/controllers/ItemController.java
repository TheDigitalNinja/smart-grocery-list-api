package controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@RestController
public class ItemController {


    // All Items
    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public String GetItemsResponce() {
        return "List all items";
    }

    // Item C.R.U.D.
    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    public String itemResponce(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "Get item data controller. " + id.toString();
    }

    @RequestMapping(value = "/item/{id}", method = RequestMethod.POST)
    public String PostItemResponce(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "Post item controller. " + id.toString();
    }

    @RequestMapping(value = "/item/{id}", method = RequestMethod.PUT)
    public String PutItemResponce(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "Put item controller. " + id.toString();
    }

    @RequestMapping(value = "/item/{id}", method = RequestMethod.DELETE)
    public String DeleteItemResponce(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "Delete item controller. " + id.toString();
    }

}
