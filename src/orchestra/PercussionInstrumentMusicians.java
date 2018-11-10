package orchestra;

public class PercussionInstrumentMusicians implements Musician{

	private Part[] played;
	public PercussionInstrumentMusicians() {
		this.played = new Part[2];
	}



	@Override
	public void playPiece(Piece piece) {
		int size = piece.getSize();
		Part lastSecond = piece.getPart((size-1));
		Part lastFirst = piece.getPart(size);
		played[0] = lastSecond;
		played[1] = lastFirst;
	}

	public Part[] getPlayed() {
		return played;
	}
	

}
