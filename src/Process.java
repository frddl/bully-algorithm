public class Process {

	int pid;
	boolean isCoordinator, isDown;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
		
	public boolean isCoOrdinatorFlag() {
		return isCoordinator;
	}

	public void setCoOrdinatorFlag(boolean isCoOrdinator) {
		this.isCoordinator = isCoOrdinator;
	}
	
	public boolean isDownflag() {
		return isDown;
	}

	public void setDownflag(boolean downflag) {
		this.isDown = downflag;
	}

	public Process() {
		
	}

	public Process(int pid) {
		this.pid = pid;
		this.isDown = false;
		this.isCoordinator = false;
	}
}