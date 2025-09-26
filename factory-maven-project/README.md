# Factory Maven Project

This project is a simple pizza ordering application built using Java and Maven. It demonstrates the use of object-oriented programming principles, including inheritance and polymorphism, to create different types of pizzas.

## Project Structure

```
factory-maven-project
├── src
│   └── main
│       └── java
│           └── pie
│               ├── CheesePizza.java
│               ├── GlutenFreePizza.java
│               ├── GreekPizza.java
│               ├── Main.java
│               ├── PepperoniPizza.java
│               ├── Pizza.java
│               ├── PizzaFactory.java
│               ├── PizzaStore.java
│               ├── PizzaType.java
│               └── VeganPizza.java
│   └── test
│       └── java
│           └── pie
│               ├── PizzaFactoryTest.java
│               └── PizzaStoreTest.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the Repository**: 
   ```bash
   git clone <repository-url>
   cd factory-maven-project
   ```

2. **Build the Project**: 
   Use Maven to build the project and download dependencies.
   ```bash
   mvn clean install
   ```

3. **Run the Application**: 
   You can run the application using the following command:
   ```bash
   mvn exec:java -Dexec.mainClass="pie.Main"
   ```

## Usage

- The application allows users to order different types of pizzas, including Cheese, Gluten-Free, Greek, Pepperoni, and Vegan pizzas.
- The `PizzaFactory` class is responsible for creating the appropriate pizza based on user input.
- The `PizzaStore` class manages the ordering process and interacts with the `PizzaFactory`.

## Testing

- Unit tests are provided for the `PizzaFactory` and `PizzaStore` classes to ensure the correct functionality of the application.
- To run the tests, use the following command:
  ```bash
  mvn test
  ```

## Dependencies

This project uses Maven for dependency management. The `pom.xml` file contains all the necessary dependencies and plugins required for the project.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.