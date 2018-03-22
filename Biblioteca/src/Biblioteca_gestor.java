
public class Biblioteca_gestor {

	private GestionBiblio gestion;
	
	public void setBiblio(GestionBiblio gestion) {
		this.gestion = gestion;
	}
	
	public void ejecutarAccion() {
		gestion.ejectuarAccion();
	}
	
}
