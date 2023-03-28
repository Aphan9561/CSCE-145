/*
 * Written by Anna Phan
 */
public class Dresser {
    private Clothing [][] clothes;
    public static final int DRAWERS = 5;
    public static final int ITEMS = 10;
    public Dresser()
    {
        clothes = new Clothing[DRAWERS][ITEMS];
    }
    private int undergarments = 0;
    private int socksAndStockings = 0;
    private int tops = 0;
    private int bottoms = 0;
    private int capes = 0;
    public void addClothing(Clothing ad)
    {
        if(ad.getType().equalsIgnoreCase("undergarments"))
        {
            if(undergarments<10)
            {
                for (int i = 0; i < ITEMS; i++)
                {
                    if (clothes[0][i] == null)
                    {
                        clothes[0][i] = ad;
                        i=ITEMS;
                        undergarments++;
                    }
                }
            }
            else
                System.out.println("Drawer is full");
        }
        else if(ad.getType().equalsIgnoreCase("socks")||ad.getType().equalsIgnoreCase("stockings"))
        {
            if(socksAndStockings<10)
            {
                for (int i = 0; i < ITEMS; i++)
                {
                    if (clothes[1][i] == null)
                    {
                        clothes[1][i] = ad;
                        i=ITEMS;
                        socksAndStockings++;
                    }
                }
            }
            else
                System.out.println("Drawer is full");
        }
        else if(ad.getType().equalsIgnoreCase("top"))
        {
            if(tops<10)
            {
                for (int i = 0; i < ITEMS; i++)
                {
                    if (clothes[2][i] == null)
                    {
                        clothes[2][i] = ad;
                        i=ITEMS;
                        tops++;
                    }
                }
            }
            else
                System.out.println("Drawer is full");
        }
        else if(ad.getType().equalsIgnoreCase("bottom"))
        {
            if(bottoms<10)
            {
                for (int i = 0; i < ITEMS; i++)
                {
                    if (clothes[3][i] == null)
                    {
                        clothes[3][i] = ad;
                        i=ITEMS;
                        bottoms++;
                    }
                }
            }
            else
                System.out.println("Drawer is full");
        }
        else if(ad.getType().equalsIgnoreCase("cape"))
        {
            if(capes<10)
            {
                for (int i = 0; i < ITEMS; i++)
                {
                    if (clothes[4][i] == null)
                    {
                        clothes[4][i] = ad;
                        i=ITEMS;
                        capes++;
                    }
                }
            }
            else
                System.out.println("Drawer is full");
        }
        else
            System.out.println("Dresser is full.");
    }
    public void removeClothing(Clothing aR)
    {
        if(aR.getType().equalsIgnoreCase("undergarments"))
        {
            for (int i = 0; i < ITEMS; i++)
            {
                if (clothes[0][i] != null)
                {
                    clothes[0][i] = null;
                    i=ITEMS;
                    undergarments--;
                }
            }
        }
        else if(aR.getType().equalsIgnoreCase("socks")||aR.getType().equalsIgnoreCase("stockings"))
        {
            for (int i = 0; i < ITEMS; i++)
            {
                if (clothes[1][i] != null)
                {
                    clothes[1][i] = null;
                    i=ITEMS;
                    socksAndStockings--;
                }
            }
        }
        else if(aR.getType().equalsIgnoreCase("top"))
        {
            for (int i = 0; i < ITEMS; i++)
            {
                if (clothes[2][i] != null)
                {
                    clothes[2][i] = null;
                    i=ITEMS;
                    tops--;
                }
            }
        }
        else if(aR.getType().equalsIgnoreCase("bottom"))
        {
            for (int i = 0; i < ITEMS; i++)
            {
                if (clothes[3][i] != null)
                {
                    clothes[3][i] = null;
                    i=ITEMS;
                    bottoms--;
                }
            }
        }
        else if(aR.getType().equalsIgnoreCase("cape"))
        {
            for (int i = 0; i < ITEMS; i++)
            {
                if (clothes[4][i] != null)
                {
                    clothes[4][i] = null;
                    i=ITEMS;
                    capes--;
                }
            }
        }
        else
        {
            System.out.println("Clothes does not exist");
        }
    }
    public void printClothing()
    {
        for(int i =0; i<DRAWERS;i++)
        {
            System.out.print("Drawer "+(i+1)+":\n");
            for(int j = 0;j<ITEMS;j++)
            {
                if(clothes[i][j] != null)
                    System.out.println(clothes[i][j]+" ");
                else
                    System.out.print("");
            }
            System.out.println();
        }
        System.out.println();
    }
}
