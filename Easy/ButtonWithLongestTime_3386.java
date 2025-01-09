package Easy;

public class ButtonWithLongestTime_3386 {

    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][1];
        int index = events[0][0];

        for (int i = 1; i < events.length; i++) {
            if ((events[i][1]-events[i-1][1]) > max) {
                max = events[i][1]-events[i-1][1];
                index = events[i][0];
            } else if ((events[i][1]-events[i-1][1]) == max) {
                if (events[i][0] < index) index = events[i][0];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] events = {
                {1, 2},
                {2, 5},
                {3, 9},
                {1, 15}
        };

        System.out.println(new ButtonWithLongestTime_3386().buttonWithLongestTime(events));
    }
}
