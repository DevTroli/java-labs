# ── Makefile ─────────────────────────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out

.PHONY: all clean run-Veiculos run-Conversor run-Calculadora run-Pagamento run-Produto

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run-Veiculos:
	java -cp out br.edu.fatec.Veiculos.view.VeiculosView

run-Conversor:
	java -cp out br.edu.fatec.Conversor.view.ConversorView

run-Calculadora:
	java -cp out br.edu.fatec.Calculadora.view.CalculadoraView

run-Pagamento:
	java -cp out br.edu.fatec.Pagamento.view.PagamentoView

run-Produto:
	java -cp out br.edu.fatec.Produto.view.ProdutoView

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
