import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    
	    ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO empdao = apc.getBean("empDAO",EmployeeDAO.class);
		
		DBConfig dbc = empdao.getDbconfig();
		System.out.println("Hi");
		System.out.println(dbc.getDriverName());
		System.out.println(dbc.getUrl());
		System.out.println(dbc.getUserName());
		System.out.println(dbc.getPassword());
	    
	}
}