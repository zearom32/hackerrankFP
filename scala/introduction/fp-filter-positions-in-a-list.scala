 def f(arr:List[Int]):List[Int] = arr match {
     case x::y::xs => y::f(xs)
     case _ => List[Int]()
 }