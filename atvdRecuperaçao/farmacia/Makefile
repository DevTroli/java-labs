# ── Makefile ─────────────────────────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out

.PHONY: all clean run-farmacia

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run-farmacia:
	java -cp out br.edu.fatec.farmacia.view.FarmaciaView

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
