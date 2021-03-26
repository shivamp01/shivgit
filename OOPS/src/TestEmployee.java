import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {
public static void main(String[] args) {
	
	//Employee e1=new Employee("shivam",300000);
	//e1.payslip();
	//System.out.println(e1.getSalary());
	//Employee e2=new Employee("zubair",500000);
	//e2.payslip();
	
	Manager m1=new Manager("sumit",9000,3000);
	//m1.payslip();
	//System.out.println(m1.getSalary());
	
	Executive ex1=new Executive("rohan",5000,2000);
	//ex1.payslip();
	//System.out.println(ex1.getSalary());
	
	showSalary(m1);
	showSalary(ex1);
	
}

private static void showSalary(Employee emp) {
	// TODO Auto-generated method stub
	if(emp instanceof Manager)
		System.out.println("Manager salary is"+emp.getSalary());
	else
		System.out.println("Executive salary is"+emp.getSalary());
}


//private static void showSalary(Executive ex1) {
//	// TODO Auto-generated method stub
//	System.out.println("Executive salary:"+ex1.getSalary());
//}
//
//private static void showSalary(Manager m1) {
//	// TODO Auto-generated method stub
//	System.out.println("manager salary:"+m1.getSalary());
//	
//}
}
