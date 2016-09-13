# Smart Grocery List

### Overview

While there are hundreds if not thousands of shopping lists they all revolve around the concept of arrays or lists and not maximum efficiency in the real world. There shouldn’t be just a shopping list without a base inventory. 

I propose a system where there is both a base inventory known as the grocery list and a shopping list to review while at the store. When the total amount of a single item on the grocery list is lower than the desired amount it would automatically appear on the shopping list. The shopping list would tell you not only what items to buy while you were at the store, but it would also remember what isle the item is on thus routing you through the store isle by isle but skipping the ones you don’t need to go down.

### Tech Specs

This application with be written in java with the spring framework and jetty (because Tomcat is literally the devil). The API should have full unit test coverage and utilize swagger. Ideally the server will be as lean as possible so it can fit on the smallest aws boxes and utilize as much of the aws tech stack of absolutely possible. It will be entirely immutable so that auto scaling with either aws auto scale groups or kubernetes containers will work. 

### MVP

The minimal viable product for this will simple be an api server with swagger endpoints for documentation and testing. It will assume there is only one user and no authentication or registration. 

I should be able to create, reference, update, and delete any list item.

### Object Models

Item {

  _ID: UUID

  Name: String

  Description: String

  Ideal_Quantity: Int

  Purchase: Int

  Isle: Int

  Unit Price:  Short

  UPC: String

}

### Heroku App
[Demo](https://smart-grocery-list.herokuapp.com/)
