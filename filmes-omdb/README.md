# filmes-omdb

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `filmes/` → `Filmes.java` + `FilmesView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-filmes          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── filmes/
│   ├── model/Filmes.java
│   └── view/FilmesView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
