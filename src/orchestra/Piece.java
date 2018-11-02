package orchestra;

import java.util.ArrayList;

public class Piece {

	
	private Score[][] piece;

	public Piece(String[][] piece) {
		
		this.piece = new Score[piece.length][piece[0].length];
	
		for (int i = 0; i<piece.length; i++) {
			ArrayList<String> scoreList = getMusicScores(piece[i]);
			ArrayList<Double> beatList = getBeats(piece[i]);
			
			for (int j = 0; j<piece[i].length; j++) {
				
				Score score = new Score(beatList.get(j),scoreList.get(j));
				this.piece[i][j] = score;
			}
		}
	}

	public Score[][] getPiece() {
		return piece;
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
