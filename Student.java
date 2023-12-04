package java101;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean issPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3 ){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.issPass = false;
    }

    void addBulkExanNote(int note1,int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {
        if (note1 >= 0 && note1 <= 100) {
            if (sozlu1 >= 0 && sozlu1 <= 100) {
                this.c1.note = (int) (note1 * (0.8) + sozlu1 * (0.2));
            }
        }
        if (note2 >= 0 && note2 <= 100) {
            if (sozlu2 >= 0 && sozlu2 <= 100) {
                this.c2.note = (int) (note2 * (0.8) + sozlu2 * (0.2));
            }
        }
        if (note3 >= 0 && note3 <= 100) {
            if (sozlu3 >= 0 && sozlu3 <= 100) {
                this.c3.note = (int) (note3 * (0.8) + sozlu3 * (0.2));
            }
        }
    }
    void issPass(){
        System.out.println("=================");
        this.avarage = (this.c1.note + this.c2.note + this.c3.note)/3.0;
        if(this.avarage >55){
            System.out.println("Sınıfı geçtiniz.");
            this.issPass = true;
        }else{
            System.out.println("Sınıfta kaldnız!");
            this.issPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + "Notu\t\t:"+ this.c1.note);
        System.out.println(this.c2.name + "Notu\t\t:"+ this.c2.note);
        System.out.println(this.c3.name + "Notu\t:"+ this.c3.note);
        System.out.println("Ortalamanız: "+ this.avarage);
    }
}
