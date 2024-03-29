package OOP;

enum Roles {
    FULL_STACK,
    FRONT_END,
    BACK_END,
}

enum Level {
    ONE, TWO, THREE, FOUR, FIVE,
}

class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // GETTERS AND SETTERS

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Employee extends Person {
    private Roles role;
    private int salary;
    private String pay_rate;

    public Employee (String name, char gender, int age, Roles role) {
        super(name, gender, age);
        this.role = role;

        this.determineSalary(role);
    }

    private void determineSalary (Roles role) {
        switch (role) {
            case BACK_END -> this.salary = 3000;
            case FRONT_END -> this.salary = 2000;
            case FULL_STACK -> this.salary = 4500;
            default -> this.salary = 0;
        }

        this.pay_rate = "per month";
    }

    public int getSalary() {
        return this.salary;
    }

    public Roles getRole() {
        return this.role;
    }

    public String getPayRate() {
        return this.pay_rate;
    }

    public void setRole(Roles role) {
        this.role = role;
        this.determineSalary(role);
    }
}

class Student extends Person {
    Level level;
    int num_courses;

    public Student(String name, char gender, int age, Level level, int num_courses) {
        super(name, gender, age);
        this.level = level;
        this.num_courses = num_courses;
    }

    // GETTERS AND SETTERS

    public Level getLevel() {
        return this.level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getNumberOfCourses() {
        return this.num_courses;
    }
}

public class Inheritance {
    public static void main (String[] args) {
        Employee rash = new Employee("rash", 'M', 21, Roles.FRONT_END);

        Student brandy = new Student("Brandy", 'M', 18, Level.ONE, 7);

        System.out.println(rash.getName() + "' Salary = " + rash.getSalary());

        System.out.println(brandy.getName() + " is in level " + brandy.getLevel() + " and has age " + brandy.getAge());
        System.out.println("His brother " + rash.getName() + " has age " + rash.getAge() + " and is a " + rash.getRole() + " Engineer, earning " + rash.getSalary() + " " + rash.getPayRate());
    }
}