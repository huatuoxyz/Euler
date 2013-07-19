object Problem2 {                                                                                                                                                                       

  def fib(i:Int):Int = {
    if (i<=3){
      return i;
    }else{
      return fib(i-1) + fib(i-2);
    }
  }

  def calSum(i:Int, s:Int):Int = {
    var index = i
    var f = fib(i)
    var sum = s
    if ( f > 4000000 ){
      return sum
    }
    if ( f % 2 == 0 ){
      sum += f
    }
    index += 1
    calSum(index, sum)
  }

  def main(arg:Array[String]):Unit = {
    println(calSum(0, 0))
  }

}
