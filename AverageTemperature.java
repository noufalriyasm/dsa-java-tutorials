import java.util.Arrays;
import java.util.Scanner;

public class AverageTemperature {
    public AverageTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days temperature :");

        int numberOfDays = scanner.nextInt();
        if (numberOfDays < 0) {
            System.out.println("the number of days should be greater than zero");
            return;
        }
        double[] daysTemp = new double[numberOfDays];
        double total = 0;
        double highestTemp = Integer.MIN_VALUE;
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.println("mark temperature of day " + day + " :");
            double temp = scanner.nextDouble();
            daysTemp[day - 1] = temp;
        }
        for (double temp : daysTemp) {
            total = total + temp;
            if (temp > highestTemp) {
                highestTemp = temp;
            }
        }
        double averageTemp = (double) total / daysTemp.length;
        System.out.println("the given temperature data " + Arrays.toString(daysTemp));
        System.out.println("the average temperature " + averageTemp);
        System.out.println("the highest temperature is " + highestTemp);
    }
}
