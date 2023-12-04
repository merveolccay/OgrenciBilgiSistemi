package java101;

public class Course {
    Teacher teacher; //teacher sınıfının bütün özelliklerini buraya taşıdık.
    String name;
    String code;
    String prefix;
    int sozlu;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int sozlu = 0;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher =teacher;
        }else {
            System.out.println("Öğretmen ve ders Bölümleri uyuşmuyor.");
        }
        this.teacher = teacher;
    }
    void printTeacher(){
        this.teacher.print();
    }
}
