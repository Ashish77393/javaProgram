import java.util.*;

public class ActivitySolution {
    public static void main(String[] args) {
        String[] activities = { "A1", "A2", "A3", "A4", "A5" };
        int[] start = { 10, 3, 1, 5, 8 };
        int[] finish = { 6, 4, 2, 9, 7 };

        int n = activities.length;
        Activity[] activityArr = new Activity[n];
        for (int i = 0; i < n; i++) {
            activityArr[i] = new Activity(activities[i], start[i], finish[i]);
        }

        Arrays.sort(activityArr, Comparator.comparingInt(a -> a.finish));

        List<String> selectedActivities = new ArrayList<>();
        selectedActivities.add(activityArr[0].name);

        int lastFinishTime = activityArr[0].finish;

        for (int i = 1; i < n; i++) {
            if (activityArr[i].start >= lastFinishTime) {
                selectedActivities.add(activityArr[i].name);
                lastFinishTime = activityArr[i].finish;
            }
        }

        System.out.println("Selected activities: " + selectedActivities);
    }
}

class Activity {
    String name;
    int start, finish;

    Activity(String name, int start, int finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }
}
