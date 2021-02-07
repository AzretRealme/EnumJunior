package child;

import parent.*;

public class Developer extends Employee {
    String grades;
    public Developer() {

    }

    public Developer(Rank rank, String name, int age, double salary) {
        super(rank, name, age, salary);
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void writeCode(){
        // super.Work();
        System.out.println(" Developers - good made games.  " + " -WriteCode.  ---" + getName() +
                ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
    }

    public void goToDayOff(){
        System.out.println("Разработчики, Отдохните от своих компьютеров! ");
    }

    public void goToVacation(){
        System.out.println("Developers say:  I am going to bootcamp! ");
    }

    public void printDeveloperGrade(){
        System.out.println(getName());
    }
}