package com.blumasc.RougeTwo.Actions;

import java.io.File;

import javax.swing.JFrame;

import com.blumasc.RougeTwo.values.SETTINGS;
import com.blumasc.RougeTwo.Display.Menu;
import com.blumasc.RougeTwo.ReaderWriter.VariationsGetter;

public class Main {
	public static void main(String[] args) {
		File theDir = new File(SETTINGS.folderPosition+SETTINGS.gameName+"/");

		if (!theDir.exists()) {
			System.out.println("creating directory: " + theDir.getName());
			boolean result = false;

			try {
				theDir.mkdir();
				result = true;
			} catch (SecurityException se) {
				se.printStackTrace();
			}
			if (result) {
				System.out.println("DIR created");
			}
		}
		try {
			//starting main menu
			String[] variations =  VariationsGetter.get();
			Menu frame = new Menu(variations);
			frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			frame.setUndecorated(true);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			//Hello Gerrito
		}
	}

}
