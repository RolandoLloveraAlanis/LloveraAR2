package Tarea5Hilos;

import java.awt.Color;

import javax.swing.JProgressBar;

public class HiloMustang implements Runnable {
	JProgressBar BarMustang;
	public static boolean fin=false;
	public HiloMustang (JProgressBar BarMustang)
	{
		this.BarMustang= BarMustang;
	}
	public void run() 
	{
		for(int i=0;i<=100;i++)
		{
			if(fin==true)
			{
				break;
			}
			BarMustang .setValue(i);
			System.out.println("Proceso "+ Thread.currentThread().getName()+" iniciado");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		fin=false;
		BarMustang.setForeground(Color.black);
		System.out.println("Proceso "+ Thread.currentThread().getName()+ " acabado");
		
	}

}
