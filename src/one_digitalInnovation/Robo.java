package one_digitalInnovation;

import one_digitalInnovationStrategy.Comportamento;

public class Robo {
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;

	}

	public void mover() {
		comportamento.mover();

	}

}
