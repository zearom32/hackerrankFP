def f(arr:List[Int]):List[Int] = arr.foldLeft(List[Int]())((xs,x) => x::xs)
