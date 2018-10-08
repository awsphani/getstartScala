package com.test.retail

/*
*
* OrderItem class with construct args as no var/val
*
* internally constructor will be created as
* public OrderItem(int,int,int,int,float,float)
*
*value classes, the primitive datatypes are created in constructor , scala classes are
* value classes, they behave as primitives and when need behave as class variables Int,Float
*hiding all the complexity from us, we just need to use Int, Float...
*itversity.com/topic/overview-of-classes/
*
*
* multiple constructors are defined using this keyword
*
* All classes extent Any
* we can override functions using keyword override
*
*
* orderItemSubtotoal=orderItemQuantity*orderItemProductPrice
*
*
*
* */


class OrderItem( var orderItemId : Int,
                 var orderItemOrderId: Int,
                 var orderItemProductId: Int,
                 var orderItemQuantity: Int,
                 var orderItemSubtotal: Float,
                 var orderItemProductPrice: Float) {


// create require ( special function similar to apply function)which will ensure subtotal=quantity*price

  require(orderItemSubtotal==orderItemQuantity*orderItemProductPrice, "Invalid orderItemSubtotal")

// will create additional constructor with 5 args using this keyword;  orderItemSubtotal which we can calculate bases on orderItemQuantity*orderItemProductPrice

  def this (orderItemId : Int,
        orderItemOrderId : Int,
        orderItemProductId: Int,
        orderItemQuantity: Int,
        orderItemProductPrice: Float) ={
   //invoke the default constructor with 6 args
   this(orderItemId,orderItemOrderId,orderItemProductId,orderItemQuantity,orderItemQuantity * orderItemProductPrice,orderItemProductPrice)
 }

//override toString method

  override def toString = "OrderItem(" +
                          orderItemId+
                          ","+
                          orderItemOrderId+
                          ","+
                          orderItemProductId+
                          ","+
                          orderItemQuantity+
                          ","+
                          orderItemSubtotal+
                          ","+
                          orderItemProductPrice+
                          ")"


}
