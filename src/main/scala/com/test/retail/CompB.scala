package com.test.retail
/*
*
*apply method inside the CompB object
*
* using apply method we can create object of CompB class and access its member variable i
*
* val a = CompB.apply(10)
* a.i
*
* can invoke the apply method just by using the object name like
* val a =  CompB(10)
* a.i
* like
*
*
* */

class CompB(val i: Int) {

  object CompB{

    def apply(i: Int) = {
      new CompB(i)
    }
  }

}
