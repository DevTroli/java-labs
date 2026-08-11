# ── Makefile ─────────────────────────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out

.PHONY: all clean run-pedido run-restaurante

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run-pedido:
	java -cp out br.edu.fatec.pedido.view.PedidoView

run-restaurante:
	java -cp out br.edu.fatec.restaurante.view.RestauranteView

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
