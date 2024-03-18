# OrangeHRM Login Functionality Automation

This project demonstrates automated testing of the login functionality of the OrangeHRM website using Java and Selenium WebDriver.

## Table of Contents

-   [Prerequisites](https://chat.openai.com/c/0eeae966-6457-4452-97e7-83d486224bbe#prerequisites)
-   [Installation](https://chat.openai.com/c/0eeae966-6457-4452-97e7-83d486224bbe#installation)
-   [Usage](https://chat.openai.com/c/0eeae966-6457-4452-97e7-83d486224bbe#usage)
-   [Contributing](https://chat.openai.com/c/0eeae966-6457-4452-97e7-83d486224bbe#contributing)
-   [License](https://chat.openai.com/c/0eeae966-6457-4452-97e7-83d486224bbe#license)
## Prerequisites

Before running this automation script, ensure that you have the following installed:

-   Java Development Kit (JDK)
-   Maven
-   WebDriver compatible with the browser you intend to use (e.g., ChromeDriver for Chrome)
-   Your favorite IDE (like IntelliJ IDEA or Eclipse)
-   Internet connectivity

## Installation

1.  Clone this repository to your local machine:
    
  
    
    `git clone https://github.com/sandipthombare/SoftwareTesting-Automation.git` 
    
2.  Navigate to the project directory:
    
    bashCopy code
    
    `cd orangehrm-login-automation` 
    
3.  Install project dependencies using Maven:
    
    bashCopy code
    
    `mvn clean install` 
    

## Usage

1.  Set the path to your WebDriver executable (e.g., ChromeDriver) in the `src/test/java/resources/config.properties` file.
    
2.  Modify the login credentials in the `src/test/java/resources/config.properties` file with valid credentials.
    
3.  Run the test:
    
    bashCopy code
    
    `mvn test` 
    
4.  After the test execution, you can find the test results in the `target/surefire-reports` directory.
    

## Contributing

Contributions are welcome! If you find any bugs or want to enhance the functionality, feel free to open an issue or submit a pull request. Please ensure that your code follows the established coding conventions and includes appropriate tests.

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/enhancement`).
3.  Make your changes and commit them (`git commit -am 'Add new feature'`).
4.  Push to the branch (`git push origin feature/enhancement`).
5.  Create a new Pull Request.

## License

This project is licensed under the MIT License.