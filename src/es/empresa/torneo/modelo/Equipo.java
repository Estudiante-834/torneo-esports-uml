package es.empresa.torneo.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
	private String idEquipo;
    private String nombre;
    private List<Jugador> listaJugadores = new ArrayList<>();
    private int rankingElo;
    private String participacion;
	
    public Equipo(String idEquipo, String nombre, List<Jugador> listaJugadores, int rankingElo) {
		super();
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.listaJugadores = listaJugadores;
		this.rankingElo = rankingElo;
		this.participacion = "Pendiente de aprobar";
	}

	public Equipo() {
		super();
	}

	public String getIdEquipo() {
		return idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
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
		return "Equipo [idEquipo=" + idEquipo + ", nombre=" + nombre + ", listaJugadores=" + listaJugadores
				+ ", rankingElo=" + rankingElo + ", participacion=" + participacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEquipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(idEquipo, other.idEquipo);
	}

}
