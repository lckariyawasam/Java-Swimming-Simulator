import java.util.Date;
import java.util.HashMap;

public class Scoreboard {
    private static Date startingTime;
    static HashMap<Swimmer, Double> finishingOrder = new HashMap<>();

    static void start_race() {
        startingTime = new Date();
    }

    static void update_scoreboard(Swimmer swimmer, Date finishedTime) {
        // Calculate the time taken by the swimmer in seconds
        double timeTaken = (finishedTime.getTime() - startingTime.getTime()) / 1000.0;

        finishingOrder.put(swimmer, timeTaken);
    }

    static void show_scoreboard() {
        System.out.println("Name           || Time");
        for (Swimmer swimmer : finishingOrder.keySet()) {
            System.out.println(swimmer.name + "          " + finishingOrder.get(swimmer));
        }
    }
}
