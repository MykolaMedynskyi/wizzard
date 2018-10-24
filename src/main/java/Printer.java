public class Printer {

    public Printer() {
    }

    public String yourNum(int n){
        if (n<=0) return "mistake was made...";
        return "Is your number " + n + "?";
    }

    public String cheater(){
        return "You are cheater";
    }

    public String win(){
        return "I am the WINNER";
    }

    public String wrong(){
        return "Wrong typing...";
    }

}
