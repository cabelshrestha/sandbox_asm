package com.suspend.test;

import com.suspend.instrument.Instrumenter;

public class Procedure {

	private Object[] actRec;
	public int jumpTarget = 0;
	

	public int procedure1() {
		int a;
		int cnt;
		
		switch(jumpTarget) {
			case 1: jump(Instrumenter.RESUME); break;
			default: ;
		}
		
		a = 3;
		cnt = 0;
	    while (a != 0) {
	      a = a - 1;
	      cnt++;

	      //storing locals to activation stack
	      actRec = new Object[] { a, cnt };
	      jumpTarget = 1;
	      
	      System.out.println("[Procedure] suspending....");

	      jump(Instrumenter.SUSPEND); // suspend()
	      label(Instrumenter.RESUME); // resume()

	      System.out.println("[Procedure] resumed....");

	      //retrieving locals from activation stack
	      a = (Integer)actRec[0];
	      cnt = (Integer)actRec[1];

	      System.out.println("[Procedure] run count=" + cnt);
	      
	    }
		
		jumpTarget = 0;
		label(Instrumenter.SUSPEND);

		return a;
	}
	
	protected final void jump(final int lineNumber) {
    }

    protected final void label(final int label) {
    }
	
	

}
