  def f(num:Int,arr:List[Int]):List[Int] = arr match {
    case Nil => List[Int]()
    case x::xs => (1 to num).foldLeft(List[Int]())((l:List[Int],_:Int) => x::l) ++ f(num, xs)
  }