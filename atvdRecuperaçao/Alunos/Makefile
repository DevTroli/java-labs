# ── Makefile ─────────────────────────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out

.PHONY: all clean run-alunos

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run-clientes:
	java -cp out br.edu.fatec.clientes.view.Main

run-alunos:
	java -cp out br.edu.fatec.aluno.view.Main

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
