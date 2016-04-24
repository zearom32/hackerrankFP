object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val in = io.Source.stdin.getLines
        val t = in.next.toInt
        (1 to t).foreach{ _ =>
            val n = in.next.toInt
            val s = scala.collection.mutable.Map[Int, Int]()
            (1 to n).foreach{_ =>
                val Array(k,v) = in.next.split(" ").map(_.toInt)
                s += (k->v)
            }
            if (s.size == n)
                println("YES")
            else
                println("NO")
         }
    }
}