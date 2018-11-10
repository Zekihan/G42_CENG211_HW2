package orchestra;

public class Flutist extends WoodwindInstrumentMusician{

	private Part[] shouldPlay;
	
	public Flutist() {
		super();
	}

	@Override
	public void playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
	
	}
}
