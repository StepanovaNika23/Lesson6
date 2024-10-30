public class Employee {
    String name;
    String position;
    String email;
    String phone;
    double salary;
    int age;

    public Employee(String name, String position, String email, String  phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + "\n" + "Должность: " + position + "\n" + "E-mail: " + email + "\n" + "Телефон: " + phone + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age);
    }

    public static void main(String[] args) {
        Employee[] e = new Employee[5];
        e[0] = new Employee("Вася", "аналитик", "vasya@mailbox.com", "+79987776543", 68700.5, 34);
        e[1] = new Employee("Дима", "тестировщик", "dima@mailbox.com", "+79987776544", 75400.4, 30);
        e[2] = new Employee("Аня", "менеджер", "anna@mailbox.com", "+79987776545", 75600.3, 29);
        e[3] = new Employee("Лиза", "разработчик", "liza@mailbox.com", "+79987776546", 80000.1, 36);
        e[4] = new Employee("Саша", "дизайнер", "alex@mailbox.com", "+79987776547", 70800.8, 27);
        for (Employee employee : e)
            employee.printInfo();
    }
}
