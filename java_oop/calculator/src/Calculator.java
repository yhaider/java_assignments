
public class Calculator implements CalculatorInterface {
	 private double first;
	 private double second;
	 private String operand;
	 private double result;
	 private static String[] math = {"+", "-", "*", "/"};
	 // All attributes
	 
	 public Calculator() {}
	 // Constructor
	 
	 public double getOperandOne() {
		 return this.first;
	 }
	 public void setOperandOne(String operand) {
		 this.first = Double.parseDouble(operand);
	 }
	 public double getOperandTwo() {
		 return this.second;
	 }
	 public void setOperandTwo(String operand) {
		 this.second = Double.parseDouble(operand);
	 }
	 public String getOperation() {
		 return this.operand;
	 }
	 public void setOperation(String operation) {
		 if(operation.length() > 1) {
			 System.out.println("This operand is not a real operand. Too many characters.");
		 }
		 else {
			 for(int i = 0; i < 4; i++) {
				 if (math[i] == operation) {
					 this.operand = operation;
				 }
			 }
		 }
	 }
	 // Getters and setters for first, second, and operand
	 
	 @Override
	 public void performOperation() {
		 if(this.operand == "+") {
			 this.result = (this.first + this.second);
		 }
		 else if(this.operand == "-") {
			 this.result = (this.first - this.second);
		 }
		 else if(this.operand == "*") {
			 this.result = (this.first = this.second);
		 }
		 else if (this.operand == "/") {
			 this.result = (this.first / this.second);
		 }
	 }
	 // Overriding what's in the interface
	 // Performs the operation but does not show results
	 
	 @Override 
	 public double getResults() {
		 System.out.println(first + " " + operand + " " + second + " = " + result);
		 return result;
	 }
	 // Overriding what's in the interface
	 // Returns and prints the result
}
