package study10;
//풀어보기4
public class CarVolMake implements CarVolService {

	private int volLevel;
	private int save;
	
	@Override
	public void volUp(int level) {
		volLevel += level;
		
	}

	@Override
	public void volDown(int level) {
		volLevel -= level;
		
	}

	@Override
	public void volOff() {
		volLevel = 0;
		
	}

	@Override
	public void volPause() {
		save = volLevel;
		volLevel = 0;
		
	}

	@Override
	public void volResume() {
		volLevel = save;
		
	}

	public int getVolLevel() {
		return volLevel;
	}

}
