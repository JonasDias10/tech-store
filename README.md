# Tech Store

### This Tech Store app integrates Spring Boot for the backend, Angular for the frontend, and PostgreSQL as the database. The backend strictly follows Clean Architecture principles, ensuring a modular and easy-to-maintain code base. Docker is employed to containerize the entire project for easy deployment.

![Tech Store GIF](./media/tech-store.gif)

## Features

- **CRUD Operations:** The application provides Create, Read, Update, and Delete (CRUD) operations for managing products.

- **Clean Architecture:** The backend project adheres to the Clean Architecture principles, separating concerns into layers such as Entities, Use Cases, and Data Access.

- **Angular Frontend:** The frontend is built with Angular and Angular Material for a modern and responsive user interface.

- **PostgreSQL Database:** Products data are stored in a PostgreSQL database, ensuring data integrity and reliability.

- **Docker Containers:** The entire application, including the backend, frontend, and database, is containerized using Docker. This simplifies deployment and ensures consistency across different environments.

## Prerequisites

- Docker installed on your machine
- Java Development Kit (JDK) installed
- Node.js and npm installed for Angular development

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/JonasDias10/tech-store.git
    ```

2. Navigate to the project directory:

    ```bash
    cd tech-store
    ```

3. Build and run the Docker containers:

    ```bash
    ./start.sh
    ```

4. Access the application:

    - Backend API: [http://localhost:8080/products/](http://localhost:8080/products/)
    - Frontend: [http://localhost:4200](http://localhost:4200)

## Development

- Backend development: Open the `backend` directory in your preferred Java IDE.
- Frontend development: Open the `frontend` directory in your preferred code editor.

## Contributions

Feel free to contribute to this project by submitting issues or pull requests.

---

**Author: Jonas Dias | [Social Media](https://jonas-dias.netlify.app/) | Thank You**