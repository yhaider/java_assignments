
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperandOne("2");
		c.setOperandTwo("3");
		c.setOperation("+");
		c.performOperation();
		c.getResults();

	}
	// Testing calculator and it works
}
