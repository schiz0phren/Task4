package Konto;

public class Main {

	public static void main(String[] args) {
		
		Konto k1 = new Konto("Yash", 100000000);
		Konto k2 = new Konto("negativ", -100);
		
		System.out.println(k1.getKontostand());
		k2.einzahlen(200);

	}

}
