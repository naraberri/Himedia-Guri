package study10;
//풀어보기3
public class VolMake implements VolService{
	
	private int volLevel;
	
	public VolMake() {
		volLevel = 1;
	}
	
	@Override
	public void volUp(int level) {
		volLevel += level;
		
	}

	@Override
	public void volDown(int level) {
		volLevel -= level;
		
	}

	public int getVolLevel() {
		return volLevel;
	}
	
}
