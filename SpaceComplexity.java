public class SpaceComplexity {

    public static void main(String args[])
    {
        int result =  SpaceComplexity.OrderOfN(4);
        System.out.println("result of OrderOfN : "+result);

        result =OrderOf1(4);
        System.out.println("result of OrderOf1 : "+result);
    }

    public static int OrderOfN(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        return n + OrderOfN(n-1);
    }

    public static int OrderOf1(int n)
    {
        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum += pairsum(i, i+1);
        }
        return sum;
    }

    public static int pairsum(int a, int b)
    {
        return a+b;
    }
}

