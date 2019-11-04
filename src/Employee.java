public class Employee {
    public void setSalary(int salary) {
        salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return firstName+" "+lastName;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent){
        return salary+salary*percent/100;
    }

    int id;
    String firstName;
    String lastName;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + firstName+" "+lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(2,"Nikita","Gryznov",30000);
        System.out.println(employee);
        System.out.println("Name of employee: "+employee.getName());
        System.out.println("Salary for the year: "+employee.getAnnualSalary());
        System.out.println("Salary with a bonus of 10 percent: "+employee.raiseSalary(10));
    }
}
