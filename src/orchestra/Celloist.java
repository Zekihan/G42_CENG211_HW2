package orchestra;

public class Celloist extends StringInstrumentMusician{

	private Part[] shouldPlay;

	public Celloist() {
		super();
	}

	@Override
	public void playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
		for (Part part : shouldPlay) {
			for (Score score : part.getPart()) {
				
			}
		}
		
	}
}
