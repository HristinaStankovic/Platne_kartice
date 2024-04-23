package platne_kartice;

class VisaKartica extends PlatnaKartica {
    private String ovlasćenoLice;

    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlasćenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlasćenoLice = ovlasćenoLice;
    }

    public String getOvlasćenoLice() {
        return ovlasćenoLice;
    }

    @Override
    public void izvrsiTransakciju(double iznos) {
        double provizija = Math.max(4, iznos * 0.018);
        dodajSredstva(iznos - provizija);
    }

    @Override
    public void stampajPodatke() {
        System.out.println("Visa Card: " + getBrojKartice() + ", " + getMesec() + "/" + getGodina() + ", $" + getSuma() + " " + getOvlasćenoLice());
    }
}
