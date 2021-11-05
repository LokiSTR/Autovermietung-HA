public class Gelaendewagen extends AutosUniversEig {
    static int _kippradius;

    public  Gelaendewagen(int ps,int preis,String typ,String marke, int kippradius){
        super(ps, preis, typ, marke);
        setKippradius(kippradius);
    }

    public void setKippradius(int _kippradius) {
        this._kippradius = _kippradius;
    }
    public static int getKippradius() {
        return _kippradius;
    }
}
