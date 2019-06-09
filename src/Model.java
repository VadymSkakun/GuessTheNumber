import java.util.ArrayList;
import java.util.List;

public class Model {
    private int minBarrier;
    private int maxBarrier;
    final int secretNumber = setSecretNumber(maxBarrier);

    private List<Integer> inputHistory = new ArrayList<>();

    public static int setSecretNumber(int maxBarrier){//TODO
        return (int) (Math.random() * maxBarrier + maxBarrier);
    }

    public boolean rangeNumber(int number){
        inputHistory.add(number);
        if (number == secretNumber){
            return false;
        } else if (number > secretNumber){
            maxBarrier = number;
        } else {
            minBarrier = number;
        }
        return true;
    }

    public void setRange(int minBarrier, int maxBarrier){
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public List<Integer> getInputHistory() {
        return inputHistory;
    }
}