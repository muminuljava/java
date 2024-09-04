//Created by Muminul Islam

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Gui extends JFrame{
    //Gui Elements
    String WindowTitle="Make A Connection!";
    int frameHeight;
    int frameWidth;

            //Local Machine Details
    JTextArea LocalMachineDetail;

            //Remote Machine Details
    JTextField remoteMachineDetail;
    JButton remoteConnectButton;

            //Message Details
    JTextArea msgShowArea;
    JTextField msgTypingArea;
    JButton msgSendButton;

    
    //Constructor
    public Gui(){
        //Setting up Variables
        frameHeight=400;
        frameWidth=200;

        //Local Machine Detail
        LocalMachineDetail=new JTextArea();
        LocalMachineDetail.setEditable(false);

        //Remote Machine Detail
        remoteMachineDetail=new JTextField(100);
        remoteMachineDetail.setEditable(true);

        //Remote Machine Connect Button
        remoteConnectButton=new JButton("Connect");

        //Message Show Text Area
        msgShowArea=new JTextArea();
        msgShowArea.setEditable(false);

        //Message Input Text Area
        msgTypingArea=new JTextField(100);
        msgTypingArea.setEditable(true);

        //Message Send Button
        msgSendButton=new JButton("Send Message");


        //Now Main GUI
        Container cp=getContentPane(); //Container of GUI Element
        cp.setLayout(new GridLayout(6,0)); //Setting Layout of GUI

                //Add all component into contianer
        cp.add(LocalMachineDetail);
        cp.add(remoteMachineDetail);
        cp.add(remoteConnectButton);
        cp.add(msgShowArea);
        cp.add(msgTypingArea);
        cp.add(msgSendButton);
        
                //Set Window
        setTitle(WindowTitle);
        setPreferredSize(new Dimension(frameWidth, frameHeight));
        pack();
        setVisible(true);

        //Set up Listener
        remoteMachineDetail.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e){
                        
                }

        });

        remoteConnectButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                        
                }
        });

        msgTypingArea.addKeyListener(new KeyAdapter() {
        
        });

        msgSendButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                        
                }
        });

    }
}
