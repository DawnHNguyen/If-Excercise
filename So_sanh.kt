package project.Dang.bai_tap_if

import kotlin.math.max

fun main(){
 class Gia_thiet
    println("Nhập 4 số nguyên")
    var min:Long
    var max:Long
    var a:Long=0
    var b:Long=0
    var c:Long=0
    var d:Long=0
    print("a=")
    var x=readLine()
    if (x!= null){a=x.toLong()}
    print("b=")
    var y=readLine()
    if (y!= null){b=y.toLong()}
    print("c=")
    var z=readLine()
    if (z!= null){c=z.toLong()}
    print("d=")
    var t=readLine()
    if (t!= null){d=t.toLong()}
 class tim_Max
  if (a>b && a>c && a>d)
      println("Số lớn nhất là $a")
  if (b>a && b>c && b>d)
      println("Số lớn nhất là $b")
  if (c>a && c>b && c>d)
      println("Số lớn nhất là $c")
  if (d>a && d>b && d>c)
      println("Số lớn nhất là $d")
 class tim_Min
  if (a<b && a<c && a<d)
      println("Số bé nhất là $a")
  if (b<a && b<c && b<d)
      println("Số bé nhất là $b")
  if (c<b && c<a && c<d)
      println("Số bé nhất là $c")
  if (d<b && d<c && d<a)
      println("Số bé nhất là $d")
}
