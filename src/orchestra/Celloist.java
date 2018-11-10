package orchestra;

public class Celloist extends StringInstrumentMusician{

	private Part[] shouldPlay;

	public Celloist() {
		super();
	}

	@Override
	public String playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
		String print = "Part ";
		for (int i = 0; i<shouldPlay.length; i++ ) {
			Part part = shouldPlay[i];
			print += i+":";
			for (Score score : part.getPart()) {
				print += score.getType();
			}
			print += "/n";
		}
		return print;
	}
}
