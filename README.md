# User Management Authentication System

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [File Structure](#file-structure)
- [Contributions](#contributions)
- [License](#license)

## Overview
This project is a Spring Boot web application designed for user management, authentication, and authorization. It allows users to register, log in, and manage their profiles. The application demonstrates the use of Spring Security for authentication and authorization, along with Thymeleaf for rendering views.

### Features
- **User Registration**: Allows users to create a new account with a username, email, and password.
- **User Login**: Users can log in with their credentials.
- **Profile Management**: Users can view and manage their profile information.
- **OAuth2 Login**: Supports logging in through Google.
- **Session Management**: Ensures proper handling of user sessions and access control.

## Usage
1. **Setup and Deployment**:
    - Clone the repository to your local machine.
    - Build the application using Maven.
    - Configure your database settings in the `application.yaml` file.
    - Run the application.

2. **Access the Application**:
    - The web application is available at `http://localhost:8080`.
    - You can register a new account or log in with existing credentials.

3. **Interacting with the Application**:
    - **Registration**: Navigate to `/registration` to create a new account.
    - **Login**: Access the login page at `/login`.
    - **Profile**: After logging in, users are redirected to `/profile` to view their information.
    - **Logout**: Users can log out by visiting `/logout`.

## File Structure

```
src/                                                                       # Source code directory
├── main/                                                                  # Main application source files
│   ├── java/                                                              # Java source files
│   │   └── com/sangarius/                                                 # Base package for the application
│   │       └── user_management_authentication_system/
│   │           ├── config/                                                # Configuration classes
│   │           │   └── SecurityConfig.java                                # Security configuration for Spring Security
│   │           ├── controller/                                            # Controllers for handling requests
│   │           │   ├── LoginController.java                               # Manages login requests and redirects
│   │           │   ├── OAuth2Controller.java                              # Handles OAuth2 login processes
│   │           │   ├── ProfileController.java                             # Manages user profile display
│   │           │   └── RegistrationController.java                        # Manages user registration
│   │           ├── dto/                                                   # Data Transfer Objects
│   │           │   └── UserRegistrationDto.java                           # DTO for user registration data
│   │           ├── model/                                                 # Domain models
│   │           │   └── User.java                                          # Represents a user in the application
│   │           ├── repository/                                            # Repository interfaces for data access
│   │           │   └── UserRepository.java                                # Repository for user data management
│   │           ├── service/                                               # Service classes for business logic
│   │           │   └── UserService.java                                   # Service for user-related operations
│   │           └── UserManagementAuthenticationSystemApplication.java     # Main application class for running the Spring Boot app
│   └── resources/                                                         # Resource files
│       ├── css/                                                           # CSS files for styling
│       │   └── main.css                                                   # Main CSS file for the application
│       ├── templates/                                                     # Thymeleaf templates for views
│       │   ├── login.html                                                 # Login page template
│       │   ├── profile.html                                               # User profile page template
│       │   └── registration.html                                          # Registration page template
│       └── application.yaml                                               # Configuration file for the Spring application
└── test/                                                                  # Test classes
    └── java/                                                              # Test source files
        └── com/sangarius/                                                 # Base package for tests
            └── user_management_authentication_system/
                ├── controller/                                            # Tests for controllers
                │   ├── ProfileControllerTest.java                         # Unit tests for ProfileController
                │   └── RegistrationControllerTest.java                    # Unit tests for RegistrationController
                └── UserManagementAuthenticationSystemApplicationTests.java # General tests for the application
```

## Contributions
Contributions, feedback, and suggestions are welcome. If you have any improvements or find issues, please submit a pull request or open an issue.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
