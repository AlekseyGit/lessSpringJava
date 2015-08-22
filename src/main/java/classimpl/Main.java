package classimpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import except.PerformanceException;
import iclass.Performer;

public class Main {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring/spring-idol.xml");
		Performer performer = (Performer) ctx.getBean("duke");
		performer.perfom();
		
		performer = (PoeticJuggler) ctx.getBean("poeticDuke");
		performer.perfom();
	}
}
