package pe.ds.comercianteexitoso.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import pe.ds.comercianteexitoso.service.VentaService;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentasView extends JFrame {

	private JPanel contentPane;
	private JTextField txtCajas;
	private JTextField txtPrecioCaja;
	private JTextField txtPorcentajeGan;
	private JTextField txtGastosTot;
	private JTextField txtIngresosTot;
	private JTextField txtGanancia;
	private JTextField txtPrecioVenta;
	private JButton btnProcesar;
	private JButton btnNuevo;
	private JButton btnSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentasView frame = new VentasView();
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
	public VentasView() {
		setTitle("VENTAS EXITOSAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 255)), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 255)));
		panel.setBounds(10, 11, 268, 160);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad Cajas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 21, 95, 25);
		panel.add(lblNewLabel);
		
		txtCajas = new JTextField();
		txtCajas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCajas.setBounds(172, 21, 73, 25);
		panel.add(txtCajas);
		txtCajas.setColumns(10);
		
		JLabel lblPrecioXCaja = new JLabel("Precio x Caja");
		lblPrecioXCaja.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrecioXCaja.setBounds(10, 57, 95, 25);
		panel.add(lblPrecioXCaja);
		
		txtPrecioCaja = new JTextField();
		txtPrecioCaja.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPrecioCaja.setColumns(10);
		txtPrecioCaja.setBounds(172, 57, 73, 25);
		panel.add(txtPrecioCaja);
		
		JLabel lblPorcentajeGanancia = new JLabel("Porcentaje Ganancia");
		lblPorcentajeGanancia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPorcentajeGanancia.setBounds(10, 93, 128, 25);
		panel.add(lblPorcentajeGanancia);
		
		txtPorcentajeGan = new JTextField();
		txtPorcentajeGan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPorcentajeGan.setColumns(10);
		txtPorcentajeGan.setBounds(172, 93, 73, 25);
		panel.add(txtPorcentajeGan);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 255)), "RESULTADOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 255)));
		panel_1.setBounds(288, 11, 268, 160);
		contentPane.add(panel_1);
		
		JLabel lblGastosTotales = new JLabel("Gastos Totales");
		lblGastosTotales.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGastosTotales.setBounds(10, 21, 95, 25);
		panel_1.add(lblGastosTotales);
		
		txtGastosTot = new JTextField();
		txtGastosTot.setEditable(false);
		txtGastosTot.setEnabled(false);
		txtGastosTot.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtGastosTot.setColumns(10);
		txtGastosTot.setBounds(172, 21, 73, 25);
		panel_1.add(txtGastosTot);
		
		JLabel lblIngresosTotales = new JLabel("Ingresos Totales");
		lblIngresosTotales.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIngresosTotales.setBounds(10, 57, 95, 25);
		panel_1.add(lblIngresosTotales);
		
		txtIngresosTot = new JTextField();
		txtIngresosTot.setEditable(false);
		txtIngresosTot.setEnabled(false);
		txtIngresosTot.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtIngresosTot.setColumns(10);
		txtIngresosTot.setBounds(172, 57, 73, 25);
		panel_1.add(txtIngresosTot);
		
		JLabel lblGanancia = new JLabel("Ganancia");
		lblGanancia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGanancia.setBounds(10, 93, 128, 25);
		panel_1.add(lblGanancia);
		
		txtGanancia = new JTextField();
		txtGanancia.setEditable(false);
		txtGanancia.setEnabled(false);
		txtGanancia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtGanancia.setColumns(10);
		txtGanancia.setBounds(172, 93, 73, 25);
		panel_1.add(txtGanancia);
		
		JLabel lblPorcentajeGanancia_1_1 = new JLabel("PrecioVenta x Caja");
		lblPorcentajeGanancia_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPorcentajeGanancia_1_1.setBounds(10, 124, 128, 25);
		panel_1.add(lblPorcentajeGanancia_1_1);
		
		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setEditable(false);
		txtPrecioVenta.setEnabled(false);
		txtPrecioVenta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPrecioVenta.setColumns(10);
		txtPrecioVenta.setBounds(172, 124, 73, 25);
		panel_1.add(txtPrecioVenta);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 255)), "ACCIONES", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 102, 255)));
		panel_2.setBounds(10, 182, 542, 83);
		contentPane.add(panel_2);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//datos
				int cantidadCajas =  Integer.parseInt(txtCajas.getText());
				double precioxCaja = Double.parseDouble(txtPrecioCaja.getText());
				int porcentajeGanancia = Integer.parseInt(txtPorcentajeGan.getText());
				//proceso
				VentaService service = new VentaService();
				double gastosTotales = service.calcularGastosTotales(cantidadCajas, precioxCaja);
				double ingresosTotales = service.calcuarIngresosTotales(gastosTotales, porcentajeGanancia);
				double ganancia = service.calcularGanancias(gastosTotales, ingresosTotales);
				double precioVenta = service.calcularPrecioVenta(ingresosTotales, cantidadCajas);
				
				txtGastosTot.setText(""+ gastosTotales);
				txtIngresosTot.setText(""+ingresosTotales);
				txtGanancia.setText(""+ganancia);
				txtPrecioVenta.setText(""+precioVenta);
				
				//desactivar form
				setEditStatus(false);
			}
		});
		btnProcesar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnProcesar.setBounds(39, 24, 110, 37);
		panel_2.add(btnProcesar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setEditStatus(true);
				InicializaForm();
			}
		});
		btnNuevo.setEnabled(false);
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNuevo.setBounds(207, 24, 110, 37);
		panel_2.add(btnNuevo);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
			
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalir.setBounds(381, 24, 110, 37);
		panel_2.add(btnSalir);
		
		setEditStatus(true);
		InicializaForm();
		this.setLocationRelativeTo(null);
	}
	
	//inicializar formulario
	
	private void InicializaForm() {
		txtCajas.setText("");
		txtPrecioCaja.setText("");
		txtPorcentajeGan.setText("");
		txtGastosTot.setText("");
		txtIngresosTot.setText("");
		txtGanancia.setText("");
		txtPrecioVenta.setText("");
		txtCajas.requestFocus();
	}
	
	//activa cajas de texto
	private void setEditStatus(boolean activa) {
		txtCajas.setEnabled(activa);
		txtPrecioCaja.setEnabled(activa);
		txtPorcentajeGan.setEnabled(activa);
		btnProcesar.setEnabled(activa);
		btnNuevo.setEnabled(!activa);
		
	}
}
