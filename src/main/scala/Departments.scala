/*
*
* sbt run-main "Comb 5,3"
*
* class Departments(departmentId : Int, departmentName: String){}
*
* the above will create a default constructor departmentId,departmentName ->constructor arguments
*
* if we use val or var it will be class variables
*
* class Departments( val departmentId : Int, val departmentName: String){}
* we will get two variables like java and 2 getters and constructors as we are using val we will not get setters
*
* private final int departmentId
* private final int departmentName:
* public int departmentId()
* public java.lang.string departmentName()
* public Departments(int,java.lang.string )
*
*class Departments( var departmentId : Int, var departmentName: String){}
* we will get setters also
*
* public void departmentId_$eq(int)
* public void departmentName_$eq(java.lang.string)
* */

class Departments(var departmentId : Int, var departmentName: String) {

  println("departmentId is: "+departmentId)

  println("departmentName is: "+departmentName)

}
