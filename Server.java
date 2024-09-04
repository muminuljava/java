/*Created by Muminl Islam
 *Stage ONE: Create Server
 *Stage Two: Start Listen
 *Stage Three: CALL IO Class for IO Operation
 */
import java.io.IOException;
import java.net.ServerSocket;

class Server{
    ServerSocket serverSocket;
    String serverIp;
    int serverPortNumber;

    public Server(){
        try {
            serverSocket=new ServerSocket();
            System.out.println("ServerSocket Working!!!");
        } catch (IOException ex) {
            System.out.println("ServerSocket Failed !!!");
        }
    }


}
