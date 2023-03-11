//find minimum number without sorting an two diementional array
class Minimum_In_2D_Array
{
    public static void main(String ar[])
    {
        int b=max(new int[][] {{10,1,330},{50,30000,1000},{70,5,20}});
        System.out.println("Minimum number in this array is ="+b);
    }
        static int max(int d[][])
        {
            int c=d[0][0];
            for(int i=0;i<d.length;i++)
            {
                for(int j=1;j<d.length;j++)
                {
                    if(c>d[i][j])
                    {
                        c=d[i][j];
                    }
                }
            }
            return c;
        }
}
