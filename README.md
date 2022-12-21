NOTE: All instructions on how to set up will be provided for macOS,
as I primarily work on this platform, but the test itself should work on all other OS systems.


To run this test will be required to install the following:
1. HomeBrew
2. Java
3. Maven
4. IntelliJ IDEA

First thing is to clone this repository to your local machine.

Install HomeBrew by using this URL https://brew.sh/

Install Java by using this URL https://formulae.brew.sh/formula/openjdk@17

Install Maven by using this URL https://formulae.brew.sh/formula/maven#default

NOTE: Yout will need to add both Java and Maven after installation to your environment variables
Open the terminal and run

    $ export JAVA_HOME=$(/usr/libexec/java_home -v17)
    $ export M2_HOME=/usr/local/apache-maven/apache-maven-<your_version>

IntelliJ installation by using URL: https://www.jetbrains.com/idea/download/
download latest version.
    
Open IntelliJ IDEA and go to `src/test/java/tests/` then open `SearchTests.java`
Then you need to hib Build Project Command+F9

Right clean on the test, and hit Run.
