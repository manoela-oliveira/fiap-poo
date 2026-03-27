package br.com.fiapride.model;

/* Alterando nomeclaturas antigas para nomeclaturas significativas
   De: individuo, pl e gas
   Para: proprietário, placa e gasolina
   Transformando atributos que estavam públicos
   em arquivos privados */
public class Veiculo {
    private String proprietario;
    private String placa;
    private double gasolina;
    private String modelo; //Modelo do carro é omutável na vida real, logo, não receberá setter

    public Veiculo(String proprietario, String placa) {
        this.setProprietario(proprietario);
		this.setPlaca(placa);
		this.setGasolina(0.0);
        this.modelo = modelo;
        System.out.println(" Registro inicial: O carro " + this.modelo + " foi criado com a placa " + this.placa);
    }
    /* Aplicando padrão de nomeclatura getter"CamelCase e tornando-o público
       De: private get_individuo
       Para: public String getProprietario */
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

    public void atualizarPlaca(String novaPlaca){
        System.out.println(" Solicitada atualização de placa no Detran para o veículo " + this.modelo + "...");
        this.setPlaca(novaPlaca);
    }

	private void setPlaca(String novaPlaca) {
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
            System.out.println(" A placa registrada atualmente é " + this.placa);
        }
        else{
            System.out.println("Erro: A placa informada possui um valor inválido.");
        }
	}
    
    public double getGasolina() {
        return this.gasolina;
    }
    /* Utilizando Setter para o atributo "gasolina" a fim de não permitir valores negativos 
       em hipótese alguma, conforme demonstrado no código legado v1.gas = -10; e tornando-o privado */
    private void setGasolina(double valor) {
        if (valor >= 0){
            this.gasolina = valor;
        }
        else {
            System.out.println("Erro: Tentativa de definir gasolina negativa negativo bloqueada!");
        }
    }
    /* Alteração do tipo, visto que gasolina é medida em litros
       De: int (permite apenas números inteiros)
       Para: double (permite números decimais) */
    public void adicionarGasolina(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de reabastecimento deve ser superior a zero.");

            return;
        }

        this.gasolina += valor;
        System.out.println("Abastecimento realizado com sucesso! Você possui agora " + this.gasolina + " litros de gasolina em seu tanque.");
    }
    /* Transformando ações em verbos e transformando nomeclatura anterior em uma nomeclatura significativa
       De: gasta
       Para: consumirGasolina */
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
        System.out.println("Resolveu dar uma voltinha? Até o momento, você consumiu " + this.gasolina + "litros de gasolina.");
    }

   
}
