package student_database_application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_database {
    //kaç öğrenci eklemek istediğini sor
    // n sayısınıda yeni öğrenci oluştur
    public static void main(String[] args){
       // Student std = new Student();
        //std.studentNoDetermine();
        //std.lessonRegistration();
        //System.out.println(std.toString());

    //kaç öğrenci eklemek istedinilyor
        Scanner input = new Scanner (System.in);
        //System.out.println("kaç öğrenci girmak istersiniz:");
        //int numberOfStudents = input.nextInt();
        //dizi oluşturduk
        //int[] arr = new int[5];
        //student classından array oluşturduk
       // Student[] student = new Student[numberOfStudents];

        List<Student> std = new ArrayList<>();

        //n sayısıyla yeni öğrenci oluştur.
        //for(int i=0;i<numberOfStudents;i++){
            //obje oluşturma metodu
          //  student[i] = new Student();
            //student[i].studentNoDetermine();
            //student[i].lessonRegistration();
            //student[i].paymentAmount();
            //System.out.println(student[i].toString());

        //}
        int i=0;
        while(true){
            System.out.println(/*Student.mavi+*/"-----Ders kayıt ekranı------");
            std.add(new Student());
            std.get(i).studentNoDetermine();
            std.get(i).lessonRegistration();
            std.get(i).paymentAmount();
            System.out.println("-------------------");
            System.out.println("Devam etmek için D'ye basınız\nÇıkış için x'e basın");
            String exit =input.next().toUpperCase();
            if(exit.equals("x")){
                break;
            }else
                i++;


           //std.get(i).toString();
        }
        //std sadece bir class obje oluşturmadık
        //for(Student w:std){
          //  w= new Student();
            //w:





        //}
    }
}
