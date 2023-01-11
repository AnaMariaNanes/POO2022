package supermarket;

public class Produs {
    private String nume;
    private int pret;
    protected int nr_exemplare;

    public Produs(String nume, int pret, int nr_exemplare) {
        this.nume = nume;
        this.pret = pret;
        this.nr_exemplare = nr_exemplare;
    }

    public boolean verificareExemplare(){
        if(this.nr_exemplare>0)
            return true;
        else
            return false;
    }
    public String toString(){
        return "Produsul " + this.nume+" are pretul "+this.pret;
    }

    public int getPret() {
        return pret;
    }
}
