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
		String print = "Part ";
		String tempoChange = piece.getTempoChange();
		if ((tempoChange.equals("Ritenuto"))) {
			print += "1:";
			for (Score score : shouldPlay[0].getPart()) {
				print += score.getType();
			}
			print += "/n";
		}
		else {
			for (int i = 0; i<shouldPlay.length; i++ ) {
				Part part = shouldPlay[i];
				print += i+":";
				for (Score score : part.getPart()) {
					print += score.getType();
				}
				print += "/n";
			}
		}
	}
}
