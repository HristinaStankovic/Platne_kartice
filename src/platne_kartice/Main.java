package platne_kartice;

public class Main {
    public static void main(String[] args) {

        VisaKartica visa = new VisaKartica(200, "4012-1239-1221-3381", 2030, 11, "Jane Dou");
        visa.izvrsiTransakciju(100);
        visa.stampajPodatke();

        MasterKartica master = new MasterKartica(300, "4012-1239-1221-3382", 2027, 12);
        master.izvrsiTransakciju(150);
        master.naplatiOdrzavanje();
        master.stampajPodatke();

    }
}