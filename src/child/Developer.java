package child;

import parent.Employee;

public class Developer extends Employee {

    String grades;
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void writeCode(){
       // super.Work();
        System.out.println(" Developers - good made games.  " + " -WriteCode.  ---" + getName() +  ", РАНГ РАЗРАБОТЧИКА: " + getGrades() +
                ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
    }

    public void goToVacation(){
        System.out.println("Developers say:  I am going to bootcamp! ");
    }

    public void goToDayOff(){
        System.out.println("Разработчики, Отдохните от своих компьютеров! ");
    }
}
