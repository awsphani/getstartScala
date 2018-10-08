/*
*
*f = n1,d1
* s = n2, d2
* f+s = n1*d2+n2*d1/ d1*d2 ->override +
*toString = print n1/d1
*
* */

class FractionOverride(val n: Int, val d: Int) {

  override def toString = n + "/" + d

  def result = n/d.toDouble

  // below function takes one fraction and returns another fraction

  def +(p: FractionOverride) = {

    new FractionOverride((n * p.d + d * p.n),(d * p.d))

  }

}
object FractionOverride{

  def main(args: Array[String]): Unit = {

    val f = new FractionOverride(2,4)

    println(f)
    println(f.result)

    val s = new FractionOverride(3,5)

    println(s)
    println(s.result)

    //   2/4 + 3/5 -> 2*5+4*3,4*5
    val r = f + s

    println(r)


    println(r.result)






  }
}



