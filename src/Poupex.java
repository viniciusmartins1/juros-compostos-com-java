import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Poupex extends JFrame {

	public Poupex() {
		
		this.setTitle("Poupex");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	
		JPanel painel = new JPanel();
		painel.setBackground(Color.decode("#ADD8E6"));
		painel.setLayout(null);
		
		JTextField area1 = new JTextField(20);
		area1.setBounds(270,10,200,30);
	
		JTextField area2 = new JTextField(20);
		area2.setBounds(270,50,200,30);
		
	
		JTextField area3 = new JTextField(20);
		area3.setBounds(270,90,200,30);
		
		
		JTextField area4 = new JTextField(20);
		area4.setBounds(270,130,200,30);
		
		
		JLabel juros = new JLabel("Juros ao Mês %: (Ex: 2)");
		juros.setBounds(30, 10, 200, 30);
		
		
		JLabel numAnos = new JLabel("Num. de Anos: (Ex: 1)");
		numAnos.setBounds(30, 50, 200, 30);
		
	
		JLabel depMensal = new JLabel("Depósito Mensal: (Ex: 100)");
		depMensal.setBounds(30, 90, 200, 30);
		
		
		JLabel totPoupado = new JLabel("Total Poupado R$:");
		totPoupado.setBounds(30, 130, 200, 30);
		

		JButton btn = new JButton("OK");
		btn.setBounds(270, 190, 200, 30);
		btn.setBackground(Color.decode("#87CEFA"));
		

		btn.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					
						
						double juros1 = Double.parseDouble(area1.getText());
						double numAnos1 = Double.parseDouble(area2.getText());
						double depMensal1 = Double.parseDouble(area3.getText());
						
						double totPoupado1 = depMensal1 * Math.pow(1+(juros1/100), (numAnos1 * 12));
						
						String m = String.valueOf(Math.round(totPoupado1));
						area4.setText(""+m);
						
						
						/*Formula do juros compostos
						 * 
						 * montante = c * Math.pow(1+i, t)
						 * 
						 */
						
					}
				}
				);
	
	
		this.add(painel);
		painel.add(area1);
		painel.add(area2);
		painel.add(area3);
		painel.add(juros);
		painel.add(numAnos);
		painel.add(depMensal);
		painel.add(totPoupado);
		painel.add(btn);
		painel.add(area4);
		
		this.setVisible(true);
	}
	
}
