package classimpl;

import except.PerformanceException;
import iclass.Poem;

public class PoeticJuggler extends Juggler {
	
	private Poem poem;
	
	public PoeticJuggler(Poem poem){
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem){
		super(beanBags);
		this.poem = poem;
	}
	
	public void perfom() throws PerformanceException{
		super.perfom();
		System.out.println("While reciting... ");
		poem.recite();
	}
	
	public void turnOn(){
		System.out.println("turnOn");
	}
	
	public void turnOff(){
		System.out.println("turnOff");
	}

	public void turnOnLights(){
		System.out.println("turnOnLights");
	}
	
	public void turnOffLights(){
		System.out.println("turnOffLights");
	}
}
