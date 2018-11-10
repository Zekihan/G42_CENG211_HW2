package orchestra;

import java.util.ArrayList;

import fileaccess.FileIn;

public class Concert {
	
	Maestro maestro;

	public Concert() {
		this.maestro = new Maestro();
		
		FileIn pieceInput = new FileIn();
		String[][] piece1Arr = pieceInput.readPiece("piece1.txt");
		String[][] piece2Arr = pieceInput.readPiece("piece2.txt");
		String[][] piece3Arr = pieceInput.readPiece("piece3.txt");
		String[][] piece4Arr = pieceInput.readPiece("piece4.txt");
		
		Piece piece1 = createPiece(piece1Arr);
		
		ArrayList<Musician> musicians = new ArrayList<>();
		musicians.add(new Violinist());
		musicians.add(new Celloist());
		musicians.add(new Violist());
		musicians.add(new Flutist());
		musicians.add(new Drummer());
		musicians.add(new BellPlayer());
	
		//plays piece 1
		for (Musician musician: musicians) {	
			System.out.println(musician.playPiece(piece1));
		}
	
	}
	
	private Piece createPiece(String[][] piece2dArr) {
		Part[] pieceArr = new Part[piece2dArr.length];
		for (int i=0; i<piece2dArr.length; i++) {
			Part part = new Part(piece2dArr[i]);
			part.setTempo(maestro.partsTempo(part));
			pieceArr[i] = part;
		}
		Piece piece = new Piece(pieceArr);
		piece.setTempoChange(maestro.changeInTempo(piece));
		return piece;
	}
	
}
