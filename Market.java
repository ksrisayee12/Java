import java.util.Scanner;
public class Market
{
    static int oil = 250;
    static int rice = 50;
    static int sugar = 40;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Market quan= new Market();
        System.out.print("enter the amount of oil in litre: ");
        int Qoil = sc.nextInt();
        System.out.println("Cost of oil = "+Qoil*quan.oil);
        System.out.println();
        System.out.print("enter the amount of rice in kg: ");
        int Qrice = sc.nextInt();
        System.out.println("Cost of rice = "+Qrice*quan.rice);
        System.out.println();
        System.out.print("enter the amount of sugar in kg: ");
        int Qsugar = sc.nextInt();
        System.out.println("Cost of sugar = "+Qsugar*quan.sugar);
        System.out.println();
        int total = 0;
        total += ((quan.oil*Qoil)+(quan.rice*Qrice)+(quan.sugar*Qsugar));
        if (total>1000){
            total = total -(total*10/100);
        }
        System.out.println("the total amount to be paid is: "+"Rs "+total);
        
        
        
    }
    
}