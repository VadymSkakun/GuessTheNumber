public class View {
    public static final String INPUT_NUMBER = "Input number from range ";
    public static final String WRONG_NUMBER = "Wrong input number! Try again!";
    public static final String GAME_OVER = "You are winner! Secret number is ";
    public static final String INPUT_HISTORY = "History of data input: ";
    
    public void printMessage(String message){
        System.out.println(message);
    }
    
    public String concatenationData(String... message){
        StringBuffer stringBuffer = new StringBuffer();
        for (String sentence : message) {
            stringBuffer = stringBuffer.append(sentence);
        }
        return new String(stringBuffer);
    }
}
