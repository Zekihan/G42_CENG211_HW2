package orchestra;

public class Violist extends StringInstrumentMusician{
	
	private Part[] shouldPlay;

	public Violist() {
		super();
	}

	@Override
	public void playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
		String tempoChange =	"";
		if ((tempoChange.equals("Ritenuto"))) {
			for (Score score : shouldPlay[0].getPart()) {
				
			}
		}
		else {
			for (Part part : shouldPlay) {
				for (Score score : part.getPart()) {
					
				}
			}
		}
	}
}
