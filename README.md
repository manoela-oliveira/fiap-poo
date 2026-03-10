# Fiap Ride

## 📌 Descrição do Projeto

Este projeto é um exemplo simples de **Programação Orientada a Objetos (POO) em Java**.  
Ele simula o comportamento de um **guarda-chuva**, permitindo abrir e fechar o objeto enquanto verifica seu estado atual.

O objetivo do projeto é praticar conceitos básicos de Java, como:

- Criação de **classes**
- Instanciação de **objetos**
- Uso de **construtores**
- Implementação de **métodos**
- Organização de código em **pacotes**

---

# Estrutura do Projeto

O projeto está organizado em dois pacotes principais:

```
br.com.fiapride
│
├── model
│   └── GuardaChuva.java
│
└── main
    └── SistemaGuardaChuva.java
```

### 📦 `model`

Contém a classe **GuardaChuva**, responsável por representar o objeto e seu comportamento.

### 📦 `main`

Contém a classe **SistemaGuardaChuva**, responsável por executar o programa.

---

# Classe GuardaChuva

A classe `GuardaChuva` representa um guarda-chuva com algumas características e ações.

## Atributos

| Atributo | Tipo | Descrição |
|--------|------|-----------|
| cor | String | Cor do guarda-chuva |
| material | String | Material do guarda-chuva |
| aberto | boolean | Indica se o guarda-chuva está aberto |

---

## Construtor

O construtor é responsável por inicializar o objeto.

```java
public GuardaChuva(String cor, String material){
    this.cor = cor;
    this.material = material;
    this.aberto = false;
}
```

Quando um guarda-chuva é criado, ele começa **fechado**.

---

## Métodos

### `abrir()`

Abre o guarda-chuva caso ele ainda esteja fechado.

Se já estiver aberto, o sistema informa ao usuário.

### `fechar()`

Fecha o guarda-chuva caso ele esteja aberto.

Se já estiver fechado, o sistema informa ao usuário.

---

# Classe SistemaGuardaChuva

A classe `SistemaGuardaChuva` contém o método principal do programa:

```java
public static void main(String[] args)
```

Ela cria objetos da classe `GuardaChuva` e executa seus métodos.

## Exemplo de criação de objeto

```java
GuardaChuva meuGuardaChuva = new GuardaChuva("Vinho", "Poliéster");
```

## Chamando métodos

```java
meuGuardaChuva.abrir();
meuGuardaChuva.fechar();
```

---

# ▶️ Exemplo de Execução

Ao executar o programa, o console pode exibir mensagens como:

```
Você abriu o guarda-chuva Vinho.
Você fechou o guarda-chuva Vinho.
Oops! Parece que o guarda-chuva Preto já está fechado!
```

---

Este projeto utiliza os seguintes conceitos de **Programação Orientada a Objetos**:

- Classes
- Objetos
- Construtores
- Métodos
- Organização em pacotes
