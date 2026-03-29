# encapsulamento

Projeto Java POO — estrutura model/view por domínio.

## Domínios

- `Carro/` → `Carro` + `CarroView`
- `Produto/` → `Produto` + `ProdutoView`
- `ContaBancaria/` → `ContaBancaria` + `ContaBancariaView`

## Compilar e rodar

```bash
# Compilar tudo
make

# Ou manualmente:
find src -name "*.java" | xargs javac -d out

# Rodar um domínio
make run-Carro
# ou: java -cp out br.edu.fatecpg.Carro.view.CarroView
```

## Estrutura

```
src/br/edu/fatecpg/
├── Carro/
│   ├── model/Carro.java
│   └── view/CarroView.java
├── Produto/
│   ├── model/Produto.java
│   └── view/ProdutoView.java
├── ContaBancaria/
│   ├── model/ContaBancaria.java
│   └── view/ContaBancariaView.java
```

## Boas práticas lembradas

- **Atributos**: sempre `private`
- **Métodos de model**: calculam e **retornam** — sem `System.out`
- **View**: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- **Constantes**: `private static final SNAKE_UPPER_CASE`
