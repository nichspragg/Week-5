
public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		char ast = '*';
		StringBuilder border = new StringBuilder();
		for(int i=0;i<error.length()+13;i++) {
			border.append(ast);
		}
		System.err.println(border + "\r***ERROR: " + error + "***\r" + border);	
	}
}
