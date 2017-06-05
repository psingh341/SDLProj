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
		InitView.setBackground(SystemColor.menu);
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
		
		JPanel UnixHWConfig = new JPanel();
		frame.getContentPane().add(UnixHWConfig, "name_149004331042821");

		// Button on UnixHWConfig page responsible for linking to module website
		final URI uriOne = new URI("http://share.allstate.com/sites/bhs/shs/Modules/Forms/Allltems.aspx");
		class OpenUrlActionOne implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}

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
