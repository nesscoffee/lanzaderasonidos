package lanzaderasonidos;

import java.io.File;

import javax.sound.sampled.*;
import javax.swing.JFrame;

public class Controlador {
	
	public void playSound(String ruta) {
		try {
			File soundfile = new File(ruta);
			AudioInputStream audio = AudioSystem.getAudioInputStream(soundfile);
			Clip clip = AudioSystem.getClip();
			clip.open(audio);
			clip.start();
			
			while(!clip.isRunning()) {
				Thread.sleep(10);
			}
			while(clip.isRunning()) {
				Thread.sleep(10);
			}
			
			clip.close();
			audio.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		Interfaz ventana = new Interfaz();
		ventana.generarInterfaz();
	}

}
