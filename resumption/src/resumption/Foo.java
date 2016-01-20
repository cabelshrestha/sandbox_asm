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

		int $i0$x, $i0$y; // interface 0 (int x, int y)
		int $i1$z; // interface 1 (int z)

		switch (control(0)) {
		case 0:
			resume(Integer.class, Integer.class); // interface 0 (int x, int y)

			$i0$x = getParameter(0);
			$i0$y = getParameter(1);

			B1(); //B1

		case 1:
			if (isRunning()) {
				 $c1 = B2();
			}
			$1: while ($c1) {
				switch (control(1)) {
				case 0:
					B3(); // B3
					suspend(1, 1);
					return;
				case 1:
					resume(Integer.class); // interface 1 (int z)
					$i1$z = getParameter(0);
					B4(); // B4
					 $c1 = B2();
				} // end switch
			} // end while

			B5(); // B5

		} // end switch
	} // end method start
	
	private void B1() {
		System.out.println("executing Block 1 code");
	}

	private boolean B2() {
		System.out.println("executing Block 2 code"); 
		return true;
	}

	private void B3() {
		System.out.println("executing Block 3 code");
	}

	private void B4() {
		System.out.println("executing Block 4 code");
	}

	private void B5() {
		System.out.println("executing Block 5 code");
	}

} // end class foo
