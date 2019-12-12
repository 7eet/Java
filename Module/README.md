### How to compile and run module application through terminal

1. **output directory contains two sub directories**
  - **classes -** _It contains all the compiled classses_
  - **lib -** _It contains all the jar files_
2. **src directory conatins two sub directories**
  - **Hello -** _This directory contains two java files _` module-info.java  com/greet/hello/Hello.java`         _This module depends on world module which is in World directory_
  - **World -** _This directory also contians two java files_ ` module-info.java com/greet/world/World.java `
 _This module exports this package (com.greet.world)_
