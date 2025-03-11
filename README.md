# E-Commerce System in Java

This project is a simple e-commerce system implemented in Java. It includes various classes to manage brands, items, customers, orders, payments, and filtering of items. Below is an overview of the project structure and functionality.

## Project Structure

The project consists of the following Java classes:

1. **Brand.java**: Manages brand information including supplier, brand name, brand code, overview, and logo.
2. **Cart.java**: Handles the shopping cart functionality, allowing users to add items to the cart and purchase them.
3. **Customer.java**: Manages customer information and provides functionality to create a customer database.
4. **Database.java**: Currently a placeholder class, potentially intended for database operations.
5. **Filter.java**: An abstract class providing methods to filter items based on various criteria.
6. **Items.java**: Represents items in the e-commerce system, including details like category, brand, gender category, color, available sizes, type, stock, frame, cut, and price.
7. **Order.java**: Manages order information and provides functionality to place orders.
8. **Payment.java**: Handles payment information and provides methods to show the amount and update payment details.
9. **Prices.java**: An interface defining methods to get the price, apply discounts, and change the price of items.

## Functionality

### Brand Management
- **Brand.java**: Allows adding and removing brands. Each brand has a supplier, name, code, overview, and logo.

### Shopping Cart
- **Cart.java**: Provides functionality to add items to the cart and purchase them. It also handles stock management when items are added to the cart.

### Customer Management
- **Customer.java**: Manages customer information and provides a method to create a customer database file.

### Item Management
- **Items.java**: Represents items in the system and provides methods to add and remove items. It also implements the `Prices` interface for price-related operations.

### Filtering Items
- **Filter.java**: Provides methods to filter items based on various criteria such as gender (men, women, kids).

### Order Management
- **Order.java**: Manages order information and provides a method to place orders.

### Payment Management
- **Payment.java**: Handles payment information and provides methods to show the amount and update payment details.

## Usage

To use this e-commerce system, you can create instances of the classes and call their methods to manage brands, items, customers, orders, and payments. Here is an example of how you might use some of the classes:

```java
// Create a new item
Items item = new Items("Shirt", "Nike", "Men", "Blue", new ArrayList<>(), "Casual", 10, "Regular", "Slim", 29.99);

// Add the item to the cart
Cart.Add_To_Cart(item);

// Place the order
Cart.PurchaseCart();

