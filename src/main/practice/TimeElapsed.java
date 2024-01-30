package main.practice;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeElapsed {

    public void getTimeElapsed(){
        Scanner scanner = new Scanner(System.in);

        // Get the first time input
        System.out.print("Enter the start time (HH:mm:ss): ");
        String startTimeStr = scanner.next();
        LocalTime startTime = parseTime(startTimeStr);

        // Get the second time input
        System.out.print("Enter the end time (HH:mm:ss): ");
        String endTimeStr = scanner.next();
        LocalTime endTime = parseTime(endTimeStr);

        // Calculate the duration between the two times
        Duration duration = Duration.between(startTime, endTime);

        // Display the result
        System.out.println("Time elapsed: " + formatDuration(duration));

        scanner.close();
    }

    private static LocalTime parseTime(String timeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalTime.parse(timeStr, formatter);
    }

    private static String formatDuration(Duration duration) {
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.getSeconds();
        long millis = duration.toMillis();

        return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, millis);
    }
}
