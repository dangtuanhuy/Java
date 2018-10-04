/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session18_NetworkProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.net.ssl.SSLServerSocket;

/**
 *
 * @author lhhuong
 */
public class ThreadServerSocket {
    public static void main(String[] args) throws IOException{
        ServerSocket socketServer = null;
        System.out.println("Server dang lang nghe...");
        int clientNumber = 0;
        
        try {
            socketServer = new ServerSocket(7777);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            while(true){
                Socket socket = socketServer.accept();
                new ServiceThread(clientNumber++, socket).start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            socketServer.close();
        }
    }
    
    private static class ServiceThread extends Thread{
        private int clientNumber;
        private Socket socketServer;

        public ServiceThread(int clientNumber, Socket socketServer) {
            this.clientNumber = clientNumber;
            this.socketServer = socketServer;
            
            System.out.println("Co mot ket noi moi tu client thu "+this.clientNumber+" tai "+this.socketServer);
        }
        
        @Override
        public void run(){
            //Mo luong vao ra tren socket tai Server
            String data, newData;
            Scanner input = new Scanner(System.in);
            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(this.socketServer.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(this.socketServer.getOutputStream()));

                //Nhan du lieu tu Client va phan hoi thong tin xuong Client
                while(true){
                    //Nhan du lieu cua Client gui den
                    data = reader.readLine();
                    System.out.println("Client: "+data);
                    //Phan hoi thong tin den Client
                    System.out.println("Thong tin can phan hoi: ");
                    newData = input.nextLine();
                    writer.write(">> "+newData);

                    //Xuong dong moi
                    writer.newLine();

                    //Day du lieu di
                    writer.flush();

                    if(data.equals("quit")){
                        writer.write(">>QUIT");
                        writer.newLine();
                        writer.flush();
                        break;
                    }
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
        
        
    }
}
