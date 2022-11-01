import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lesProduction {
        public static void main(String[] args) throws Exception{
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));
                
                String line = null;
                int zeile = 0;
                long start = System.nanoTime();

                while( (line = br.readLine()) != null ){
                        System.out.println(line+" "+zeile);
                        zeile+=1;
                }

                long end = System.nanoTime();
                long timeElapsed = end - start;
                System.out.println("Execution time in nanoseconds: " + timeElapsed);
                System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
                System.out.println("Execution time in seconds: " + timeElapsed / 1000000000);
        }       

}
