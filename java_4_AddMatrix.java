import java.util.*;
public class java_4_AddMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter the number of Columns and Rows : ");
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] first=new int[m][n];
        int[][] second=new int[m][n];
        int[][] sum=new int[m][n];
        System.out.println("Enter the First Matrix :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                first[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Enter The Second Matrix :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                second[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of the First Matrix :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(first[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Elements of the Second Matrix :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(second[i][j]+" "); 
            }
            System.out.println(" ");
         }
        System.out.println("The Sum Of the 2 Matrices are ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                sum[i][j]=first[i][j]+second[i][j];

            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    
}
