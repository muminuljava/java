/*
 * This Client program have two job
 * job one: get local ip and port
 * job two: make a client connection using this ip and port
 */
import java.net.Socket;

public class Client{
    Socket clinetSocket;

    String ClientLocalIp;
    int clientLocalSocketNumber;
    
    public Client(){
        clinetSocket=new Socket();

    }

}