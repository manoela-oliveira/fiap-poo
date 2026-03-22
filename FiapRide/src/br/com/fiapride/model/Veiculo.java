package br.com.fiapride.model;

public class Veiculo {
    private String proprietario;
    private String placa;
    private double gasolina;

    public Veiculo(String proprietario, String placa) {
        this.setProprietario(proprietario);
		this.setPlaca(placa);
		this.setGasolina(0);
    }

	public String getProprietario() {
		return this.proprietario;
	}

	private void setProprietario(String proprietario) {
        if (proprietario != null){
        this.proprietario = proprietario;
        }
        else{
            System.out.println("Erro: O espaço 'Proprietário' deve conter ao menos 1 caracter válido.");
        }
	}

	public String getPlaca() {
		return this.placa;
	}

	private void setPlaca(String placa) {
        if (placa != null){
            this.placa = placa;
        }
        else{
            System.out.println("Erro: O espaço 'Placa' deve conter ao menos 1 caracter válido.");
        }
	}

	public double getGasolina() {
		return this.gasolina;
	}

	public void setGasolina(double valor) {
        this.gasolina = valor;
	}


    public void adicionarGasolina(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de reabastecimento deve ser superior a zero.");

            return;
        }

        this.gasolina += valor;
        System.out.println("Abastecimento realizado com sucesso! Você possui agora " + this.gasolina + " litros de gasolina em seu tanque.");
    }
    
    public void consumirGasolina(double gasto) {
        if (gasto <= 0) {
            System.out.println("Erro: Valor inválido. O valor consumo de gasolina deve ser superior a zero.");
            return;
        }

        if (this.gasolina < gasto) {
            System.out.println("Erro: Quantidade de gasolina no tanque insuficiente para seu passeio. O percurso consumiria cerca de " + gasto + " litros e você tem somente " + this.gasolina + " litros de gasolina disponíveis no tanque.");
            return;
        }

        this.gasolina -= gasto;
        System.out.println("Resolveu dar uma voltinha? Até o momento, você gastou " + this.gasolina + "litros de gasolina.");
    }

   
}
