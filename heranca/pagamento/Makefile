# ── Makefile — Projeto Pagamento ─────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out

.PHONY: all clean run

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run:
	java -cp out br.edu.fatec.pagamento.view.Main

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
