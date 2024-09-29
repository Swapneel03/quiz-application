
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start , back;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         JLabel heading = new JLabel("WELCOME " +  name  + " TO QUIZ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Bell MT", Font.BOLD,40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Cambria", Font.PLAIN,16));
        rules.setText(
            "<html>"+ 
                "1. If you select an incorrect response for a question,it will dudect the mark . " + "<br><br>" +
                "2. you have 30 second to answer each question" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start  = new JButton("START");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
        setSize(800, 650);
        setLocation(350,100);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae) {
     if (ae.getSource() == start) {
         setVisible(false);
          new Quiz(name);
            setVisible(false);
         
        } else {
            setVisible(false);
             Login l= new Login();
        }
    }
     public static void main(String arg[]){
         Rules r= new Rules("user");
         
     }
    
}
