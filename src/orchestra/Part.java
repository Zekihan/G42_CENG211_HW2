package orchestra;

import java.util.ArrayList;

public class Part {

	private Score[] part;
	private int size;
	private String tempo;
	
	public Part(String[] partStr) {
		ArrayList<String> scoreList = getMusicScores(partStr);
		ArrayList<Double> beatList = getBeats(partStr);
		Score[] part = new Score[partStr.length];
		for (int j = 0; j<partStr.length; j++) {
			Score score = new Score(beatList.get(j),scoreList.get(j));
			part[j] = score;
		}
		setPart(part);
		setTempo(null);
	}

	public Score[] getPart() {
		return part;
	}
	
	public Score getScore(int i) {
		return part[i];
	}

	public int getSize() {
		return size;
	}

	public void setPart(Score[] part) {
		this.part = part;
		this.size = part.length;
	}
	
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getTempo() {
		return tempo;
	}

	
	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
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
