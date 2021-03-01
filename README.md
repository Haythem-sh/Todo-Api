# Part 1 : Todo Web App (Backend)

This project is developed with Java and Spring boot 

## How to run the todo-backend application

* First clone the backend project
* Import the project using your preferred IDE (I recommend using Intellij Community version is fully sufficient)
* Update and build the project dependencies using the command `mvn clean install -U`
* Check that the `target` folder contains the .jar swagger.json files
* Open the file `TodoApplication.java` and run it Using the green play button

==> Clone and setup the [Frontend application](https://github.com/Haythem-sh/Todo-Api/tree/master/todo-frontend) and enjoy playing with the different functionalities

# Part 2: Todo Web App (Frontend)

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 11.2.1.

## How to run the todo-frontend application

* First clone the backend project [Todo Backend](https://github.com/Haythem-sh/Todo-Api/tree/master/todo-backend)
* Follow the instructions to run correctly the backend project and generate the swagger.json file => The REST API documentation which servers the Frontend services generation
## Two different options to run the application
# Option 1
   * Run the command  `npm install` to install all the dependencies and libraries
   * Run the command `npm run todo-api` to generate
   * Run the command `ng serve` for a dev server. Navigate to `http://localhost:4200/login`. The app will automatically reload if you change any of the source files.
# Option 2
* Run the command  `npm install` to install all the dependencies and libraries
* Run `npm run start:local` for a dev server. Navigate to `http://localhost:4200/login`. The app will automatically reload if you change any of the source files.
    + This command will generate the API and run the application
