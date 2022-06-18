
package basic;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author VAIO
 */
public class UsandoDate {
    
    public static void main(String[] args) {
       
        Date novaData = new Date();
        System.out.println(novaData);
        
        //Date( long date)
        
        Long currentTimeMillis = System.currentTimeMillis();
        
        System.out.println(currentTimeMillis);
        
        Date novaData2 = new Date(currentTimeMillis);
        
        System.out.println(novaData2);
        
        Calendar agora = Calendar.getInstance();
        
        System.out.println(agora);
    }
    
}
