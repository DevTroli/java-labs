# polimorfismo

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

| Pasta | Conceito | Classes |
|-------|----------|---------|
| `Veiculos/` | Sobrescrita (`@Override`) | `Veiculo`, `Carro`, `Bicicleta` |
| `Conversor/` | Sobrecarga de métodos | `Conversor` |
| `Calculadora/` | Sobrecarga de métodos | `Calculadora` |
| `Pagamento/` | Sobrescrita (`@Override`) | `Pagamento`, `PagamentoBoleto`, `PagamentoCartao` |
| `Produto/` | Sobrecarga de construtores | `Produto` |

## Compilar e rodar

```bash
make              # compila tudo
make run-Veiculos # roda o domínio Veículos
make run-Conversor
make run-Calculadora
make run-Pagamento
make run-Produto
```

## Estrutura

```
src/br/edu/fatec/
├── Veiculos/
│   └── model/
│       ├── Veiculo.java
│       ├── Carro.java
│       └── Bicicleta.java
├── Conversor/
│   └── model/
│       └── Conversor.java
├── Calculadora/
│   └── model/
│       └── Calculadora.java
├── Pagamento/
│   └── model/
│       ├── Pagamento.java
│       ├── PagamentoBoleto.java
│       └── PagamentoCartao.java
├── Produto/
│   └── model/
│       └── Produto.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
