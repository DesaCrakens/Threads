package pckThread;

import java.io.*;
import java.net.*;

public class Servidor {
	public Servidor(){
		try{
			ServerSocket server = new ServerSocket(10000);
			for (int i = 0; i < 4; i++) {
				Socket cliente = server.accept();
				System.out.println("Cliente "+i);
				DataOutputStream f = new DataOutputStream(cliente.getOutputStream());
				f.writeUTF("Hola cliente " + i );
				cliente.close();
			}
		}catch(Exception e){
			
		}
	}
}
