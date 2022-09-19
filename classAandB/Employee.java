package classAandB;

public class Employee {

    // Attributes
    protected String name;
    private int code;
    public static double grossSalary;
    public static double tax;

    //Constructors
	public Employee(String name, int code) {
		this.name = name;
		this.code = code;
	}

    // Methods and Getters/Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static double netSalary() {
        return grossSalary - tax;
    }

    public static double bonus() {
        return grossSalary *= 30.0 / 100.0;
    }
}