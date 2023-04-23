To run parse variables to mvn, enviroment=qa tests will fail and screenshot will be made.
Example:
mvn -Dbrowser=chrome -Dsurefire.suiteXmlFiles=src/test/resources/testng-all.xml -Denvironment=dev clean test
