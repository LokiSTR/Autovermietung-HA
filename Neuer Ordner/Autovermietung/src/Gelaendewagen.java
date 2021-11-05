public class Gelaendewagen extends AutosUniversEig {
    static int _kippradius;

    public  Gelaendewagen(int ps,int preis,String typ,String marke, int kippradius){
        super(ps, preis, typ, marke);
        setKippradius(kippradius);
    }

    public static void setKippradius(int a) {
        _kippradius = a;
    }
    public static int getKippradius() {
        return _kippradius;
    }
}
