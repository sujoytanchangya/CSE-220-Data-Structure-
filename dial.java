public class dial
{
    public static void main(String [] args)
    {
        char [] r1 = {'1', '2', '3'};
        char [] r2 = {'4', '5', '6'};
        char [] r3 = {'7', '8', '9'};
        char [] r4 = {'*', '0', '#'};

        char [][] telephone = {r1, r2, r3, r4};
        for(int i=0; i<telephone.length; i++)
        {
            char [] row = telephone[i];
            for(int j=0; j<row.length; j++)
            {
                char c = row[j];
                System.out.print( c+" ");
            }
            System.out.println();
        }
        System.out.println("Another Way");
        for(char[] row1 : telephone)
        {
            for(char c1 : row1)
            {
                System.out.print(c1+ " ");

            }
            System.out.println();
        }
    }
}