package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.IHat;
import com.aurionpro.model.Premium;
import com.aurionpro.model.RibonedHat;
import com.aurionpro.model.Standard;

public class HatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      IHat hat = new Standard();
      GoldenHat gh = new GoldenHat( hat);
      RibonedHat rh = new RibonedHat(gh);
      System.out.println(rh.getName());
      System.out.println(rh.getPrice());
      IHat hat1 = new Premium();
      GoldenHat gh1 = new GoldenHat(hat1);
      System.out.println(gh1.getName()+" "+gh1.getPrice());
      
	}

}
