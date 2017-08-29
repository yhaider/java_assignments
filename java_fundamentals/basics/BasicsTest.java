import java.lang.ArrayIndexOutOfBoundsException;
import java.utils.ArrayList;

public class BasicsTest {

    public static void main(String[] args) {
        Basics basics = new Basics();

        basics.print1To255();
        basics.printOdd1To255();
        basics.printSum1To255();


        int[] arr = {1, 2, 3, 4, -11, -9, 7};

        basics.iterateArray(arr);

        basics.findMax(arr);

        basics.averageVal(arr);

        basics.oddArray();

        basics.squareVal(arr);

        basics.greaterThanY(arr, 2);

        basics.noNegs(arr);

        basics.maxMinAvg(arr);

        basics.shiftOne(arr);

    }
}
