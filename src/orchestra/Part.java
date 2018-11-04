package orchestra;

public class Part {

	private Score[] part;
	
	public Part(Score[] part) {
		setPart(part);
	}

	public Score[] getPart() {
		return part;
	}

	public void setPart(Score[] part) {
		this.part = part;
	}
	
}
