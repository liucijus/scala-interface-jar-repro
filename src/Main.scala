import com.example.dep1.Hi
import com.example.dep2.Hello
import com.example3.Foo

object Main {
  def main(args: Array[String]) {
    println("runs!")

    // full jar
    new Hi().sayHi("full jar")

    // interface jar
    new Hello().sayHello("interface jar")

    // java interface jar
    new Foo().foo()
  }
}
