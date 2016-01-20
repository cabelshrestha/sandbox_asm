package resumption;

import java.io.Serializable;
import org.jcsp.lang.CSProcess;

public abstract class AbstractCSProcess implements CSProcess, Serializable {

	private static final long serialVersionUID = 1693398703261184099L;

	protected int control(int level) {
		
		return 0;
	}
	protected <T> T getParameter(int index) {
		
		return null;
	} 
	protected boolean isRunning(){
		
		return false;
	}
	protected void resume(Class<?>... parameterTypes){
		
	} 
	public void run(Object... args) {
		
	}
	protected abstract void start();
	protected void suspend(int... targets) {
		
	}

}
