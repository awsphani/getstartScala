object Comb {

  /*
  * object is singleton
  * Scala doesnot support static keyword like in java,
  * so create object type then all methods,variables become static, now can invoke using
  * classname. notations
  *
  *go to path of the project and use sbt console
  *
  * Comb.main(Array(" "))
  *
  *or sbt run - if only one main func in the project
  *
  * sbt "run 5,3" if only 1 main func
  * sbt run-main "Comb 5,3"
  * javap -p Comb$ ->class file , can see the metadata of the singleton class
  *
  * */

  def main(args: Array[String]): Unit ={
    print("Hello Comb")

    val n = args(0).toInt
    val r = args(1).toInt
    val c = HelloWorld.ncr(n,r)

    println("\n ncr for n="+n+",r="+r+" is"+c)

    // create object of Departments, mutable (val)or immutable (var)

    val d = new Departments(1, "HR")


  }



}
