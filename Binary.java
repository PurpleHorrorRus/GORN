package binary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import javax.swing.Timer;

public class Binary extends javax.swing.JFrame{
    StringTokenizer st;
    public Binary() {
        System.out.println("Enter the number of characters to generate.");
        int get = nextInt();
        Timer timer = new Timer(1000, new ActionListener() {
            String newGen;
            @Override
            public void actionPerformed(ActionEvent e) {
                Genery gen = new Genery(get);
                newGen = gen.gener();
                System.out.println(newGen);
                
            }
        });
        timer.start();
    }                          

    public static void main(String args[]) {
        Binary bin = new Binary();
        bin.setVisible(true);
        bin.setVisible(false);
    }
         
    private Integer nextInt(){
        int a = 0;
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(bf.readLine());
                if(st.countTokens() > 1){
                    while(st.hasMoreElements()){
                        for(int i = 0; i < st.countTokens(); i++){
                            a = a + Integer.parseInt(st.nextToken());
                        }
                    }         
            }else { a = Integer.parseInt(st.nextToken()); }
        } catch (IOException ex) { }
        return a;
    }
}

class Genery{
    String ready = ""; int symbols;
    Genery(int symbols){
        this.symbols = symbols;
    }
    public String gener(){
        int i;
        for(i = 0; i < symbols; i++){ 
            int[] rnd = new int[i+2];
            rnd[i] = 0 + (int)(Math.random() * ((1 - 0) + 1));
            ready = ready + rnd[i];           
        }
        return ready;
    }
}