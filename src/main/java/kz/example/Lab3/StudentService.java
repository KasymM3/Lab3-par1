package kz.example.Lab3;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    List<Student> list = new ArrayList<>();
    long id = 0;

    public StudentService() {
        add(new Student(null, "Ilyas", "Zhuanyshev", 88));
        add(new Student(null,"Serik", "Erikov", 91));
        add(new Student(null,"Erik", "Serikov", 65));
        add(new Student(null, "Nurzhan", "Bolatov", 48));
        add(new Student(null, "Patrick", "Zuckerberg", 100));
        add(new Student(null, "Sabina", "Assetova", 33));
        add(new Student(null, "Madina", "Adletova", 77));
        add(new Student(null, "Karina", "Serzhanova", 51));
    }


    public List<Student> studentList (){
        return list;
    }

    public void add(Student student){
        student.setId(id++);
        student.setMark(grade(student.getExam()));
        list.add(student);
    }

    public String grade(int exam){

        if(exam>=90) return "A";
        if (exam>=75) return "B";
        if(exam>=60) return "C";
        if(exam>=50) return "D";

        return "F";
    }
}
