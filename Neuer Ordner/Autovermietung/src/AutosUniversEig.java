public class AutosUniversEig {
    int _ps;
    int _preis;
    String _typ;
    String _marke;

    public AutosUniversEig(int ps, int preis, String typ, String marke){
        setPs(ps);
        setPreis(preis);
        setTyp(typ);
        setMarke(marke);
    }

    public void setPs(int _ps) {
        this._ps = _ps;
    }
    public void setPreis(int _preis) {
        this._preis = _preis;
    }
    public void setTyp(String _typ) {
        this._typ = _typ;
    }
    public void setMarke(String _marke) {
        this._marke = _marke;
    }

    public int getPs() {
        return _ps;
    }
    public int getPreis() {
        return _preis;
    }
    public String getTyp() {
        return _typ;
    }
    public String getMarke() {
        return _marke;
    }
}
