# shopping-cart-exercise

To run tests:
```
sbt test
```

### Design choices and assumptions
Given that the shop **only** sells apples and oranges, and for simplicity reasons:
- Items are represented as strings
- Items are case-sensitive, only "Apple" and "Orange" will be recognized
- No error handling if an unrecognized item is added to the shopping cart

With current requirements a `List[String]` data structure to hold the items is sufficient.
But a more appropriate data structure for a shopping cart would have a count for each item,
e.g. `Apple -> 5, Orange -> 2`

Finally, since there are only two offers, implementation of these was kept simple. 
But of course, in the future if the store were to sell more products and have more offers
then a more scalable solution, probably consisting of an offer/discount abstraction 
would be better.