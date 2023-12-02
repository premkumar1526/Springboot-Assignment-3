# E-Commerce-Assignment-3

E-Commerce CLI Application is built using Spring Boot, Data JPA, and MySQL.
To develop a command-line e-commerce application where users can view products, add them to a cart, and place orders through a series of text-based prompts and responses.

1. Setup & Configuration:
•	Setup a new Spring Boot project using the Spring Initializr.
•	Include the following dependencies: Spring Data JPA and MySQL Driver.
•	Configure the application.properties or application.yml for the MySQL database connection.

2.Services:
The Services used in this application are,
•	ProductService: CRUD operations for products.
•	CartService: Operations like add product to cart, remove product from cart, and view cart.
•	OrderService: Operations like place an order and view order history.

3. CLI Interface:
•	On starting the application, we display a menu with options such as:
->List all products
->Add a product to the cart
->View cart
->Place an order
->View order history
->Exit
•	Depending on the user's choice, perform the corresponding action, and then it will return to the menu.

4. Running the app
->Clone the repository: git clone https://github.com/PaviG128/E-Commerce-Assignment-3.git
->Import the project into STS:
->Click File > Import...
->Select Maven > Existing Maven Projects and click Next
->Browse to the project directory and click Finish
->Update the values in application.properties with your MySQL database connection details.
->Run the app: Right-click the project in the Package Explorer and click Run As > Spring Boot App.


