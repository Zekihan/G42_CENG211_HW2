package orchestra;

import fileaccess.FileIn;

public class Concert {

	public Concert() {
		FileIn pieceInput = new FileIn();
		String[][] piece1Arr = pieceInput.readPiece("piece1.txt");
		String[][] piece2Arr = pieceInput.readPiece("piece2.txt");
		String[][] piece3Arr = pieceInput.readPiece("piece3.txt");
		String[][] piece4Arr = pieceInput.readPiece("piece4.txt");
		Piece piece1 = new Piece(piece1Arr);
		Piece piece2 = new Piece(piece2Arr);
		Piece piece3 = new Piece(piece3Arr);
		Piece piece4 = new Piece(piece4Arr);
		
		
	}
}
