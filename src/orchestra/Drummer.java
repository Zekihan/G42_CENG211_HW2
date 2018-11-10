package orchestra;

public class Drummer extends PercussionInstrumentMusicians{

	private Part[] shouldPlay;
	
	public Drummer() {
		super();
	}

	@Override
	public void playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
		String print = "Part ";
		for (int i = 0; i<shouldPlay.length; i++ ) {
			Part part = shouldPlay[i];
			print += i+":";
			String tempo =	part.getTempo();
			if ((tempo.equals("Prestissimo"))||(tempo.equals("Vivace"))||(tempo.equals("Allegretto"))) {
				for (Score score : part.getPart()) {
					if((score.getType().equals("C"))||(score.getType().equals("D"))||(score.getType().equals("E"))) {
						print += score.getType();
					}
					else {
						print += "X";
					}
				}
			}
			print += "/n";
		}
		
		
	}

}
