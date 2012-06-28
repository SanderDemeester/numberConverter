package paneel;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class NumberConverterMenuBar extends JMenuBar{
	
	private static final int NUMBER_OF_ITEMS = 4;
	private static final int NUMBER_OF_MENU = 2;
	
	private static final String[] OPSCHRIFT_MENU = {"Bestand","Floating Point"};
	private static final String[] OPSCHRIFT_MENUITEMS = {"1/3/4","1/5/12","Open","Opslaan"};
	
	private JMenu[] menu = new JMenu[NUMBER_OF_MENU];
	private JMenuItem[] menuItems = new JMenuItem[NUMBER_OF_ITEMS];
	
	public NumberConverterMenuBar(){
		super();
		
		for(int i = 0; i < NUMBER_OF_ITEMS; i++){
			if(i < NUMBER_OF_MENU){
				menu[i] = new JMenu(OPSCHRIFT_MENU[i]);
				add(menu[i]);
			}
			
			menuItems[i] = new JMenuItem(OPSCHRIFT_MENUITEMS[i]);
			add(menuItems[i]);
		}
		
		menu[0].add(menuItems[2]);
		menu[0].add(menuItems[3]);
		
		menu[1].add(menuItems[0]);
		menu[1].add(menuItems[1]);
		
		menu[0].setMnemonic(KeyEvent.VK_B);
		menu[1].setMnemonic(KeyEvent.VK_F);
		
	}

}
