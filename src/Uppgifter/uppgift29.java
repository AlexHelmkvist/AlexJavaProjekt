package Uppgifter;

import java.sql.Time;

public class uppgift29 {

    public class Main {
        public static void main(String[] args) {

            //29.Skapa ett program som beräknar ankomsttiden för ett tåg. I inmatningsrutan finns
            //följande:
            //tidpunkt i timma och minut för avgången (t ex 12 41)
            //körtid i timma och minut (t ex 3 47)
            //I utmatningsrutan ska klockslaget för ankomsttiden skrivas. Om midnatt passeras ska det
            //även skrivas “NÄSTA DAG“ i utmatningsrutan.

            // Vi anger vilken tid vi avgår från stationen!
            int departureTimeHour = 23;
            int departureTimeMinutes = 30;
            // Vi anger vår resetid!
            int travelTimeHours = 02;
            int travelTimeMinutes = 30;
            // Vi lägger ihop klockslaget och antalet timmar som går åt för att resa.
            // Vi gör sedan samma sak med antalet minuter.
            int arrivalTimeHours = departureTimeHour + travelTimeHours;
            int arrivalTimeMinutes = departureTimeMinutes + travelTimeMinutes;

            // Vi måste på något sätt simulera att minuter max kan vara 60 och timmar max 24.
            if (arrivalTimeMinutes >= 60) {
                //Om mängden minuter är lika med eller överstiger 60, så ökar vi antalet timmar med ett!
                arrivalTimeHours++;
                // Om vi ökar timmar med ett så tar vi bort 60 minuter ifrån minutes
                arrivalTimeMinutes = arrivalTimeMinutes - 60;
            }
            //I utmatningsrutan ska klockslaget för ankomsttiden skrivas. Om midnatt passeras ska det
            //även skrivas “NÄSTA DAG“ i utmatningsrutan.

            if (arrivalTimeHours >= 24) {
                arrivalTimeHours = arrivalTimeHours - 24;
                System.out.println("Vi ankommer till stationen " + arrivalTimeHours + ":" + arrivalTimeMinutes + " Nästa dag!");
            } else {
                System.out.println("Vi ankommer till stationen " + arrivalTimeHours + ":" + arrivalTimeMinutes);
            }
        }
    }
}