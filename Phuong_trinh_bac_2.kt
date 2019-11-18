package project.Dang.bai_tap_if

fun bacnhat() {
    var b: Double=0.0
    var c: Double=0.0
    var d: Double=0.0
    if (b == 0.0 && c == d) {
        println("Phương trình vô số nghiệm")
    }
    if (b == 0.0 && c != d) {
        println("Phưong trình vô nghiệm")
    }
    if(b!=0.0) {
        println("Phưong trình $b x + $c = $d có nghiệm x=${(d-c)/b} ")
    }
}

fun main (){
    var a: Double=0.0
    var b: Double=0.0
    var c: Double=0.0
    var d: Double=0.0
    println("Phương trình ax^2 + bx + c = d có")
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
    print("d=")
    var p= readLine()
    if (n!=null)
        d=n.toDouble()
   if (a==0.0)
       bacnhat()
   if (a!=0.0){
        var D = (b*b - 4*a*(c-d))
    if (D < 0 )
        println("Phương trình vô nghiệm")
    if (D == 0.0)
        println ("Phương trình có nghiệm duy nhất x = ${-b/(2*a)}")
    if (D > 0){
        var M= Math.sqrt(D)
        println ("Phương trình có 2 nghiệm x1= ${(-b - M)/(2*a)} và x2= ${(-b + M)/(2*a)}")}
    }
}