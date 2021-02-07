package child;

import parent.Employee;
import parent.Rank;

public class Specialist extends Employee {

    int levels;

    public Specialist() {

    }

    public Specialist(Rank rank, String name, int age, double salary) {
        super(rank, name, age, salary);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public void workWithClients(){
        //super.Work();
        System.out.println(" child.Specialist - awesome speak English. " + " -workWithClients. ---" + getName() + ", РАНГ СПЕЦИАЛИСТА: " + getLevels() +
                ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
    }

    public void goToVacation(){
        System.out.println("child.Specialist say: I am go to Stanbul");
    }
    public void goToDayOff(){
        System.out.println("Специалисты, Прогуляйтесь в эти выходные!");
    }
    public void printDeveloperGrade(){
        System.out.println(getName());
    }
}