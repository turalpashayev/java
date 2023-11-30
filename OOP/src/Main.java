public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp.age = 20;
        emp.name = "Ali";
        emp.jobTitle = "Engineer";

        emp1.age = 23;
        emp1.name = "Vali";
        emp1.jobTitle = "Doctor";

        emp2.age = 29;
        emp2.name = "Sam";
        emp2.jobTitle = "Admin Network";

        bar(emp);

    }

    static void bar (Employee e) {
        System.out.print(e.name + " " + e.age + " " + e.jobTitle);
    }
}
