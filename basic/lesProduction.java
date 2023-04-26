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
                        long end = System.nanoTime();
                        System.out.println(end-start);
                        if ((end - start) <= 100000000){
                                System.out.println("ada");
                        
                        }else{
                                break;
                        }
                        zeile+=1;
         
                       } 
        }       

}
