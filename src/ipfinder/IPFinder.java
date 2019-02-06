package ipfinder;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
/**
 *
 * @author harsh
 */
public class IPFinder extends JFrame implements ActionListener{
    JLabel jlab;
    JButton jbtn;
    JTextField jtxtfield;
    public IPFinder() {
        super("IP Finder"); 
        jlab = new JLabel("Enter URL");
        jlab.setBounds(50,70,150,20);
        jtxtfield = new JTextField();
        jtxtfield.setBounds(50,100,200,20);
        jbtn = new JButton("Find IP");
        jbtn.setBounds(50,150,80,30);
        add(jlab);
        add(jtxtfield);
        add(jbtn);
        jbtn.addActionListener(this);
        setSize(500, 200);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String url = jtxtfield.getText();
        try
        {
            InetAddress in = InetAddress.getByName(url); //network address
            String ip = in.getHostAddress(); //ip = network address + host address
            JOptionPane.showMessageDialog(this, ip); // opens a message bos to show IP address
        }
        catch(UnknownHostException e1)
        {
            JOptionPane.showMessageDialog(this, e1.toString());
        }
    }
    public static void main(String[] args) {
        new IPFinder(); 
    }
}
