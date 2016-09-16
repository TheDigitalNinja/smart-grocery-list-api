
# Smart Grocery List

[![Build Status](https://travis-ci.org/TheDigitalNinja/Smart-Grocery-List.svg?branch=master)](https://travis-ci.org/TheDigitalNinja/Smart-Grocery-List)
[![Heroku](https://heroku-badge.herokuapp.com/?app=smart-grocery-list)](https://smart-grocery-list.herokuapp.com/)

### Overview

While there are hundreds if not thousands of shopping lists they all revolve around the concept of arrays or lists and not maximum efficiency in the real world. There shouldn’t be just a shopping list without a base inventory. 

I propose a system where there is both a base inventory known as the grocery list and a shopping list to review while at the store. When the total amount of a single item on the grocery list is lower than the desired amount it would automatically appear on the shopping list. The shopping list would tell you not only what items to buy while you were at the store, but it would also remember what isle the item is on thus routing you through the store isle by isle but skipping the ones you don’t need to go down.

### Tech Specs

This application with be written in java with the spring framework and jetty (because Tomcat is literally the devil). The API should have full unit test coverage and utilize swagger. Ideally the server will be as lean as possible so it can fit on the smallest aws boxes and utilize as much of the aws tech stack of absolutely possible. It will be entirely immutable so that auto scaling with either aws auto scale groups or kubernetes containers will work. 

### MVP

The mvp will be broken down into two separate projects.

* A restful  API endpoint that will serve and validate objects from the database.
* A front end Angular 2.0 single page app to access and interact with the api layer. The css framework will be Angular Materials.