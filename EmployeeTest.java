

public class EmployeeTest
{
 public static void main(String[] args){
 Employee ob1=new Employee();
 Employee ob2=new Employee();
 ob1.getFirstName();
 ob1.getLastName();
 ob1.getsalary();
  ob2.getFirstName();
 ob2.getLastName();
 ob2.getsalary();
 System.out.println("the yearly salary of employee "+ob1.FirstName+" "+ob1.LastName+" is  "+ob1.salary*12);
  System.out.println("the yearly salary of employee "+ob2.FirstName+" "+ob2.LastName+" is  "+ob2.salary*12);
 ob1.salary=13.2*ob1.salary;
 ob2.salary=13.2*ob2.salary;
System.out.println("incremented salary of employee "+ob1.FirstName+" "+ob1.LastName+" is "+ob1.salary);
System.out.println("incremented salary of employee "+ob2.FirstName+" "+ob2.LastName+" is "+ob2.salary);
}
}