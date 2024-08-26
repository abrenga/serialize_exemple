package com.aweb;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Student One = new Student("Antonietta", "Brenga");
        Student two = new Student("Anita", "Bella");
        Student tree = new Student("Jessica ", "Brengo");

        ArrayList<Student> miaClasseTest = new ArrayList<>();

        ManagementFile studentToInsert = new ManagementFile(miaClasseTest);
        String stringa = "C:/Boolean/java/serialize_exemple/file.txt";
        File file = new File(stringa);

        studentToInsert.writeOnFile(file);
    }
}