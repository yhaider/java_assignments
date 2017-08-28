
public class ManipulatorTest{
    public static void main(String[] args){

        Manipulator manipulator = new Manipulator();
        String str = manipulator.trimAndConcat(" Hello ", " World ");
        System.out.println(str);
        // Testing the trimAndConcat method

        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Hello", letter);
        Integer b = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // should get 4
        System.out.println(b); // should get null
        // Testing the first getIndexOrNull method

        String word = "Hello";
        String subword = "llo";
        String subword2 = "ang";
        Integer one = manipulator.getIndexOrNull(word, subword);
        Integer two = manipulator.getIndexOrNull(word, subword2);
        System.out.println(one); // should get 2
        System.out.println(two); // should get null
        // Testing the second getIndexOrNull method

        String test = manipulator.concatSubstring("Hello", 1, 2, "world"); // should get "eworld"
        System.out.println(test);
        // Testing the concatSubstring method

    }
}
