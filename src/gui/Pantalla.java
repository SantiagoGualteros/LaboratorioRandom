package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import logica.*;

public class Pantalla {

	private JFrame frmPoolabcalculadora;
	private JTextField txtEntraNumero1;
	private JTextField txtEntraNumero2;
	Calculadora calculo; //OBJETO CON EL QUE SE IMPLEMENTAN LAS OPERACIONES

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla window = new Pantalla();
					window.getFrmPoolabcalculadora().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	
	/**
	 * Create the application.
	 */
	public Pantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrmPoolabcalculadora(new JFrame());
		getFrmPoolabcalculadora().setBackground(new Color(255, 255, 255));
		getFrmPoolabcalculadora().setTitle("PooLab13_2_Calculadora");
		getFrmPoolabcalculadora().setBounds(100, 100, 450, 300);
		getFrmPoolabcalculadora().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrmPoolabcalculadora().getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Calculadora");
		lblTitulo.setForeground(new Color(0, 0, 255));
		lblTitulo.setFont(new Font("DialogInput", Font.BOLD, 22));
		lblTitulo.setBounds(144, 5, 143, 20);
		getFrmPoolabcalculadora().getContentPane().add(lblTitulo);
		
		txtEntraNumero1 = new JTextField();
		txtEntraNumero1.setBounds(281, 36, 86, 20);
		getFrmPoolabcalculadora().getContentPane().add(txtEntraNumero1);
		txtEntraNumero1.setColumns(10);
		
		JLabel lblResultado = new JLabel("El resultado de la operación es: ");
		lblResultado.setForeground(new Color(64, 128, 128));
		lblResultado.setFont(new Font("DialogInput", Font.BOLD, 16));
		lblResultado.setBounds(60, 155, 330, 20);
		getFrmPoolabcalculadora().getContentPane().add(lblResultado);
		
		JLabel lblPideNumero2 = new JLabel("Digite el segundo número:");
		lblPideNumero2.setForeground(new Color(128, 0, 64));
		lblPideNumero2.setFont(new Font("DialogInput", Font.BOLD, 16));
		lblPideNumero2.setBounds(14, 71, 257, 19);
		getFrmPoolabcalculadora().getContentPane().add(lblPideNumero2);
		
		txtEntraNumero2 = new JTextField();
		txtEntraNumero2.setBounds(281, 70, 86, 20);
		getFrmPoolabcalculadora().getContentPane().add(txtEntraNumero2);
		txtEntraNumero2.setColumns(10);
		
		JLabel lblNumeroResultado = new JLabel("");
		lblNumeroResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroResultado.setFont(new Font("DialogInput", Font.BOLD, 16));
		lblNumeroResultado.setBounds(26, 186, 382, 30);
		getFrmPoolabcalculadora().getContentPane().add(lblNumeroResultado);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//METODO QUE SUMA DOS NUMEROS
				double num1;
				double num2;
				try {
					num1 = Double.parseDouble(txtEntraNumero1.getText());
					num2 = Double.parseDouble(txtEntraNumero2.getText());
					calculo = new Sumar(num1, num2); //"Objeto 'tipo'" Calculo con referencia a un objeto tipo Clase hija 'Sumar'
					double suma = calculo.operacion();
					lblNumeroResultado.setText(String.valueOf(suma));
				} catch (NumberFormatException e2) {
					lblNumeroResultado.setText(String.valueOf("ERROR: Valor no numerico ingresado."));
				}
			}
		});
		btnSumar.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnSumar.setForeground(new Color(255, 255, 255));
		btnSumar.setBackground(new Color(128, 64, 64));
		btnSumar.setBounds(14, 121, 86, 23);
		getFrmPoolabcalculadora().getContentPane().add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//METODO QUE RESTA DOS NUMEROS
				double num1;
				double num2;
				try {
					num1 = Double.parseDouble(txtEntraNumero1.getText());
					num2 = Double.parseDouble(txtEntraNumero2.getText());
					calculo = new Restar(num1, num2); //"Objeto 'tipo'" Calculo con referencia a un objeto tipo Clase hija 'Sumar'
					double resta = calculo.operacion();
					lblNumeroResultado.setText(String.valueOf(resta));
				} catch (NumberFormatException e2) {
					lblNumeroResultado.setText(String.valueOf("ERROR: Valor no numerico ingresado."));
				}
			}
		});
		btnRestar.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnRestar.setForeground(new Color(255, 255, 255));
		btnRestar.setBackground(new Color(128, 64, 64));
		btnRestar.setBounds(113, 121, 89, 23);
		getFrmPoolabcalculadora().getContentPane().add(btnRestar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//METODO QUE MULTIPLICA DOS NUMEROS
				double num1;
				double num2;
				try {
					num1 = Double.parseDouble(txtEntraNumero1.getText());
					num2 = Double.parseDouble(txtEntraNumero2.getText());
					calculo = new Multiplicar(num1, num2); //"Objeto 'tipo'" Calculo con referencia a un objeto tipo Clase hija 'Sumar'
					double multiplicacion = calculo.operacion();
					lblNumeroResultado.setText(String.valueOf(multiplicacion));
				} catch (NumberFormatException e2) {
					lblNumeroResultado.setText(String.valueOf("ERROR: Valor no numerico ingresado."));
				}
			}
		});
		btnMultiplicar.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnMultiplicar.setForeground(new Color(255, 255, 255));
		btnMultiplicar.setBackground(new Color(128, 64, 64));
		btnMultiplicar.setBounds(212, 121, 113, 23);
		getFrmPoolabcalculadora().getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//METODO QUE DIVIDE DOS NUMEROS
				double num1;
				double num2;
				try {
					num1 = Double.parseDouble(txtEntraNumero1.getText());
					num2 = Double.parseDouble(txtEntraNumero2.getText());
					if (num2 != 0) {
						calculo = new Dividir(num1, num2); //"Objeto 'tipo'" Calculo con referencia a un objeto tipo Clase hija 'Sumar'
						double division = calculo.operacion();
						lblNumeroResultado.setText(String.valueOf(division));
					} else {
						throw new IllegalArgumentException("ERROR: División entre 0 no es válida.");
					}
				} catch (NumberFormatException e2) {
					lblNumeroResultado.setText(String.valueOf("ERROR: Valor no numerico ingresado."));
				} catch (IllegalArgumentException e3) {
					lblNumeroResultado.setText(e3.getMessage());
				}
			}
		});
		btnDividir.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnDividir.setBackground(new Color(128, 64, 64));
		btnDividir.setForeground(new Color(255, 255, 255));
		btnDividir.setBounds(335, 121, 89, 23);
		getFrmPoolabcalculadora().getContentPane().add(btnDividir);
		
		JLabel lblPideNumero1 = new JLabel("Digite el primer número: ");
		lblPideNumero1.setForeground(new Color(128, 0, 64));
		lblPideNumero1.setFont(new Font("DialogInput", Font.BOLD, 16));
		lblPideNumero1.setBounds(14, 37, 250, 19);
		getFrmPoolabcalculadora().getContentPane().add(lblPideNumero1);
		
		JButton btnCerrarVentana = new JButton("Cerrar");
		btnCerrarVentana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Tenga un felíz día!", "Ejecución Finalizada Con Éxito", 1, null);
				System.exit(0);
			}
		});
		btnCerrarVentana.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnCerrarVentana.setForeground(new Color(255, 255, 255));
		btnCerrarVentana.setBackground(new Color(255, 0, 0));
		btnCerrarVentana.setBounds(335, 227, 89, 23);
		getFrmPoolabcalculadora().getContentPane().add(btnCerrarVentana);
		
	}

	public JFrame getFrmPoolabcalculadora() {
		return frmPoolabcalculadora;
	}

	public void setFrmPoolabcalculadora(JFrame frmPoolabcalculadora) {
		this.frmPoolabcalculadora = frmPoolabcalculadora;
	}
}
