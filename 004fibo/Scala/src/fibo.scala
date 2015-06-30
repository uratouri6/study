object fibo extends App {

  var x1=1
  var x2=1
  var temp=0
  var n=10

  println(x1+"\n"+x2)

  for(i<-0 to n){
    temp = x2
    x2 += x1
    System.out.println(x2)
    x1 = temp
  }

  System.out.println("scalattenani")

  val lst = List(5,235,47,3,5346,355623);

  println(lst.max);
  println(lst.min);

}
