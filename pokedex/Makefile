# ── Makefile ─────────────────────────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out
PG_JAR := lib/postgresql.jar

.PHONY: all clean run

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run: all
	java -cp "$(OUT):$(PG_JAR)" br.edu.fatec.pokemon.view.Main

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
