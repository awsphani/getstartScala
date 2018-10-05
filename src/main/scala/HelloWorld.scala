import util.control.Breaks._
object HelloWorld {
  def main(args: Array[String]): Unit = {
    print("HelloOregon \n")
    print("Hello "+args(0))

    /*Declaring variables
    no need to define data types but tell ifs its mutable(var) or immutable(val) (like final in java)
    initialization in mandatory with val
    variables are statically typed, once data type is defined you cannot change to another data type
    there is no distinction such as primitive type or classes for primitive types
    int / Integer;
    all primitive types are classes in scala, if primitive needed scala compiler will take care of it
    value classes for primitives are Byte(signed 8 bits) -2^7 to -2^7-1,Short(signed16 bit),Int(signed32 bit),Long(signed64 bit),
    Char(16 bit unsigned 2^0 to 2^16-1 inclusive ),
    String(seq of chars),
    Float(32 bit single precision float),Double(32 bit double precision float),
    */

    val i = 0
    print(" \n i is " +i )
    val a: Int = 34
    print(" \n a is " +a )
    val l:Long = 12L
    print(" \n l is " +l )
    val f:Float = 12.0f
    print(" \n f is " +f )
    var p = 2

    print(" \n initial val of p"+p)
    p=5
    print(" \n initial val of p changed to "+p)

    //code blk assignment

    val c = {
      val t = 1;
      val j= math.pow(2,5)
      t-j
    }
    print(" \n  val of code blk c  "+c)

    /*
    * Programming constructs
    *if, while, for
    * */

    val r = (math.random*100).toInt
    val s = (math.random*100).toInt
    print("\n r and s are :"+r+": " +s)
    if(r>s){
      print(" \n r is greater than s ")
    }else if(r<s){
      print(" \n s is greater than r ")
    }else{
      print(" \n Both s and r are equal")
    }

    //ternary operator
    val res1= {
      if(s>r) s else r
    }
    print("\n res is "+res1)

    for(e <- 1 to 10 by 2)
      print("n e is:"+e)

    //Factorial

    val fact=5
    var res= 1
    for(e<-fact to 2 by -1 )
      res = res*e
    print("\n Factorial of " + fact +" is:"+res )

    //Fibs

    val fib =10

    var prev=0
    var curr=1
    print("\n prev and curr are: "+prev +" "+ curr+"\n")
    var result = 0
    for(e<- 2 to fib-1 ){
      result = prev +curr
      print(result)
      prev=curr
      curr=result
    }

    /*
    * functions
    * functions are expressions nor statements, functions can be nested,assigned to vars, can be returned, passes as args
    * default is call by value
    *functional programming is paradigm
    * advantages are  better modularity, parallelism and cloud computing
    * */

    print("\n factorial si: "+computefact(5))

    print("\n factorial recursive si: "+factr(5))

    print("\n fibs is: "+computefibs(10))
    //ncr= n!/((n-r)!*r!)
    print("\n ncr 5c2 is: "+ncr(5,2))

    print("\n ncr 5c2 is: "+ncr1(6,2))

    print("\n is Fib: "+isFib(8))

    /*
    * Higher order and Anonymous funcs
    *
    *Func can be a parameter of a function , a return variable
    *
    * */


    print("\n sum of numbers:"+sum(id,1,10))
    print("\n sum of squares of numbers:"+sum(sqr,1,10))
    print("\n sum of cubes of numbers:"+sum(cube,1,10))

    /*
    *
    * Anonymous funcs, need not have a name and can be assigned to variables, these vars
    * can be passes a parameters
    * */

    // anon funcs defined as vars, funct without name

    val i1 = (i: Int) => i
    val s1 = (i: Int) => i*i
    val c1 = (i: Int) => i*i*i

    print("\n anon func i1(10):"+ i1(10))
    print("\n anon func s1(10):"+ s1(10))
    print("\n anon func c1(10):"+ c1(10))


    /*
    * pass anon func as parameter to func(higherorder) like below
    *
    * */

    print("\n sum of numbers:"+sum((i: Int)=> i,1,10))
    print("\n sum of squares of numbers:"+sum((i: Int)=> i*i,1,10))
    print("\n sum of cubes of numbers:"+sum((i: Int)=> i*i*i,1,10))


    /*
    * Operators
    *
    * &&,||,==(compares attributes of the objects or objects ;not object references(same mem locs, in java == same address comp,==compares values in objects java), similar to equals in java)
    *
    *
    * in java
    *
    * String s1 = new String("HELLO");
    * String s2 = new String("HELLO");
    * System.out.println(s1 == s2); -> false both the objects s1,s2 have diff addresses
    * System.out.println(s1.equals(s2)); -> true, both objects have same value.
    *
    *
    *
    * In scala == is like equals in java
    *
    * ==, .equals are same in scala
    *


    * */

    val q= 2
    val q1=2

    println(q==q1)
    println(q.equals(q1))

  }

  def computefact(i: Int): Int = {
    var result = 1
    for(e<- i to 2 by -1){
      result = e*result
    }
    result
  }
//recursive function
  def factr(i: Int): Int = { if (i==1) 1 else i*factr(i-1)}

  def computefibs(i: Int): Any = {
    var prev =0
    var curr = 1
    var result =0
    print("\n"+prev+"\t"+curr)
    for(e<-3 to i){
      result= prev+curr
      print("\t"+result)
      prev=curr
      curr=result
    }

  }

  def ncr(n: Int,r: Int):  Int = {
    //ncr= n!/((n-r)!*r!)
    factr(n)/(factr(n-r)*factr(r))
  }
  // nested function

  def ncr1(n: Int, r: Int): Int  = {
    def factp(i: Int): Int =  {
      var res: Int = 1
      for (e <- i to 1 by -1)
        res = res * e
      res
    }
    factp(n) /(factp(n-r)*factp(r))
  }

  def isFib( p: Int): Any = {

    var prev = 0
    var curr = 1
    var result =0
    var flag= false
    
    if (p==0 || p==1) {
      flag = true
    }else{
      breakable {
          for(e<-1 to p){
             result= prev+curr
             if(result < p )
             {
                prev=curr
                curr=result
              }else if(result == p){
                flag = true
                break
              }else if(result > p){
                flag = false
                break
            }
          }
      }
    }
    flag
  }


  // higher order fun, taking func f as parameter, below func f has just def(which takes int and retuns int) as param
  def sum(f: Int => Int, a: Int, b: Int) : Int = {
    if(a > b) 0 else f(a) + sum(f,a+1,b)
  }

  def id(i: Int) = i

  def sqr(i: Int) = math.pow(i,2).toInt

  def cube(i: Int) = math.pow(i,3).toInt


}
