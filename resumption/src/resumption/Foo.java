package resumption;

public class Foo extends AbstractCSProcess {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	int $b1$a; // original a
	int $b3$q; // original q
	int $b4$w; // original w
	boolean $c1; // original B2

	@Override
	protected void start() {
	// interface 0 (int x, int y) int $i0$x, $i0$y;
	// interface 1 (int z)
	int $i1$z;
	switch (control(0)) { 
	case 0:
		// interface 0 (int x, int y) 
		resume(Integer.class, Integer.class); 
		$i0$x = getParameter(0);
		$i0$y = getParameter(1);
		System.out.println("executing Block 1 code"); //B1
	case 1:
		if (isRunning()) {
//			$c1 = B2; 
			}
		$1: while ($c1) { 
			switch (control(1)) { 
				case 0:
					System.out.println("executing Block 3 code"); //B3
					suspend(1,1); return;
				case 1:
					//interface 1 (int z) 
					resume(Integer.class); 
					$i1$z = getParameter(0); 
//					B4
					System.out.println("executing Block 4 code"); //B4
//					$c1 = B2;
				} // end switch 
			} // end while
			System.out.println("executing Block 5 code"); //B5
		} // end switch
	} // end method start
} // end class foo
