public class StringContainsUniqueChars {
    public static void main(String args[])
    {
        int MAX_CHAR = 26;
        int[] letters= new int[MAX_CHAR];
        String input= "raaj";
        for(char c: input.toCharArray())
        {
            if(letters[c-'a']!=0){
                System.out.println("string has duplicates");
                return;
            }else {
                letters[c - 'a']++;
            }
        }
        System.out.println("string has no duplicates");
    }
}
