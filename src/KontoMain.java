public class KontoMain {
    public static void main(String[] args) {
        Konto kontoA = new Konto();
        kontoA.kontoNummer = 1007;
        kontoA.inhaber = "Emil Braun";
        kontoA.kontoStand = 560.60;
        printKonto(kontoA);

        kontoA.einzahlen(200.0);
        System.out.println(STR."Kontostand: \{kontoA.kontoStand}");
        kontoA.abheben(400.0);
        System.out.println(STR."Kontostand: \{kontoA.kontoStand}");

        Konto kontoB = new Konto();
        kontoB.kontoNummer = 1009;
        kontoB.inhaber = "Helga Schmitt";
        kontoB.kontoStand = 1340.0;
        printKonto(kontoB);
    }

    private static void printKonto(Konto konto) {
        System.out.println(STR."Kunde: \{konto.inhaber}");
        System.out.println(STR."Ihre Kontonummer lautet: \{konto.kontoNummer}");
        System.out.println(STR."Aktueller Kontostand: \{konto.kontoStand}");
    }
}
