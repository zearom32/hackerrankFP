object Solution {
    
  def dfs(m:Array[Array[Int]],n:Int,sr:Int,mc:Int,len:Int):Unit = {
    if (n > 0){
        val er = sr + len / 2
        val mr = sr + len / 4 + 1
        for (x <- mr to er;
             y <- mc - len/4 + x - mr to mc + len/4 - (x - mr)) {
            m(x)(y) = 0
        }
        dfs(m,n-1,sr,mc,len/2)
        dfs(m,n-1,mr,mc-len/4-1,len/2)
        dfs(m,n-1,mr,mc+len/4+1,len/2)
    }
  }
    
  def drawTriangles(n: Int) {
    //Draw the N'th iteration of the fractal as described 
    // in the problem statement
    val m = Array.ofDim[Int](32, 63)
    for (x <- 0 to 31;
         y <- 31 - x to 62 - (31-x)){
        m(x)(y) = 1
    }
    dfs(m, n, 0, 31, 63)
    for (x <- 0 to 31;
         y <- 0 to 62){
        if (m(x)(y) == 0) print("_") else print("1")
        if (y == 62) print("\n")
    }
  }

  def main(args: Array[String]) {
    drawTriangles(readInt())
  }
}