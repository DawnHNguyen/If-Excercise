package project.Dang.bai_tap_if

 fun main(){
     println("Kiểm tra năm có phải năm nhuận không?")
     println("Nhập năm:")
     var a:Int=0
     var s=readLine()
      if (s!= null)
         a=s.toInt()

     if (a%400==0 || a%4==0 && a%100!=0){
        println("Năm $a có 366 ngày, là năm nhuận" )
    }
     else
        println ("Năm $a có 365 ngày, không là năm nhuận")
 }