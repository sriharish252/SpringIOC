import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
		MemberShip mem = apc.getBean("mem", MemberShip.class);
		System.out.println(mem);
	}

}
