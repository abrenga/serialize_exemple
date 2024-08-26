package com.aweb;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ManagementFile implements Serializable {
    ArrayList<Student> studentList;

    public ManagementFile(ArrayList<Student> student) {

        this.studentList = student;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void writeOnFile(File file) throws IOException {
        ObjectOutputStream binaryOut = new ObjectOutputStream(new FileOutputStream(file));
        Student[] studentArray = studentList.toArray(new Student[studentList.size()]);
        binaryOut.writeObject(studentArray);
        binaryOut.close();
    }


    public void readOnFile(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream binaryIn = new ObjectInputStream(new FileInputStream(file));
        try {
            Student[] studentArray = (Student[]) binaryIn.readObject();
            studentList.clear();
            studentList.addAll(Arrays.asList(studentArray));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
