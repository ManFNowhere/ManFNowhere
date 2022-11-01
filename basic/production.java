import java.io.*;

public class production {
  public static void main (String[] args) throws Exception {

    PrintWriter bw = new PrintWriter(
        new OutputStreamWriter(System.out), true);
        int start = 0;
        int finish = 100000000;

        while(start <= finish){
                bw.println("HALLO World");
                start+=1;
        }

  

  }
}
