import {Component} from "angular2/core";

@Component({
  // Declare the tag name in index.html to where the component attaches
  selector: 'app',

  // Location of the template for this component
  templateUrl: 'angular/main.html'

})

export class App {

    newItem: Item;

    constructor() {
        this.newItem = new Item();
    }

  // Mockup of items
  items = [];

  addItem(){
    if (this.newItem && this.newItem.name != null) {
      this.items.push(this.newItem.name);
      document.getElementById('addGroceryInput').value = ""; // Reset the form on addition.
      this.newItem = new Item(); // Reset it to the constructor. TODO: Better way?
    }
  }
}

class Item {
    name: string;
}
