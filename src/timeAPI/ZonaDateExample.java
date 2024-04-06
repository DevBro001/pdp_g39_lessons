package src.timeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonaDateExample {

    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
      /*  for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
        }*/

        ZoneId zoneId = ZoneId.of("America/New_York");
//
//        System.out.println(zoneId.getRules());

        ZonedDateTime now = ZonedDateTime.now(zoneId);
        System.out.println(now);

    }
}
