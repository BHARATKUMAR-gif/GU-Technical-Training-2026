import java.util.Scanner;

public class Problem19 {
    //WAP to take input income from the user and calculate the amount of tax to be paid as per rules. 
    // Less or equal to 10,000 -> no tax
    // Greater than 10,000 and less or equal to 25,000 -> 10% of income above 10,000
    //Greater than 25,000 and less or equal to 50,000 -> 2500 + 20% income above 25,000
    //Greater than 50,000 -> 5000 + 30% of income above 50,000

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income= sc.nextDouble();
        double tax=0;

        //tax calculation based on income
        if(income<=10000){
            tax=0; //No tax
        } else if(income <= 25000){
            tax=0.10 * (income - 10000) ; // 10% of income above 10,000
        } else if(income <= 50000){
            tax=2500 + 0.20 * (income-25000); // 2500 + 20% of income above 25,000

        } else{
            tax=5000+ 0.30*(income-50000); //5000 + 30% of income above 50,000
        }
        System.out.println("Tax to be paid=" + tax);
        
    }
    
}
