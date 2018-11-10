package orchestra;

public class WoodwindInstrumentMusician implements Musician{

	private Part[] played;
	
	public WoodwindInstrumentMusician() {
		this.played = new Part[2];
	}

	@Override
	public void playPiece(Piece piece) {
		played = piece.getPiece();
		
	}

	public Part[] getPlayed() {
		return played;
	}
}
