# Cucumber-java-selenide-customWebDriver template
#### with Cucumber-java, Selenide library, Selenide Driver, and custom webdriver manager (Selenide WebDriverProvider) for:
* ##### chrome
* ##### firefox
* ##### chrome headless
* ##### firefox headless

### Prerequisites
* gradle
* Cucumber for Java plugin for IntelliJ
* Gherkin for IntelliJ
* chromedriver.exe (put it into project root)- chrome is set as default browser
* geckodriver.exe (put it into project root)- is needed for newer FF versions

### Initial
* clone repository
* open build.gradle file in IDE (IntelliJ)
* import dependencies with gradle

### Customise Cucumber tests
* add your .feature files with scenarios
* create custom steps class / steps classes page objects class / classes
* generate steps- in .feature file press 'alt+enter' shortcut and choose 'Create step definition' option, choose created steps class / steps classes to paste steps
* create custom page objects classes with methods
* delete example .feature files, steps classes and page objects classes

### How to run tests:
#### With gradle command:
###### To run Cucumber tests with custom runTests task and with default browser, type:
 * 'runTests'

###### To run Cucumber tests with custom runTests task and with chosen browser, type:
 * '-Dbrowser=chrome runTests'
 * '-Dbrowser=firefox runTests'
 * '-Dbrowser=chromeHeadless runTests'
 * '-Dbrowser=firefoxHeadless runTests'

###### To run Cucumber tests with default browser type:
* 'clean test'

###### To run Cucumber tests with chosen browser type:
 * 'clean -Dbrowser=chrome test'
 * 'clean -Dbrowser=firefox test'
 * 'clean -Dbrowser=chromeHeadless test'
 * 'clean -Dbrowser=firefoxHeadless test'

#### With IDE (JUnit):
* run CucumberRunner class
* or run .feature file / directory with .feature files / scenario in .feature file

#### Reports
Reports are placed in 'target' directory.
To run report in browser, open 'target\html\index.html' file and choose browser.

#### Gradle tests reports
Reports are placed in 'build' directory.
To run report in browser, open 'build/reports/tests/runTests/index.html' file and choose browser.

#### Gradle custom tasks
* runTests
* deleteCucumberReports
