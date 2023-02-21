package entities;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.inject.Singleton;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

/**
 * 
 */

/**
 * @author roskai
 *
 */
@Singleton
public class Environement {
    private static Environement INSTANCE;
    
    private int brightness;
    private LocalTime timeOfDay;
    
    public static Environement getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Environement();
        }

        return INSTANCE;
    }
}
