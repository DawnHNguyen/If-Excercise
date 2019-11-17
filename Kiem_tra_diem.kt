package project.Dang.bai_tap_if

fun main(){
    print("Điểm có toạ độ x=")
    var x:Double=0.0
    var y:Double=0.0
    var a=readLine()
    if (a!=null) x=a.toDouble()
    print("y=")
    var b=readLine()
    if (b!=null) y=b.toDouble()
  if (x<1.0 && y<1.0 && x>-1.0 && y>-1.0)
      println("Điểm đã cho nằm trong hình tròn tâm O bán kính 1 ")
  else if (x==0.0 && y==0.0) println("Điểm đã cho là tâm O")
  else if (x==1.0 && y== 0.0 || x==-1.0 && y==0.0 ||y==1.0 && x== 0.0 || y==-1.0 && x==0.0) println ("Điểm đã cho nằm trên đường tròn tâm O bán kính 1")
  else println("Điểm đã cho nằm ngoài hình tròn tâm O bán kính 1 ")

}