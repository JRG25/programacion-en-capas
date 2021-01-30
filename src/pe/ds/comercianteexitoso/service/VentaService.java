package pe.ds.comercianteexitoso.service;

public class VentaService {
	
	public double calcularGastosTotales( int cantidadCajas, double precioxCaja) {
		double gastosTotales;
		gastosTotales = cantidadCajas* precioxCaja*1.05;
		return gastosTotales;
	}
	
	public double calcuarIngresosTotales(double gastosTot, int porcentajeGanancia) {
		double ingresosTotales = gastosTot + gastosTot * porcentajeGanancia / 100;
		return ingresosTotales;
	}
	
	public double calcularGanancias(double gastosTotales, double ingresosTot) {
		double ganancias;
		ganancias = ingresosTot - gastosTotales;
		return ganancias;
	}

	public double calcularPrecioVenta(double ingresosTot, int cantidadCajas) {
		double precioVenta;
		precioVenta= ingresosTot / cantidadCajas;
		return precioVenta;
		
	}
}
