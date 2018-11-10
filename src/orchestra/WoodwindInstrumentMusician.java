package orchestra;

import java.util.ArrayList;

public class WoodwindInstrumentMusician implements Musician{

	private Part[] played;
	
	public WoodwindInstrumentMusician() {
		this.played = new Part[2];
	}

	@Override
	public void playPiece(Piece piece) {
		ArrayList<Part> play = new ArrayList<>();
		Part[] copy = piece.getPiece();
		for (int i = 0; i<piece.getSize(); i++) {
			for (int j = 0; j<copy.length; j++ ) {
				if(i!=j) {
					Part part = copy[j];
					if(part.equals(piece.getPart(i))) {
						play.add(piece.getPart(i));
					}
				}
			}
		}
		played = (Part[]) play.toArray();
	}

	public Part[] getPlayed() {
		return played;
	}
}
