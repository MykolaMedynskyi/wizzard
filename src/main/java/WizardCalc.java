public class WizardCalc {

    private int min;
    private int max;
    private int currNum;


    public WizardCalc() {
        this.min = 0;
        this.max = -2;
        this.currNum = 1024;
    }

    public int getCurrNum() {
        return currNum;
    }

    public void numberIsMore(){
        min = currNum;
        if (max == -2){
            currNum *= 2;
        } else{
            currNum += (max - min)/2;
        }
    }

    public void numberIsLess(){
        max = currNum;
        currNum -= (max - min)/2;
    }

    public boolean isError(String typed){
        if ((max - min) == 1 && (typed.equals("l") || typed.equals("m"))) return true;
        return false;
    }

}
