/*
 * Written by Anna Phan
 */
public class AppleTester {

    public static void main(String[] args) {
        System.out.println("Welcome to the Apple Tester.");
        System.out.println("\nCreating a default apple. \nPrinting the default apple's value.");
        Apple apple01;
        apple01 = new Apple();
        apple01.setType("Gala");
        apple01.setWeight(0.0);
        apple01.setPrice(0.0);
        System.out.println("Type: "+apple01.getType()+" Weight: "+apple01.getWeight()+" Price: "+apple01.getPrice());

        System.out.println("\nCreating another apple. \nSetting new apple's values to the following, valid values.\n\"Granny Smith, 0.75, 0.99\"");
        System.out.println("Printing the new apple's values");
        Apple apple02 = new Apple("Granny Smith",0.75,0.99);
        System.out.println("Type: "+apple02.getType()+" Weight: "+apple02.getWeight()+" Price: "+apple02.getPrice());

        System.out.println("\nCreating another default apple. \nThen setting the new apple's values to the following, invalid values \"iPad 2.5 -200\"");
        Apple apple03 = new Apple("iPad",2.5,-200);
        System.out.println("Printing the newest apple's values which should not have changed from the default values");
        System.out.println("Type: "+apple03.getType()+" Weight: "+apple03.getWeight()+" Price: "+apple03.getPrice());

        System.out.println("\nChecking if the first and last apple have the same values.");
        System.out.println(apple01.equals(apple03));
    }
}
