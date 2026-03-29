# ── Makefile — java-poo ──────────────────────────────────────────────────────
# Comandos:
#   make          → compila tudo
#   make run-carro  → roda um domínio específico
#   make clean    → remove bytecode compilado

SRC := $(shell find src -name "*.java")
OUT := out

.PHONY: all clean run-Carro run-Produto run-ContaBancaria

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run-Carro:
	java -cp out br.edu.fatecpg.Carro.view.CarroView

run-Produto:
	java -cp out br.edu.fatecpg.Produto.view.ProdutoView

run-ContaBancaria:
	java -cp out br.edu.fatecpg.ContaBancaria.view.ContaBancariaView

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
