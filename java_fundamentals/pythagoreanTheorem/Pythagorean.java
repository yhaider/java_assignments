import java.lang.Math;

public class Pythagorean{
    public double calculateHypotenuse(int legA, int legB){
        double squareAndAdd = (legA * legA) + (legB * legB);
        double c = Math.sqrt(squareAndAdd);
        return c;
    }
}
