package java101;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "05423987665");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "05487921619");
        Teacher t3 = new Teacher("Külyutmaz","BIO", "15426983358");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("inek şaban", "123", "4", tarih,fizik,biyo);
        s1.addBulkExanNote(100,78,50,84,64,78);
        s1.issPass();

        Student s2 = new Student("Güdük Necmi","444", "4",tarih,fizik,biyo);
        s2.addBulkExanNote(54,95,74,84,65,35);
        s2.issPass();
    }
}
