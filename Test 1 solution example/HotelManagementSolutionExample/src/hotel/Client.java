package hotel;

public class Client extends Persoana implements Comparable<Client>{
    private int nrCamera;
    public Client(int id, String nume, String nrTel, int nrCamera) {
        super(id, nume, nrTel);
        this.nrCamera=nrCamera;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + this.getId() +
                ", nume='" + this.getNume() + '\'' +
                ", nrTel='" + this.getNrTel() + '\'' +
                ", nrCamera=" + nrCamera +
                '}';
    }

    public void setNrCamera(int nrCamera) {
        this.nrCamera = nrCamera;
    }

    public int compareTo(Client client){
        return this.getNume().compareTo(client.getNume());
    }
}
