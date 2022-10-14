package aula;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Janela extends JFrame {

	private JPanel contentPane;
	private String textoTotal;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Opções:");
		lblNewLabel.setBounds(39, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(108, 27, 109, 22);
		
		comboBox.addItem("Isaac Newton");
		comboBox.addItem("Albert Einstein");
		comboBox.addItem("Nicolas Tesla");
		comboBox.addItem("Antonio Gramsci");
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valorSelecionado = (String) comboBox.getSelectedItem();
				if(textoTotal == null) {
					textoTotal = valorSelecionado;
				}else{
					textoTotal = textoTotal + ", " + valorSelecionado;
				}
				textArea.setText(textoTotal);
				
			}
		});
		btnNewButton.setBounds(227, 27, 107, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 324, 145);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	}
}
