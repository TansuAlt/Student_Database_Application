package student_database_application;

import java.util.Scanner;

public class Student {


    //valiables
    //constructor: isim,soyisim,yıl bilgisi
    //öğrenci no oluştur
    //derse kayıt ol
    //toplam borcu görüntüle
    //kayıttan sonra ekranda son durumu göster

    //renk kodları
    public static final String kirmizi = "\u0018[31n";
    public static final String yesil = "\u0018[32n";
    public static final String sari = "\u0018[33n";
    public static final String mavi = "\u0018[34n";
    public static final String mor = "\u0018[35n";
    public static final String beyaz = "\u0018[37n";


    private String name;
    private String lastname;
    private int year;
    private String studentNo;
    private String lessons = "";
    private int totalDebt;
    private int tuition = 600;
    private static int id = 1000;
    int sayac = 1;

    //constructor: isim,soyisim,yıl bilgisi
    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print(/*kirmizi+*/"Enter your name:");
        this.name = input.nextLine();
        System.out.print("Enter your lastname:");
        this.lastname = input.nextLine();
        System.out.print("What grade are you in?:");

        int sene = input.nextInt();
        while(sene>4 || sene<1){
            System.out.println(/*sari+*/"Yanlış bilgi girdiniz");
            sene= input.nextInt();
        }
        this.year = sene;




    }
    //öğrenci no oluştur
    public void studentNoDetermine(){
        id++;
        this.studentNo = id + "" + year ;
        System.out.println(studentNo);
    }
    //derse kayıt ol
    public void lessonRegistration(){
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Lesson List: \n" +
                "101 - History\n" +
                "103 - Mathematics\n" +
                "105 - English \n" +
                "107 - Chemical \n" +
                "109 - Computer Science " +
                "\n\n press X to exit ");
        do{
            System.out.println("Enter the code of the course you want to select: ");
            String lesson = input.next().toUpperCase();
            switch(lesson){

                case "101":
                    lessons = lessons +sayac+ " -History";
                    System.out.println("Selected lesson \n" + lessons);
                    viewDept();
                    sayac++;
                    break;
                case "103":
                    lessons = lessons +sayac+ " -Mathematics";
                    System.out.println("Selected lesson \n" + lessons);
                    viewDept();
                    sayac++;
                    break;
                case "105":
                    lessons = lessons +sayac+ " -English";
                    System.out.println("Selected lesson \n" + lessons);
                    viewDept();
                    sayac++;
                    break;
                case "107":
                    lessons = lessons +sayac+" -Checimal";
                    System.out.println("Selected lesson \n" + lessons);
                    viewDept();
                    sayac++;
                    break;
                case "109":
                    lessons = lessons +sayac+ " -Computer Science";
                    System.out.println("Selected lesson \n" + lessons);
                    viewDept();
                    sayac++;
                    break;
                case "X":
                    flag = false;
                    break;
                default:
                    System.out.println("You made an invalid transaction");
                   // lessonRegistration();//yanlış bir şey girildiğinde direkt terkar metodu çağırır atlar

            }
        }while(flag);

        System.out.println("Selected lessons: " + lessons);
        System.out.println("Total dept: " + totalDebt);


    }
    //toplam borcu görüntüleme
    public void viewDept(){
        totalDebt = totalDebt + tuition;
        System.out.println("Total dept: " + totalDebt);


    }
    //öğrenciye ne kadar ödeme yapacağını sor ve hesapla
    public void paymentAmount(){
        viewDept();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to be paid:");
        int payment = input.nextInt();
        totalDebt = totalDebt - payment;
        System.out.println("The amount you paid:" +payment+"$");
        System.out.println("Remainder dept:"+totalDebt);


    }

    //kayıttan sonra ekranda son durumu göster


    @Override
    public String toString() {
        return
                "Name Lastname : " + name +" "+ lastname + "\n"+
                "Student NO: " + studentNo + "\n" +
                "Year : " + year + "\n" +
                "Registered Lessons : " +lessons+"\n"+
                "Remainder Dept: " +totalDebt;



    }
}
