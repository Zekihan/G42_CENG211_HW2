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
		for (Part part : shouldPlay) {
			String tempo =	"";
			if (!(tempo.equals("Prestissimo"))) {
				for (Score score : part.getPart()) {
					
				}
			}
		}
		
		
	}
}
