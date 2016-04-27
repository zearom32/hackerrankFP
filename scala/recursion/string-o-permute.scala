object Solution {
    
    def dfs(s:List[Char]):List[Char] = s match {
        case x::y::xs => y::x::dfs(xs)
        case _ => s
    }
    
    def solve(s:String):Unit = {
        println(dfs(s.toList).mkString)
    }
    
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val in = io.Source.stdin.getLines
        val t = in.next.toInt
        in.foreach(solve _)
    }
}