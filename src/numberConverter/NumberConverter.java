package numberConverter;

import java.awt.EventQueue;

import paneel.Gui;

public class NumberConverter {
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Gui g = new Gui();
			}
		});
	}

}
