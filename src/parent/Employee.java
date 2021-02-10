package parent;

public abstract class Employee {

    
   private String name;
   private int age;
   private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Employee() {

    }

    public Employee( String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void Work(){
        System.out.println(" Emloyee - awesome writing.  ---" + getName() + ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
    }

    public void goToVacation(){
        System.out.println(" parent.Employee say: I am going to Sochi ");
    }

    abstract public void goToDayOff();
    abstract public void printDeveloperGrade();

}
