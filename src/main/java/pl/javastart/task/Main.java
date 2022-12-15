package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);
        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);
        janNowakServices.wyswietlPodsumowanie();

        Firma burakDieta = new Firma("Burak Dieta", new SkalaPodatkowa());

        burakDieta.dodajPrzychod("Jedzenie", 50_000);
        burakDieta.dodajWydatek("Prąd, gaz", 15_000);
        burakDieta.wyswietlPodsumowanie();
    }
}
