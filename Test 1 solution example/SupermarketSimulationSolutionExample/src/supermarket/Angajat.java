package supermarket;

public class Angajat extends Persoana implements Comparable<Angajat>{
    private int nr_clienti;

    public Angajat(int id, String nume) {
        super(id, nume);
        this.nr_clienti = 0;
    }

    public String toString(){
        return "Angajatul are id-ul "+ this.id+", numele "+this.nume+" si a sevit "+this.nr_clienti+" clienti";
    }

    @Override
    public int compareTo(Angajat a){
        return nr_clienti-a.nr_clienti;
    }

    public void servire(Produs p, int nr, ClientFidel c){
        c.nr_produse += nr;
        c.lista_produse[c.n++] = p;
        c.suma+= nr*p.getPret();
        nr_clienti++;
        p.nr_exemplare-=nr;
    }
}
