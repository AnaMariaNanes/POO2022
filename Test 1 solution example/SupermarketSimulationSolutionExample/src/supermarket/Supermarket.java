package supermarket;

public class Supermarket {
    protected Produs[] produse;
    protected Angajat[] angajati;
    protected ClientFidel[] clienti_fideli;

    public Supermarket(Produs[] produse, Angajat[] angajati, ClientFidel[] clienti_fideli) {
        this.produse = produse;
        this.angajati = angajati;
        this.clienti_fideli = clienti_fideli;
    }

    public void afiseazaProduse() {
        for (Produs produs : produse) {
            System.out.println(produs);
        }
    }

    public void afiseazaAngajati() {
        for (Angajat angajat : angajati) {
            System.out.println(angajat);
        }
    }

    public void afiseazaClientiFideli() {
        for (ClientFidel client : clienti_fideli) {
            System.out.println(client);
        }
    }

}
