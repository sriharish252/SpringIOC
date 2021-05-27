
import java.text.ParseException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws ParseException {
		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
		TransportService ts = apc.getBean("transportsrv", TransportService.class);
		ts.registerBooking(apc.getBean("booking",Booking.class));
		
	}

}
