package child;

import parent.Employee;

public class Manager extends Employee {

    boolean hasStocks;

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public void writeProcedures(){
        //super.Work();
        System.out.println(" Managers - awesome work.  " + " -WriteProccess.  ---" + getName() + ", ЗАРПЛАТА МЕНЕДЖЕРА: " + getSalary() + ", ВОЗРАСТ: " +
                getAge() + ", АКЦИИ ТЕСЛА : " + isHasStocks());
    }

    public void goToVacation(){
        System.out.println("Managers say:  I am going to Antaliya ");
    }

    public void goToDayOff(){
        System.out.println("Менеджеры, Отдохните от своих дел!");
    }

}
