package criando_um_metodo_para_obtermos_os_beneficios_de_reaproveitamento_e_delegacao.entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
}
