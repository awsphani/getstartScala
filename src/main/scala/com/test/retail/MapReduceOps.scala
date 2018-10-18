package com.test.retail

import scala.io.Source

class MapReduceOps {

  def sumsqs(lb: Int, ub: Int) : Int ={

    val l = (lb to ub).toList
    val f = l.filter(ele => ele % 2 == 0)
    val m = f.map(rec => rec * rec)

    var total =0
    for( e <- m) total += e
    total
  }

  def readFromFile( src: String) : Any ={


    /*
    *
    * fromFile is used to read data from a file
    * fromIterable is used to read data from collection
    * fromURI creates Source from a file with given file: URI
    * fromURL is used to read data from HTTP URL
    *
    * */

    //read from file ,get lines in to list

    val orderItems = Source.fromFile(src).getLines().toList
    print("orderItemId,orderItemOrderId,orderItemProductId,orderItemQuantity,orderItemSubTotal,orderItemProductPrice")
    print("\n Total line is the list  is:" + orderItems.size)
    print("\n first line is the list is:" + orderItems(0))

    print("\n first 10 line is the list are: \n" )

    orderItems.take(10).foreach(println)

    print("\n get all lines having orderItemOrderId =2 using filter and sum of all orderItemSubTotal  \n" )

    val orderItemsFilter = orderItems.filter(orderItem => orderItem.split(",")(1).toInt ==2)

    val orderItemsMap = orderItems.map(orderItem => orderItem.split(",")(4).toFloat)

    val sum1 = orderItemsMap.sum

    val sum2 = orderItemsMap.reduce((total,orderItemSubtotal) => total+orderItemSubtotal)

    val sum3 = orderItemsMap.reduce(_ + _)

    print("\n orderRevenue (sum of orderItemSubTotal) having orderItemOrderId =2 using list.sum: \n"+sum1 )

    print("\n orderRevenue (sum of orderItemSubTotal)  having orderItemOrderId =2 using list.reduce \n"+sum2 )

    print("\n orderRevenue (sum of orderItemSubTotal)  having orderItemOrderId =2 using list.reduce notation: \n"+sum3 )


    /*
    *
        A tuple is another data structure in Scala
        It can hold heterogeneous elements
        Syntax for tuple val t = (1, "Hello World")
        Another syntax for tuple val t: (Int, String) = (1, "Hello World")
        Tuple has a handful of methods
        Elements of tuples can be accessed using _ notation (t._1 will return 1 and t._2 return Hello World)
        If there are 2 elements it is called also known as pair
        Elements of a tuple can be collections and vice versa
        Tuple with collection val t = (1, List(1, 2, 3, 4))
        Collection with tuple  val t = List((1, "Hello"), (2, "World"))
        We will use tuples quite extensively in Spark as a key value pair
    *
    *
    *
    *
    * */


    val t = (1,1,957,1,299.98,299.98)
    print("\n sample tuple is "+t)
    print("\n")
    print(t._1)


  }

  def stringManipulate(src: String) : Any ={

    val orders = Source.fromFile(src).getLines().toList


    print("\n Total line is the list  is:" + orders.size)
    print("\n first line is the list is:" + orders(0))



    val str = orders(0)

    val a = str.split(",")

    var orderDate = a(1)


    print("\n al orderId = a(0).toInt is:" + a(0).toInt)
    print("\n Does a(1).contains(\"2013\") is:" + a(1).contains("2013"))
    print("\n orderDate.substring(0, 10)is:" + orderDate.substring(0, 10))
    print("\n orderDate.substring(5, 7)s:"   + orderDate.substring(5, 7) )
    print("\n orderDate.substring(11) is:"   + orderDate.substring(11))

    orderDate = orderDate.replace('-', '/').replace("07", "July")



    print("\n orderDate.replace('-', '/').replace(\"07\", \"July\") is:" + orderDate)

    print("\n orderDate.indexOf(\"2\") is:" + orderDate.indexOf("2"))
    print("\n orderDate.indexOf(\"2\",2) is:" + orderDate.indexOf("2",2))
    print("\n orderDate.length is:" + orderDate.length)




  }



}
