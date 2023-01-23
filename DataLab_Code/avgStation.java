

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;



public class avgStation {

    public static void main(String args[]) {
      String hateState = "";
      ArrayList<Float> hateStateTemps = new ArrayList<Float>();

      Scanner sc = new Scanner(System.in);
    
    DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name", 
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");


             

             System.out.println("Type state(Abriviated) to find its average temp. across all stations.");
             hateState = sc.nextLine();
             

          
             
             ds.setCacheTimeout(1);  
             for (WeatherStation ws : allstns) {
              if (ws.isLocatedInState(hateState)) {
                String holdId = ws.getId();
                DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + holdId + ".xml"); 
                ds1.load();
                float temp = ds1.fetchFloat("temp_f");
                hateStateTemps.add(temp);
                System.out.println("Grabbing Data!");
              }
           }


             for(int i = 0; i < hateStateTemps.size(); i++) {
              System.out.println(hateStateTemps.get(i));
             }


             double hold = 0;
             for(int i = 0; i < hateStateTemps.size(); i++) {
              hold += hateStateTemps.get(i);
             }

             System.out.println("The average tempature in " + hateState + " is aprox. " + (hold/hateStateTemps.size()));

             




            
    }
}


