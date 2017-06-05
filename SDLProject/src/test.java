
public class test {

	private static void testUnixHWConfig() {
		UnixHWConfigs unixHWConfig = new UnixHWConfigs();
		unixHWConfig.parse_UnixHWConfigFile();
		
		System.out.println("Model Names");
		String[] myModelNames = unixHWConfig.getModelNames();
		for(int i =0; i < myModelNames.length; i++) {
			System.out.println(myModelNames[i]);
		}
		
		System.out.println("");
		System.out.println("Standard Hosting Options");
		String[] myStandardHostingOps = unixHWConfig.getStandardHostingOps();
		for(int i =0; i < myStandardHostingOps.length; i++) {
			System.out.println(myStandardHostingOps[i]);
		}
	}
	
	public static void main(String[] args) {
		testUnixHWConfig();
	}
}
