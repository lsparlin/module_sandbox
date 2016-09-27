# My Module Sandbox
Just a little tinkering with JDK9 modules.   

## recompile classes in /mods directory
_also runs classes using java --module-path mods -m [module/Main]_

`./compile_and_run_java.sh`

## Create module jar files for each module (in /mlib)
`./make_jars.sh`

## Run jars on module path
`java -p mlib -m hello`

## Link modules in a Java runtime that only contains the needed modules
`link_it.sh`

## Execute runtime (specify module with Main class)
`./helloapp/bin/java -m hello`
