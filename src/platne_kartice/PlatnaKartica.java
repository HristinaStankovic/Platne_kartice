package platne_kartice;

public abstract class PlatnaKartica {

    private double suma;
    private String brojKartice;
    private int godina;
    private int mesec;

    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void dodajSredstva(double iznos) {
        suma += iznos;
    }

    public abstract void izvrsiTransakciju(double iznos);

    public abstract void stampajPodatke();
}

