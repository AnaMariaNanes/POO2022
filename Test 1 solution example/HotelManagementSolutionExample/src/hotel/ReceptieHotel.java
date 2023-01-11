package hotel;

public class ReceptieHotel {
    public static void main(String[] args) {
        Client client1=new Client(1,"Gigel","07221",2);
        Client client2=new Client(2,"Ana","07332",2);
        Client client3=new Client(3,"George","072332",1);
        Client client4=new Client(4,"Maria","0733442",3);
        Angajat angajat1=new Angajat(1,"Marcel","07222",12202022,0);
        Angajat angajat2=new Angajat(1,"Ionela","07222422",13202023,0);

        Hotel hotel=new Hotel(5,2,4);
        hotel.setAngajats(new Angajat[]{angajat1,angajat2});

        hotel.cazare(angajat1, new Client[]{client1, client2});
        hotel.cazare(angajat1, new Client[]{client3});
        hotel.cazare(angajat2, new Client[]{client4});

        System.out.println("Avem "+hotel.getNrCamereGoale()+" camere goale si "+hotel.getNrCameraOcupate()+" camere ocupate.");

        hotel.sortareClients();
        hotel.afisClients();

        hotel.sortareAngajati();
        hotel.afisAngajats();
    }
}
