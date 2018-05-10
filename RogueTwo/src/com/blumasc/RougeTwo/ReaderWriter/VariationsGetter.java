package com.blumasc.RougeTwo.ReaderWriter;

import java.io.File;
import java.util.ArrayList;

import com.blumasc.RougeTwo.values.SETTINGS;

public class VariationsGetter {
	public static String[] get() 
	{
		File file = new File(SETTINGS.folderPosition+SETTINGS.gameName+"/");
		ArrayList<String> directories = new ArrayList<String>();
		File[] files = file.listFiles();
		for(File f : files) 
		{
			if(f.isDirectory()) {
				directories.add(f.getAbsolutePath());
			}
		}
		String[] dirs = new String[directories.size()];
		return directories.toArray(dirs);
	}

}
