package entities;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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

public class Environement {
    private int brightness;
    private LocalTime timeOfDay;
}
