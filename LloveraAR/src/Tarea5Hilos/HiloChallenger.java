package Tarea5Hilos;

import java.awt.Color;

import javax.swing.JProgressBar;

public class HiloChallenger implements Runnable{

	JProgressBar BarChallenger;
	public static boolean fin=false;
	public HiloChallenger (JProgressBar BarChallenger)
	{
		this.BarChallenger= BarChallenger;
	}
	public void run() 
	{
		for(int i=0;i<=100;i++)
		{
			if(fin==true)
			{
				break;
			}
			BarChallenger.setValue(i);
			System.out.println("Proceso "+ Thread.currentThread().getName()+" iniciado");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		fin=false;
		BarChallenger.setForeground(Color.red);
		System.out.println("Proceso "+ Thread.currentThread().getName()+ " acabado");
		
	}

}
