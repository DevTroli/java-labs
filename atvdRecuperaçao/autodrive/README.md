# autodrive

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `carro/` → `Carro.java` + `CarroView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-carro          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── carro/
│   ├── model/Carro.java
│   └── view/CarroView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
