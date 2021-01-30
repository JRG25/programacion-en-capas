package pe.ds.comercianteexitoso.prueba;

import pe.ds.comercianteexitoso.service.VentaService;

public class Prueba01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cajas;
		double precioCaja;
		int porcentajeGanancia;
		double ganancia;
		double gastosTot;
		double ingresosTot;
		double precioVneta;
		
		cajas = 200;
		porcentajeGanancia=60;
		precioCaja=30;
		
		VentaService v = new VentaService();
		
		gastosTot = v.calcularGastosTotales(cajas, precioCaja);
		ingresosTot = v.calcuarIngresosTotales(gastosTot, porcentajeGanancia);
		ganancia = v.calcularGanancias(gastosTot, ingresosTot);
		precioVneta = v.calcularPrecioVenta(ingresosTot, cajas);
		
		System.out.println("GASTOS T.: "+gastosTot);
		System.out.println("Ingresos: "+ ingresosTot);
		System.out.println("Ganancia: "+ganancia);
		System.out.println("PRECIO VENTA: "+precioVneta);

	}

}
