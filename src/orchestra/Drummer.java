package orchestra;

public class Drummer extends PercussionInstrumentMusicians{

	@Override
	public Part[] playPiece(Piece piece) {
		
		Part[] p = super.playPiece(piece);
		return p;
	}

}
