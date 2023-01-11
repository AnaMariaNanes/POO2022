package supermarket;

public class Client extends Persoana implements Comparable<Client> {
    protected int nr_produse;
    protected Produs[] lista_produse;
    protected int n;
    protected int suma;

    public Client(int id, String nume) {
        super(id, nume);
        this.nr_produse = 0;
        this.n = 0;
        this.suma = 0;
        this.lista_produse = new Produs[10];
    }

    public int totalSuma() {
        return (int) (0.5 / 100 * this.suma);
    }

    @Override
    public int compareTo(Client c) {
        return  suma - c.suma;
    }
}

