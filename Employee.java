import java.util.Scanner;
public class Employee
{
 String FirstName;
 String LastName;
 double salary;
Employee()
{
 FirstName="";
 LastName="";
 salary=0.0;
}
public void getFirstName()
{
System.out.println("enter your first name");
 Scanner xx =new Scanner(System.in);
 FirstName=xx.next();
}
public void getLastName()
{
System.out.println("enter your last name");
Scanner yy =new Scanner(System.in);
LastName=yy.next();
}
public void getsalary()
{double c;
 System.out.println("enter your salary");
Scanner zz=new Scanner(System.in);
c=zz.nextDouble(); 
if(c>0)
{
salary=c;
}
else{
System.out.println("enter a valid salary");
getsalary();
}
}
}