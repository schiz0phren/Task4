
public class Raute {
	private int anzahlStars;
	
	public Raute(int anzahlStars) {
		
		this.anzahlStars = anzahlStars;
		
		if(anzahlStars % 2 != 1) {
			System.out.println("Ungerade Zahl eingeben");
		}
			else {
				generate();
			}
			}
		
		
	
	
	public void generate() {
		
	}
}