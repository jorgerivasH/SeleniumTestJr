# 🧪 Selenium & API Automation Project – QA Technical Assessment

This repository contains the deliverables for my **QA Automation Assessment**, showcasing both **manual and automated testing skills**.  
It includes functional web tests automated with **Selenium + Java + Maven + TestNG**, and API tests automated via **Postman**.

---

## 📋 Project Overview

The purpose of this repository is to demonstrate my ability to:

- Design manual and automated test cases
- Automate functional web tests using Selenium
- Automate API validations using Postman
- Structure a professional automation project using Maven and TestNG
- Document and explain the QA process clearly

---

## 📂 Repository Contents

| Folder/File | Description |
|--------------|-------------|
| `/src/test/java/tests/` | Selenium TestNG automated test cases (UI) |
| `/postman/` | Collection and test scripts for API testing |
| `/video/` | Short video demo of the test execution |
| `/docs/QA_Assessment_TestCases.xlsx` | Manual Test Cases document (functional + API) |
| `pom.xml` | Maven configuration file |
| `README.md` | Project documentation |

---

## 🧠 QA Assessment Summary

The QA assessment includes the following sections:

### **🧩 Section 1 – Manual QA**
- Created **detailed Test Cases** for:
  - User registration
  - Login (valid and invalid)
  - Field validations and edge cases
- Deliverable: attached pdf

### **⚙️ Section 2 – Automation QA**

#### **Part A: API Testing**
- Automated tests using **Postman** and the public API [ReqRes](https://reqres.in)
- Three API test cases included:
  1. Retrieve user list
  2. Retrieve single user
  3. Create user
- Each includes status code and field validations.
- Headers configured with API key: `x-api-key: reqres-free-v1`

#### **Part B: Web Automation**
- Web UI automation created using:
  - **Selenium WebDriver**
  - **Java**
  - **Maven**
  - **TestNG**
  - **WebDriverManager**
- Scenarios:
  - ✅ Login with valid credentials  
  - ❌ Login with invalid credentials  
- Implemented **Page Object Model (POM)** for maintainability
- Added **Log statements (log.info)** for clear test execution tracking

---

## 🧰 Tech Stack

| Component | Description |
|------------|-------------|
| **Java 17+** | Programming language |
| **Selenium WebDriver 4.x** | Browser automation |
| **TestNG** | Testing framework |
| **Maven** | Build and dependency management |
| **WebDriverManager** | Automatic driver setup |
| **Postman** | API automation tool |
| **IntelliJ IDEA** | IDE for Java development |
| **Log4j** | Logging utility |
