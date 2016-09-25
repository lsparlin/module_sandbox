javac -d mods/dep \
	$(find dep_mod -name "*.java")

javac -d mods/service \
  $(find service_mod  -name "*.java")

javac --module-path mods \
	-d mods/hello \
	$(find hello_mod  -name "*.java")

java --module-path mods -m hello/com.hello.Main
