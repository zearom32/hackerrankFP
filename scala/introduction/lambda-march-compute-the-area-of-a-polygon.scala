object Solution {

    def cal_area(a:Array[Int], b:Array[Int]):Double = {
        0.5 * (a(1)*b(0) - a(0) * b(1))
    }
    
    def cal_length(a:Array[Int], b:Array[Int]):Double = {
        val x:Double = a(0) - b(0)
        val y:Double = a(1) - b(1)
        Math.sqrt(x*x + y*y)
    }
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val in = io.Source.stdin.getLines
        val n = in.next.toInt
        val d = in.map(_.split(" ").map(_.toInt)).toList
        val ans = (0 to d.size -1).map(x => cal_area(d((x+1)%d.size), d(x))).sum
        println(ans)
    }
}