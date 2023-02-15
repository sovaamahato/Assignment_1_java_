import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner obj1=new Scanner(System.in);
        
        System.out.println("a) what is the total number of employees?");
        int emp_num =obj1.nextInt();

        
        System.out.println("b) what is the name of supervisor?");
        obj1.nextLine();
        String supervisor_name=obj1.nextLine();
       
        System.out.println("c) How many times the Nuclear waste is removed from the core?");
         int count=obj1.nextInt();

        
        System.out.println("d) what is the total waste produced every 1 week?");
        float weight =obj1.nextFloat();

        System.out.println("e)Is Electric motor being replaced every 18 days? Press \"y\" for yes and \"n\" for no. ");
        char ans =obj1.next().charAt(0);
    

        System.out.println("f) What is the core average temperature(celcius) of the Nuclear Reactor? ");
        int temp =obj1.nextInt();


        //output-------------------------
        System.out.println("");
        System.out.print("\t--------------------------------------------------------\n");
        System.out.print("\t\tStatus Update on Nuclear Reactor JX00-XC-HB1\n");
        System.out.print("\t--------------------------------------------------------\n");

        System.out.println("\tTotal no. of Employess: "+ emp_num);
        System.out.println("\tSupervisor name: " + supervisor_name);
        System.out.println("\tNumber of times Nuclear Waste is removed form core: " + count);
        System.out.println("\tProduction of waste per week: " + weight );
        System.out.println("\tIs Electric Motor being replaced every 18 days?: " + ans);
        System.out.println("\tCore Average Temperature: " + temp+ "\" Celsius (" + (temp + 273.15) + "K)\n");

        System.out.println("");
        


        





    }
}