package com.test.retail

object RetailMain {


  def main(args: Array[String]): Unit = {

    //passing values to default constructor but passing wrong value for subtotal, so require function in class OrderItem will throw error
    //Exception in thread "main" java.lang.IllegalArgumentException: requirement failed: Invalid orderItemSubtotal

    //val oi= new OrderItem(1,1,1,3,100,50)

    val oi= new OrderItem(1,1,1,3,150,50)

    println(oi) // this is printing com.test.retail.OrderItem@4cdbe50f; we can override toString method; after override we got OrderItem(1,1,1,3,150.0,50.0)

    //invoking second constructor with 5 args, which will invoke the default constructor with calculated subtotal

    val oi1= new OrderItem(1,1,1,3,50)

    println(oi1)

    //invoke the companion objects apply method to create class object

    val oikls = OrderItemCaseKLS(1,1,1,3,150.0f,50.0f)

    println(oikls)  // is printing OrderItemCaseKLS(1,1,1,3,150.0,50.0) ie using the ovveride method for .toString() of case class

    println(oikls.orderItemId) // will print orderItemId value using setters of class class

    println(oikls.productArity) // will print number of class arguments

    println(oikls.productElement(0)) // will print first argument

    oikls.productIterator.foreach(println)  // will loop and print all elements of of class



  }






}
