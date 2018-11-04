package orchestra;

public class Part {

	private Score[] part;
	private int size;
	
	public Part(Score[] part) {
		setPart(part);
		
	}

	public Score[] getPart() {
		return part;
	}
	
	public Score getScore(int i) {
		return part[i];
	}

	public int getSize() {
		return size;
	}

	public void setPart(Score[] part) {
		this.part = part;
		this.size = part.length;
	}
	
}
