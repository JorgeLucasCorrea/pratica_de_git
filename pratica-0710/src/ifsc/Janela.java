package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;

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
		setBounds(100, 100, 290, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Nome = new JLabel("Nome:");
		Nome.setBounds(30, 26, 46, 14);
		contentPane.add(Nome);
		
		JLabel nota1 = new JLabel("Nota 1:");
		nota1.setBounds(30, 74, 46, 14);
		contentPane.add(nota1);
		
		JLabel nota2 = new JLabel("Nota 2:");
		nota2.setBounds(30, 109, 46, 14);
		contentPane.add(nota2);
		
		JLabel nota3 = new JLabel("Nota 3:");
		nota3.setBounds(30, 140, 46, 14);
		contentPane.add(nota3);
		
		txtNome = new JTextField();
		txtNome.setBounds(86, 23, 120, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(86, 71, 120, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(86, 106, 120, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(86, 137, 120, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				double n1 = Double.valueOf(txtNota1.getText());
				double n2 = Double.valueOf(txtNota2.getText());
				double n3 = Double.valueOf(txtNota3.getText());
				double media = (n1 + n2 + n3)/ 3;
				JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Média: " + Math.round(media));
				
				
			}
		});
		btnCalcular.setBounds(96, 168, 89, 23);
		contentPane.add(btnCalcular);
	}
}
