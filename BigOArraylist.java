import java.util.ArrayList;
public class BigOArraylist {
    public static void main(String args[])
    {
        String[] words= new String[]{"one","two"};
        String[] more= new String[]{"three","four"};
        ArrayList<String> res= addMoreElements(words,more);
        System.out.println("result:");
        for(String element:res) {
            System.out.println(element);
        }
    }

    static ArrayList<String> addMoreElements(String[] words, String[] more)
    {

        ArrayList<String> resultList=new ArrayList();
        //ArrayList<String> resultList= new ArrayList();
        for(String w: words) {
            resultList.add(w);
        }
        for(String w: more){
            resultList.add(w);
        }
        return resultList;
    }
}
