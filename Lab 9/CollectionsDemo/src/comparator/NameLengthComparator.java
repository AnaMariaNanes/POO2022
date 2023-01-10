package comparator;

import java.io.File;
import java.util.Comparator;

// NameLengthComparator Pentru a sorta dupa lungimea numelui de fisier/director (cel mai lung primul).
class NameLengthComparator implements Comparator<File> {

    // Interfata Comparator necesita definirea metodei compare.
    public int compare(File filea, File fileb) {
        int comp = fileb.getName().length() - filea.getName().length();
        if (comp != 0) {
            //... daca lungimile sunt diferite, am terminat.
            return comp;
        } else {
            //... daca lungimile sunt egale, sorteaza alfabetic.
            return filea.getName().compareToIgnoreCase(fileb.getName());
        }
    }
}