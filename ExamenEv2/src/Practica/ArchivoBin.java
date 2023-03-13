package Practica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivoBin {

	public static void main(String[] args) throws IOException {
		String fichero = "pedidos.bin";
		
		escribirFicheroBinario(fichero);
		leerFicheroBinario(fichero);

	}
	
	private static void leerFicheroBinario(String fichero) throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream(fichero));
		
		dis.close();
	}
	
	private static void escribirFicheroBinario(String fichero) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero));
		
		dos.close();
		
	}

}
