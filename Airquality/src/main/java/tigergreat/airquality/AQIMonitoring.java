/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tigergreat.airquality;

/**
 *
 * @author AM I
 */import java.util.Arrays;
import java.util.Random;

public class AQIMonitoring {
    public static void main(String[] args) {
        Random random = new Random();
        int[] aqiReadings = new int[30];

    
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = random.nextInt(300) + 1; 
        }

        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[aqiReadings.length / 2 - 1] + aqiReadings[aqiReadings.length / 2]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }
        System.out.println("Median AQI value: " + median);

        int hazardousDaysCount = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                hazardousDaysCount++;
            }
        }
        System.out.println("Number of hazardous days (AQI > 200): " + hazardousDaysCount);
    }
}


