package orchestra;

import java.util.ArrayList;

public class Piece {

	
	private Part[] piece;

	public Piece(String[][] piece) {
		
		this.piece = new Part[piece.length];
	
		for (int i = 0; i<piece.length; i++) {
			ArrayList<String> scoreList = getMusicScores(piece[i]);
			ArrayList<Double> beatList = getBeats(piece[i]);
			Score[] part = new Score[piece[i].length];
			for (int j = 0; j<piece[i].length; j++) {
				Score score = new Score(beatList.get(j),scoreList.get(j));
				part[j] = score;
			}
			this.piece[i] = new Part(part);
		}
	}
	public Part[] getPiece() {
		return piece;
	}
	
	public Part getPart(int i) {
		return piece[i];
	}
	
	public int getSize() {
		return piece.length;
	}
	


	private ArrayList<String> getMusicScores(String[] part) {
		ArrayList<String> musicScores = new ArrayList<>();
		for (String string : part) {
			musicScores.add(string.substring(0, 1));
		}
		return musicScores;
	}
	private ArrayList<Double> getBeats(String[] part) {
		ArrayList<Double> beats = new ArrayList<>();
		for (String string : part) {
			beats.add(Double.parseDouble(string.substring(1)));
		}
		return beats;
	}
	
	
}
