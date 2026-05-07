# pagamento

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `pagamento/` → `Pagamento.java` + `PagamentoView.java`
- `pagamentocartao/` → `Pagamentocartao.java` + `PagamentocartaoView.java`
- `pagamentodinheiro/` → `Pagamentodinheiro.java` + `PagamentodinheiroView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-pagamento          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── pagamento/
│   ├── model/Pagamento.java
│   └── view/PagamentoView.java
├── pagamentocartao/
│   ├── model/Pagamentocartao.java
│   └── view/PagamentocartaoView.java
├── pagamentodinheiro/
│   ├── model/Pagamentodinheiro.java
│   └── view/PagamentodinheiroView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
