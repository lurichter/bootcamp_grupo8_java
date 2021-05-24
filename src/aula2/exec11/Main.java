package aula2.exec11;

public class Main {

	public static void main(String[] args) {
		
		Assalariado tecnico = new Tecnico(false);
		System.out.println("Salario CLT -> " + tecnico.pagarSalario());
		tecnico.setMetaBatida(true);
		System.out.println("Salario CLT com meta batida -> " + tecnico.pagarSalario());
		
		System.out.println();
		
		Assalariado tecnico2 = new Tecnico(true);
		System.out.println("Salario PJ -> " + tecnico2.pagarSalario());
	}

}
