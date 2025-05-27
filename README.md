# simple-to-do
### Automation Testing Task for React Native To-Do App

Automation Framework built with:

- [Java](https://www.java.com/en/)
- [Cucumber](https://cucumber.io/) - BDD/Gherkin
- [Maven](https://maven.apache.org/) - Dependency Management
- [Appium](https://appium.io/) - Automation for Apps
- [Allure Report](https://github.com/allure-framework/allure2) - Test Report

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for
development and testing purposes. See below instructions on how to setup the project on your local
environment.

### Prerequisites(Basic)

-   Java JDK 15(set JAVA_HOME environment variable)
-   IntelliJ
-   git

### Prerequisites(Mobile)

-   Android Studio SDK(set ANDROID_HOME environment variable)
-   Appium 2.17.1

## Running the tests

-   Setup and Install the below plugins in IntelliJ IDEA.

| Plugin                                                                           |
| -------------------------------------------------------------------------------- |
| [Cucumber For Java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java) |
| [Gherkin](https://plugins.jetbrains.com/plugin/9164-gherkin)                     |

-   Clone and open the project in IntelliJ using `pom.xml` file

## 1 - Mobile App Test Automation Execution

- **CLONE:** `git clone https://github.com/qaShujaatAli/simple-to-do.git`
  - checkout: `git checkout master`
- Launch an iOS simulator(ex: iPhone 16/iOS 18.1).
- Add simulator details in **MobileRunnerIOS1** class:
  - **UDID**.
  - **platformVersion**
  - **deviceName**
- Launch terminal and run cmd: 
  - `cd <project-root-dir>`
  - `appium --base-path /wd/hub --session-override --address 127.0.0.1 --port 4723`
  - This is important for appium to pick up app path which is saved within project directory.
    - If we dont wish to run appium from project root just simply start appium server and provide absolute app path under Reports/environment.properties.
- Run **MobileRunnerIOS1** class.

## 2 - Generate and view Run Report

**- Report Generation:**
  - Delete everything(json files) under 'Reports/allure-results' except **environment.properties**
  - `cd <project-root-dir>`
  - `allure generate Reports/allure-results/ --clean -o Reports/allureReport`
  - `allure open Reports/allureReport/`

## 3 - Existing Run Report
- Allure Report hosted here via github-pages: [Allure Report](https://qashujaatali.github.io/simple-to-do/#suites/87c3e575874b880631d0ba707d871cc1/7687c2ecc981b414/)