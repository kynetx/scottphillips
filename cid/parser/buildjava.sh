. ./myclasspath.sh
java org.antlr.Tool Ruleset.g -o output
mkdir output/classes
javac -d output/classes  output/Rule*.java json_java/*.java ParseRuleset.java
