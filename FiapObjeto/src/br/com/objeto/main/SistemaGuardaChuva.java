package br.com.objeto.main;

import br.com.objeto.model.Capa;
import br.com.objeto.model.Dono;
import br.com.objeto.model.GuardaChuva;

public class SistemaGuardaChuva {
	public static void main(String[] args) {
		System.out.println("~~~ SISTEMA GUARDA-CHUVA ~~~");

		Dono comprador = new Dono("Manoela", "2CCPW");
        GuardaChuva guardaChuva = new GuardaChuva("Rosa","Plástico");
		guardaChuva.fechar();
		guardaChuva.abrir();
        Capa capaPersonalizada = new Capa("Flores",67.0, comprador);
        comprador.adicionarSaldo(100.0);
		comprador.comprarCapa(capaPersonalizada);
		capaPersonalizada.exibirDetalhesCompra();
		System.out.println("\n~~~ Sua escolha com toda certeza combina com o guarda-chuva " + guardaChuva.getCor() + " de " + guardaChuva.getMaterial());
	}

}