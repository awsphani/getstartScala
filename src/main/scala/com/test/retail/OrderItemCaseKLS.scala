package com.test.retail


/*
*case class implements serializable(converting its state to byte stream to transmit object data across network),
*Serialization and Deserialization in Java with Example. Serialization is a mechanism of converting the state of an object into a byte stream.
* Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
* This mechanism is used to persist the object.
* case class will have companion object associated with it
*
* :javap -p OrderItemCaseKLS ->to check metadata of case class in sbt
* :javap -p OrderItemCaseKLS$ ->to check metadata of companion object in sbt
*
*
*OrderItemCaseKLS implements scala.Serializable,scala.Product
*scala.Product will have productArity(), productElement(int),productIterator() methods
*OrderItemCaseKLS have default toString() method
*case class parameters are val so we will get all getters; for normal class not setters as parameters are not val or var by default
*case class  will also have some copy(), override method for hashCode() methods
*case class will have companion object which will have apply(int,int,int,float,float) and unapply(OrderItemCaseKLS) methods
* using Apply method we are create the object of class
* can invoke the apply method just by using the object name, like below
*
*
*its always better to invoke the companion objects apply method to create class object
*
*val oikls = OrderItemCaseKLS(1,1,1,3,150.0f,50.0f)
*
*invoke the companion objects apply method to create class object

* val oikls = OrderItemCaseKLS(1,1,1,3,150.0f,50.0f)

* println(oikls)  // is printing OrderItemCaseKLS(1,1,1,3,150.0,50.0) ie using the ovveride method for .toString() of case class

* println(oikls.orderItemId) // will print orderItemId value using setters of class class

* println(oikls.productArity) // will print number of class arguments/attributes/elements

* println(oikls.productElement(0)) // will print first attribute of class

* oikls.productIterator.foreach(println)  // will loop and print all elements/attributes passed to create case class
*
* */
case class OrderItemCaseKLS (orderItemId : Int,
                             orderItemOrderId: Int,
                             orderItemProductId: Int,
                             orderItemQuantity: Int,
                             orderItemSubtotal: Float,
                             orderItemProductPrice: Float){




}
