package Inheritance;

public class Student extends Person{

    private String college;

    private String year;

    public Student(String name){
        super(name);
        System.out.println("This is student con");
    }

    public String getName() {
        return college;
    }

    public void setName(String name) {
        this.college = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString(){
        return college;
    }
}
