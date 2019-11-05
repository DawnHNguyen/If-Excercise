package Project.Dang.bai_tap_if

fun main() {
    var a:Double=0.0
    var b:Double=0.0
    var c:Double=0.0
    println("Phương trình ax + b= c có")
    print("a=")
    var s= readLine()
     if (s!= null)
         a=s.toDouble()
    print("b=")
    var m= readLine()
     if (m!= null)
         b=m.toDouble()
    print("c=")
    var n= readLine()
     if (n!=null)
          c=n.toDouble()
    if (a == 0.0 && b == c) {
        println("Phương trình vô số nghiệm")
    }
    if (a == 0.0 && b != c) {
        println("Phưong trình vô nghiệm")
    }
    if(a!=0.0) {
        println("Phưong trình $a x + $b = $c có nghiệm x=${(c-b)/a} ")
    }
}
