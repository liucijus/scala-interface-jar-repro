Demonstrates issue with Scala jar source attachment in Intellij if jar is interface

**Where to look at**:
[`src/Main.scala`](https://github.com/liucijus/scala-interface-jar-repro/blob/master/src/Main.scala)

There are three cases demonstrated:
 - Attached fully Scala compiled jar + source jar. Works: Navigates correctly to source file.
 - Attached just Scala interface jar + source jar. Does not work: navigates to class file.
 - Attached just Java interface jar + source jar. Works: navigates to source file.
 
Not needed to reproduce, but some background/motivation: 
Issue was discovered with Bazel build system which produces interface jars for performance reasons during one of compilation phases.
Scala interface jar is produced by Scala Bazel support https://github.com/bazelbuild/rules_scala
