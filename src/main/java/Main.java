import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String reader;

        WizardCalc wizardCalc = new WizardCalc();
        Printer printer = new Printer();
        Scanner sc = new Scanner(System.in);

        System.out.println("Think about the number");
        System.out.println("Type 'm' if your number is more");
        System.out.println("Type 'l' if your number is less");
        System.out.println("Type 'y' if it is your number");

        printer.yourNum(wizardCalc.getCurrNum());

        while(true){
            reader = sc.nextLine();
            if (!(reader.equals("m")) && !(reader.equals("l")) && !(reader.equals("y"))){
                System.out.println("wrong typing...");
            } else System.out.println("nice, ty");
        }

    }

}
