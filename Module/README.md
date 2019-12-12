### How to compile and run module application through terminal

## `module-info.java` is module descriptor file. Which specifies that this module is dependent to any other module or this module exports the package so that other module can access the public classes which are in that package

1. **output**
  
  - **classes -** _It contains all the compiled classses_
 
  - **lib -** _It contains all the jar files_

2. **src**
  
 - **Hello -** _This directory contains two java files_
 
   `module-info.java` _- This module requires World module._
   
   `com/greet/hello/Hello.java` _- This is a simple java file which prints_ **Hello World**
 
 - **World -** _This directory also contians two java files_
 
   `module-info.java` _- It exports package_ **com.greet.world** _so that other module which requires this module can access only public classes available in the package._
   
   `com/greet/world/World.java` _- A simple java file with a public method which return _ **World** _ string._
