package orchestra;

public class PercussionInstrumentMusicians implements Musician{

	@Override
	public Part[] playPiece(Piece piece) {
		
		int size = piece.getSize();
		Part lastSecond = piece.getPart((size-1));
		Part lastFirst = piece.getPart(size);
		Part[] p = new Part[1];
		p[0] = lastSecond;
		p[1] = lastFirst;
		return p;
	}

}
