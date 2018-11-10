package orchestra;

public class BellPlayer extends PercussionInstrumentMusicians{

	private Part[] shouldPlay;
	
	public BellPlayer() {
		super();
	}

	@Override
	public String playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
		String print = "";
		String tempoChange = piece.getTempoChange();
		if ((tempoChange.equals("Stretto"))) {
			for (int i = 0; i<shouldPlay.length; i++ ) {
				Part part = shouldPlay[i];
				print +="Part " + (piece.getSize()-2+i) +":";
				String tempo = part.getTempo();
				if ((tempo.equals("Grave"))) {
					for (Score score : part.getPart()) {
						if((score.getType().equals("F"))||(score.getType().equals("G"))||(score.getType().equals("A"))||(score.getType().equals("B"))) {
							print += " " + score.getType();
						}
						else {
							print += " X";
						}
					}
				}
				print += " -- " + tempo + System.lineSeparator();
			}
		}
		return "Bell Playes"+System.lineSeparator()+print;
	}
}
