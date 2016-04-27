object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val in = io.Source.stdin.getLines
        val x1:String = in.next
        val x2:String = in.next
        println(x1.zip(x2).flatMap(a => List(a._1, a._2)).mkString)
    }
}