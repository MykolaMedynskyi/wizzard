import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String reader;

        WizardCalc wizardCalc = new WizardCalc();
        Printer printer = new Printer();
        Scanner sc = new Scanner(System.in);

        System.out.println("Think about the number > 0");
        System.out.println("Type 'm' if your number is more");
        System.out.println("Type 'l' if your number is less");
        System.out.println("Type 'y' if it is your number\n");

        while(true) {
            System.out.println(printer.yourNum(wizardCalc.getCurrNum()));
            reader = sc.nextLine();
            if (!(reader.equals("m")) && !(reader.equals("l")) && !(reader.equals("y"))){
                System.out.println(printer.wrong());
                continue;
            }
            if (reader.equals("y")) {
                System.out.println(printer.win());
                break;
            }
            if  (reader.equals("m")){
                wizardCalc.numberIsMore();

            }
            if (reader.equals("l")){
                wizardCalc.numberIsLess();
            }
            if (wizardCalc.isError(reader)){
                System.out.println(printer.cheater());
                break;
            }
        }

    }

}
