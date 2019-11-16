package project.Dang.bai_tap_if

fun main(){
    println("Nhập độ dài ba đoạn thẳng")
    var sideA: Double=0.0
    var sideB: Double=0.0
    var sideC: Double=0.0
    var a=readLine()
     if (a!= null) sideA=a.toDouble()
    var b=readLine()
    if (b!= null) sideB=b.toDouble()
    var c=readLine()
    if (c!= null) sideC=c.toDouble()
  if ( (sideA + sideB)>sideC && (sideB+sideC)>sideA && (sideC+sideA)>sideB)
      println("Các độ dài đoạn thẳng đã nhập là của một tam giác có diện tích là:")
  else println ("Ba độ dài đã nhập không tạo thành tam giác")
}