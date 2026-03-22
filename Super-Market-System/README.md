# Supermarket Billing System (Console-Based)

## Overview
This is a role-based supermarket billing system developed as a console application. It simulates real-world shopping scenarios including product selection, cart management, and payment processing with reward logic.

## Features

### Authentication
- Basic user structure (Admin/Customer roles)

### Inventory Management
- View available products
- Add and manage product details (extendable for admin)

### Customer Purchase
- View products
- Add products to cart
- Modify cart quantities
- View cart summary

### Payment System
- Preloaded credit system (₹1000 initial balance)
- Purchase limited by available credit
- Reward mechanisms:
  - ₹100 cashback for purchases ≥ ₹5000
  - 1 loyalty point per ₹100 spent
  - ₹100 discount for every 50 points

### Additional Capabilities
- Cart total calculation
- Credit deduction handling

## Technologies Used
- Java
- OOP Design
- Collections Framework (List, HashMap)

## Project Structure
- `User.java` → Stores user data and credit details
- `Product.java` → Represents product entity
- `Cart.java` → Handles cart operations using HashMap
- `AdminService.java` → Inventory management logic
- `CustomerService.java` → Purchase and payment logic
- `Main.java` → Application entry and menu flow

## How to Run
1. Navigate to `src` folder
2. Compile: javac *.java
3. Run java Main


## Key Concepts Demonstrated
- Role-based system design
- HashMap for cart management
- Business logic implementation (rewards system)
- Modular service-based architecture

## Future Enhancements
- Full authentication system
- Database integration
- Purchase history tracking
- Advanced reporting (low stock, top customers)
