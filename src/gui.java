import javax.swing.*;

import java.awt.GridLayout;





public class gui{







    public static void main (String [] args){

        JPanel p1 = new JPanel();

        GridLayout gr=new GridLayout(3,2,5,5);

        p1.setLayout(gr);

        JTextField send=new JTextField();

        JTextField type=new JTextField();

        JButton push=new JButton("SEND");

        p1.add(send);

        p1.add(type);

        p1.add(push);

        JFrame frame= new JFrame("Network Chat");

        frame.setContentPane(p1);

        frame.setSize(500,600);

        frame.setVisible(true);





    }





}
