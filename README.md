# 📱 Fake WhatsApp Chatbot Backend

This project is a simple backend simulation of a WhatsApp chatbot built using Java and Spring Boot.

##  Features
- REST API endpoint: `/webhook`
- Accepts JSON input (simulating WhatsApp messages)
- Returns predefined responses:
  - Hi → Hello
  - Bye → Goodbye
- Logs all incoming messages in console

##  Technologies Used
- Java
- Spring Boot
- Maven

##  API Details

### Endpoint:
POST /webhook

### Request Body:
{
  "message": "Hi"
}

### Response:
{
  "reply": "Hello"
}

## How to Run
1. Clone the repository
2. Open in IDE (Eclipse/IntelliJ)
3. Run `FakeWhatsAppApplication.java`
4. Server starts on `http://localhost:8080`

##  Testing
Use Postman:

POST http://localhost:8080/webhook

Body:
{
  "message": "Hi"
}

##  Output
- Returns chatbot reply
- Logs message in console

##  Purpose
This project was built as part of an assignment to demonstrate understanding of REST APIs, Spring Boot, and backend development.

---
