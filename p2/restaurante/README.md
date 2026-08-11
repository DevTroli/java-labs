# restaurante

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `pedido/` → `Pedido.java` + `PedidoView.java`
- `restaurante/` → `Restaurante.java` + `RestauranteView.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-pedido          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── pedido/
│   ├── model/Pedido.java
│   └── view/PedidoView.java
├── restaurante/
│   ├── model/Restaurante.java
│   └── view/RestauranteView.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
