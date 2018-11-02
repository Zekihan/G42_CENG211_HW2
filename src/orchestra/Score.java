package orchestra;

public class Score {

	private double beat;
	private String type;
	
	public Score(double beat, String type) {
		setBeat(beat);
		setType(type);
	}

	public double getBeat() {
		return beat;
	}

	public void setBeat(double beat) {
		this.beat = beat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
