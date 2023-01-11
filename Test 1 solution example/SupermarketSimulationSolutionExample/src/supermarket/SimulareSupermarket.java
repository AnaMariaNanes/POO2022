package supermarket;

import java.util.Arrays;

public class SimulareSupermarket {
    public static void main(String[] args) {
        Produs[] produse = new Produs[]{new Produs("Faina", 6, 30), new Produs("Lapte", 3, 18), new Produs("Ciocolata", 10, 10)};
        Angajat[] angajati = new Angajat[]{new Angajat(1, "Ana"), new Angajat(2, "Marian"), new Angajat(3, "Dana")};
        ClientFidel[] fideli = new ClientFidel[]{new ClientFidel(10, "Popa", 12), new ClientFidel(11, "Daniela", 12), new ClientFidel(12, "Mara", 2), new ClientFidel(13, "Darius", 20)};
        Supermarket supermarket = new Supermarket(produse, angajati, fideli);

        supermarket.afiseazaProduse();
        System.out.println();
        supermarket.afiseazaAngajati();
        System.out.println();
        supermarket.afiseazaClientiFideli();

        supermarket.angajati[0].servire(supermarket.produse[0], 2, supermarket.clienti_fideli[0]);
        supermarket.angajati[0].servire(supermarket.produse[1], 2, supermarket.clienti_fideli[1]);
        supermarket.angajati[1].servire(supermarket.produse[0], 2, supermarket.clienti_fideli[2]);
        supermarket.angajati[0].servire(supermarket.produse[2], 2, supermarket.clienti_fideli[3]);

        System.out.println();
        supermarket.afiseazaAngajati();
        System.out.println();
        supermarket.afiseazaClientiFideli();

        //sortare cienti fideli
        Arrays.sort(supermarket.clienti_fideli);
        System.out.println();
        supermarket.afiseazaClientiFideli();

        //sortare angajati fideli
        Arrays.sort(supermarket.angajati);
        System.out.println();
        supermarket.afiseazaAngajati();

    }
}
