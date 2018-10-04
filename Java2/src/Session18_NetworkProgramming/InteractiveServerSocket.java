/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session18_NetworkProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author lhhuong
 */
public class InteractiveServerSocket {
    public static void main(String[] args){
        ServerSocket server = null;
        String data;
        BufferedReader reader;
        BufferedWriter writer;
        Socket socket = null;
        Scanner input = new Scanner(System.in);
        
        //Tao mot Server lang nghe cac ket noi tai cong 9999
        try {
            server = new ServerSocket(9999);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("Server dang lang nghe...");
            
            //Chap nhan ket noi tu phia client gui den
            socket = server.accept();
            System.out.println("Chap nhan ket noi cua Client!!!");
            
            
            //Mo luong vao ra tren socket tai Server
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            
            //Nhan du lieu tu Client va phan hoi thong tin xuong Client
            while(true){
                //Nhan du lieu cua Client gui den
                data = reader.readLine();
                System.out.println("Client: "+data);
                //Phan hoi thong tin den Client
                String newData;
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
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Dong Server!!!");
    }
}
