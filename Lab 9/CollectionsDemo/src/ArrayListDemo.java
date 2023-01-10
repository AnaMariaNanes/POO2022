import java.util.*;
import java.io.*;

/*Scrieți un program care să citească un fișier text,al cărui nume este primul argument de pe linia de comandă,
într-o List.Programul va tipări apoi linii aleatoare din fișier,numărul de linii fiind specificat de cel de-al doilea
argument din linia de comandă. Scrieți programul în așa fel,încât o colecție dimensionată corect se alocă toată
odată,în loc să fie expandată gradat pe măsură ce se citește fișierul.

Sugestie:Pentru a determina numărul de
linii din fișier folosiți java.io.File.length pentru a obține mărimea fișierului,apoi împărțiți această
dimensiune cu o mărime medie presupusă a unei linii.

Soluție:Deoarece accesăm aleatoriu lista vom folosi ArrayList.Estimăm numărul de linii din fișier împărțind
cu 50 mărimea fișierului.Apoi dublăm valoarea obținută,deoarece este mai eficient să supraestimăm decât să
subestimăm */

public class ArrayListDemo {
    public static void main(String[] args) {

        final int assumedLineLength = 50;

        File file = new File(args[0]);
        List<String> fileList = new ArrayList<>((int) (file.length() / assumedLineLength) * 2);
        BufferedReader reader = null;

        int lineCount = 0;
        try {
            reader = new BufferedReader(new FileReader(file));
            for (String line = reader.readLine(); line != null;
                 line = reader.readLine()) {
                fileList.add(line);
                lineCount++;
            }
        } catch (IOException e) {
            System.err.format("Nu pot citi %s: %s%n", file, e);
            System.exit(1);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
        int repeats = Integer.parseInt(args[1]);
        Random random = new Random();
        for (int i = 0; i < repeats; i++) {
            System.out.format("%d: %s%n", i,
                    fileList.get(random.nextInt(lineCount - 1)));
        }
    }
}
