# produtos-func

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `stream/` → `Stream.java` + `StreamView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-stream          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── stream/
│   ├── model/Stream.java
│   └── view/StreamView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
