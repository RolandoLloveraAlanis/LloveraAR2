package Tarea5Hilos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	JProgressBar BarCamaro ;
	JProgressBar BarMustang;
	JProgressBar BarChallenger;
   HiloCamaro  hCamaro;
   HiloMustang hMustang;
   HiloChallenger hChallenger;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Camaro");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mustang");
		lblNewLabel_1.setBounds(10, 57, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Challenger");
		lblNewLabel_2.setBounds(10, 102, 73, 14);
		contentPane.add(lblNewLabel_2);
		
	    BarCamaro = new JProgressBar();
		BarCamaro.setBounds(10, 32, 146, 14);
		contentPane.add(BarCamaro);
		
		 BarMustang = new JProgressBar();
		BarMustang.setBounds(10, 71, 146, 14);
		contentPane.add(BarMustang);
		
	    BarChallenger = new JProgressBar();
		BarChallenger.setBounds(10, 118, 146, 14);
		contentPane.add(BarChallenger);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				hCamaro = new HiloCamaro(BarCamaro);
				Thread camaro = new Thread(hCamaro,"Camaro");
				camaro.start();
				
				hMustang = new HiloMustang(BarMustang);
				Thread mustang = new Thread(hMustang,"Mustang");
			    mustang.start();
				
				hChallenger = new HiloChallenger(BarChallenger);
				Thread challenger = new Thread(hChallenger,"Challenger");
				challenger.start();
			}
			
		});
		btnIniciar.setBounds(195, 23, 89, 23);
		contentPane.add(btnIniciar);
		
		JButton btnFin = new JButton("Finalizar");
		btnFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				hCamaro.fin=true;
				hMustang.fin=true;
				hChallenger.fin=true;
			}
		});
		btnFin.setBounds(195, 118, 89, 23);
		contentPane.add(btnFin);
	}
}
