package pl.javastart.task;

public class SkalaPodatkowa extends FormaOpodatkowania {
    private static final int PULAP_WOLNY_OD_PODATKU = 10_000;
    private static final int PODATEK_DO_KWOTY_DLA_18PROCENT_PODATKU = 100_000;

    public double wyliczPodatek(double przychody, double wydatki) {
        double dochody = przychody - wydatki;
        if (dochody < PULAP_WOLNY_OD_PODATKU) {
            return dochody;
        } else if (dochody > PULAP_WOLNY_OD_PODATKU && dochody < PODATEK_DO_KWOTY_DLA_18PROCENT_PODATKU) {
            return (dochody - PULAP_WOLNY_OD_PODATKU) * 0.18;
        } else if (dochody > PODATEK_DO_KWOTY_DLA_18PROCENT_PODATKU) {
            double obliczaniePodatkuDo100Tysiecy = (PODATEK_DO_KWOTY_DLA_18PROCENT_PODATKU - PULAP_WOLNY_OD_PODATKU) * 0.18; //16_200
            double resztaPodatku = dochody - PODATEK_DO_KWOTY_DLA_18PROCENT_PODATKU; //150_000 - 100_000 = podatek dla 50_000
            double obliczanieResztyPodatku = resztaPodatku * 0.32; //16_000
            return obliczaniePodatkuDo100Tysiecy + obliczanieResztyPodatku; //16_200 + 16_000 = 32_200
        }
        return dochody;
    }
}
