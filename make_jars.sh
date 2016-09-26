mkdir mlib

jar --create --file=mlib/dep.jar \
  --module-version=1.0 -C mods/dep .

jar --create --file=mlib/service.jar \
  --module-version=1.0 -C mods/service .

jar --create --file=mlib/hello.jar \
  --main-class=com.hello.Main --module-version=1.0 -C mods/hello .
