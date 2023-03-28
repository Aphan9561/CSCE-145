

public class HouseOfCats {

    public static void main(String[] args)
    {
        Cat cat01;
        cat01 = new Cat();//Calls the default constructor
        System.out.println(cat01.getName()+" "+cat01.getWeight()+" "+cat01.getNumberOfLegs());
        cat01.setName("Mr. Flufferkins");
        cat01.setWeight(8.0);
        System.out.println(cat01.getName()+" "+cat01.getWeight()+" "+cat01.getNumberOfLegs());

        Cat cat02 = new Cat("Triscut",9.2,4);
        //System.out.println(cat02.getName()+" "+cat02.getWeight()+" "+cat02.getNumberOfLegs());
        System.out.println(cat02);

        Cat cat03 = new Cat("Mr. Flufferkins", 8.0, 4);
        System.out.println(cat01.equals(cat02));
        System.out.println(cat01.equals(cat03));
        System.out.println(cat01 == cat03);

        cat03 = cat02;
        cat02.setName("Dr. Boots");
        System.out.println(cat03.getName());

    }

}
