package testando;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.text.MaskFormatter;


public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame");
		JLabel label1 = new JLabel("Digite seu código: ");
		JButton botao1 = new JButton("Login");
		JFormattedTextField texto1 = new JFormattedTextField();
		MaskFormatter mascaraLogin = null;
		mascaraLogin = new MaskFormatter("#");
		int codigo = 5;
		
		
		if(codigo == 5) {
		botao1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("agua");
				}
		}
				);
		}
		botao1.setBounds(115,80,100,20);
		label1.setBounds(40,40,150,20);
		texto1.setBounds(150,40,150,20);
		frame.add(label1);
		frame.add(texto1);
		frame.add(botao1);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
