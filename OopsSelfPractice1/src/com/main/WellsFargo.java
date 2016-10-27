package com.main;

public class WellsFargo extends Bank{           //inheritance
	int interest = 2000;
	public static void main(String[] args) {
		WellsFargo wf = new WellsFargo();
		System.out.println("Wellsfargo loan is:"+wf.loan);
		System.out.println("Interest of Wells is:"+wf.interest);
		
		
	}
	}

