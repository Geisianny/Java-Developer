
package Inferencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

/**
 *
 * @author Geisy
 */
public class Exemplo {

    public static void main(String[] args) throws IOException{
       URL url = new URL("https://www.oracle.com/java/technologies/java-archive-javase10-downloads.html");
       var urlConnection = url.openConnection();
       var bufferReader = new BufferedReader( new InputStreamReader( urlConnection.getInputStream()));
       System.out.println(bufferReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
       
    }
    
    public void testar(){
        var string = new String("Bixa se eu falar...");
	System.out.println(string);
    }
    
}
