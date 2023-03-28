/*
 * Written By Anna Phan
 */
public class AnimalCollection {
    private Animal[] animals;
    public static final int SIZE = 10;
    public AnimalCollection()
    {
        animals = new Animal[SIZE];
    }
    public Animal[] getAnimals()
    {
        return this.animals;
    }
    public void addAnimal(Animal anA)//Add animal
    {
        for(int i=0;i< animals.length;i++)
        {
            if(animals[i] == null)
            {
                animals[i] = anA;
                return;
            }
        }
        System.out.println("The collection animals is full!");
    }
    public void removeAnimals(String aN)//remove animal
    {
        for(int i=0;i<animals.length;i++)
        {
            if(animals[i] != null && animals[i].getName().equals(aN))
            {
                animals[i] = null;
                return;
            }
        }
        System.out.println("The animal was not found");
    }
    public void printAnimals()//print out collection
    {
        for(Animal A: animals)
        {
            if(A == null)
                continue;
            System.out.println(A);
        }
    }
}
