- package help organize the java project
- group related classes together

consider:
import java.lang.*;

means import all classes from java.lang package
here java itself is a package which contains inner packages like java.lang, java.util, java.io etc.

//create a package
package mypackage; // this is the package declaration
> java -d . MyClass.java // this command will create a package named mypackage and compile the MyClass.java file into it

//adding existing class to a package
package mypackage; // this is the package declaration
> javac -d . MyClass.java // this command will compile the MyClass.java file and place it in the mypackage package