object Solution {
    
    def fib(a:Int, b:Int):Stream[Int] = a #:: fib(b, a+b)
    val fibs = fib(0,1)
     def fibonacci(x:Int):Int = {
          if (x == 0) 0 else fibs(x-1)
      // Fill Up this function body
        // You can add another function as well, if required
     }

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(readInt()))

    }
}
