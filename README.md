# AutoFramework

AutoFramework is an highly modular, and scalable test automation framework specifically engineered for comprehensive end-to-end web application testing. Developed using Selenium WebDriver. 
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
├── src/main/java/engine/                # Core framework components (actions, constants, logger)
├── src/main/java/pages/                 # Page Object Model (POM) classes
├── src/main/resources/properties/       # Configuration files
├── src/test/java/tests/                 # Test cases
├── src/test/resources/                  # Test data and resources
├── pom.xml                              # Maven configuration
└── README.md                            # Project documentation
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

Contributions are welcome! 
We welcome contributions from QA Automation Testing Engineers! To contribute:

1. Fork the repository and clone it to your local machine.
2. Create a new branch for your test enhancements or fixes (`git checkout -b test-enhancement-name`).
3. Write clear, maintainable test scripts and ensure thorough test coverage.
4. Run all tests and confirm they pass successfully.
5. Commit your changes with meaningful messages (`git commit -m 'Add new test or fix'`).
6. Push your branch to your fork (`git push origin test-enhancement-name`).
7. Open a pull request, including a description of your improvements or fixes.

We look forward to your contributions and appreciate your attention to quality!
"""

---
