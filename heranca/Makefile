# ── Makefile raiz — Exercícios de Herança ────────────────────────────────────
# Roda make nos subprojetos

PROJECTS := Funcionarios pagamento autenticacao

.PHONY: all clean $(PROJECTS)

all:
	@for proj in $(PROJECTS); do \
		$(MAKE) -C $$proj all; \
	done

clean:
	@for proj in $(PROJECTS); do \
		$(MAKE) -C $$proj clean; \
	done

# Targets dinâmicos: make Funcionarios, make Exercicio2, etc.
$(PROJECTS):
	$(MAKE) -C $@ run
