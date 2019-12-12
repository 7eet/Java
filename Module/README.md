## How to compile and run module application through terminal

<b> `module-info.java` is module descriptor file. Which specifies that this module is dependent to any other module or this module exports the package so that other module can access the public classes which are in that package
</b>

### Directories in this repo

1. **output**
  
    - **classes -** _It contains all the compiled classses_
 
    - **lib -** _It contains all the jar files_

2. **src**
  
    - **Hello -** _This directory contains two java files_
 
    - `module-info.java` _- This module requires World module._
   
    - `com/greet/hello/Hello.java` _- This is a simple java file which prints_ **Hello World**
 
    - **World -** _This directory also contians two java files_
 
    - `module-info.java` _- It exports package_ **com.greet.world** _so that other module which requires this module can access only public classes available in the package._
 
    - `com/greet/world/World.java` _- A simple java file with a public method which return_ **"World"**.

   > **_NOTE:_** If you do not export the package you get the compilation error.
   


### Compile and Create jar file

  * `$ javac -d output/classses/World \
		src/World/module-info.java \
		src/World/com/greet/World.java
	`

<i>Above line compile both java file and place compiled file in `output/classses/World`.</i>	
  

  * `$ jar -cf output/lib/world.jar -C output/classses/World .`

It creates jar file of `output/classses/World/` directory and store in `output/lib` and the name of jar file is **world.jar**	

  * `$ javac -d output/classses/Hello \ 
		-p output/classses \ 
		src/Hello/module-info.java \
		src/Hello/com.greet/hello/Hello.java
	`

`-p` is used for module path because world module is in `output/classses` and  hello module depends on world module.

  * `$ jar -cf output/lib/second.jar -C output/classses/Hello .`


### Run the application

 * ` java -p $modulepath -m $moduleName/$PackageWithMainFile`

> above is the synatx to run the module application.<br> $modulepath is path of the module,  $moduleName is the module name of main application file <br> $PackageWithMainFile is full package name with the name of main application file respectively.

 * `java -p output/classses -m hello/com.greet.hello.Hello`<br>
 **Output:**<br>
   `Hello World`


