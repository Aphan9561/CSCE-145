/*
 * Written by Anna Phan
 */
public class StringHelper {
    private String str;

    public StringHelper(){
    }

    public static boolean hasAllUniqueCharacters(String str)
    {
        for(int i =0; i<str.length();i++)
        {
            for(int j =i+1;j<str.length();j++)
            {
                char c = str.charAt(i);
                char C = str.charAt(j);
                if(c == C)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static String meshString(String str1, String str2)
    {
        String mesh_str = "";

        for(int i = 0; i < str1.length(); i++)
        {
            mesh_str += str1.charAt(i);

            if (str2.length() > i) {
                mesh_str += str2.charAt(i);
            }
        }
        if (str2.length() > str1.length())
            mesh_str += str2.substring(str1.length());

        return mesh_str;
    }
    public static String replaceVowelsWithOodle(String str)
    {
        String new_str = "";

        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U' )
                new_str += "oodle";
            else
                new_str += c;
        }

        return new_str;
    }
    public static double weight(String str)
    {
        double weight = 0.0;

        for (int i = 0; i < str.length(); i ++)
        {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U' )
                weight += 2.5;
            else
                weight += 3.4;
        }

        return weight;
    }
}
