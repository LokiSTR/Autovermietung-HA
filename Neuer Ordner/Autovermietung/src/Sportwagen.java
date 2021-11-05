public class Sportwagen extends AutosUniversEig{
    int _maxgeschwindigkeit;

    public Sportwagen(int ps,int preis,String typ,String marke, int maxgeschwindigkeit){
        super(ps, preis, typ, marke);
        setMaxgeschwindigkeit(maxgeschwindigkeit);
    }

    public void setMaxgeschwindigkeit(int _maxgeschwindigkeit) {
        this._maxgeschwindigkeit = _maxgeschwindigkeit;
    }
    public int getMaxgeschwindigkeit() {
        return _maxgeschwindigkeit;
    }
}
