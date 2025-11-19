import java.util.Scanner;

public class c_tof {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in c:");
        double c=sc.nextDouble();
        double f=(c*9/5)+32;
        System.out.println("F: "+f);     }
}
