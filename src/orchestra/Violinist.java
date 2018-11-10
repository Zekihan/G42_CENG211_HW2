package orchestra;

public class Violinist extends StringInstrumentMusician{

	
	
	private Part[] shouldPlay;

	public Violinist() {
		super();
	}

	@Override
	public void playPiece(Piece piece) {
		super.playPiece(piece);
		shouldPlay = super.getPlayed();
		String print = "Part ";
		for (int i = 0; i<shouldPlay.length; i++ ) {
			Part part = shouldPlay[i];
			print += i+":";
			String tempo =	part.getTempo();
			if (!(tempo.equals("Prestissimo"))) {
				for (Score score : part.getPart()) {
					print += score.getType();
				}
			}
			print += "/n";
		}
		
		
	}
}
