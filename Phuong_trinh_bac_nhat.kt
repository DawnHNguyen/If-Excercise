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
    if (a == 0.0 && b == 0.0 && c == 0.0) {
        println("Phương trình vô số nghiệm")
    }
    if (a == 0.0 && b != 0.0 && c == 0.0) {
        println("Phưong trình vô nghiệm")
    }
    if (a!=0.0 && c == 0.0) {
        var x=-b/a
        println("Phương trình $a x+ $b =0 có nghiệm x="+x)

    }
    if(a!=0.0 && c!=0.0) {
        var x=(c-b)/a
        println("Phưong trình $a x + $b = $c có nghiệm x= "+x)
    }
}
