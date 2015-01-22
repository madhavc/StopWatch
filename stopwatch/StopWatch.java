/*
 * Name: Madhav Chhura 
 * Project: #1(Warm-up)
 * Due: Thursday January 22, 2015
 * CourseL cs-245-01-w15
 *
 * Description: Stopwatch gives you time in seconds. Press Start button to
 * began the watch and Stop to end it. At anytime press Stop and it will give you
 * the total time in seconds.
 */
package stopwatch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Date;
/**
 *
 * @author madhavchhura
 */
public class StopWatch implements ActionListener {
    
    JLabel jlab;
    long start;
    
    StopWatch(){
        JFrame jfrm = new JFrame("M.Chhura's Stopwatch"); //The tittle of the window.
        jfrm.setLayout(new FlowLayout()); //Setting the flow layout.
        jfrm.setSize(230, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        
        jfrm.add(startButton);
        jfrm.add(stopButton);
        
        jlab = new JLabel("Press Start to begin timing");
        
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StopWatch();
            }
            });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Date date = new Date(e.getWhen());
        //Calendar date = Calendar.getInstance();
        if(e.getActionCommand().equals("Start")){
            start = date.getTime();
            jlab.setText("StopWatch is Running...");
        }
        else{
            jlab.setText("Elapsed Time is " + (double) (date.getTime()- start) / 1000);
        }
        
    }
    
    
    
}
