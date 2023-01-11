package hotel;

import java.util.Arrays;

public class Hotel {
    private Camera[] cameras;
    private Angajat[] angajats;
    private Client[] clients;

    public Hotel(int nrCamera, int nrAngajat, int nrClient) {
        cameras=new Camera[nrCamera];
        angajats=new Angajat[nrAngajat];
        clients=new Client[nrClient];
    }
    public Hotel(int nrCamera,Angajat[] angajat, Client[] client) {
        cameras=new Camera[nrCamera];
        //angajats=new Angajat[angajat.length];
        //clients=new Client[client.length];
        //cameras=camera;
        angajats=angajat;
        clients=client;
    }


    public void cazare(Angajat angajat, Client[] newClients){
        angajat.setNrClienti(angajat.getNrClienti()+1);
        int i=0;
        for(i=0;i<cameras.length;i++){
            if(cameras[i]==null)
                break;
        }
        if(i==cameras.length)
            return;
        else {
            //Camera newCamera=new Camera(i,4,newClients);
            //cameras[i]=newCamera;
            cameras[i]=new Camera(i,4,newClients);
            //cameras[i].setNr(i);
            //cameras[i].setCapacitate(4);
            //cameras[i].setClients(newClients);
            for(int j=0;j<newClients.length;j++){
                newClients[j].setNrCamera(i);
            }
            int k;
            for(k=0;k<clients.length;k++){
                if(clients[k]==null)
                    break;
            }

            for(int j=0;j< newClients.length;j++){
                clients[k]=newClients[j];
                k++;
            }
        }
    }
    public void sortareClients(){
        int i;
        for(i=0;i< clients.length;i++){
            if(clients[i]==null)
                break;
        }
        Arrays.sort(clients,0,i-1);
    }

    public void sortareAngajati(){
        int i=0;
        for(i=0;i< angajats.length;i++){
            if(angajats[i]==null)
                break;
        }
        Arrays.sort(angajats,0,i-1);
    }
    public void afisClients(){
        for(int i=0;i<clients.length;i++){
            if(clients[i]!=null)
                System.out.println(clients[i].toString());
            else
                System.out.println("null");
        }
    }

    public void afisAngajats(){
        for(int i=0;i<angajats.length;i++){
            if(angajats[i]!=null)
                System.out.println(angajats[i].toString());
            else
                System.out.println("null");
        }
    }

    public int getNrCamereGoale(){
        int k=0;
        for(int i=0;i<cameras.length;i++){
            if(cameras[i]==null)
                k++;
        }
        return k;
    }

    public int getNrCameraOcupate(){
        int k=0;
        for(int i=0;i<cameras.length;i++){
            if(cameras[i]!=null)
                k++;
        }
        return k;
    }

    public void setAngajats(Angajat[] angajats) {
        this.angajats = angajats;
    }
}
