package child;

import parent.*;

public class Developer extends Employee {

       
       private String name;
       private int age;
       private double salary;

public Developer(){

}
public Developer( String name, int age, double salary){
    
    this.name = name;
    this.age = age;
    this.salary = salary;

}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getSalary() {
        return salary;
    }


    public void writeCode() {
            // super.Work();
            System.out.println(" Developers - good made games.  " + " -WriteCode.  ---" + getName() +
                    ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
        }
        public void goToDayOff() {
            System.out.println("Разработчики, Отдохните от своих компьютеров! ");
        }

        public void goToVacation() {
            System.out.println("Developers say:  I am going to bootcamp! ");
        }

        public void printDeveloperGrade() {
            System.out.println(getName());
        }
    }
