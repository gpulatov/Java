
public class Assign21 {
	public String str;
	public double val;

	public Assign21(String str, double val) {

		this.str = str;
		this.val = val;
	}

	public Assign21() {
		this.str = "JAVA";
		this.val = 0.0;
	}

	public Assign21(String str) {
		this.str = str;
		this.val = 0.0;
	}

	public Assign21(double val) {
		this.val = val;
		this.str = "JAVA";
	}

	public void print() {
		System.out.println("str: " + str + ", val: " + val);
	}
}