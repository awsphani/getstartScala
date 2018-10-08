package com.test.retail

/*
*
* Companion Objects and case classes
*companion object will have same name as class name, we can access private var of class using companion object
*companion object has access rights to class/trait that other objects lack
*companion object can access private methods and attributes
*
* create class, object
* create apply method in the object
* instantiate object of the class in the apply method
*
*
* */

class CompA (private val message: String){

  object CompA{
    val a = new CompA("Hello Companion class")
    println(a.message)
  }

  println(CompA)
}
