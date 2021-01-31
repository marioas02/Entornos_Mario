/**
 * 
 */
package UT4;

/**
 * @author MarioAguirre
 *
 */
public class Actividad4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nif minif = new Nif(18082739, 'R');
		System.out.println(minif.getDni() + "-" + minif.getLetra());
		minif.setLetra('U');
		System.out.println(minif.getDni() + "-" + minif.getLetra());
		minif.setLetra('R');
		System.out.println(minif.getDni() + "-" + minif.getLetra());

	}

}
