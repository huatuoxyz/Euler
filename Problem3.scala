object Problem3 {

  def primefactor(x:Long,i:Long, maxIndex:Long):Long = {
    var index:Long = i
    if (x<=1){
      return maxIndex;
    }
    if(x%index==0){
      return primefactor(x/index, 2, index);
    }else{
      index+=1
      return primefactor(x, index, index);
    }
  }

  def main(arg:Array[String]):Unit = {
    println(primefactor(600851475143L,2,0));
  }

}
