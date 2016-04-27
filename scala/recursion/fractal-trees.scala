object Solution {

    def show(a:Array[Array[Boolean]]):Unit = {
        a.foreach {
            b =>
            b.foreach{c => if (c) print("1") else print("_")}
            println
        }
    }
    def dfs(a:Array[Array[Boolean]], iter:Int, row:Int, col:Int, step:Int):Array[Array[Boolean]] = {
        if (iter > 0) {
            (0 to step-1).foreach(x => a(row-x)(col)=true)
            (0 to step-1).foreach(x => a(row-step-x)(col-1-x)=true)
            (0 to step-1).foreach(x => a(row-step-x)(col+1+x)=true)
            dfs(a, iter-1,row - 2 * step, col-step ,step>>1)
            dfs(a, iter-1,row - 2 * step, col+step ,step>>1)
        }
        a
        
    }
    
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        show(dfs(Array.ofDim[Boolean](63,100), io.Source.stdin.getLines.next.toInt, 62, 49, 16))
    }
}