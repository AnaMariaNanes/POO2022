package comparator;// File: arrays/filelist/Filelistsort.java
// Scop: Listarea conținutului directorului implicit(home) al unui utilizator
// Demonstreaza folosirea Comparators pentru a sorta acelasi tablou
// dupa doua criterii diferite.
// Author: Fred Swartz 2006-Aug-23 Public domain.

import java.util.Arrays;
import java.util.Comparator;
import java.io.*;

public class ComparatorDemo {
    public static void main(String[] args) {

        //... Creaza comparatorii pentru sortare.
        Comparator<File> byDirThenAlpha = new DirAlphaComparator();
        Comparator<File> byNameLength = new NameLengthComparator();

        //... Creaza un obiect a File pentru directorul utilizatorului.
        File dir = new File(System.getProperty("user.home"));
        File[] children = dir.listFiles();
        System.out.println("Fisierele dupa director, apoi alfabetic ");
        Arrays.sort(children, byDirThenAlpha);
        printFileNames(children);

        System.out.println("\nFisierele dupa lungimea numelui lor (cel mai lung primul)");
        Arrays.sort(children, byNameLength);
        printFileNames(children);
    }

    private static void printFileNames(File[] fa) {
        for (File oneEntry : fa) {
            System.out.println(" " + oneEntry.getName());
        }
    }
}
