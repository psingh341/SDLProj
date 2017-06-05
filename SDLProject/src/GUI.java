import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class GUI {

	public JFrame frame;

	/**
	 * Create the application.
	 * 
	 * @throws URISyntaxException
	 */
	public GUI() throws URISyntaxException {
		initialize();
	}

	// Initialize method to start the gui
	private void initialize() throws URISyntaxException {

		// The frame to be used throughout the program
		frame = new JFrame();
		frame.setBounds(100, 100, 1004, 905);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setResizable(false);

		// Initial panel that is presented at the start of the program
		JPanel InitView = new JPanel();
		InitView.setBackground(new Color(204, 204, 153));
		frame.getContentPane().add(InitView, "name_933255140938789");
		InitView.setLayout(null);

		// Window button on the first page
		JButton windowsButton = new JButton("Windows");
		windowsButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		windowsButton.setBounds(352, 36, 208, 219);
		InitView.add(windowsButton);

		// Unix button on the first page
		JButton unixButton = new JButton("Unix/Linux");
		unixButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		unixButton.setBounds(352, 266, 208, 204);
		InitView.add(unixButton);

		// Code for linking the sdl sharepoint site to button on the first page
		final URI uri = new URI("http://share.allstate.com/sites/wsteam/SDL/default.aspx");
		class OpenUrlAction implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				open(uri);
			}
		}
		JButton sdlWebsiteButton = new JButton("SDL Sharepoint Site");
		sdlWebsiteButton.setBounds(10, 389, 332, 81);
		sdlWebsiteButton.setToolTipText(uri.toString());
		sdlWebsiteButton.addActionListener(new OpenUrlAction());
		InitView.add(sdlWebsiteButton);

		// Label for the Server Design Layout on initial page
		JLabel lblServerDesignLayout = new JLabel("Server Design Layout - SDL");
		lblServerDesignLayout.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblServerDesignLayout.setBounds(10, 0, 660, 33);
		InitView.add(lblServerDesignLayout);

		// Question on the first page for user to select their desired solution
		JLabel lblWhatIsThe = new JLabel("What is the platform for your solution?");
		lblWhatIsThe.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblWhatIsThe.setBounds(38, 249, 332, 23);
		InitView.add(lblWhatIsThe);

		// Button on UnixHWConfig page responsible for linking to module website
		final URI uriOne = new URI("http://share.allstate.com/sites/bhs/shs/Modules/Forms/Allltems.aspx");
		class OpenUrlActionOne implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}

		// The server count for opod
		String[] numServersOPOD = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		// Environment comboBox for OPOD
		String[] environmentsOPOD = { "", "Production", "Pre-Production", "Training", "Continuity", "eTest", "Test", "Development",
									  "Lab", "TPT"};

		// Combo Box for OPOD Buis Units
		String[] buisUnitsOPOD = { "", "Affinity", "Agency Distribution - Sales", "ALMCO", "Allstate Benefits",
				"Allstate Buisness Insurance (Commerical)", "Allstate Dealer Services(Credit Division)",
				"Allstate Finance Company", "Allstate Financial Technology", "Allstate Independent Agents",
				"Allstate Investments", "Allstate Roadside Services (ARS)", "Allstate Solutions Private Limited (ASPL)",
				"Allstate Vehicle & Property(AVPIC)", "ANI", "ANJ", "Architecture & Simplification", "ASAP", "ASIC",
				"ATO - PROD OPS", "ATO Finance", "ATO Strategy", "B2B Technology", "Broker Dealer", "Canada", "CEO COO",
				"CIC", "Claims", "Claims Technology Services", "Connected Car Technologies", "Consumer Household(SPL)",
				"Corporate Relations", "Customer Experience & Retention", "Dealer Lab", "Delivery & Risk Management",
				"Direct Channel of Bind - CIC", "Direct Channel of Bind - Internet",
				"DRM - Buisness/Application Architecture", "DRM - Enterprise Testing & Release Mgmt",
				"DRM - Information Security", "DRM - Program Management Office", "DRM - Risk Mgmt & Compliance",
				"Encompass", "Encompass Claims", "Encompass Support", "Enterprise", "Enterprise Shared Services",
				"Esurance", "Facility Services", "Finance", "Human Resources", "Information Services Group",
				"Infrastructure Services", "Investments Technology", "IS - ANI IS",
				"IS - Client & Middleware Platforms", "IS - Foundation Platforms", "IS - Infrastructure Operations",
				"IS - Network Services", "IS - Product Operations", "IS - Production Processes",
				"IS - Server Platforms", "IS - Solutions Enginerring & Service Mgmt",
				"ISG - Business Intelligence & Analytics", "ISG - Customer Data Strategy & Data Quality",
				"ISG - Data Solutions", "ISG - Database Administrator", "ISG - ICS/Customer Data Strategy",
				"ISG - Intgrated Customer Services", "IVANTAGE", "Kennet", "Law & Reg Claim Litigation",
				"Law & Regulation", "Life", "Marketing", "Motor Club", "North Light", "Northbrook Services",
				"Operations", "Ops - ATO Effectiveness & Engagement", "Ops - BPM & Quality",
				"Ops - Business Process Competency Center", "Ops - Business Process Delivery",
				"Ops - Enterprise Support", "Ops - Global Delivery Integration & Sourcing", "Ops - Operations CIO",
				"Ops - Policy Administration", "Ops - Processing Support for Claims",
				"Ops - Selling Policies & Agency Support", "Partnership Marketing  Group (PMG)", "Personal Lines",
				"Personal Lines - California", "Personal Lines(Exc.ANJ)", "Personal Lines(Incl.ANJ)",
				"Protection Risk & Return Mgmt", "Real Estate & Construction", "Research Center", "RMBC",
				"Sales, Mktg & Customer Experience", "SMCE - Agency Facing", "SMCE - Customer Facing",
				"Sourcing & Procurement Solutions", "Specialty Ops", "Sterling", "Techcor", "Technology Solutions" };

		// Data center options for OPOD
		String[] opsOPOD = { "", "Hudson", "Rochelle" };

		// Enterprise Options combo box for OPOD
		String[] entOpsOPOD = { "None", "sxm0029", "sxm0034" };

		// Wing location Options for OPOD
		String[] wingOpsOPOD = { "", "East", "West" };
		
		// combo box for vpool storage array in OPOD page
		String[] vpoolOpts = {"", "Storage_Subsystem_1001446", "Storage_Subsystem_1001646", "Storage_Subsystem_1099", 
							  "Storage_Subsystem_1201999", "Storage_Subsystem_1415", "Storage_Subsystem_17335", "Storage_Subsystem_28573",
							  "Storage_Subsystem_4547", "Storage_Subsystem_48504", "Storage_Subsystem_4961", "Storage_Subsystem_5018",
							  "Storage_Subsystem_54071", "Storage_Subsystem_55290", "Storage_Subsystem_55300", "Storage_Subsystem_55401",
							  "Storage_Subsystem_65197", "Storage_Subsystem_65278", "Storage_Subsystem_65284", "Storage_Subsystem_65301",
							  "Storage_Subsystem_65302", "Storage_Subsystem_65383", "Storage_Subsystem_65579", "Storage_Subsystem_66539",
							  "Storage_Subsystem_66796", "Storage_Subsystem_66804", "Storage_Subsystem_66897"};
		
		// number of databases combo box in OPOD page
		String[] numDatabasesOpts = {"1", "2", "3", "4", "5", "6", "7", "8"};
		
		// Combo box for number of disk groups in OPOD page
		String[] numDiskGroupsOpts = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};

		// The server count for hadoop
		String[] numServers1 = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		// Environment comboBox for Hadoop
		String[] environments1 = { "", "Production", "Pre-Pro", "QA", "I-Test", "E-Test", "A-Test" };

		// Combo Box for Hadoop Buis Units
		String[] buisUnits1 = { "", "Affinity", "Agency Distribution - Sales", "ALMCO", "Allstate Benefits",
				"Allstate Buisness Insurance (Commerical)", "Allstate Dealer Services(Credit Division)",
				"Allstate Finance Company", "Allstate Financial Technology", "Allstate Independent Agents",
				"Allstate Investments", "Allstate Roadside Services (ARS)", "Allstate Solutions Private Limited (ASPL)",
				"Allstate Vehicle & Property(AVPIC)", "ANI", "ANJ", "Architecture & Simplification", "ASAP", "ASIC",
				"ATO - PROD OPS", "ATO Finance", "ATO Strategy", "B2B Technology", "Broker Dealer", "Canada", "CEO COO",
				"CIC", "Claims", "Claims Technology Services", "Connected Car Technologies", "Consumer Household(SPL)",
				"Corporate Relations", "Customer Experience & Retention", "Dealer Lab", "Delivery & Risk Management",
				"Direct Channel of Bind - CIC", "Direct Channel of Bind - Internet",
				"DRM - Buisness/Application Architecture", "DRM - Enterprise Testing & Release Mgmt",
				"DRM - Information Security", "DRM - Program Management Office", "DRM - Risk Mgmt & Compliance",
				"Encompass", "Encompass Claims", "Encompass Support", "Enterprise", "Enterprise Shared Services",
				"Esurance", "Facility Services", "Finance", "Human Resources", "Information Services Group",
				"Infrastructure Services", "Investments Technology", "IS - ANI IS",
				"IS - Client & Middleware Platforms", "IS - Foundation Platforms", "IS - Infrastructure Operations",
				"IS - Network Services", "IS - Product Operations", "IS - Production Processes",
				"IS - Server Platforms", "IS - Solutions Enginerring & Service Mgmt",
				"ISG - Business Intelligence & Analytics", "ISG - Customer Data Strategy & Data Quality",
				"ISG - Data Solutions", "ISG - Database Administrator", "ISG - ICS/Customer Data Strategy",
				"ISG - Intgrated Customer Services", "IVANTAGE", "Kennet", "Law & Reg Claim Litigation",
				"Law & Regulation", "Life", "Marketing", "Motor Club", "North Light", "Northbrook Services",
				"Operations", "Ops - ATO Effectiveness & Engagement", "Ops - BPM & Quality",
				"Ops - Business Process Competency Center", "Ops - Business Process Delivery",
				"Ops - Enterprise Support", "Ops - Global Delivery Integration & Sourcing", "Ops - Operations CIO",
				"Ops - Policy Administration", "Ops - Processing Support for Claims",
				"Ops - Selling Policies & Agency Support", "Partnership Marketing  Group (PMG)", "Personal Lines",
				"Personal Lines - California", "Personal Lines(Exc.ANJ)", "Personal Lines(Incl.ANJ)",
				"Protection Risk & Return Mgmt", "Real Estate & Construction", "Research Center", "RMBC",
				"Sales, Mktg & Customer Experience", "SMCE - Agency Facing", "SMCE - Customer Facing",
				"Sourcing & Procurement Solutions", "Specialty Ops", "Sterling", "Techcor", "Technology Solutions" };

		// Data center options for Hadoop
		String[] ops1 = { "", "Hudson", "Rochelle" };

		// Enterprise Options combo box for Hadoop
		String[] entOps1 = { "None", "sxm0029", "sxm0034" };

		// Wing location Options for Hadoop
		String[] wingOps = { "", "East", "West" };

		// Jcombo box for the number of servers for TIBCO
		String[] numServers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		// Environment options jcombo box for TIBCO
		String[] environments = { "", "Production", "Pre-Pro", "QA", "I-Test", "E-Test", "A-Test" };

		// Combo Box for business units for TIBCO
		String[] buisUnits = { "Technology Solutions", "Affinity", "Agency Distribution - Sales", "ALMCO",
				"Allstate Benefits", "Allstate Buisness Insurance (Commerical)",
				"Allstate Dealer Services(Credit Division)", "Allstate Finance Company",
				"Allstate Financial Technology", "Allstate Independent Agents", "Allstate Investments",
				"Allstate Roadside Services (ARS)", "Allstate Solutions Private Limited (ASPL)",
				"Allstate Vehicle & Property(AVPIC)", "ANI", "ANJ", "Architecture & Simplification", "ASAP", "ASIC",
				"ATO - PROD OPS", "ATO Finance", "ATO Strategy", "B2B Technology", "Broker Dealer", "Canada", "CEO COO",
				"CIC", "Claims", "Claims Technology Services", "Connected Car Technologies", "Consumer Household(SPL)",
				"Corporate Relations", "Customer Experience & Retention", "Dealer Lab", "Delivery & Risk Management",
				"Direct Channel of Bind - CIC", "Direct Channel of Bind - Internet",
				"DRM - Buisness/Application Architecture", "DRM - Enterprise Testing & Release Mgmt",
				"DRM - Information Security", "DRM - Program Management Office", "DRM - Risk Mgmt & Compliance",
				"Encompass", "Encompass Claims", "Encompass Support", "Enterprise", "Enterprise Shared Services",
				"Esurance", "Facility Services", "Finance", "Human Resources", "Information Services Group",
				"Infrastructure Services", "Investments Technology", "IS - ANI IS",
				"IS - Client & Middleware Platforms", "IS - Foundation Platforms", "IS - Infrastructure Operations",
				"IS - Network Services", "IS - Product Operations", "IS - Production Processes",
				"IS - Server Platforms", "IS - Solutions Enginerring & Service Mgmt",
				"ISG - Business Intelligence & Analytics", "ISG - Customer Data Strategy & Data Quality",
				"ISG - Data Solutions", "ISG - Database Administrator", "ISG - ICS/Customer Data Strategy",
				"ISG - Intgrated Customer Services", "IVANTAGE", "Kennet", "Law & Reg Claim Litigation",
				"Law & Regulation", "Life", "Marketing", "Motor Club", "North Light", "Northbrook Services",
				"Operations", "Ops - ATO Effectiveness & Engagement", "Ops - BPM & Quality",
				"Ops - Business Process Competency Center", "Ops - Business Process Delivery",
				"Ops - Enterprise Support", "Ops - Global Delivery Integration & Sourcing", "Ops - Operations CIO",
				"Ops - Policy Administration", "Ops - Processing Support for Claims",
				"Ops - Selling Policies & Agency Support", "Partnership Marketing  Group (PMG)", "Personal Lines",
				"Personal Lines - California", "Personal Lines(Exc.ANJ)", "Personal Lines(Incl.ANJ)",
				"Protection Risk & Return Mgmt", "Real Estate & Construction", "Research Center", "RMBC",
				"Sales, Mktg & Customer Experience", "SMCE - Agency Facing", "SMCE - Customer Facing",
				"Sourcing & Procurement Solutions", "Specialty Ops", "Sterling", "Techcor" };

		// Data center combo box for TIBCO page
		String[] ops = { "", "Hudson", "Rochelle" };

		// Combo Box for Wing Location TIBCO page
		String[] locationOpts = { "", "East", "West" };

		// Enterprise controller comboBox
		String[] entOps = { "None", "sxm0029", "sxm0034" };

		// Security Ops combobox for TIBCO page
		String[] securityOps = { "", "MPN_Other_0", "DMZ_AccessMgmt_0", "DMZ_AccessMgmt_0_Pub", "DMZ_Vendor_0",
				"DMZ_Vendor_0_Pub", "N/A(for Tier 0 Servers" };

		// Behavior combo box for TIBCO
		String[] behaviors = { "", "Active/Active", "Swappable" };

		// Module options combobox for TIBCO
		String[] moduleOps = { "", "Business", "EMS", "Other" };

		// Maintenance options combobox for TIBCO
		String[] maintainOps = { "", "M4", "M5" };

		// Adds the selection of choices after user selects Windows
		windowsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Yes", "No", "Cancel" };
				int n = JOptionPane.showOptionDialog(frame, "Would you like to save it", null,
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

			}
		});

		// Adds the selection of choices after user selects Linux
		unixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Yes", "No", "Cancel" };
				int n = JOptionPane.showOptionDialog(frame, "Would you like to save it", null,
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
				if (n == 1) {
					UnixHWConfig.setVisible(true);
					InitView.setVisible(false);
				}
			}
		});
		InitView.setVisible(true);
	}

	/**
	 * Private helper method responsible for opening url
	 * 
	 * @param uri
	 *            The url to use
	 */
	private static void open(URI uri) {
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(uri);
			} catch (IOException e) {
				/* TODO: error handling */ }
		} else {
			/* TODO: error handling */ }
	}
}
