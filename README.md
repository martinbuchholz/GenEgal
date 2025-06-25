# Meeting Room Booking MVP

This project contains a simple meeting room booking application with:

- **Backend:** Spring Boot (Java)
- **Frontend:** Angular (TypeScript)
- **Database:** In-memory H2

## Prerequisites
- Java 17+
- Node.js 18+ and npm

## Running Backend

```bash
cd backend
mvn spring-boot:run
```

The backend will start on `http://localhost:8080` and expose the REST API under `/api`.
H2 console is available at `/h2-console`.

## Running Frontend

```bash
cd frontend
npm install
npm start
```

The frontend will be served on `http://localhost:4200`.

## Running Tests

Backend tests:
```bash
cd backend
mvn test
```

Frontend tests:
```bash
cd frontend
npm test
```

## Notes

Sample rooms and a booking are created on startup. Booking creation checks for overlapping reservations.
