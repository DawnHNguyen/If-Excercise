package project.Dang.bai_tap_if

fun main(){
    println("Điểm A có toạ độ (x1;y1)")
    print("x1=")
    var x1:Double=0.0
    var a=readLine()
    if (a!=null)  x1=a.toDouble()
    print("y1=")
    var y1:Double=0.0
    var b=readLine()
    if (b!=null)  y1=b.toDouble()
    println("Điểm B có toạ độ (x2;y2)")
    print("x2=")
    var x2:Double=0.0
    var c=readLine()
    if (c!=null)  x2=c.toDouble()
    print("y2=")
    var y2:Double=0.0
    var d=readLine()
    if (d!=null)  y2=d.toDouble()
   var M=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)
  println("Khoảng cách giữa điểm A và điểm B là ${Math.sqrt(M)}")
}