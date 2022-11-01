#!/bin/bash
javac -d build src/hbv/engineering/*.java
echo "Main-Class: hbv.engineering.Main" > MANIFEST.MF

(
  cd build
  jar cmf ../MANIFEST.MF ../engineering.jar .
)

rm MANIFEST.MF

java -jar engineering.jar
