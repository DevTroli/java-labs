# ── Makefile ─────────────────────────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out

.PHONY: all clean run-cep

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run-cep: all
	java -cp out br.edu.fatec.cep.view.CepView

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
