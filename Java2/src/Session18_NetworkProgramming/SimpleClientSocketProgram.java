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

/**
 *
 * @author lhhuong
 */
public class SimpleClientSocketProgram {
    public static void main(String[] args) throws IOException{
        String serverHost = "localhost";
        Socket socketClient = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        
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
            
            writer.write("HELO");
            writer.newLine();
            writer.flush();
            
            writer.write("Toi la Client. Va toi la Luong Hoang Huong");
            writer.newLine();
            writer.flush();
            
            writer.write("quit");
            writer.newLine();
            writer.flush();
            
            String dataFromServer;
            while((dataFromServer = reader.readLine()) != null){
                System.out.println("Du lieu tu Server: "+dataFromServer);
                if(dataFromServer.indexOf("QUIT") != -1)
                    break;
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
