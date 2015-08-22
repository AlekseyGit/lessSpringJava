package classimpl;

import except.PerformanceException;
import iclass.Performer;

public class Juggler implements Performer{

	private int beanBags;
	
	public Juggler() {
		super();
		this.beanBags = 3;
	}

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
	}

	@Override
	public void perfom() throws PerformanceException {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
		
	}

}
