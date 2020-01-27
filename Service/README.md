## Service provider and consumer

<b> module </b><i>service.api</i><b> is the service interface</b>.
<i> service.implOne, service.implTwo and service.implThree </i><b> are the service providers. (implementation of service.)</b>

<b> module</b><i> consumer.main</i><b> is the consumer class which use the services.</b>

## Compile 
`javac --module-source-path . -d output/ $(find . -iname '*.java')`

## Run 
`java --module-path output -m consumer.main/consumer.main.Main`
