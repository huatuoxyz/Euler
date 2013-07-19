object Problem1 {

  def main(arg:Array[String]):Unit = {
    var sum:Int = 0;
    for (i:Int <- 0 to 1000){
        if (i%3 == 0 || i%5==0){
            sum += i;
        }
    }
    println(sum)
  }
}
