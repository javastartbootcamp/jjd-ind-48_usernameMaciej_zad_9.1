package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {
    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochody = przychody - wydatki;
        return dochody * 0.19;
    }
}
