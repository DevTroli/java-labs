# autenticacao

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `autenticacao/` → `Autenticacao.java` + `AutenticacaoView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-autenticacao          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── autenticacao/
│   ├── model/Autenticacao.java
│   └── view/AutenticacaoView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
