public class averageMark {
    public static void main(String[] args) {

        int[] marks = {80, 75, 90, 85, 70};

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        double average = (double) sum / marks.length;

        System.out.println("Average marks = " + average);
    }
}