public class Action {
	public Action() {}
	public interface Perform {
		void perf(double a, double b);
	}
	public void act(Perform c) {
		return c.calculate(a, b);
	}
	//idk what im doing
}