import java.util.ArrayList;
import java.util.List;

public class SwimmingRace {
    public static void main(String[] args) {

        // To run the program provide command line arguments in the following order
        // swimmers, spectators, judges, SupportStaff
        // Eg: java SwimmingRace 5 10 1 3
        // This will create 5 swimmers, 10 spectators, 1 judge and 3 support staff

        // Create ArrayLists for each of the types to hold the objects that will be created
        List<Swimmer> swimmers = new ArrayList<>();
        List<Spectator> spectators = new ArrayList<>();
        List<SupportStaff> supportStaff = new ArrayList<>();
        List<Judge> judges = new ArrayList<>();


        //Initialize Swimmers
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            Person.count++;
            Swimmer swimmer = new Swimmer(Person.count, "Swimmer " + i);
            swimmers.add(swimmer);
        }

        //Initialize Spectators
        for (int j = 0; j < Integer.parseInt(args[1]); j++) {
            Person.count++;
            Spectator spectator = new Spectator(Person.count, "Spectator " + j);
            spectators.add(spectator);
        }

        //Initialize Judges
        for (int a = 0; a < Integer.parseInt(args[2]); a++) {
            Person.count++;
            Judge judge = new Judge(Person.count, "Judge " + a);
            judges.add(judge);
        }

        //Initialize Support Staff
        for (int k = 0; k < Integer.parseInt(args[3]); k++) {
            Person.count++;
            SupportStaff supportStaffMember = new SupportStaff(Person.count, "Support Staff " + k);
            supportStaff.add(supportStaffMember);
        }

        Judge judge1 = judges.get(0);

        judge1.blow_whistle();

        // Call swim method of all swimmers
        for (Swimmer swimmer : swimmers) {
            swimmer.swim();
        }

        //Spectator checking the Scoreboard
        for (Spectator spectator : spectators) {
            spectator.check_scorebaord();
        }

        //Judges checking the Scoreboard
        for (Judge judge : judges) {
            judge.check_scorebaord();
        }

        // Support staff checking the scoreboard
        for (SupportStaff supportStaffMemeber : supportStaff) {
            supportStaffMemeber.check_scorebaord();
        }
    }
}