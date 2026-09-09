# ── Makefile ─────────────────────────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out
LIBS := $(shell find lib -name "*.jar" | tr '\n' ':')

.PHONY: all clean run-filmes

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -cp "$(LIBS)" -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run-filmes:
	java -cp "$(OUT):$(LIBS)" br.edu.fatec.filmes.view.Main

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
