package orchestra;

public class Flutist extends WoodwindInstrumentMusician{

	private Part[] shouldPlay;
	
	public Flutist() {
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
