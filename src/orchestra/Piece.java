package orchestra;

import java.util.ArrayList;

public class Piece {

	private ArrayList<String> a;
	private String[][] piece;

	public Piece(String[][] piece) {
		this.piece = piece;
	}

	public String[][] getPiece() {
		return piece;
	}


	private 
	private ArrayList<String> getMusicScores(String[] part) {
		ArrayList<String> musicScores = new ArrayList<>();
		for (String string : part) {
			musicScores.add(string.substring(0, 1));
		}
		return musicScores;
	}
	private ArrayList<Double> getBeats(String[] part) {
		ArrayList<Double> musicScores = new ArrayList<>();
		for (String string : part) {
			musicScores.add(Double.parseDouble(string.substring(1)));
		}
		return musicScores;
	}
	
	
}
