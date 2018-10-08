package com.test.retail
/*
* apply method inside the CompB class
*
*
*
*
* */

class CompC(val i: Int) {

  def apply(i: Int) = {
    new CompC(i)
    println("apply method inside class CompC ;not inside object CompC")
  }

  object CompC{

    }


}
