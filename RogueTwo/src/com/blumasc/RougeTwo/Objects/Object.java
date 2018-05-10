package com.blumasc.RougeTwo.Objects;

import com.blumasc.RougeTwo.Display.Display;
import com.blumasc.RougeTwo.Display.Map;

public abstract class Object {
	String name = "";
	abstract void defaultBehaviour(Map m);
	abstract void onUse(Map m,Display d);
	public String getName() 
	{
		return name;
	}

}
