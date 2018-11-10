package orchestra;

public class Drummer extends PercussionInstrumentMusicians{

	Part[] shouldPlay;
	
	public Drummer() {
	}

	@Override
	public void playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
		for (Part part : shouldPlay) {
			String tempo =	"";
			if ((tempo.equals("Prestissimo"))||(tempo.equals("Vivace"))||(tempo.equals("Allegretto"))) {
				for (Score score : part.getPart()) {
					if((score.getType().equals("C"))||(score.getType().equals("D"))||(score.getType().equals("E"))) {
						
					}
				}
			}
		}
		
		
	}

}
