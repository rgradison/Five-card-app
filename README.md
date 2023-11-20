# Five-card-app API

Five-card draw is a variant of poker where each player receives a hand of 5 cards, is then
allowed to swap any number of those cards for new ones, and then competes against each
other based on the standard 5 card poker hand strength.

## Table of Contents
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Usage](#usage)
    - [Endpoints](#endpoints)
    - [Sample Request](#Post Request Response)
    - [API Documentation](#api-documentation)
- [Configuration](#configuration)
- [Contributing](#contributing)

# Getting Started

### Prerequisites

To run the Survivor API, you need the following prerequisites:
===
- Java 17
- Apache Maven
- PostgreSQL database
- I used intellij idea

### Installation

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/rgradison/Five-card-app.git
1.Navigate to the project directory:
===
    cd ~/Five-card-app
2.Build sing Maven:
===
    mvn clean install
3.Run the application:
===
### mvn clean install , this command will compile and create a jar for us.
### java -jar target/Five-card-app-0.0.1-SNAPSHOT.jar

The application will start and be accessible at:
===
http://localhost:8080, or depending on where you run it.

### Endpoints

### Request
# In case we want to convert the project to web, i created a controller that we can consume
GET http://localhost:8080/evaluatePokerHand
### Sample Response
{Your Cards=[Card{suit='Spades', rank='2'}, Card{suit='Clubs', rank='2'}, Card{suit='Spades', rank='King'}, Card{suit='Diamonds', rank='3'}, Card{suit='Spades', rank='7'}], Result=One Pair}

## API Documentation
You can access the API documentation by visiting http://localhost:8080/swagger-ui.html after starting the application. The interactive Swagger documentation provides details about the available endpoints and allows you to test them.

## Configurationgit status 
You can configure the application properties in the application.properties file. Be sure to set up your PostgreSQL database and any other necessary configurations.

## Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your fork.
5. Create a pull request with a clear description of your changes. 
6. 