public class Konto {
    int kontoNummer;
    String inhaber;
    double kontoStand;

    public void einzahlen(double betrag) {
        kontoStand += betrag;
    }

    public void abheben(double betrag) {
        kontoStand -= betrag;
    }

    public double getKontoStand() {
        return this.kontoStand;
    }
}
