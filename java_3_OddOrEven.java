import java.util.*;
class java_3_OddOrEven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The "+n+" is Even");
        }
        else{
            System.out.println("The "+n+" is Odd");
        }
    }
}