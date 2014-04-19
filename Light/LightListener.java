/** The LightListener interface */
import java.util.EventListener;
 
public interface LightListener extends EventListener {
   public void lightOn(LightEvent evt);  // called-back upon light on
   public void lightOff(LightEvent evt); // called-back upon light off
}