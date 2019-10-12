/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manjukl
 */
//package serverSide;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
/**
* A TCP server that runs on port 7070. When a client connects, it
* sends the client the current date and time, then closes the
* connection with that client.
*/
public class Server
{
    /**
     * Runs the server.
     */
    public static void main(String[] args) throws IOException {
        /* Create the socket listner
        * using ServerSocket Java class
        * for Listening on a socket.
        * Use port 7070*/
/* TO DO here */
            ServerSocket serverSocket = new ServerSocket (7070);
            Socket socket = new Socket();
            
        System.out.println("ServerSocket running on port 7070");
        try {
            while (true) {
                /** To Do
                * Accept client connection here
                */
                socket = serverSocket.accept();
/* TO DO here*/
               try 
               {
                System.out.println("Now listening on port 9090");
                    PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Date().toString());
               } finally 
               {
                System.out.println("terminated running on port 9090");
                /* close the communication channel here
                */
                serverSocket.close();
                socket.close();;
/* To Do Here */
                }
            }
        }
        finally {
        /* close the communication channel here
        */
        serverSocket.close();
        socket.close();
/* To Do Here */
        }
    }
}

