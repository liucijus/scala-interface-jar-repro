import com.example.dep1.Hi
import com.example.dep2.Hello
import com.example3.Foo

object Main {
  // Scala OK: navigates to source, with full jar + source jar attached
  new Hi().sayHi("full jar")

  // Scala NOT OK: interface jar + source jar attached
  new Hello().sayHello("interface jar")

  // Java OK: interface jar + source jar attached
  new Foo().foo()
}
