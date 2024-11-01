# Project Title: Calculator App Test Automation
## Overview : The project includes a test method that takes a series of arithmetic operations as input and verifies that the calculator app produces the correct result. The goal is to ensure that the calculator handles various expressions accurately.
## Test Method:
### The doSeries method is designed to accept a string representing a mathematical expression. It then passes this expression to the calculateSeries method, which performs the calculations and verifies the output.
## Prerequisites:
- JDK LTS Version
- NODEJS LTS Version
- Android SDK
- Appium
- Gradle
- Allure

## Preferred IDE:
- Intellij

## Emulator Setup:
Setup Android Studio Emulator

##How to run?
- Open CMD
- Write command npm i appium --global to install appium
- appium driver list
- appium driver install uiautomator2
- appium plugin list
- appium plugin install execute-driver
- appium --use-plugins=execute-driver to start the Appium Server
- Open Terminal of IDE (Intelij)
- Write command gradle clean test

### Allure repros
![Screenshot 2024-11-01 035637](https://github.com/user-attachments/assets/8ae1445a-2627-4639-8762-0aad99cebc27)


![Screenshot 2024-11-01 035743](https://github.com/user-attachments/assets/7937253b-888e-43e7-b749-d655c69543fc)



### Video


https://github.com/user-attachments/assets/1e5431ba-e5f6-4781-90bd-578657001405

