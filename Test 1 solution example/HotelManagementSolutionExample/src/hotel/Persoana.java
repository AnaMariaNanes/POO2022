package hotel;

public class Persoana {
    private int id;
    private String nume;
    private String nrTel;

    public Persoana(int id, String nume, String nrTel) {
        this.id = id;
        this.nume = nume;
        this.nrTel = nrTel;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", nrTel='" + nrTel + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTel() {
        return nrTel;
    }
}
