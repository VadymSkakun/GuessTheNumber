import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);

        model.setRange(Barriers.MIN_BARRIER, Barriers.MAX_BARRIER);

        System.out.println(model.getSecretNumber());
        while (model.rangeNumber(readData(scanner)));

        view.printMessage(View.GAME_OVER + model.getSecretNumber());
        view.printMessage(View.INPUT_HISTORY + String.valueOf(model.getInputHistory()));
    }

    private int readData(Scanner scanner){
        int res;
        view.printMessage(printComment());
        while (true) {
            while (!scanner.hasNextInt()) {
                view.printMessage(View.WRONG_NUMBER + printComment());
                scanner.next();
            }

            if ((res = scanner.nextInt()) <= model.getMinBarrier() || res >= model.getMaxBarrier()) {
                view.printMessage(View.WRONG_NUMBER + printComment());
                continue;
            }
            break;
        }
        return res;
    }

    private String printComment(){
        return view.concatenationData( View.INPUT_NUMBER, String.valueOf(model.getMinBarrier()),
                String.valueOf(model.getMaxBarrier()));
    }
}
