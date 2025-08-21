package com.nt;

import java.util.Date;

public class WishGenerator {
	
	Date dt;

   public void setDt(Date dt) {
		this.dt = dt;
	}

	public void wish() {
		int hr = dt.getHours();
		if(hr<12) {
			System.out.println("Good Morning All of You.");
		}else {
			System.out.println("Good Night All of You.");
		}
	}
	

}
