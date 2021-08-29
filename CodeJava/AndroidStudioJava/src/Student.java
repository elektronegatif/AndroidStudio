/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sefa_
 */
public class Student {

    private String name = "";
    private int Id = 0;
    private int Ave = 0;
    private String school = "";

    public Student(String name, int Id, int Ave, String school) {
        this.name = name;
        this.Id = Id;
        this.Ave = Ave;
        this.school = school;
        System.out.println("********************Student Info*****************");
        System.out.println("Name: " + name);
        System.out.println("Id: " + Id);
        System.out.println("Ave: " + Ave);
        System.out.println("School: " + school);
        System.out.println("*************************************************");

    }

    public String getName() {

        return name;

    }

    public int getId() {

        return Id;
    }

    public int getAve() {

        return Ave;
    }

    public String getSchool() {

        return school;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setId(int Id) {
        this.Id = Id;

    }

    public void setAve(int Ave) {
        this.Ave = Ave;

    }

    public void setSchool(String school) {
        this.school = school;

    }

}
