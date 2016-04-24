object Solution {

    def f(x:Int, y:Int, m:scala.collection.mutable.Map[(Int, Int), Int]):Int = {
        if (y > x) return 0
        if (x < 0) return 0
        if (m.contains((x,y))) return m((x,y))
        m((x,y)) = f(x-1,y,m) + f(x-1,y-1,m)
        m((x,y))
    }
    
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val n = io.Source.stdin.getLines.next.toInt
        val m = scala.collection.mutable.Map[(Int, Int), Int]()
        m((0,0)) = 1
        for (x <- 0 to n-1;
             y <- 0 to x){
            print(f(x,y,m))
            if (y != x) print(" ") else print("\n")
        }
    }
}