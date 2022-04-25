public class SortString{
    static final int MAX_CHAR = 26;

    // function to print string in sorted order
    static void sortString(String str) {

        // Hash array to keep count of characters.
        int letters[] = new int[MAX_CHAR];
        for (char x : str.toCharArray()) {
            letters[x-'a']++;
        }

        // Traverse the hash array and print characters
        for (int i = 0; i < MAX_CHAR; i++) {
            if(letters[i]==1) {
                System.out.print((char) (i + 'a'));
            }
        }
    }

    // Driver program to test above function
    public static void main(String[] args) {
        sortString("bec");
    }
}
