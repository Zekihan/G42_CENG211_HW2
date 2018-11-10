package orchestra;

public class Violinist extends StringInstrumentMusician{

	
	
	private Part[] shouldPlay;

	public Violinist() {
		super();
	}

	@Override
	public String playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
		String print = "Part ";
		for (int i = 0; i<shouldPlay.length; i++ ) {
			Part part = shouldPlay[i];
			print += (i+1)+":";
			String tempo =	part.getTempo();
			if (!(tempo.equals("Prestissimo"))) {
				for (Score score : part.getPart()) {
					print += score.getType();
				}
			}
			print += "/n";
		}
		return print;
		
	}
}
