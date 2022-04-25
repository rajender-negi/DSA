import java.util.ArrayList;
public class CharNoDuplicate {
    public static void main(String args[])
    {
        String input = "abcde";
        ArrayList<Character> checkList= new ArrayList();
        for(char i: input.toCharArray())
        {
            if(checkList.contains(i))
            {
                System.out.println("String has duplicates: "+i);
                return;
            }else{
                checkList.add(i);
            }
        }
        System.out.println("String does not have duplicates");
    }
}
