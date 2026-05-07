# ── Makefile ─────────────────────────────────────────────────────────────────
SRC := $(shell find src -name "*.java")
OUT := out

.PHONY: all clean run-atvd1 run-atvd2 run-atvd3 run-atvd4 run-atvd5

all: $(OUT)
	@echo "Compilando $(words $(SRC)) arquivo(s)..."
	javac -d $(OUT) $(SRC)
	@echo "✓ Build OK"

$(OUT):
	mkdir -p $(OUT)

run-atvd1:
	java -cp out br.edu.fatec.atvd1.view.Atvd1View

run-atvd2:
	java -cp out br.edu.fatec.atvd2.view.Atvd2View

run-atvd3:
	java -cp out br.edu.fatec.atvd3.view.Atvd3View

run-atvd4:
	java -cp out br.edu.fatec.atvd4.view.Atvd4View

run-atvd5:
	java -cp out br.edu.fatec.atvd5.view.Atvd5View

clean:
	rm -rf $(OUT)
	@echo "✓ Bytecode removido"
