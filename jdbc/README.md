# jdbc

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `curso/` → `Curso.java` + `CursoView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-curso          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── curso/
│   ├── model/Curso.java
│   └── view/CursoView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
