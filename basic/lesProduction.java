import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lesProduction {
        public static void main(String[] args) throws Exception{
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));
                
                String line = null;
                int zeile = 0;
                while( (line = br.readLine()) != null ){
                        System.out.println(line+" "+zeile);
                        zeile+=1;
                }
        }
}
