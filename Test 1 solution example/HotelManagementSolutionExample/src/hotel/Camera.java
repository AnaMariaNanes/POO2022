package hotel;

public class Camera {
    private int nr;
    private int capacitate;
    private Client[] clients;
    private int pret;

    public Camera(int nr, int capacitate, Client[] newClients) {
        this.nr = nr;
        this.capacitate = capacitate;
        this.clients = newClients;
        if(newClients.length==1)
            calculeazaPret(clients[0]);
        else{
            calculeazaPret(clients);
        }
    }

    public void calculeazaPret(Client x){
        this.pret=150;
    }

    public void calculeazaPret(Client[] x){
        this.pret=200;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }
}
