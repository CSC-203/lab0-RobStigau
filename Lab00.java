import static java.lang.Character.charCount;

public class Lab00 {


    public static void main(String[] args) {

        //declaring and initializing some variables
        int x = 5;
        String y = "hello";
        double z = 9.8;

        //printing the variables
        System.out.println("x:" + x + "y:" + y + "z:" + z);

        //an array
        int[] nums = {3, 6, -1, 2};
        for (int j : nums) {
            System.out.println(j);
        }


        //call a function
        int numFound = charCount(y, 'l');
        System.out.println("Found: " + numFound);

        //a counting for loop
        for (int l = 1; l < 11; l++) {
            System.out.print(l + " ");
        }


    }

    public static int charCount(String s, char target) {
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count += 1;
            }
        }
        return count;
    }

}