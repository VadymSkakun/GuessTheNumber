import java.util.ArrayList;
import java.util.List;

public class Model {
    private int minBarrier;
    private int maxBarrier;
    final int secretNumber = setSecretNumber(Barriers.MIN_BARRIER, Barriers.MAX_BARRIER);

    private List<Integer> inputHistory = new ArrayList<>();

    public static int setSecretNumber(int minBarrier, int maxBarrier){
        maxBarrier -= minBarrier;
        return (int) (Math.random() * maxBarrier + minBarrier);
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