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
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author lhhuong
 */
public class InteractiveClientSocket {
    public static void main(String[] args) throws IOException{
        String serverHost = "localhost";
        Socket socketClient = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        Scanner input = new Scanner(System.in);
        
        try {
            //Gui yeu cau ket noi den Server
            socketClient = new Socket(serverHost, 9999);
            
            //Mo luong vao ra phia Client
            writer = new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));
            reader = new  BufferedReader(new InputStreamReader(socketClient.getInputStream()));
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println("Khong the mo ket noi vao ra den: "+serverHost);
        }
        
        try {
            
            //Thuc hien viec gui thong tin den Server
            String dataFromServer;
            String data;
            while(true){
                
                System.out.println("Thong tin gui den Server: ");
                data = input.nextLine();
                writer.write(data);
                writer.newLine();
                writer.flush();
                
                dataFromServer = reader.readLine();
                if(dataFromServer  != null){
                    System.out.println("Server: "+dataFromServer);
                    if(dataFromServer.indexOf("quit") != -1)
                        break;
                }
            }
            writer.close();
            reader.close();
            socketClient.close();
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        
    }
}
