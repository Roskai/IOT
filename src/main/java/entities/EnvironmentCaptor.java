package entities;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.inject.Singleton;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Singleton
public class EnvironementCaptor {
    private static Environement INSTANCE;
    
    private int hour = 0; 
    private int brightness = 5; 

    
    public static Environement getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new EnvironmentCaptor();
        }

        return INSTANCE;
    }

    
    public void createHour(){
        while (1) {
            for (int i=1; i<=24; i++){
                this.hour = this.hour+1; 
                sleep(10000);
            }
            hour = 0;
        }
    }

    public void createBrightness(){
        while (1) {
            if (this.hour >= 7 && this.hour <= 20){
                this.brightness = 100 ;
            }else if(this.hour > 20 && this.hour < 7){
                this.brightness = 15; 
            }else if(this.hour >= 22 && this.hour <= 6){
                this.brightness = 5 ; 
            }
            sleep(10000);
        }
    }

    public String getHourString() { return this.hour.toString(); }
    public String getBrightnessString() { return this.brightness.toString() ; }



}
