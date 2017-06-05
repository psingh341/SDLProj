import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JComboBox;

public class UnixHWConfigs {

	File file = new File("Program_Files\\UnixHWConfig.txt");
	String[] modelNames;
	ArrayList<String> modelNamesAlternate = new ArrayList<String>();
	String[] standHostOps;
	ArrayList<String> standHostOpsAlt = new ArrayList<String>();

	public String[] getModelNames() {
		return modelNames;
	}
	
	public String[] getStandardHostingOps() {
		return standHostOps;
	}
	
	public void parse_UnixHWConfigFile() {
		Scanner console = null;
		try {
			console = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (console.hasNextLine()) {
			console.nextLine();
			String toParse = console.nextLine();
			Scanner lineScanner = new Scanner(toParse);
			lineScanner.useDelimiter(", ");
			while (lineScanner.hasNext()) {
				String toAdd = lineScanner.next();
				modelNamesAlternate.add(toAdd);
			}
			lineScanner.close();
			console.nextLine();
			String toParseAlternate = console.nextLine();
			Scanner lineScannerAlt = new Scanner(toParseAlternate);
			lineScannerAlt.useDelimiter(", ");
			while (lineScannerAlt.hasNext()) {
				String toAdd = lineScannerAlt.next();
				standHostOpsAlt.add(toAdd);
			}
			lineScannerAlt.close();
		}
		modelNames = new String[modelNamesAlternate.size()];
		for(int i = 0; i < modelNames.length; i++) {
			modelNames[i] = modelNamesAlternate.get(i);
		}
		standHostOps = new String[standHostOpsAlt.size()];
		for(int i = 0; i < standHostOps.length; i++) {
			standHostOps[i] = standHostOpsAlt.get(i);
		}
		console.close();
	}
}
