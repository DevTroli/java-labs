# autodriveclientes

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `clientes/` → `Clientes.java` + `ClientesView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-clientes          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── clientes/
│   ├── model/Clientes.java
│   └── view/ClientesView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
