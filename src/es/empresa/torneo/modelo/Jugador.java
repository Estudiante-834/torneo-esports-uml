package es.empresa.torneo.modelo;

import java.util.Objects;

public class Jugador {
	private String idJugador;
    private String nombre;
    private String apodo;
    private int rankingElo;
    private String participacion;
	
    public Jugador(String idJugador, String nombre, String apodo, int rankingElo, String participacion) {
		super();
		this.idJugador = idJugador;
		this.nombre = nombre;
		this.apodo = apodo;
		this.rankingElo = rankingElo;
		this.participacion = participacion;
	}

	public Jugador() {
		super();
	}

	public String getIdJugador() {
		return idJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public int getRankingElo() {
		return rankingElo;
	}

	public void setRankingElo(int rankingElo) {
		this.rankingElo = rankingElo;
	}

	public void setParticipacion(String participacion) {
		this.participacion = participacion;
	}

	@Override
	public String toString() {
		return "Jugador [idJugador=" + idJugador + ", nombre=" + nombre + ", apodo=" + apodo + ", rankingElo="
				+ rankingElo + ", participacion=" + participacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idJugador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(idJugador, other.idJugador);
	}

}
