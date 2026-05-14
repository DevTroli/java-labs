SRC  = src/br/edu/fatec/associacao
OUT  = out
MAIN = br.edu.fatec.associacao.view.AssociacaoView

SOURCES = $(shell find src -name "*.java")

.PHONY: all clean run

all:
	@echo "Compilando $(words $(SOURCES)) arquivo(s)..."
	@javac -d $(OUT) $(SOURCES)
	@echo "✓ Build OK"

clean:
	@rm -rf $(OUT)
	@echo "✓ Limpo"

run: all
	@java -cp $(OUT) $(MAIN)
