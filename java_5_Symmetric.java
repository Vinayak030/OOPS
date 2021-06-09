import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class java_5_Symmetric 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c,r,i,j,flag=1;
        System.out.println("Enter the No: of Rows and Columns :");
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] a=new int[r][c];
        int[][] t=new int[r][c];
        System.out.println(" Enter the Matrix: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements are");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
            
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                t[j][i]=a[i][j];

            }
        }
        if(r==c)
        {
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    if(a[i][j]!=t[i][j])
                    {
                        flag=0;
                        break;
                
                    }
                }
                if(flag==0)
                {
                    System.out.println("\nThe Matrix is not Symmetric");
                    break;
                }
            }
                if(flag==1)
                {
                    System.out.println("\nThe Matrix is Symmetric");
                }
        }
         
        else
        {
            System.out.println("\nThe Matrix is not Symmetric");
            
        }
        
    }
    
}
 