package Konto;

public class Konto {

String name; 
double kontostand;


public Konto(String name, double Kontostand) {
	this.kontostand = Kontostand;
	this.name = name;
	Homo hello  = new Homo();

}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getKontostand() {
	return kontostand;
}


public void setKontostand(double kontostand) {
	this.kontostand = kontostand;
	}

public void einzahlen(double betrag ) {
	if(betrag > 0) {
		kontostand +=betrag;
		R
	}else System.out.println("nur positive Werte");
	}

public void abheben(double betrag) {
	if(betrag > 0) {
		kontostand -= betrag;
	}else System.out.println("nur positive Werte");
	}
}




