# polimorfismo

> Projeto Java POO — estrutura model/view por domínio.
> Autor: **Troli**

## Domínios

- `atvd1/` → `Atvd1.java` + `Atvd1View.java`
- `atvd2/` → `Atvd2.java` + `Atvd2View.java`
- `atvd3/` → `Atvd3.java` + `Atvd3View.java`
- `atvd4/` → `Atvd4.java` + `Atvd4View.java`
- `atvd5/` → `Atvd5.java` + `Atvd5View.java`

## Compilar e rodar

```bash
make                    # compila tudo
make run-atvd1          # roda o domínio
```

## Estrutura

```
src/br/edu/fatec/
├── atvd1/
│   ├── model/Atvd1.java
│   └── view/Atvd1View.java
├── atvd2/
│   ├── model/Atvd2.java
│   └── view/Atvd2View.java
├── atvd3/
│   ├── model/Atvd3.java
│   └── view/Atvd3View.java
├── atvd4/
│   ├── model/Atvd4.java
│   └── view/Atvd4View.java
├── atvd5/
│   ├── model/Atvd5.java
│   └── view/Atvd5View.java
```

## Boas práticas

- Atributos sempre `private`
- Métodos de model: calculam e **retornam** — sem `System.out`
- View: tem o `main()`, lê com `Scanner`, imprime com `System.out`
- Constantes: `private static final SNAKE_UPPER_CASE`
