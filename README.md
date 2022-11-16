This Shopping cart gui project is program that displays  a catalog of items that can be purchased. You can purchase
more than one of a given item. Prices are expressed using real numbers (doubles).
Quantities to purchase are expressed as integers (ints). For example, you can’t buy
2.5 of something.
Some items have a discount when you buy enough of them. For example, Silly
Putty normally costs $3.95 each, but you can buy 10 for $19.99. These items have,
in effect, two prices: a single item price and a bulk item price for a bulk quantity.
When computing the price for a discounted bulk item, apply as many of the bulk
quantity as you can and then use the single item price for any leftovers. For
example, the user is ordering 12 buttons that cost $0.99 each but can be bought in
bulk 10 for $5.00. The first 10 are sold at that bulk price ($5.00) and the two extras
are charged at the single item price ($0.99 each) for a total of $6.98. If the user had
bought 32 buttons, the first 30 would cost $15.00 (3 * $5.00) and the two extras
would be $0.99 each for a total of $16.98.
At the bottom of the window is a checkbox for an overall discount. If this box is
checked, the user is given a 10% discount off the total price when the cart contains
at least 20 total items. This is computed using simple double arithmetic, computing
a price that is 90% of what it would be otherwise if the quantity is large enough. 
![image](https://user-images.githubusercontent.com/69253138/202080967-26ffa1cf-0413-4bd6-98a4-90e2c76b1c4e.png)
![image](https://user-images.githubusercontent.com/69253138/202081007-cfbf5871-8a74-4d94-b1ab-56038878885b.png)
