
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class Gui extends JFrame{
    //Gui Elements
    String WindowTitle="Make A Connection!";
    int frameHeight;
    int frameWidth;

            //Local Machine Details
    JTextArea localIpShowTextArea;
    JTextArea localPortShowTextArea;
    JButton localInfoButton;
            //Remote Machine Details
    JTextField remoteIpInputTextfield;
    JTextField remotePortInputTextfield;
    JButton RemoteConnectButton;
            //Message Details
    JTextArea msgShowArea;
    JTextField msgTypingArea;
    JButton msgSendButton;

    
    //Constructor
    public Gui(){
        //Local Machine Detail
        localIpShowTextArea=new JTextArea();
        localPortShowTextArea=new JTextArea();
        localInfoButton=new JButton("Ping");

        //Remote Machine Detail
        remoteIpInputTextfield=new JTextField();
        remotePortInputTextfield=new JTextField();
        RemoteConnectButton=new JButton("Connect");

        //Message Portion
        msgShowArea=new JTextArea();
        msgTypingArea=new JTextField();
        msgSendButton=new JButton("Send Message");

        //Now Main GUI
        Container cp=getContentPane(); //Container of GUI Element
        cp.setLayout(new GridLayout(0,2)); //Setting Layout of GUI

            //Add all component into contianer
            cp.add(localIpShowTextArea);
            cp.add(localPortShowTextArea);
            cp.add(localInfoButton);




    }
}