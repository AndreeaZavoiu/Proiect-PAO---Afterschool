package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

// clasa serviciu care expune operatiile sistemului
public class Afterschool {

    // private Set<Student> students; // set = collection of unique elements
    private Student[] students;
    private List<Employee> employees; // list = to access the elements frequently by using the index
//    private int castigLunar;
    // private Map<, > ;  // map = to store the data in the form of key/value pair


    public Afterschool(Student[] students, List<Employee> employees) {
        this.students = students;
        this.employees = employees;
    }

    public Student[] getStudent() {
        return students;
    }
    public List<Employee> getEmployees(){
        return employees;
    }
    // public int getCastigLunar() {return castigLunar;}

    public void setStudent(Student[] students) {
        this.students = students;
    }
    public void setTeacher(List<Employee> employees) {
        this.employees = employees;
    }
    // public void setCastigLunar(int castigLunar) { this.castigLunar += castigLunar;}

    public void AddTeacher (Employee employee){
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "\nAfterschool Java" +
                "\n   Studenti inscrisi:" + Arrays.toString(students) +
                "\n\n   Angajati:" + employees +
                '}';
    }
}
