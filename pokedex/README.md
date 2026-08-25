# pokedex

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `pokemon/` → `Pokemon.java` + `PokemonView.java`
- `favoritos/` → `Favoritos.java` + `FavoritosView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-pokemon          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── pokemon/
│   ├── model/Pokemon.java
│   └── view/PokemonView.java
├── favoritos/
│   ├── model/Favoritos.java
│   └── view/FavoritosView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
