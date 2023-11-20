package com.aurionpro.test;

import com.aurionpro.model.Command;
import com.aurionpro.model.Light;
import com.aurionpro.model.LightOffCommand;
import com.aurionpro.model.LightOnCommand;
import com.aurionpro.model.RemoteControl;

public class LightTest {
	
	    public static void main(String[] args) {
	        Light livingRoomLight = new Light();
	        Command lightOn = new LightOnCommand(livingRoomLight);
	        Command lightOff = new LightOffCommand(livingRoomLight);

	        RemoteControl remote = new RemoteControl();
	        
	        remote.setCommand(lightOn);
	        remote.pressButton(); 

	        remote.setCommand(lightOff);
	        remote.pressButton(); 
	        
	    }
	}

