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
		frame.setBounds(100, 100, 804, 905);
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

		// New panel for the hadoop page
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
