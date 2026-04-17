# farmacia

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `farmacia/` → `Farmacia.java` + `FarmaciaView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-farmacia          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── farmacia/
│   ├── model/Farmacia.java
│   └── view/FarmaciaView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
