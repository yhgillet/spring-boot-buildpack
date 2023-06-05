# Read Me First

### BPE_APPEND_JAVA_TOOL_OPTIONS fails at runtime

Build project:

```mvn package -Pappend_options```

Run container:
```shell
docker run spring-boot-buildpack:dev
```

When using `BPE_APPEND_JAVA_TOOL_OPTIONS` Error at startup:

```
Picked up JAVA_TOOL_OPTIONS: -Djava.security.properties=/layers/paketo-buildpacks_bellsoft-liberica/java-security-properties/java-security.properties -XX:+ExitOnOutOfMemoryError-Dfile.encoding=UTF-16 -XX:ActiveProcessorCount=6 -XX:MaxDirectMemorySize=10M -Xmx7431056K -XX:MaxMetaspaceSize=66523K -XX:ReservedCodeCacheSize=240M -Xss1M -XX:+UnlockDiagnosticVMOptions -XX:NativeMemoryTracking=summary -XX:+PrintNMTStatistics -Dorg.springframework.cloud.bindings.boot.enable=true
Unrecognized VM option 'ExitOnOutOfMemoryError-Dfile.encoding=UTF-16'
```

the option is not correctly appended , even delim doesnt do the trick

### BPE_APPEND_JAVA_TOOL_OPTIONS fails at runtime