package controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@RestController
public class ItemController {


    // All Items
    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public String GetItemsResponce() {
        return "List all items";
    }

    // Item C.R.U.D.
    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public String itemResponce(@RequestParam(value="id", required=true) String id, Model model) {
        model.addAttribute("id", id);
        return "Get item data controller";
    }

    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public String PostItemResponce(@RequestParam(value="id", required=true) String id, Model model) {
        return "Post item controller";
    }

    @RequestMapping(value = "/item", method = RequestMethod.PUT)
    public String PutItemResponce(@RequestParam(value="id", required=true) String id, Model model) {
        return "Put item controller";
    }

    @RequestMapping(value = "/item", method = RequestMethod.DELETE)
    public String DeleteItemResponce(@RequestParam(value="id", required=true) String id, Model model) {
        return "Delete item controller";
    }

}
