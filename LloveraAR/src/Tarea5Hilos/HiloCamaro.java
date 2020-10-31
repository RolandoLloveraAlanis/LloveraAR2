package Tarea5Hilos;

import java.awt.Color;

import javax.swing.JProgressBar;

public class HiloCamaro implements Runnable{

	JProgressBar BarCamaro;
	public static boolean fin=false;
	public HiloCamaro (JProgressBar BarCamaro)
	{
		this.BarCamaro= BarCamaro;
	}
	public void run() 
	{
		for(int i=0;i<=100;i++)
		{
			if(fin==true)
			{
				break;
			}
			BarCamaro.setValue(i);
			System.out.println("Proceso "+ Thread.currentThread().getName()+" iniciado");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		fin=false;
		BarCamaro.setForeground(Color.yellow);
		System.out.println("Proceso "+ Thread.currentThread().getName()+ " acabado");
		
	}

}
