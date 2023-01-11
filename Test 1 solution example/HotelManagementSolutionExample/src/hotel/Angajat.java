package hotel;

public class Angajat extends Persoana implements Comparable<Angajat>{
    private int dataAngajare;
    private int nrClienti;

    public Angajat(int id, String nume, String nrTel, int dataAngajare, int nrClienti) {
        super(id, nume, nrTel);
        this.dataAngajare=dataAngajare;
        this.nrClienti=nrClienti;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "id=" + this.getId() +
                ", nume='" + this.getNume() + '\'' +
                ", nrTel='" + this.getNrTel() + '\'' +
                ", dataAngajare=" + dataAngajare +
                ", nrClienti=" + nrClienti +
                '}';
    }

    public void setNrClienti(int nrClienti) {
        this.nrClienti = nrClienti;
    }

    public int getNrClienti() {
        return nrClienti;
    }
    public int compareTo(Angajat angajat){
        if(this.nrClienti==angajat.nrClienti)
            return 0;
        if(this.nrClienti<angajat.nrClienti)
            return -1;
        return 1;
    }
}
