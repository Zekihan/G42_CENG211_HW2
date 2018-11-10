package orchestra;

public class BellPlayer extends PercussionInstrumentMusicians{

	private Part[] shouldPlay;
	
	public BellPlayer() {
		super();
	}

	@Override
	public void playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
		String tempoChange = "";
		if ((tempoChange.equals("Stretto"))) {
			for (Part part : shouldPlay) {
				String tempo =	"";
				if ((tempo.equals("Grave"))) {
					for (Score score : part.getPart()) {
						if((score.getType().equals("F"))||(score.getType().equals("G"))||(score.getType().equals("A"))||(score.getType().equals("B"))) {
							
						}
					}
				}
			}
		}
	}
}
