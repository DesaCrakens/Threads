package pckThread;

import java.io.*;
import java.net.*;

public class Cliente {
	Cliente(){
		try{
			Socket cliente = new Socket("localhost",10000);
			DataInputStream f = new DataInputStream(cliente.getInputStream());
			System.out.println(f.readUTF());
			cliente.close();
		}catch(Exception e){
			
		}
	}
}
