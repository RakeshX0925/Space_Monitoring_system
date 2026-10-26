import java.util.*;
class Mission {
    private String missionName;
    private int duration;
    private int priority;
    Mission(String missionName, int duration, int priority) {
        this.missionName = missionName;
        this.duration = duration;
        this.priority = priority;
    }
    public String getMissionName() {
        return missionName;
    }
    public int getDuration() {
        return duration;
    }
    public int getPriority() {
        return priority;
    }
    public void executeMission() {
        System.out.println("Executing mission...");
    }
    public void countdown() {
        System.out.println("\n⏱ Countdown:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }
        System.out.println("! LIFTOFF !");
    }
}
class LaunchMission extends Mission {
    LaunchMission(String n, int d, int p) {
        super(n, d, p);
    }
    @Override
    public void executeMission() {
        System.out.println(
                getMissionName() + " Rocket Launch | Duration: " + getDuration() + " | Priority: " + getPriority());
    }
}
class OrbitMission extends Mission {
    OrbitMission(String n, int d, int p) {
        super(n, d, p);
    }
    @Override
    public void executeMission() {
        System.out.println(
                getMissionName() + " Satellite Orbit | Duration: " + getDuration() + " | Priority: " + getPriority());
    }
}
class LandingMission extends Mission {
    LandingMission(String n, int d, int p) {
        super(n, d, p);
    }
    @Override
    public void executeMission() {
        System.out.println(
                getMissionName() + " Rover Landing | Duration: " + getDuration() + " | Priority: " + getPriority());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mission> missions = new ArrayList<>();
        ArrayList<String> history = new ArrayList<>();
        int totalScore = 0;
        String[] failureReasons = {
                "Fuel shortage !!",
                "Engine failure !!",
                "Bad weather !!",
                "Communication lost !!",
                "Navigation error !!"};
        int choice;
        do {
            System.out.println("\n // SPACE MISSION SYSTEM // ");
            System.out.println("I.   Add Mission");
            System.out.println("II.  Run Missions");
            System.out.println("III. View History");
            System.out.println("IV.  View Score");
            System.out.println("V.   Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1.Launch // 2.Orbit // 3.Landing");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Mission Name: ");
                    String name = sc.nextLine();
                    System.out.print("Duration: ");
                    int duration = sc.nextInt();
                    System.out.print("Priority (1-High,2-Med,3-Low): ");
                    int priority = sc.nextInt();
                    Mission m = null;
                    if (type == 1)
                        m = new LaunchMission(name, duration, priority);
                    else if (type == 2)
                        m = new OrbitMission(name, duration, priority);
                    else if (type == 3)
                        m = new LandingMission(name, duration, priority);
                    missions.add(m);
                    System.out.println("Mission Added !");
                    break;
                case 2:
                    if (missions.isEmpty()) {
                        System.out.println("\nNo missions assigned!");
                        break;
                    }
                    missions.sort(Comparator.comparingInt(Mission::getPriority));
                    System.out.println("\nRunning Missions...\n");
                    for (Mission ms : missions) {
                        ms.countdown();
                        ms.executeMission();
                        Random r = new Random();
                        boolean success = r.nextBoolean();
                        if (success) {
                            System.out.println(" SUCCESS (+10 points)");
                            totalScore += 10;
                            history.add(ms.getMissionName() + " SUCCESS");
                        } else {
                            String reason = failureReasons[r.nextInt(failureReasons.length)];
                            System.out.println(" FAILED: " + reason);
                            totalScore -= 5;
                            history.add(ms.getMissionName() + " FAILED (" + reason + ")");
                        }
                        System.out.println("Running next mission...\n");
                    }
                    break;
                case 3:
                    if (history.isEmpty()) {
                        System.out.println("\n No mission history available!");
                    } else {
                        System.out.println("\n Mission History:");
                        for (String h : history) {
                            System.out.println(h);
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n Total Score: " + totalScore);
                    break;
            }
        } while (choice != 5);
        System.out.println("Program Ended");
        sc.close();
    }  
}