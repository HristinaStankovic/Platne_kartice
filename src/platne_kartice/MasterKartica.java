package platne_kartice;

public class MasterKartica extends PlatnaKartica {
        public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
            super(suma, brojKartice, godina, mesec);
        }

        @Override
        public void izvrsiTransakciju(double iznos) {
            double provizija = iznos * 0.015;
            dodajSredstva(iznos - provizija);
        }

        public void naplatiOdrzavanje() {
            dodajSredstva(-2);
        }

        @Override
        public void stampajPodatke() {
            System.out.println("Master Card: " + getMesec() + "/" + getGodina() + ", " + getBrojKartice() + ", $" + getSuma());
        }
    }

