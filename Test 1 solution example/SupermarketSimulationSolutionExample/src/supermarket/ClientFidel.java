package supermarket;

public class ClientFidel extends Client {
    private int puncte;

    public ClientFidel(int id, String nume, int puncte) {
        super(id, nume);
        this.puncte = puncte;
    }

    public int totalSuma() {
        return (int) ((0.5 * this.nr_produse) / 100 * this.suma);
    }

    public String toString() {
        return "Clientul fidel are id-ul " + this.id + ", numele " + this.nume + " si are " + this.puncte + " puncte si suma " + this.suma;
    }
}
