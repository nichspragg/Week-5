
public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.println(spaced(log));
	}

	@Override
	public void error(String error) {
		System.err.println("ERROR: " + spaced(error));
	}

	private String spaced(String str) {
		StringBuilder space = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			space.append(str.charAt(i) + " ");
		}
		return space.toString();
	}
}
