CMDProcessorLibrary
===================

My implementation of AOKP's CMDProcessor as a standalone library.  
This provides a concise and easy-to-use Java abstraction layer for the UNIX Shell on Android.


__Examples:__
```java
// Executing a command
CMDProcessor.runShellCommand("touch /sdcard/test.txt");

// Executing a command as root
CMDProcessor.runSuCommand("mount -o remount,rw /system");

// Getting the standard output
String stdout = CMDProcessor.runShellCommand("echo HelloWorld").getStdout().toString(); //stdout == "HelloWorld"

// Getting the standard error stream
String stderr = CMDProcessor.runShellCommand("mount -o remount,rw /system").getStderr; //stderr = "mount: permission denied (are you root?)" 

// Check if the device is rooted
if (CMDProcessor.canSu()) { ... }
    
// Executing several commands at once
CMDProcessor.runShellCommand("echo test" + "\n" + "touch /sdcard/test.txt" + "\n" + "ls -n");
```
