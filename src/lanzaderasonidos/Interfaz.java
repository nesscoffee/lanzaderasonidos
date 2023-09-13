package lanzaderasonidos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class Interfaz {
	public void generarInterfaz() {
		
		JFrame ventana = new JFrame("Lanzadera de Sonidos");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel titulo = new JLabel("Lanzadera de Sonidos");
		titulo.setBounds(10,10,380,30);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titulo);
		
		JTextField texto1 = new JTextField();
		texto1.setBounds(10,60,300,30);
		panel.add(texto1);
		
		JButton botonPlay1 = new JButton("Reproducir");
		botonPlay1.setBounds(320,60,100,30);
		panel.add(botonPlay1);
		
		JButton seleccionarAudio1 = new JButton("Seleccionar sonido");
		seleccionarAudio1.setBounds(320,90,100,30);
		panel.add(seleccionarAudio1);
		
		///////////////////////////////////////
		
		JTextField texto2 = new JTextField();
		texto2.setBounds(10,120,300,30);
		panel.add(texto2);
		
		JButton botonPlay2 = new JButton("Reproducir");
		botonPlay2.setBounds(320,120,100,30);
		panel.add(botonPlay2);
		
		JButton seleccionarAudio2 = new JButton("Seleccionar sonido");
		seleccionarAudio2.setBounds(320,150,100,30);
		panel.add(seleccionarAudio2);
		
		///////////////////////////////////////
		
		JTextField texto3 = new JTextField();
		texto3.setBounds(10,180,300,30);
		panel.add(texto3);
		
		JButton botonPlay3 = new JButton("Reproducir");
		botonPlay3.setBounds(320,180,100,30);
		panel.add(botonPlay3);
		
		JButton seleccionarAudio3 = new JButton("Seleccionar sonido");
		seleccionarAudio3.setBounds(320,210,100,30);
		panel.add(seleccionarAudio3);
		
		///////////////////////////////////////

		JTextField texto4 = new JTextField();
		texto4.setBounds(10,240,300,30);
		panel.add(texto4);
		
		JButton botonPlay4 = new JButton("Reproducir");
		botonPlay4.setBounds(320,240,100,30);
		panel.add(botonPlay4);
		
		JButton seleccionarAudio4 = new JButton("Seleccionar sonido");
		seleccionarAudio4.setBounds(320,270,100,30);
		panel.add(seleccionarAudio4);
		
		/////////////////////////////////////////
		
		JTextField texto5 = new JTextField();
		texto5.setBounds(10,300,300,30);
		panel.add(texto5);
		
		JButton botonPlay5 = new JButton("Reproducir");
		botonPlay5.setBounds(320,300,100,30);
		panel.add(botonPlay5);
		
		JButton seleccionarAudio5 = new JButton("Seleccionar sonido");
		seleccionarAudio5.setBounds(320,330,100,30);
		panel.add(seleccionarAudio5);
		
		/////////////////////////////////////////
		
		JTextField texto6 = new JTextField();
		texto6.setBounds(10,360,300,30);
		panel.add(texto6);
		
		JButton botonPlay6 = new JButton("Reproducir");
		botonPlay6.setBounds(320,360,100,30);
		panel.add(botonPlay6);
		
		JButton seleccionarAudio6 = new JButton("Seleccionar sonido");
		seleccionarAudio6.setBounds(320,390,100,30);
		panel.add(seleccionarAudio6);
		
		
		seleccionarAudio1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				int result = file.showOpenDialog(panel);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selfile = file.getSelectedFile();
					texto1.setText(selfile.getAbsolutePath());
				}
			}
		});
		
		seleccionarAudio2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				int result = file.showOpenDialog(panel);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selfile = file.getSelectedFile();
					texto2.setText(selfile.getAbsolutePath());
				}
			}
		});
		
		seleccionarAudio3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				int result = file.showOpenDialog(panel);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selfile = file.getSelectedFile();
					texto3.setText(selfile.getAbsolutePath());
				}
			}
		});
		
		seleccionarAudio4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				int result = file.showOpenDialog(panel);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selfile = file.getSelectedFile();
					texto4.setText(selfile.getAbsolutePath());
				}
			}
		});
		
		seleccionarAudio5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				int result = file.showOpenDialog(panel);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selfile = file.getSelectedFile();
					texto5.setText(selfile.getAbsolutePath());
				}
			}
		});
		
		seleccionarAudio6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				int result = file.showOpenDialog(panel);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selfile = file.getSelectedFile();
					texto6.setText(selfile.getAbsolutePath());
				}
			}
		});
		
		botonPlay1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = texto1.getText();
				Controlador controlador1 = new Controlador();
				controlador1.playSound(path);
			}
		});
		
		botonPlay2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = texto2.getText();
				Controlador controlador1 = new Controlador();
				controlador1.playSound(path);
			}
		});
		
		botonPlay3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = texto3.getText();
				Controlador controlador1 = new Controlador();
				controlador1.playSound(path);
			}
		});
		
		botonPlay4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = texto4.getText();
				Controlador controlador1 = new Controlador();
				controlador1.playSound(path);
			}
		});
		
		botonPlay5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = texto5.getText();
				Controlador controlador1 = new Controlador();
				controlador1.playSound(path);
			}
		});
		
		botonPlay6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = texto6.getText();
				Controlador controlador1 = new Controlador();
				controlador1.playSound(path);
			}
		});
		
		ventana.add(panel);
		ventana.setSize(450, 400);
		ventana.setVisible(true);
	}
}
