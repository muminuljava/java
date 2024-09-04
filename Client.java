/*Created By Muminul Islam
 * This Client program have two job
 * job one: get local ip and port
 * job two: make a client connection using this ip and port
 */
import java.io.IOException;
import java.net.Socket;

public class Client{
    Socket clientSocket;

    String RemoteIp;
    int remotePortNumber;
    
    public Client(){

        //Initialize Client
        try {
            clientSocket=new Socket(RemoteIp, remotePortNumber );
            System.out.println("Connected to "+RemoteIp);
        } catch (IOException ex) {
            System.out.println("Client Ip FAILED!");
        }


    }

}
