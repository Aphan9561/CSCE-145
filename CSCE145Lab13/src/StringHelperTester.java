/*
 * Written by Anna Phan
 */
public class StringHelperTester {

    public static void main(String[] args) {

        System.out.println("Welcome to the String Helper Tester!");
        System.out.println("\nTesting Has All Unique Characters with \"facetiously\"");
        boolean UC1 = StringHelper.hasAllUniqueCharacters("facetiously");
        System.out.println(UC1);

        System.out.println("Testing Has All Unique Characters with \"banana\"");
        boolean UC2 = StringHelper.hasAllUniqueCharacters("banana");
        System.out.println(UC2);

        System.out.println("\nTesting Mesh Strings with \"harp\" and \"fiddle\"");
        String sM = StringHelper.meshString("harp", "fiddle");
        System.out.println(sM);

        System.out.println("\nTesting Replace Vowels with Oodle with \"burrito\"");
        String rV = StringHelper.replaceVowelsWithOodle("burrito");
        System.out.println(rV);

        System.out.println("\nTesting Weight with \"heavy\"");
        double W1 = StringHelper.weight("heavy");
        System.out.println(W1);

        System.out.println("\nTesting Weight with \"light\"");
        double W2 = StringHelper.weight("light");
        System.out.println(W2);
    }
}
