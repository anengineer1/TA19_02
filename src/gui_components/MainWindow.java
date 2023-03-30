package gui_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow extends JFrame {

	private JPanel content_pane;
	private JLabel description;
	private JLabel description_combobox;
	private JTextField input_text;
	private JButton button_accept;
	private ActionListener button_action;
	private JComboBox movie_list_box;


	public MainWindow() {
		initialize();
	}


	private void initialize() {
		this.setTitle("Escribe título de la película");
		this.setBounds(100, 100, 600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.fillFrame();

		this.setVisible(true);

	}

	
	private void fillFrame() {
		this.content_pane = new JPanel();
		this.content_pane.setLayout(null);
		this.content_pane.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.setContentPane(this.content_pane);

		this.description = new JLabel("Escriba un nombre de una película");
		this.description.setBounds(50, 30, 250, 20);
		this.content_pane.add(this.description);
		this.description_combobox = new JLabel("Películas");
		this.description_combobox.setBounds(400, 30, 250, 20);
		this.content_pane.add(this.description_combobox);
		this.addInputText();
		this.fillActions();
		this.addMoviesBox();
		this.addConfirmationButton();
	}

	private void addInputText() {
		this.input_text = new JTextField();
		this.input_text.setBounds(50, 80, 200, 20);
		this.content_pane.add(input_text);
	}

	private void addConfirmationButton() {
		this.button_accept = new JButton("Confirmación");
		this.button_accept.setBounds(50, 160, 150, 20);
		this.button_accept.addActionListener(this.button_action);
		this.content_pane.add(this.button_accept);
	}
	
	private void addMoviesBox() {
		this.movie_list_box = new JComboBox<>();
		this.movie_list_box.setBounds(400, 100, 150, 20);
		this.movie_list_box.addItem("La cosaseca");
		this.content_pane.add(this.movie_list_box);
	}

	private void fillActions() {
		this.button_action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				movie_list_box.addItem(input_text.getText());
			}
		};
	}
}
