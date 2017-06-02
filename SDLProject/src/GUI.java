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
	private JTextField logicalName_1;
	private JTextField logicalName_2;
	private JTextField logicalName_3;
	private JTextField logicalName_4;
	private JTextField logicalName_5;
	private JTextField logicalName_6;
	private JTextField logicalName_7;
	private JTextField logicalName_8;
	private JTextField logicalName_9;
	private JTextField logicalName_10;
	private JTextField relationship_1;
	private JTextField relationship_2;
	private JTextField relationship_3;
	private JTextField relationship_4;
	private JTextField relationship_5;
	private JTextField relationship_6;
	private JTextField relationship_7;
	private JTextField relationship_8;
	private JTextField relationship_9;
	private JTextField relationship_10;
	private JTextField clusterNameTF;
	private JTextField databaseName_1;
	private JTextField databaseName_2;
	private JTextField databaseName_3;
	private JTextField databaseName_4;
	private JTextField databaseName_5;
	private JTextField databaseName_6;
	private JTextField databaseName_7;
	private JTextField databaseName_8;
	private JTextField version_1;
	private JTextField version_2;
	private JTextField version_3;
	private JTextField version_4;
	private JTextField version_5;
	private JTextField version_6;
	private JTextField version_7;
	private JTextField version_8;
	private JTextField relationshipTF_1;
	private JTextField relationshipTF_2;
	private JTextField relationshipTF_3;
	private JTextField relationshipTF_4;
	private JTextField relationshipTF_5;
	private JTextField relationshipTF_6;
	private JTextField relationshipTF_7;
	private JTextField relationshipTF_8;
	private JTextField primaryTF_1;
	private JTextField primaryTF_2;
	private JTextField primaryTF_3;
	private JTextField primaryTF_4;
	private JTextField primaryTF_5;
	private JTextField primaryTF_6;
	private JTextField primaryTF_7;
	private JTextField primaryTF_8;
	private JTextField backupTypeTF_1;
	private JTextField backupTypeTF_2;
	private JTextField backupTypeTF_3;
	private JTextField backupTypeTF_4;
	private JTextField backupTypeTF_5;
	private JTextField backupTypeTF_6;
	private JTextField backupTypeTF_7;
	private JTextField backupTypeTF_8;
	private JTextField serverOrderNumTF;

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

		// The new panel that is used for the UnixHW Config
		JPanel UnixHWConfig = new JPanel();

		// Sets the layout for the UnixHWConfig page
		frame.getContentPane().add(UnixHWConfig, "name_938386085892580");
		UnixHWConfig.setLayout(null);

		// Button on UnixHWConfig page responsible for linking to module website
		final URI uriOne = new URI("http://share.allstate.com/sites/bhs/shs/Modules/Forms/Allltems.aspx");
		class OpenUrlActionOne implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				open(uriOne);
			}
		}
		JButton linkForModule = new JButton("Module Selections and Options Link");
		linkForModule.setBounds(10, 66, 301, 57);
		linkForModule.setToolTipText(uri.toString());
		linkForModule.addActionListener(new OpenUrlActionOne());
		UnixHWConfig.add(linkForModule);

		// Title for the Unix Hardware Configs Page
		JLabel lblUnixHardwareConfigs = new JLabel("Unix Hardware Configs");
		lblUnixHardwareConfigs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUnixHardwareConfigs.setBounds(10, 11, 693, 21);
		UnixHWConfig.add(lblUnixHardwareConfigs);

		// Description on Unix Hardware Configs Page of actions to be performed
		JLabel lblIfYourSolution = new JLabel(
				"If your solution allows the utilization of the Server Hardware Modules, please select any of these below");
		lblIfYourSolution.setBounds(10, 43, 693, 14);
		UnixHWConfig.add(lblIfYourSolution);

		// Title for Blade Server Modules on Unix Hardware Configs Page
		JLabel lblBladeServerModules = new JLabel("Blade Server Modules");
		lblBladeServerModules.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblBladeServerModules.setBounds(10, 134, 236, 29);
		UnixHWConfig.add(lblBladeServerModules);

		// Button for Blade Server Module on Unix Hardware Page
		JButton dellBladeModel = new JButton("DELL M630 13G Blade Server Hardware CFG02");
		dellBladeModel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		dellBladeModel.setBounds(20, 174, 357, 45);
		UnixHWConfig.add(dellBladeModel);

		// Separator for page on Unix Hardware Config Page
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 236, 798, 2);
		UnixHWConfig.add(separator);

		// Separator for page on Unix Hardware Config Page
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 133, 798, 2);
		UnixHWConfig.add(separator_1);

		// Label for Physical Rack Server Modules on Unix Hardware Configs Page
		JLabel lblPhysicalRackServer = new JLabel("Physical RACK Server Modules");
		lblPhysicalRackServer.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblPhysicalRackServer.setBounds(10, 252, 357, 29);
		UnixHWConfig.add(lblPhysicalRackServer);

		// Button for HP DL560 G9 Server Hardware CFG01 12x1024GB on Unix
		// Hardware Configs Page
		JButton hpPhysicalRack = new JButton("HP DL560 G9 Server Hardware CFG01 12x1024GB");
		hpPhysicalRack.setBounds(377, 292, 347, 45);
		UnixHWConfig.add(hpPhysicalRack);

		// Button for DELL R730 Server Hardware CFG01 on Unix Hardware Configs
		// Page
		JButton dellPhysicalRack = new JButton("DELL R730 Server Hardware CFG01");
		dellPhysicalRack.setBounds(20, 361, 347, 45);
		UnixHWConfig.add(dellPhysicalRack);

		// Button for Dell R730 Server Hardware CFG04 8x384GB on Unix Hardware
		// Configs Page
		JButton dellPhysicalRack1 = new JButton("Dell R730 Server Hardware CFG04 8x384GB");
		dellPhysicalRack1.setBounds(377, 361, 347, 45);
		UnixHWConfig.add(dellPhysicalRack1);

		// Button for Dell R730 Server Hardware CFG05 16x512GB on Unix Hardware
		// Configs Page
		JButton btnDellRServer = new JButton("Dell R730 Server Hardware CFG05 16x512GB");
		btnDellRServer.setBounds(20, 292, 347, 45);
		UnixHWConfig.add(btnDellRServer);

		// Seperator between sections on Unix Hardware Configs Page
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 431, 798, 2);
		UnixHWConfig.add(separator_2);

		// Description for alternate option Unix Hardware Configs Page
		JLabel lblAnythingOtherThan = new JLabel(
				"Anything other than what is considered a Hardware Module you may use these options:");
		lblAnythingOtherThan.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblAnythingOtherThan.setBounds(10, 443, 778, 29);
		UnixHWConfig.add(lblAnythingOtherThan);

		// Alternate Option of Virtual Server on Unix Hardware Configs Page
		JButton btnVirtualServerzone = new JButton("Virtual Server (Zone)");
		btnVirtualServerzone.setBounds(20, 485, 226, 45);
		UnixHWConfig.add(btnVirtualServerzone);

		// Alternate option of Virtual Machine on Unix Hardware Configs Page
		JButton btnVirtualMachinevmware = new JButton("Virtual Machine (VMWare)");
		btnVirtualMachinevmware.setBounds(277, 483, 226, 45);
		UnixHWConfig.add(btnVirtualMachinevmware);

		// Alternate option of Custom Server on Unix Hardware Configs Page
		JButton btnCustomServer = new JButton("Custom Server");
		btnCustomServer.setBounds(534, 483, 226, 45);
		UnixHWConfig.add(btnCustomServer);

		// Separator on page
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 563, 798, 2);
		UnixHWConfig.add(separator_3);

		// New panel for the TIBCO page
		JPanel TIBCO = new JPanel();
		frame.getContentPane().add(TIBCO, "name_235054462757806");
		TIBCO.setLayout(null);

		// New panel for the OPOD page
		JPanel OPOD = new JPanel();
		frame.getContentPane().add(OPOD, "name_235092414105547");
		OPOD.setLayout(null);

		// Label for the title of the opod page
		JLabel lblOpod = new JLabel("OPOD");
		lblOpod.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblOpod.setBounds(10, 11, 753, 34);
		OPOD.add(lblOpod);
		
		// Question for unix server count on Opod page
		JLabel unixServerCountQuestionOPOD = new JLabel("How many Unix Server(s) total are planned?");
		unixServerCountQuestionOPOD.setBounds(10, 109, 254, 14);
		OPOD.add(unixServerCountQuestionOPOD);

		// Description of required fields for OPOD Page
		JLabel requiredFieldsOPOD = new JLabel("Required UNIQUE fields to be filled in prior to selecting the SHS Option");
		requiredFieldsOPOD.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		requiredFieldsOPOD.setBounds(10, 57, 435, 14);
		OPOD.add(requiredFieldsOPOD);

		// The server count for opod
		String[] numServersOPOD = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		JComboBox unixServerCountOPOD = new JComboBox(numServersOPOD);
		unixServerCountOPOD.setBackground(Color.YELLOW);
		unixServerCountOPOD.setBounds(338, 106, 276, 20);
		unixServerCountOPOD.setSelectedItem("2");
		OPOD.add(unixServerCountOPOD);
		unixServerCountOPOD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(1 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_1.setVisible(true);
					relationship_1.setVisible(true);
				}
				else {
					logicalName_1.setVisible(false);
					relationship_1.setVisible(false);
				}
				if(2 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_2.setVisible(true);
					relationship_2.setVisible(true);
				}
				else {
					logicalName_2.setVisible(false);
					relationship_2.setVisible(false);
				}
				if(3 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_3.setVisible(true);
					relationship_3.setVisible(true);
				}
				else {
					logicalName_3.setVisible(false);
					relationship_3.setVisible(false);
				}
				if(4 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_4.setVisible(true);
					relationship_4.setVisible(true);
				}
				else {
					logicalName_4.setVisible(false);
					relationship_4.setVisible(false);
				}
				if(5 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_5.setVisible(true);
					relationship_5.setVisible(true);
				}
				else {
					logicalName_5.setVisible(false);
					relationship_5.setVisible(false);
				}
				if(6 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_6.setVisible(true);
					relationship_6.setVisible(true);
				}
				else {
					logicalName_6.setVisible(false);
					relationship_6.setVisible(false);
				}
				if(7 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_7.setVisible(true);
					relationship_7.setVisible(true);
				}
				else {
					logicalName_7.setVisible(false);
					relationship_7.setVisible(false);
				}
				if(8 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_8.setVisible(true);
					relationship_8.setVisible(true);
				}
				else {
					logicalName_8.setVisible(false);
					relationship_8.setVisible(false);
				}
				if(9 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_9.setVisible(true);
					relationship_9.setVisible(true);
				}
				else {
					logicalName_9.setVisible(false);
					relationship_9.setVisible(false);
				}
				if(10 <= unixServerCountOPOD.getSelectedIndex()) {
					logicalName_10.setVisible(true);
					relationship_10.setVisible(true);
				}
				else {
					logicalName_10.setVisible(false);
					relationship_10.setVisible(false);
				}
			}
		});

		// Environment comboBox for OPOD
		String[] environmentsOPOD = { "", "Production", "Pre-Production", "Training", "Continuity", "eTest", "Test", "Development",
									  "Lab", "TPT"};
		JComboBox environmentCBOPOD = new JComboBox(environmentsOPOD);
		environmentCBOPOD.setBackground(Color.YELLOW);
		environmentCBOPOD.setBounds(338, 139, 276, 20);
		OPOD.add(environmentCBOPOD);

		// Label for Environment comboBox for OPOD
		JLabel environmentlblOPOD = new JLabel("Environment Selection");
		environmentlblOPOD.setBounds(10, 142, 254, 14);
		OPOD.add(environmentlblOPOD);

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
		JComboBox buisUnitOPOD = new JComboBox(buisUnitsOPOD);
		buisUnitOPOD.setBackground(Color.YELLOW);
		buisUnitOPOD.setBounds(280, 183, 334, 20);
		buisUnitOPOD.setSelectedItem("Enterprise");
		OPOD.add(buisUnitOPOD);

		// Label for Buis Units on OPOD Page
		JLabel businesslblOPOD = new JLabel("Business Unit");
		businesslblOPOD.setBounds(10, 186, 254, 14);
		OPOD.add(businesslblOPOD);

		// Label for Enterprise Controller on OPOD page
		JLabel entContOPOD = new JLabel("Enterprise Controller");
		entContOPOD.setBounds(10, 252, 140, 14);
		OPOD.add(entContOPOD);

		// Data center label for OPOD
		JLabel dataCentlblOPOD = new JLabel("Data Center");
		dataCentlblOPOD.setBounds(10, 219, 120, 14);
		OPOD.add(dataCentlblOPOD);

		// Data center options for OPOD
		String[] opsOPOD = { "", "Hudson", "Rochelle" };
		JComboBox dataCentOpsOPOD = new JComboBox(opsOPOD);
		dataCentOpsOPOD.setBackground(Color.YELLOW);
		dataCentOpsOPOD.setBounds(338, 216, 276, 20);
		OPOD.add(dataCentOpsOPOD);

		// Enterprise Options combo box for OPOD
		String[] entOpsOPOD = { "None", "sxm0029", "sxm0034" };
		JComboBox enterpriseCBOPOD = new JComboBox(entOpsOPOD);
		enterpriseCBOPOD.setBackground(Color.YELLOW);
		enterpriseCBOPOD.setBounds(338, 249, 276, 20);
		OPOD.add(enterpriseCBOPOD);

		JComboBox securityCBOPOD = new JComboBox();
		securityCBOPOD.setBackground(new Color(216, 191, 216));
		securityCBOPOD.setBounds(338, 288, 276, 20);
		OPOD.add(securityCBOPOD);

		// Wing location Options for OPOD
		String[] wingOpsOPOD = { "", "East", "West" };
		JComboBox wingCBOPOD = new JComboBox(wingOpsOPOD);
		wingCBOPOD.setBackground(new Color(175, 238, 238));
		wingCBOPOD.setBounds(338, 359, 276, 20);
		OPOD.add(wingCBOPOD);

		// Security zone label for OPOD
		JLabel secZonelblOPOD = new JLabel("Security Zone");
		secZonelblOPOD.setBounds(10, 291, 140, 14);
		OPOD.add(secZonelblOPOD);

		// Wing lbl for OPOD
		JLabel lblWingLocationInOPOD = new JLabel("Wing Location in the DC");
		lblWingLocationInOPOD.setBounds(10, 359, 140, 14);
		OPOD.add(lblWingLocationInOPOD);
		
		// Label for vpool storage array in OPOD page
		JLabel lblVpoolStorageArray = new JLabel("vpool Storage Array");
		lblVpoolStorageArray.setBounds(10, 393, 193, 16);
		OPOD.add(lblVpoolStorageArray);
		
		// combo box for vpool storage array in OPOD page
		String[] vpoolOpts = {"", "Storage_Subsystem_1001446", "Storage_Subsystem_1001646", "Storage_Subsystem_1099", 
							  "Storage_Subsystem_1201999", "Storage_Subsystem_1415", "Storage_Subsystem_17335", "Storage_Subsystem_28573",
							  "Storage_Subsystem_4547", "Storage_Subsystem_48504", "Storage_Subsystem_4961", "Storage_Subsystem_5018",
							  "Storage_Subsystem_54071", "Storage_Subsystem_55290", "Storage_Subsystem_55300", "Storage_Subsystem_55401",
							  "Storage_Subsystem_65197", "Storage_Subsystem_65278", "Storage_Subsystem_65284", "Storage_Subsystem_65301",
							  "Storage_Subsystem_65302", "Storage_Subsystem_65383", "Storage_Subsystem_65579", "Storage_Subsystem_66539",
							  "Storage_Subsystem_66796", "Storage_Subsystem_66804", "Storage_Subsystem_66897"};
		JComboBox vpoolCBOPOD = new JComboBox(vpoolOpts);
		vpoolCBOPOD.setBackground(new Color(175, 238, 238));
		vpoolCBOPOD.setBounds(338, 392, 276, 20);
		OPOD.add(vpoolCBOPOD);
		
		// label for Logical Names in OPOD page
		JLabel lblLogicalNames = new JLabel("Logical Names");
		lblLogicalNames.setBounds(681, 56, 107, 16);
		OPOD.add(lblLogicalNames);
		
		// label for server relationship in OPOD page
		JLabel lblServerRelationship = new JLabel("Server Relationship");
		lblServerRelationship.setBounds(828, 56, 128, 16);
		OPOD.add(lblServerRelationship);
		
		// logical name text field 1 in OPOD page
		logicalName_1 = new JTextField();
		logicalName_1.setBounds(672, 85, 116, 22);
		OPOD.add(logicalName_1);
		logicalName_1.setColumns(10);
		
		// logical name text field 2 in OPOD page
		logicalName_2 = new JTextField();
		logicalName_2.setColumns(10);
		logicalName_2.setBounds(672, 115, 116, 22);
		OPOD.add(logicalName_2);
		
		// logical name text field 3 in OPOD page
		logicalName_3 = new JTextField();
		logicalName_3.setColumns(10);
		logicalName_3.setBounds(672, 147, 116, 22);
		logicalName_3.setVisible(false);
		OPOD.add(logicalName_3);
		
		// logical name text field 4 in OPOD page
		logicalName_4 = new JTextField();
		logicalName_4.setColumns(10);
		logicalName_4.setBounds(672, 182, 116, 22);
		logicalName_4.setVisible(false);
		OPOD.add(logicalName_4);
		
		// logical name text field 5 in OPOD page
		logicalName_5 = new JTextField();
		logicalName_5.setColumns(10);
		logicalName_5.setBounds(672, 216, 116, 22);
		logicalName_5.setVisible(false);
		OPOD.add(logicalName_5);
		
		// logical name text field 6 in OPOD page
		logicalName_6 = new JTextField();
		logicalName_6.setColumns(10);
		logicalName_6.setBounds(672, 252, 116, 22);
		logicalName_6.setVisible(false);
		OPOD.add(logicalName_6);
		
		// logical name text field 7 in OPOD page
		logicalName_7 = new JTextField();
		logicalName_7.setColumns(10);
		logicalName_7.setBounds(672, 287, 116, 22);
		logicalName_7.setVisible(false);
		OPOD.add(logicalName_7);
		
		// logical name text field 8 in OPOD page
		logicalName_8 = new JTextField();
		logicalName_8.setColumns(10);
		logicalName_8.setBounds(672, 322, 116, 22);
		logicalName_8.setVisible(false);
		OPOD.add(logicalName_8);
		
		// logical name text field 9 in OPOD page
		logicalName_9 = new JTextField();
		logicalName_9.setColumns(10);
		logicalName_9.setBounds(672, 355, 116, 22);
		logicalName_9.setVisible(false);
		OPOD.add(logicalName_9);
		
		// logical name text field 10 in OPOD page
		logicalName_10 = new JTextField();
		logicalName_10.setColumns(10);
		logicalName_10.setBounds(672, 390, 116, 22);
		logicalName_10.setVisible(false);
		OPOD.add(logicalName_10);
		
		// server relationship text field 1 in OPOD page
		relationship_1 = new JTextField();
		relationship_1.setBounds(828, 85, 116, 22);
		OPOD.add(relationship_1);
		relationship_1.setColumns(10);
		
		// server relationship text field 2 in OPOD page
		relationship_2 = new JTextField();
		relationship_2.setColumns(10);
		relationship_2.setBounds(828, 115, 116, 22);
		OPOD.add(relationship_2);
		
		// server relationship text field 3 in OPOD page
		relationship_3 = new JTextField();
		relationship_3.setColumns(10);
		relationship_3.setBounds(828, 147, 116, 22);
		relationship_3.setVisible(false);
		OPOD.add(relationship_3);
		
		// server relationship text field 4 in OPOD page
		relationship_4 = new JTextField();
		relationship_4.setColumns(10);
		relationship_4.setBounds(828, 182, 116, 22);
		relationship_4.setVisible(false);
		OPOD.add(relationship_4);
		
		// server relationship text field 5 in OPOD page
		relationship_5 = new JTextField();
		relationship_5.setColumns(10);
		relationship_5.setBounds(828, 216, 116, 22);
		relationship_5.setVisible(false);
		OPOD.add(relationship_5);
		
		// server relationship text field 6 in OPOD page
		relationship_6 = new JTextField();
		relationship_6.setColumns(10);
		relationship_6.setBounds(828, 252, 116, 22);
		relationship_6.setVisible(false);
		OPOD.add(relationship_6);
		
		// server relationship text field 7 in OPOD page
		relationship_7 = new JTextField();
		relationship_7.setColumns(10);
		relationship_7.setBounds(828, 287, 116, 22);
		relationship_7.setVisible(false);
		OPOD.add(relationship_7);
		
		// server relationship text field 8 in OPOD page
		relationship_8 = new JTextField();
		relationship_8.setColumns(10);
		relationship_8.setBounds(828, 322, 116, 22);
		relationship_8.setVisible(false);
		OPOD.add(relationship_8);
		
		// server relationship text field 9 in OPOD page
		relationship_9 = new JTextField();
		relationship_9.setColumns(10);
		relationship_9.setBounds(828, 355, 116, 22);
		relationship_9.setVisible(false);
		OPOD.add(relationship_9);
		
		// server relationship text field 10 in OPOD page
		relationship_10 = new JTextField();
		relationship_10.setColumns(10);
		relationship_10.setBounds(828, 390, 116, 22);
		relationship_10.setVisible(false);
		OPOD.add(relationship_10);
		
		// label for cluster name in OPOD page
		JLabel lblClusterName = new JLabel("Cluster Name");
		lblClusterName.setBounds(10, 457, 140, 16);
		OPOD.add(lblClusterName);
		
		// cluster name text field in OPOD page
		clusterNameTF = new JTextField();
		clusterNameTF.setBounds(223, 454, 116, 22);
		OPOD.add(clusterNameTF);
		clusterNameTF.setColumns(10);
		
		// label for how many databases question in OPOD page
		JLabel lblHowManyDatabases = new JLabel("How many Databases (Max. 8)?");
		lblHowManyDatabases.setBounds(10, 486, 210, 16);
		OPOD.add(lblHowManyDatabases);
		
		// number of databases combo box in OPOD page
		String[] numDatabasesOpts = {"1", "2", "3", "4", "5", "6", "7", "8"};
		JComboBox numDatabasesCB = new JComboBox(numDatabasesOpts);
		numDatabasesCB.setBounds(223, 483, 116, 22);
		OPOD.add(numDatabasesCB);
		numDatabasesCB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(0 <= numDatabasesCB.getSelectedIndex()) {
					databaseName_1.setVisible(true);
					version_1.setVisible(true);
					relationshipTF_1.setVisible(true);
					primaryTF_1.setVisible(true);
					backupTypeTF_1.setVisible(true);
				}
				else {
					databaseName_1.setVisible(false);
					version_1.setVisible(false);
					relationshipTF_1.setVisible(false);
					primaryTF_1.setVisible(false);
					backupTypeTF_1.setVisible(false);
				}
				if(1 <= numDatabasesCB.getSelectedIndex()) {
					databaseName_2.setVisible(true);
					version_2.setVisible(true);
					relationshipTF_2.setVisible(true);
					primaryTF_2.setVisible(true);
					backupTypeTF_2.setVisible(true);
				}
				else {
					databaseName_2.setVisible(false);
					version_2.setVisible(false);
					relationshipTF_2.setVisible(false);
					primaryTF_2.setVisible(false);
					backupTypeTF_2.setVisible(false);
				}
				if(2 <= numDatabasesCB.getSelectedIndex()) {
					databaseName_3.setVisible(true);
					version_3.setVisible(true);
					relationshipTF_3.setVisible(true);
					primaryTF_3.setVisible(true);
					backupTypeTF_3.setVisible(true);
				}
				else {
					databaseName_3.setVisible(false);
					version_3.setVisible(false);
					relationshipTF_3.setVisible(false);
					primaryTF_3.setVisible(false);
					backupTypeTF_3.setVisible(false);
				}
				if(3 <= numDatabasesCB.getSelectedIndex()) {
					databaseName_4.setVisible(true);
					version_4.setVisible(true);
					relationshipTF_4.setVisible(true);
					primaryTF_4.setVisible(true);
					backupTypeTF_4.setVisible(true);
				}
				else {
					databaseName_4.setVisible(false);
					version_4.setVisible(false);
					relationshipTF_4.setVisible(false);
					primaryTF_4.setVisible(false);
					backupTypeTF_4.setVisible(false);
				}
				if(4 <= numDatabasesCB.getSelectedIndex()) {
					databaseName_5.setVisible(true);
					version_5.setVisible(true);
					relationshipTF_5.setVisible(true);
					primaryTF_5.setVisible(true);
					backupTypeTF_5.setVisible(true);
				}
				else {
					databaseName_5.setVisible(false);
					version_5.setVisible(false);
					relationshipTF_5.setVisible(false);
					primaryTF_5.setVisible(false);
					backupTypeTF_5.setVisible(false);
				}
				if(5 <= numDatabasesCB.getSelectedIndex()) {
					databaseName_6.setVisible(true);
					version_6.setVisible(true);
					relationshipTF_6.setVisible(true);
					primaryTF_6.setVisible(true);
					backupTypeTF_6.setVisible(true);
				}
				else {
					databaseName_6.setVisible(false);
					version_6.setVisible(false);
					relationshipTF_6.setVisible(false);
					primaryTF_6.setVisible(false);
					backupTypeTF_6.setVisible(false);
				}
				if(6 <= numDatabasesCB.getSelectedIndex()) {
					databaseName_7.setVisible(true);
					version_7.setVisible(true);
					relationshipTF_7.setVisible(true);
					primaryTF_7.setVisible(true);
					backupTypeTF_7.setVisible(true);
				}
				else {
					databaseName_7.setVisible(false);
					version_7.setVisible(false);
					relationshipTF_7.setVisible(false);
					primaryTF_7.setVisible(false);
					backupTypeTF_7.setVisible(false);
				}
				if(7 <= numDatabasesCB.getSelectedIndex()) {
					databaseName_8.setVisible(true);
					version_8.setVisible(true);
					relationshipTF_8.setVisible(true);
					primaryTF_8.setVisible(true);
					backupTypeTF_8.setVisible(true);
				}
				else {
					databaseName_8.setVisible(false);
					version_8.setVisible(false);
					relationshipTF_8.setVisible(false);
					primaryTF_8.setVisible(false);
					backupTypeTF_8.setVisible(false);
				}
			}
		});
		
		// label for Database name in OPOD page
		JLabel lblDatabaseName = new JLabel("Database Name");
		lblDatabaseName.setBounds(10, 515, 107, 16);
		OPOD.add(lblDatabaseName);
		
		// label for Version in OPOD page
		JLabel lblVersion = new JLabel("Version");
		lblVersion.setBounds(167, 515, 56, 16);
		OPOD.add(lblVersion);
		
		// label for relationship in OPOD page
		JLabel lblRelationship = new JLabel("Relationship");
		lblRelationship.setBounds(280, 515, 86, 16);
		OPOD.add(lblRelationship);
		
		// label for primary in OPOD page
		JLabel lblPrimary = new JLabel("Primary");
		lblPrimary.setBounds(422, 515, 56, 16);
		OPOD.add(lblPrimary);
		
		// label for backup type in OPOD page
		JLabel lblBackupType = new JLabel("Backup Type");
		lblBackupType.setBounds(541, 515, 95, 16);
		OPOD.add(lblBackupType);
		
		// database name text field 1 in OPOD page
		databaseName_1 = new JTextField();
		databaseName_1.setBounds(10, 544, 116, 22);
		OPOD.add(databaseName_1);
		databaseName_1.setColumns(10);
		
		// database name text field 2 in OPOD page
		databaseName_2 = new JTextField();
		databaseName_2.setColumns(10);
		databaseName_2.setBounds(10, 569, 116, 22);
		databaseName_2.setVisible(false);
		OPOD.add(databaseName_2);
		
		// database name text field 3 in OPOD page
		databaseName_3 = new JTextField();
		databaseName_3.setColumns(10);
		databaseName_3.setBounds(10, 597, 116, 22);
		databaseName_3.setVisible(false);
		OPOD.add(databaseName_3);
		
		// database name text field 4 in OPOD page
		databaseName_4 = new JTextField();
		databaseName_4.setColumns(10);
		databaseName_4.setBounds(10, 624, 116, 22);
		databaseName_4.setVisible(false);
		OPOD.add(databaseName_4);
		
		// database name text field 5 in OPOD page
		databaseName_5 = new JTextField();
		databaseName_5.setColumns(10);
		databaseName_5.setBounds(10, 651, 116, 22);
		databaseName_5.setVisible(false);
		OPOD.add(databaseName_5);
		
		// database name text field 6 in OPOD page
		databaseName_6 = new JTextField();
		databaseName_6.setColumns(10);
		databaseName_6.setBounds(10, 678, 116, 22);
		databaseName_6.setVisible(false);
		OPOD.add(databaseName_6);
		
		// database name text field 7 in OPOD page
		databaseName_7 = new JTextField();
		databaseName_7.setColumns(10);
		databaseName_7.setBounds(10, 705, 116, 22);
		databaseName_7.setVisible(false);
		OPOD.add(databaseName_7);
		
		// database name text field 8 in OPOD page
		databaseName_8 = new JTextField();
		databaseName_8.setColumns(10);
		databaseName_8.setBounds(10, 730, 116, 22);
		databaseName_8.setVisible(false);
		OPOD.add(databaseName_8);
		
		// version text field 1 in OPOD page
		version_1 = new JTextField();
		version_1.setBounds(138, 544, 116, 22);
		OPOD.add(version_1);
		version_1.setColumns(10);
		
		// version text field 2 in OPOD page
		version_2 = new JTextField();
		version_2.setColumns(10);
		version_2.setBounds(138, 569, 116, 22);
		version_2.setVisible(false);
		OPOD.add(version_2);
		
		// version text field 3 in OPOD page
		version_3 = new JTextField();
		version_3.setColumns(10);
		version_3.setBounds(138, 597, 116, 22);
		version_3.setVisible(false);
		OPOD.add(version_3);
		
		// version text field 4 in OPOD page
		version_4 = new JTextField();
		version_4.setColumns(10);
		version_4.setBounds(138, 624, 116, 22);
		version_4.setVisible(false);
		OPOD.add(version_4);
		
		// version text field 5 in OPOD page
		version_5 = new JTextField();
		version_5.setColumns(10);
		version_5.setBounds(138, 651, 116, 22);
		version_5.setVisible(false);
		OPOD.add(version_5);
		
		// version text field 6 in OPOD page
		version_6 = new JTextField();
		version_6.setColumns(10);
		version_6.setBounds(138, 678, 116, 22);
		version_6.setVisible(false);
		OPOD.add(version_6);
		
		// version text field 7 in OPOD page
		version_7 = new JTextField();
		version_7.setColumns(10);
		version_7.setBounds(138, 705, 116, 22);
		version_7.setVisible(false);
		OPOD.add(version_7);
		
		// version text field 8 in OPOD page
		version_8 = new JTextField();
		version_8.setColumns(10);
		version_8.setBounds(138, 730, 116, 22);
		version_8.setVisible(false);
		OPOD.add(version_8);
		
		// relationship text field 1 in OPOD page
		relationshipTF_1 = new JTextField();
		relationshipTF_1.setBounds(266, 544, 116, 22);
		OPOD.add(relationshipTF_1);
		relationshipTF_1.setColumns(10);
		
		// relationship text field 2 in OPOD page
		relationshipTF_2 = new JTextField();
		relationshipTF_2.setColumns(10);
		relationshipTF_2.setBounds(266, 569, 116, 22);
		relationshipTF_2.setVisible(false);
		OPOD.add(relationshipTF_2);
		
		// relationship text field 3 in OPOD page
		relationshipTF_3 = new JTextField();
		relationshipTF_3.setColumns(10);
		relationshipTF_3.setBounds(266, 597, 116, 22);
		relationshipTF_3.setVisible(false);
		OPOD.add(relationshipTF_3);
		
		// relationship text field 4 in OPOD page
		relationshipTF_4 = new JTextField();
		relationshipTF_4.setColumns(10);
		relationshipTF_4.setBounds(266, 624, 116, 22);
		relationshipTF_4.setVisible(false);
		OPOD.add(relationshipTF_4);
		
		// relationship text field 5 in OPOD page
		relationshipTF_5 = new JTextField();
		relationshipTF_5.setColumns(10);
		relationshipTF_5.setBounds(266, 651, 116, 22);
		relationshipTF_5.setVisible(false);
		OPOD.add(relationshipTF_5);
		
		// relationship text field 6 in OPOD page
		relationshipTF_6 = new JTextField();
		relationshipTF_6.setColumns(10);
		relationshipTF_6.setBounds(266, 678, 116, 22);
		relationshipTF_6.setVisible(false);
		OPOD.add(relationshipTF_6);
		
		// relationship text field 7 in OPOD page
		relationshipTF_7 = new JTextField();
		relationshipTF_7.setColumns(10);
		relationshipTF_7.setBounds(266, 705, 116, 22);
		relationshipTF_7.setVisible(false);
		OPOD.add(relationshipTF_7);
		
		// relationship text field 8 in OPOD page
		relationshipTF_8 = new JTextField();
		relationshipTF_8.setColumns(10);
		relationshipTF_8.setBounds(266, 730, 116, 22);
		relationshipTF_8.setVisible(false);
		OPOD.add(relationshipTF_8);
		
		// primary text field 1 in OPOD page
		primaryTF_1 = new JTextField();
		primaryTF_1.setColumns(10);
		primaryTF_1.setBounds(394, 544, 116, 22);
		OPOD.add(primaryTF_1);
		
		// primary text field 2 in OPOD page
		primaryTF_2 = new JTextField();
		primaryTF_2.setColumns(10);
		primaryTF_2.setBounds(394, 569, 116, 22);
		primaryTF_2.setVisible(false);
		OPOD.add(primaryTF_2);
		
		// primary text field 3 in OPOD page
		primaryTF_3 = new JTextField();
		primaryTF_3.setColumns(10);
		primaryTF_3.setBounds(394, 597, 116, 22);
		primaryTF_3.setVisible(false);
		OPOD.add(primaryTF_3);
		
		// primary text field 4 in OPOD page
		primaryTF_4 = new JTextField();
		primaryTF_4.setColumns(10);
		primaryTF_4.setBounds(394, 624, 116, 22);
		primaryTF_4.setVisible(false);
		OPOD.add(primaryTF_4);
		
		// primary text field 5 in OPOD page
		primaryTF_5 = new JTextField();
		primaryTF_5.setColumns(10);
		primaryTF_5.setBounds(394, 651, 116, 22);
		primaryTF_5.setVisible(false);
		OPOD.add(primaryTF_5);
		
		// primary text field 6 in OPOD page
		primaryTF_6 = new JTextField();
		primaryTF_6.setColumns(10);
		primaryTF_6.setBounds(394, 678, 116, 22);
		primaryTF_6.setVisible(false);
		OPOD.add(primaryTF_6);
		
		// primary text field 7 in OPOD page
		primaryTF_7 = new JTextField();
		primaryTF_7.setColumns(10);
		primaryTF_7.setBounds(394, 705, 116, 22);
		primaryTF_7.setVisible(false);
		OPOD.add(primaryTF_7);
		
		// primary text field 8 in OPOD page
		primaryTF_8 = new JTextField();
		primaryTF_8.setColumns(10);
		primaryTF_8.setBounds(394, 730, 116, 22);
		primaryTF_8.setVisible(false);
		OPOD.add(primaryTF_8);
		
		// backup type text field 1 in OPOD page
		backupTypeTF_1 = new JTextField();
		backupTypeTF_1.setColumns(10);
		backupTypeTF_1.setBounds(525, 544, 116, 22);
		OPOD.add(backupTypeTF_1);
		
		// backup type text field 2 in OPOD page
		backupTypeTF_2 = new JTextField();
		backupTypeTF_2.setColumns(10);
		backupTypeTF_2.setBounds(525, 569, 116, 22);
		backupTypeTF_2.setVisible(false);
		OPOD.add(backupTypeTF_2);
		
		// backup type text field 3 in OPOD page
		backupTypeTF_3 = new JTextField();
		backupTypeTF_3.setColumns(10);
		backupTypeTF_3.setBounds(525, 597, 116, 22);
		backupTypeTF_3.setVisible(false);
		OPOD.add(backupTypeTF_3);
		
		// backup type text field 4 in OPOD page
		backupTypeTF_4 = new JTextField();
		backupTypeTF_4.setColumns(10);
		backupTypeTF_4.setBounds(525, 624, 116, 22);
		backupTypeTF_4.setVisible(false);
		OPOD.add(backupTypeTF_4);
		
		// backup type text field 5 in OPOD page
		backupTypeTF_5 = new JTextField();
		backupTypeTF_5.setColumns(10);
		backupTypeTF_5.setBounds(525, 651, 116, 22);
		backupTypeTF_5.setVisible(false);
		OPOD.add(backupTypeTF_5);
		
		// backup type text field 6 in OPOD page
		backupTypeTF_6 = new JTextField();
		backupTypeTF_6.setColumns(10);
		backupTypeTF_6.setBounds(525, 678, 116, 22);
		backupTypeTF_6.setVisible(false);
		OPOD.add(backupTypeTF_6);
		
		// backup type text field 7 in OPOD page
		backupTypeTF_7 = new JTextField();
		backupTypeTF_7.setColumns(10);
		backupTypeTF_7.setBounds(525, 705, 116, 22);
		backupTypeTF_7.setVisible(false);
		OPOD.add(backupTypeTF_7);
		
		// backup type text field 8 in OPOD page
		backupTypeTF_8 = new JTextField();
		backupTypeTF_8.setColumns(10);
		backupTypeTF_8.setBounds(525, 730, 116, 22);
		backupTypeTF_8.setVisible(false);
		OPOD.add(backupTypeTF_8);
		
		// label for total new asm disk groups in OPOD page
		JLabel lblTotalNewAsm = new JLabel("Total New ASM Disk Groups");
		lblTotalNewAsm.setBounds(10, 765, 193, 16);
		OPOD.add(lblTotalNewAsm);
		
		// Combo box for number of disk groups in OPOD page
		String[] numDiskGroupsOpts = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
		JComboBox numDiskGroups = new JComboBox(numDiskGroupsOpts);
		numDiskGroups.setBounds(266, 762, 193, 22);
		OPOD.add(numDiskGroups);
		
		// label for Dell R730 (8 Cores - 384GB Mem. Opt.) in OPOD page
		JLabel lblDellR = new JLabel("Dell R730 (8 Cores - 384GB Mem. Opt.)");
		lblDellR.setBounds(10, 794, 230, 16);
		OPOD.add(lblDellR);
		
		// label for Dell R730 (16 Cores - 512GB Mem. Opt.) in OPOD page
		JLabel lblDellR_1 = new JLabel("Dell R730 (16 Cores - 512GB Mem. Opt.)");
		lblDellR_1.setBounds(263, 794, 247, 16);
		OPOD.add(lblDellR_1);
		
		// label for HP DL560p (24 Cores - 1024GB Mem. Opt.) in OPOD page
		JLabel lblHpDlp = new JLabel("HP DL560p (24 Cores - 1024GB Mem. Opt.)");
		lblHpDlp.setBounds(525, 794, 263, 16);
		OPOD.add(lblHpDlp);
		
		// Button for Oracle POD SHS CFG10 in OPOD page
		JButton btnOraclePodShs = new JButton("Oracle POD SHS CFG10");
		btnOraclePodShs.setBounds(10, 823, 230, 34);
		OPOD.add(btnOraclePodShs);
		
		// Button for Oracle POD SHS CFG11 in OPOD page
		JButton btnOraclePodShs_1 = new JButton("Oracle POD SHS CFG11");
		btnOraclePodShs_1.setBounds(266, 823, 244, 34);
		OPOD.add(btnOraclePodShs_1);
		
		// Button for Oracle POD SHS CFG09 in OPOD page
		JButton btnOraclePodShs_2 = new JButton("Oracle POD SHS CFG09");
		btnOraclePodShs_2.setBounds(525, 823, 263, 34);
		OPOD.add(btnOraclePodShs_2);
		
		// Label for server order number in OPOD page
		JLabel lblServerOrderNumber = new JLabel("Server Order Number");
		lblServerOrderNumber.setBounds(12, 325, 252, 16);
		OPOD.add(lblServerOrderNumber);
		
		// text field for server order number in OPOD page
		serverOrderNumTF = new JTextField();
		serverOrderNumTF.setBounds(338, 321, 276, 22);
		OPOD.add(serverOrderNumTF);
		serverOrderNumTF.setColumns(10);

		// New panel for the OPOD page
		JPanel Hadoop = new JPanel();
		frame.getContentPane().add(Hadoop, "name_235116866424390");
		Hadoop.setLayout(null);

		// Title for the hadoop page
		JLabel lblHadoop = new JLabel("Hadoop");
		lblHadoop.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblHadoop.setBounds(10, 11, 753, 34);
		Hadoop.add(lblHadoop);

		// Question for unix server count
		JLabel unixServerCountQuestion = new JLabel("How many Unix Server(s) total are planned?");
		unixServerCountQuestion.setBounds(10, 109, 254, 14);
		Hadoop.add(unixServerCountQuestion);

		// Description of required fields for Hadoop Page
		JLabel requiredFields = new JLabel("Required UNIQUE fields to be filled in prior to selecting the SHS Option");
		requiredFields.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		requiredFields.setBounds(10, 57, 435, 14);
		Hadoop.add(requiredFields);

		// The server count for hadoop
		String[] numServers1 = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		JComboBox unixServerCountHadoop = new JComboBox(numServers1);
		unixServerCountHadoop.setBackground(Color.YELLOW);
		unixServerCountHadoop.setBounds(338, 106, 276, 20);
		Hadoop.add(unixServerCountHadoop);

		// Environment comboBox for Hadoop
		String[] environments1 = { "", "Production", "Pre-Pro", "QA", "I-Test", "E-Test", "A-Test" };
		JComboBox comboBox_11 = new JComboBox(environments1);
		comboBox_11.setBackground(Color.YELLOW);
		comboBox_11.setBounds(338, 152, 276, 20);
		Hadoop.add(comboBox_11);

		// Label for Environment comboBox
		JLabel label_2 = new JLabel("Environment Selection");
		label_2.setBounds(10, 155, 254, 14);
		Hadoop.add(label_2);

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
		JComboBox buisUnitHdop = new JComboBox(buisUnits1);
		buisUnitHdop.setBackground(Color.YELLOW);
		buisUnitHdop.setBounds(280, 205, 334, 20);
		Hadoop.add(buisUnitHdop);

		// Label for Buis Units on Hadoop Page
		JLabel label_3 = new JLabel("Buisiness Unit");
		label_3.setBounds(10, 208, 254, 14);
		Hadoop.add(label_3);

		// Label for Enterprise Controller on Hadoop page
		JLabel entContHdop = new JLabel("Enterprise Controller");
		entContHdop.setBounds(10, 308, 140, 14);
		Hadoop.add(entContHdop);

		// Data center label for hadoop
		JLabel dataCentlbl = new JLabel("Data Center");
		dataCentlbl.setBounds(10, 256, 67, 14);
		Hadoop.add(dataCentlbl);

		// Data center options for Hadoop
		String[] ops1 = { "", "Hudson", "Rochelle" };
		JComboBox dataCentOps = new JComboBox(ops1);
		dataCentOps.setBackground(Color.YELLOW);
		dataCentOps.setBounds(338, 253, 276, 20);
		Hadoop.add(dataCentOps);

		// Enterprise Options combo box for Hadoop
		String[] entOps1 = { "None", "sxm0029", "sxm0034" };
		JComboBox comboBox_14 = new JComboBox(entOps1);
		comboBox_14.setBackground(Color.YELLOW);
		comboBox_14.setBounds(338, 305, 276, 20);
		Hadoop.add(comboBox_14);

		JComboBox comboBox_15 = new JComboBox(new Object[] {});
		comboBox_15.setBackground(new Color(216, 191, 216));
		comboBox_15.setBounds(338, 356, 276, 20);
		Hadoop.add(comboBox_15);

		// Wing location Options for Hadoop
		String[] wingOps = { "", "East", "West" };
		JComboBox comboBox_16 = new JComboBox(wingOps);
		comboBox_16.setBackground(new Color(175, 238, 238));
		comboBox_16.setBounds(338, 402, 276, 20);
		Hadoop.add(comboBox_16);

		// Security zone label for hadoop
		JLabel secZonelbl = new JLabel("Security Zone");
		secZonelbl.setBounds(10, 359, 140, 14);
		Hadoop.add(secZonelbl);

		// Wing lbl for hadoop
		JLabel lblWingLocationIn = new JLabel("Wing Location in the DC");
		lblWingLocationIn.setBounds(10, 405, 140, 14);
		Hadoop.add(lblWingLocationIn);

		// One of the hadoop buttons on hadoop page
		JButton btnHadoopShsV = new JButton("Hadoop SHS V1");
		btnHadoopShsV.setBounds(32, 485, 202, 76);
		Hadoop.add(btnHadoopShsV);

		// Other hadoop butoon on hadoop page
		JButton btnHadoopShsV_1 = new JButton("Hadoop SHS V2");
		btnHadoopShsV_1.setBounds(412, 485, 202, 76);
		Hadoop.add(btnHadoopShsV_1);

		// Label for first Hadoop Button
		JLabel lblDellRxdServer = new JLabel("DELL R730xd Server Hardware CFG01 - Hadoop(Data)");
		lblDellRxdServer.setBounds(32, 460, 276, 14);
		Hadoop.add(lblDellRxdServer);

		// Alternate label for second Hadoop Button
		JLabel dellHdopServer = new JLabel("DELL R730xd Server Hardware CFG06 - Hadoop (Infrastructure)");
		dellHdopServer.setBounds(412, 460, 322, 14);
		Hadoop.add(dellHdopServer);

		// Button for Standard hosting Sys. Options on Unix Hardware Configs
		// Page
		JButton standardHostingOP = new JButton("Standard Hosting Sys. Options");
		standardHostingOP.setBounds(10, 576, 282, 50);
		standardHostingOP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "TIBCO", "OPOD", "Hadoop" };
				int n = JOptionPane.showOptionDialog(frame, "Standard Hosting Sys. Options. Choose One", null,
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
				if (n == 0) {
					UnixHWConfig.setVisible(false);
					TIBCO.setVisible(true);
				} else if (n == 1) {
					UnixHWConfig.setVisible(false);
					OPOD.setVisible(true);
				} else if (n == 2) {
					UnixHWConfig.setVisible(false);
					Hadoop.setVisible(true);
				}

			}
		});
		UnixHWConfig.add(standardHostingOP);

		// Description of why standard hosting sys.options button should be
		// clicked
		JLabel lblAnyDesignDeviation = new JLabel(
				"Any design deviation from any of the listed SHS's will dissolve the SHS solution");
		lblAnyDesignDeviation.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAnyDesignDeviation.setBounds(302, 584, 486, 32);
		UnixHWConfig.add(lblAnyDesignDeviation);

		// Title for TIBCO page
		JLabel tibcoTitle = new JLabel("TIBCO");
		tibcoTitle.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		tibcoTitle.setBounds(10, 11, 753, 34);
		TIBCO.add(tibcoTitle);

		// Describes required fields for the TIBCO page
		JLabel tibcoDesc = new JLabel("Required UNIQUE fields to be filled in prior to selecting the SHS Option");
		tibcoDesc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tibcoDesc.setBounds(10, 56, 435, 14);
		TIBCO.add(tibcoDesc);

		// Question Unix Server TIBCO page
		JLabel tibcoQOne = new JLabel("How many Unix Server(s) total are planned?");
		tibcoQOne.setBounds(10, 97, 254, 14);
		TIBCO.add(tibcoQOne);

		// Jcombo box for the number of servers for TIBCO
		String[] numServers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		JComboBox comboBox = new JComboBox(numServers);
		comboBox.setBackground(Color.YELLOW);
		comboBox.setBounds(296, 94, 276, 20);
		TIBCO.add(comboBox);

		// Environment section label TIBCO page
		JLabel Environment = new JLabel("Environment Selection");
		Environment.setBounds(10, 128, 254, 14);
		TIBCO.add(Environment);

		// Environment options jcombo box for TIBCO
		String[] environments = { "", "Production", "Pre-Pro", "QA", "I-Test", "E-Test", "A-Test" };
		JComboBox comboBox_1 = new JComboBox(environments);
		comboBox_1.setBackground(Color.YELLOW);
		comboBox_1.setBounds(296, 125, 276, 20);
		TIBCO.add(comboBox_1);

		// Business Unit section for TIBCO page
		JLabel BuisinessSoluntions = new JLabel("Buisiness Unit");
		BuisinessSoluntions.setBounds(10, 159, 254, 14);
		TIBCO.add(BuisinessSoluntions);

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
		JComboBox comboBox_2 = new JComboBox(buisUnits);
		comboBox_2.setBackground(Color.YELLOW);
		comboBox_2.setBounds(238, 156, 334, 20);
		TIBCO.add(comboBox_2);

		// Data center label TIBCO page
		JLabel DataCenter = new JLabel("Data Center");
		DataCenter.setBounds(10, 193, 67, 14);
		TIBCO.add(DataCenter);

		// Data center combo box for TIBCO page
		String[] ops = { "", "Hudson", "Rochelle" };
		JComboBox datCentTib = new JComboBox(ops);
		datCentTib.setBackground(Color.YELLOW);
		datCentTib.setBounds(296, 190, 276, 20);
		TIBCO.add(datCentTib);

		// Wing Location label TIBCO page
		JLabel WingLocationIn = new JLabel("Wing Location in the DC");
		WingLocationIn.setBounds(10, 307, 140, 14);
		TIBCO.add(WingLocationIn);
		WingLocationIn.setVisible(false);

		// Combo Box for Wing Location TIBCO page
		String[] locationOpts = { "", "East", "West" };
		JComboBox wingLocTIBCO = new JComboBox(locationOpts);
		wingLocTIBCO.setBounds(296, 304, 276, 20);
		TIBCO.add(wingLocTIBCO);
		wingLocTIBCO.setVisible(false);

		// Disappearing section TIBCO page
		datCentTib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (datCentTib.getSelectedItem() == "Hudson") {
					WingLocationIn.setVisible(true);
					wingLocTIBCO.setVisible(true);
				} else {
					WingLocationIn.setVisible(false);
					wingLocTIBCO.setVisible(false);
				}
			}
		});

		// Enterprise Controller label TIBCO page
		JLabel EnterpriseController = new JLabel("Enterprise Controller");
		EnterpriseController.setBounds(10, 229, 140, 14);
		TIBCO.add(EnterpriseController);

		// Enterprise controller comboBox
		String[] entOps = { "None", "sxm0029", "sxm0034" };
		JComboBox entControllOps = new JComboBox(entOps);
		entControllOps.setBackground(Color.YELLOW);
		entControllOps.setBounds(296, 226, 276, 20);
		TIBCO.add(entControllOps);

		// Security zone label TIBCO page
		JLabel SecurityZone = new JLabel("Security Zone");
		SecurityZone.setBounds(10, 271, 140, 14);
		TIBCO.add(SecurityZone);

		// Security Ops combobox for TIBCO page
		String[] securityOps = { "", "MPN_Other_0", "DMZ_AccessMgmt_0", "DMZ_AccessMgmt_0_Pub", "DMZ_Vendor_0",
				"DMZ_Vendor_0_Pub", "N/A(for Tier 0 Servers" };
		JComboBox secOps = new JComboBox(securityOps);
		secOps.setBounds(296, 268, 276, 20);
		TIBCO.add(secOps);

		// TIBCO behavior label for TIBCCO page
		JLabel behavior = new JLabel("Tibco Behavior");
		behavior.setBounds(10, 408, 140, 14);
		TIBCO.add(behavior);

		// Behavior combo box for TIBCO
		String[] behaviors = { "", "Active/Active", "Swappable" };
		JComboBox tibBehavior = new JComboBox(behaviors);
		tibBehavior.setBackground(Color.YELLOW);
		tibBehavior.setBounds(296, 405, 276, 20);
		TIBCO.add(tibBehavior);

		// TIBCO Module label for TIBCO page
		JLabel Module = new JLabel("Tibco Module");
		Module.setBounds(10, 447, 140, 14);
		TIBCO.add(Module);

		// Module options combobox for TIBCO
		String[] moduleOps = { "", "Business", "EMS", "Other" };
		JComboBox comboBox_7 = new JComboBox(moduleOps);
		comboBox_7.setBackground(Color.YELLOW);
		comboBox_7.setBounds(296, 444, 276, 20);
		TIBCO.add(comboBox_7);

		// Maintenance options combobox for TIBCO
		String[] maintainOps = { "", "M4", "M5" };
		JComboBox comboBox_8 = new JComboBox(maintainOps);
		comboBox_8.setBackground(Color.YELLOW);
		comboBox_8.setBounds(296, 491, 276, 20);
		TIBCO.add(comboBox_8);

		// Maintenance label for TIBCO page
		JLabel Maintenance = new JLabel("Maintenance Window");
		Maintenance.setBounds(10, 494, 140, 14);
		TIBCO.add(Maintenance);

		// HP server label for TIBCO page
		JLabel lblHpBlcG = new JLabel("HP BL460C G9");
		lblHpBlcG.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblHpBlcG.setBounds(10, 564, 184, 34);
		TIBCO.add(lblHpBlcG);

		// Button for Tibco express build in Tibco page
		JButton btnNewButton = new JButton("Tibco Express Build");
		btnNewButton.setBounds(10, 609, 184, 49);
		TIBCO.add(btnNewButton);

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
