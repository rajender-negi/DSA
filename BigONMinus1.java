public class BigONMinus1 {
    public static void main(String args[])
    {
        int[] arr= new int[]{1,2,3};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.println("a[i]a[j] "+i+""+j);
                //System.out.println("value of arr[i]: "+arr[i]+" -- value of arr[j]: "+arr[j]);
            }
        }
    }
}
