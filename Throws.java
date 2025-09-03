class Example {
    int salary;

    Example(int salary) throws IllegalArgumentException {
        if (salary <= 0) {
            throw new IllegalArgumentException("salary cannot be negative");
        }
        this.salary = salary;
        System.out.println(salary);
    }
}

public class Throws {
    public static void main(String[] args) {
        try {
            new Example(12000); // No need to store in a variable if not used
        } catch (IllegalArgumentException e1) {
            System.out.println("Exception: " + e1.getMessage());
        }
    }
}
