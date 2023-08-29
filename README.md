#Workshop2

User Management System
A basic Java application designed to manage user information by performing CRUD (Create, Read, Update, Delete) operations using a MySQL database.

* Features:

- User Entity: 
A simple Java class (User) representing a user in the system. It contains basic user attributes such as id, userName, email, and password.
* User Data Access Object (DAO):
- Create: 
Allows for adding a new user to the database, with the password being securely hashed using BCrypt.
- Read: 
Retrieves a user's details based on the provided user ID.
- Update: 
Modifies an existing user's details, including hashing a new password if changed.
- Delete: 
Removes a user's details using the provided user ID.
- Find All: 
Fetches all users from the database.

* Database Utility (DbUtil): 
- Provides connection capabilities to the MySQL database.
* Security:
P- asswords are securely hashed using the jBcrypt library before being stored or updated in the database.

* Technical Details:
- Programming Language: Java.
- Database: MySQL.
* External Libraries:
- mysql-connector-j for MySQL JDBC driver.
- jbcrypt for password hashing.
  
Setup:
Ensure you have the MySQL server running and the necessary database and tables created as required by the DAO class. 
Update the DB_URL_WORKSHOP, DB_USER, and DB_PASSWORD in the DbUtil class with your database details.
