package orchestra;

public class StringInstrumentMusician implements Musician{
	
	private Part[] played;
	
	public StringInstrumentMusician() {
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
