package no.hib.dat100;

public class VipAnsatt extends Ansatt {

    private int viptillegg = 5000;    
    
    public VipAnsatt(String n, int f, String a, int l) {
        super(n, f, a, l);
    }
    
    // Overkj�ring av beregnMaanedslonn()
    @Override
    public int beregnMaanedslonn() {
        
        return getLonnstrinn() * 200 + 20000 + viptillegg;
        
        //Alternativt
        //return super.beregnMaanedslonn() + viptillegg;
    }
}
