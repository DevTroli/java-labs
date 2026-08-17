# ── Makefile ─────────────────────────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out

.PHONY: all clean run-curso

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run-curso:
	java -cp "out:lib/*" br.edu.fatec.curso.view.CursoView

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
