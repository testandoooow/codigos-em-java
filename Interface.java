package aplicacao;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Sistema de gestão de estoque");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Clique para acessar o sistema");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "O sistema está em desenvolvimento");
			}
		});

		frame.getContentPane().add(button);
		
		frame.setVisible(true);
}
}