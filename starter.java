import java.util.ArrayList;

public class starter {
	public static void main(String args[]) {
		Calculator k = new Calculator();
		Calculator.Lm add = (a, b) -> a + b;
		Calculator.Lm sub = (a, b) -> a - b;
		Calculator.Lm mult = (a, b) -> a * b;
		Calculator.Lm div = (a, b) -> a / b;
		System.out.println("Adding... "+k.op(10,20,add));
		System.out.println("Subtracting... "+k.op(10,20,sub));
		System.out.println("Multiplying... "+k.op(10,20,mult));
		System.out.println("Dividing... "+k.op(10,20,div));
	}
}
