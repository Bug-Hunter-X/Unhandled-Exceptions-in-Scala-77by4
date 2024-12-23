```scala
class MyClass(val value: Int) {
  def myMethod(x: Int): Int = {
    try {
      if (x > 0) {
        value + x
      } else {
        throw new IllegalArgumentException("x must be positive")
      }
    } catch {
      case e: IllegalArgumentException => {
        println("Error: " + e.getMessage)
        0 // Return a default value
      }
    }
  }
}

val obj = new MyClass(5)
println(obj.myMethod(10)) // Output: 15
println(obj.myMethod(-1)) // Output: Error: x must be positive, then 0
```