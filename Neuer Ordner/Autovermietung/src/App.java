public class App{

    static Gelaendewagen[] _gelaendewagen;
    static Kombi[] _kombi;
    static LKW[] _lkw;
    static Sportwagen[] _sportwagen;
    static boolean siebensitzer = false;
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        _gelaendewagen = new Gelaendewagen[20];
        _gelaendewagen[0] = new Gelaendewagen(150, 8900, "G Klasse", "Mercedes", 65);
        _gelaendewagen[1] = new Gelaendewagen(230, 12000, "Discovery", "Range Rover", 45);
        _gelaendewagen[2] = new Gelaendewagen(300, 18000, "Sport", "Range Rover", 30);

        _kombi = new Kombi[20];
        _kombi[0] = new Kombi(200, 16000, "XC 70", "Volvo", false);
        _kombi[1] = new Kombi(180, 26000, "H2", "Hammer", true);
        _kombi[2] = new Kombi(140, 19000, "Escalade", "Cadillac", true);
        
        _lkw = new LKW[20];
        _lkw[0] = new LKW(400, 30000, "Actros", "Mercedes", 29000);
        _lkw[1] = new LKW(400, 40000, "Atego", "Mercedes", 28000);
        _lkw[2] = new LKW(400, 50000, "Arocs", "Mercedes", 32000);

        _sportwagen = new Sportwagen[20];
        _sportwagen[0] = new Sportwagen(520, 89000, "Continental GT", "Bentley", 420);
        _sportwagen[0] = new Sportwagen(580, 90000, "DB 5", "Aston Marin", 580);
        _sportwagen[0] = new Sportwagen(320, 54000, "Taycan", "Porsche", 320);

        showAllGelaendewagen();
        System.out.println(" ");
        showAllKombi();
        System.out.println(" ");
        showAllLKW();
        System.out.println(" ");
        showAllSportwagen();
    }
/** 
    public static void showGelaendewagen(){
        int i = 0;
        System.out.println(i + " Der Wagen ist von " + _gelaendewagen[0].getMarke() + " und vom Typ " + _gelaendewagen[0].getTyp() + ". Er kostet  " + _gelaendewagen[0].getPreis() + "€. Er hat " + _gelaendewagen[0].getPs() + " PS und einen maximalen Kippradius von " + _gelaendewagen[0]. getKippradius() + " Grad");
    }  **/
    public static void showAllGelaendewagen(){
        int i = 0;
        for(Gelaendewagen a : getAllGelaendewagen()){
            if(a!= null){
                System.out.println(" Der Wagen ist von " + _gelaendewagen[i].getMarke() + " und vom Typ " + _gelaendewagen[i].getTyp() + ". Er kostet  " + _gelaendewagen[i].getPreis() + "€. Er hat " + _gelaendewagen[i].getPs() + " PS und einen maximalen Kippradius von " + _gelaendewagen[i].getKippradius() + " Grad");
            }
            i++;
        }
    }
    public static Gelaendewagen[] getAllGelaendewagen(){
        return _gelaendewagen;
    }


    public static void showAllKombi(){
        int i = 0;
        for(Kombi a : getAllKombi()){
            if (siebensitzer == true){
                if(a!= null){
                    System.out.println(" Der Wagen ist von " + _kombi[i].getMarke() + " und vom Typ " + _kombi[i].getTyp() + ". Er kostet  " + _kombi[i].getPreis() + "€. Er hat " + _kombi[i].getPs() + " PS und ist ein Siebensitzer");
                }
            }
            else {
                if(a!= null){
                    System.out.println(" Der Wagen ist von " + _kombi[i].getMarke() + " und vom Typ " + _kombi[i].getTyp() + ". Er kostet  " + _kombi[i].getPreis() + "€. Er hat " + _kombi[i].getPs() + " PS und ist kein Siebensitzer");
                }
            }
            i++;
        }
    }
    public static Kombi[] getAllKombi(){
        return _kombi;
    }

    public static void showAllLKW(){
        int i = 0;
        for(Gelaendewagen a : getAllGelaendewagen()){
            if(a!= null){
                System.out.println(" Der Wagen ist von " + _lkw[i].getMarke() + " und vom Typ " + _lkw[i].getTyp() + ". Er kostet  " + _lkw[i].getPreis() + "€. Er hat " + _lkw[i].getPs() + " PS und eine maximale Ladungskapazität von " + _lkw[i].getMaxLadung() + " Tonnen");
            }
            i++;
        }
    }
    public static LKW[] getAllLKW(){
        return _lkw;
    }

    public static void showAllSportwagen(){
        int i = 0;
        for(Sportwagen a : getAllSportwagen()){
            if(a!= null){
                System.out.println(" Der Wagen ist von " + _sportwagen[i].getMarke() + " und vom Typ " + _sportwagen[i].getTyp() + ". Er kostet  " + _sportwagen[i].getPreis() + "€. Er hat " + _sportwagen[i].getPs() + " PS und eine maximale Geschwindigkeit von " + _sportwagen[i].getMaxgeschwindigkeit() + " km/h");
            }
            i++;
        }
    }
    public static Sportwagen[] getAllSportwagen(){
        return _sportwagen;
    }
}
