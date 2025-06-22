# 🍽️ FoodOrderingSystem

A simple web-based food ordering application built using **Java (JSP/Servlets)**, **JDBC**, and **MySQL**, inspired by platforms like Swiggy or Zomato.

---

## 🔧 Tech Stack

- Java (JDK 8+)
- JSP & Servlets
- JDBC
- MySQL
- HTML, CSS, Bootstrap
- Apache Tomcat (v9+)

---

## 🌟 Features

- 👤 User Registration & Login
- 🍔 View Restaurants and Menus
- 🛒 Add to Cart and Checkout
- 💳 Place Orders with Payment Option (Cash/Card)
- 🧾 View Order Confirmation
- 🖼️ Upload and Update Profile Picture

---

## 📌 Project Structure

FoodOrderingSystem/
├── src/
│ ├── model/
│ ├── dao/
│ ├── servlet/
├── web/
│ ├── jsp/
│ ├── css/
│ ├── images/
├── lib/
├── sql/ (DB dump)
├── README.md
├── .gitignore
├── web.xml

## 🖼️ System Architecture

```plaintext
+------------+      +---------------------+     +--------------+
|  User      | ---> |  JSP / HTML Pages   | <-->|  Servlet      |
+------------+      +---------------------+     +--------------+
                                                |  DAO Layer    |
                                                +--------------+
                                                        |
                                                        v
                                                +--------------+
                                                |  MySQL DB     |
                                                +--------------+



---

## 🚀 How to Run the Project

### ✅ Prerequisites
- JDK 8 or higher
- Apache Tomcat 9 or later
- MySQL Server
- IDE: Eclipse / IntelliJ IDEA (recommended)
- Maven or manually managed `lib` folder for JDBC drivers

### 💡 Steps to Run Locally on Tomcat Server:

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Mahaboob-Basha-Shaik/FoodOrderingSystem.git
Import the Project

Open Eclipse or IntelliJ.

Import it as a Dynamic Web Project or Maven Web Project.

Configure the Database

Create a MySQL database (e.g., food_ordering_db).

Run the SQL script located in the sql/ folder to create tables and sample data.

Update your DB credentials in the DBUtil.java or db.properties file:

String url = "jdbc:mysql://localhost:3306/food_ordering_db";
String username = "root";
String password = "yourpassword";
String password = "yourpassword";
Add JDBC Connector

Add mysql-connector-java-x.x.xx.jar to your lib directory or use Maven dependency if applicable.

Deploy on Tomcat

Add your project to Tomcat server in Eclipse.

Clean and build the project.

Start the Tomcat server.

Access the App
http://localhost:8080/FoodOrderingSystem/




## 📷 Screenshots

### 🏠 Home Page  
![Home Page Screenshot](https://github.com/Mahaboob-Basha-Shaik/Food-Ordering-System/blob/main/Screenshot%202025-06-22%20102900.png?raw=true)


### 🍽️ Restaurant Menu
![Restaurant Menu](screenshots/restaurant-menu.png)

---

### 🛒 Cart Page
![Cart Page](screenshots/cart.png)

---

### 💳 Checkout Page
![Checkout Page](screenshots/checkout.png)

---

### ✅ Order Confirmation
![Order Confirmation](screenshots/order-confirmation.png)

---

### 👤 User Profile Page
![Profile Page](screenshots/profile.png)





👨‍💻 Author
Shaik Mahaboob Basha

💼 Aspiring Full Stack Java Developer | Passionate about Web Development and Clean Code
📫 Let's Connect!
💼 [LinkedIn]...(https://www.linkedin.com/in/mahaboob-shaik-991380239)
📧 Email:maheboob2002basha@gmail.com.com
🧑‍💻 [GitHub]...(https://github.com/Mahaboob-Basha-Shaik)
🌐 [Portfolio Website : https://mahaboob-basha-shaik.vercel.app/]
📍 Location: India

---
> _“Code is like humor. When you have to explain it, it’s bad.” – Cory House_

