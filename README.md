# AutoFramework

AutoFramework is an advanced, highly modular, and scalable test automation framework specifically engineered for comprehensive end-to-end web application testing. Developed using Selenium WebDriver. 
it offers a robust foundation for creating clean, maintainable, and reusable automated test cases. 
Its modular design ensures flexibility, enabling seamless integration with various tools and technologies, while maintaining high standards of performance, reliability, and test coverage.

---

## Getting Started

### Clone the Repository
```bash
git clone https://github.com/Mohamed-Abdel-Nasser/AutoFramework.git
cd AutoFramework
```

### Install Dependencies
Run the following Maven command to install required dependencies:
```bash
mvn clean install
```

---

## Project Structure

```
AutoFramework/
├── src/main/java/engine/         	# Core framework components (actions, constants, logger)
├── src/main/java/pages/         		# Page Object Model (POM) classes
├── src/main/resources/properties/ 	# Configuration files
├── src/test/java/tests/         		# Test cases
├── src/test/resources/          		# Test data and resources
├── pom.xml                      		# Maven configuration
└── README.md                    		# Project documentation
```

---

## Key Components

### Pages
The framework uses the Page Object Model (POM) to separate page-specific actions and elements for better code reusability.

### Logger
Custom logging is implemented using Log4j2 to provide detailed information about test execution and failures.

### Utilities
Reusable utilities such as browser actions and assertions are provided to accelerate test development.

---

## Tools and Technologies

- **Java**: Programming language
- **Selenium WebDriver**: For browser automation
- **IntelliJ IDEA**: A powerful IDE for efficient Java development with advanced features and intelligent code assistance.
- **Maven Dependencies**: For dependency management
  - **TestNG**: For test execution and reporting.
  - **WebDriverManager**: Automates browser driver management for Selenium.
  - **Log4j**: A flexible logging framework for debugging and monitoring.
    - **log4j-core**: Core module for logging implementation.
    - **log4j-api**: Provides logging functionality API.
  - **SLF4J**: A logging facade for consistent logging across frameworks.---

---

## Contributing

Contributions are welcome! To contribute:
1. Fork this repository.
2. Create a new branch for your feature (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push the branch to your fork (`git push origin feature-name`).
5. Create a pull request.

---

## Contact

For questions or support, please contact:

**Mohamed Abdel Nasser**

### Contact 
[![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/mohamed-abdel-nasser-75014019a/)  
[![Gmail](https://img.shields.io/badge/Email-red?style=for-the-badge&logo=gmail&logoColor=white)](mailto:m.a.nasser113@gmail.com)  
[![WhatsApp](https://img.shields.io/badge/WhatsApp-green?style=for-the-badge&logo=whatsapp&logoColor=white)](http://wa.me/+201018127745)


