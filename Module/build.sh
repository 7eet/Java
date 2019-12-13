echo "compiling files"
javac -d output/classses/World src/World/module-info.java src/World/com/greet/world/World.java
javac -d output/classses/Hello -p output/classses/World src/Hello/module-info.java src/Hello/com/greet/hello/Hello.java
echo "Compiled Successfully"
echo "Creating jar files"
jar -cf output/lib/world.jar -C output/classses/World .
jar -cf output/lib/hello.jar -C output/classses/Hello .
echo "Created jar files."
