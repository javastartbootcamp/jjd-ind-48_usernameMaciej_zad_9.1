package pl.javastart.task;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();

        System.out.printf("======= Firma: %s =======\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", "TODO");
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        return 0;
    }

    private double zsumujPrzychody() {
        return 0;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {

    }

    public void dodajWydatek(String nazwa, double wartosc) {
    }
}
