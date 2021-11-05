public class LKW extends AutosUniversEig {
    int _maxLadung;

    public LKW(int ps,int preis,String typ,String marke, int maxLadung){
        super(ps, preis, typ, marke);
        setMaxLadung(maxLadung);
    }
    
    public void setMaxLadung(int _maxLadung) {
        this._maxLadung = _maxLadung;
    }
    public int getMaxLadung() {
        return _maxLadung;
    }
}
