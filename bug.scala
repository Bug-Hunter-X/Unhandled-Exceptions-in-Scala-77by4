```scala
class MyClass(val value: Int) {
  def myMethod(x: Int): Int = {
    if (x > 0) {
      value + x
    } else {
      throw new IllegalArgumentException("x must be positive")
    }
  }
}

val obj = new MyClass(5)
println(obj.myMethod(10)) // Output: 15
println(obj.myMethod(-1)) // Throws IllegalArgumentException
```