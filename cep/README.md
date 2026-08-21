# cep

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `cep/` → `Cep.java` + `CepView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-cep          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── cep/
│   ├── model/Cep.java
│   └── view/CepView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
