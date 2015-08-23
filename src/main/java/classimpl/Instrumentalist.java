package classimpl;


import except.PerformanceException;
import iclass.Instrument;
import iclass.Performer;

public class Instrumentalist implements Performer{
	
	public Instrumentalist() {}
	
	private String song;
	
	public void setSong(String song) { // Внедрение мелодии
		this.song = song; 
	}
	
	public String getSong() {
		return song;
	}
	
	public String screamSong() {
		return song;
	}
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument) { // Внедрение
		this.instrument = instrument; // инструмента
	}

	@Override
	public void perfom() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}
}
