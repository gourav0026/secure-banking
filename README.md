* Secure Banking

This is a simple Spring Boot project that simulates basic banking operations.  
It supports creating accounts, depositing money, withdrawing money, and viewing accounts.  
The project also includes Spring Security and an H2 in-memory database.

---

* Features
- Create new account
- View all accounts
- Get account by ID
- Deposit money
- Withdraw money
- Preloaded sample accounts
- H2 console enabled for testing
- Secured with Spring Security login

---

* Tech Stack
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database

---

* How to Run
1. Clone the repository:
   
   git clone https://github.com/<your-username>/secure-banking.git
   cd secure-banking
   
2. Run the application:-
   
   ./mvnw spring-boot:run

3. Open in the browser:-
App: http://localhost:8080

> H2 Console: http://localhost:8080/h2-console

     ~ JDBC URL: jdbc:h2:mem:testdb

     ~ User: sa

     ~ Password: (blank)

* API Endpoints

  Method	Endpoint	Description

   POST	/accounts	Create account
   GET	/accounts	Get all accounts
   GET	/accounts/{id}	Get by ID
   PUT	/accounts/{id}/deposit	Deposit money
   PUT	/accounts/{id}/withdraw	Withdraw money

* Sample data:-

> Gourav -> 5000
> Ravi   -> 3000
> Aman   -> 7000

* Screenshots

 Accounts API Response
![Accounts Screenshot](accounts.png)
![Accounts Screenshot](Secure-Banking.png)
