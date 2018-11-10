package orchestra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class WoodwindInstrumentMusician implements Musician{

	private Part[] played;
	
	public WoodwindInstrumentMusician() {
		this.played = new Part[2];
	}

	@Override
	public String playPiece(Piece piece) {
		ArrayList<Part> play = new ArrayList<>();
		for (int i = 0; i<piece.getSize(); i++) {
			for (int j = (i+1); j<piece.getSize(); j++ ) {
				System.out.println(j);
				Part part = piece.getPart(j);
				if(part.equals(piece.getPart(i))) {
					play.add(part);
				}
			}
		}
		played = play.toArray(new Part[play.size()]);
		return null;
	}

	public Part[] getPlayed() {
		return played;
	}
}
