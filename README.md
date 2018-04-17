# Decorator_Pattern
OOP- Project 4 -Decorator Pattern

Decorator pattern allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of
other objects from the same class.

- This is achieved by designing a new decorator class that wraps the original class.

In this project, I tried to build a Cafe selling Bubble teas with different ingredient.
By applying the decorator pattern, it makes much easier to add ingredients based on customer's choice.

For example, there are three different foundation drink for customers to choose.
- Black Tea
- Oolong Tea (a kind of green tea)
- Coffee

And for the decorators,
customers can add:
- Bubble
- Herbal Jelly
- Mocha
- Red bean

With decorator pattern, I can just apply the changes in Main.java easily and reflect the different price based on customer's 
choice on Cup Sizes and ingredients.