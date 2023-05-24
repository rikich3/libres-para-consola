package facil_c;
import java.util.Scanner;

/*
 *HERENCIA EN JAVA
 *CREEMOS UNA CLASE BASE PARA 3 DIFERENTES CLASES QUE VERIFICAN QUE EL USUARIO HALLA
 *COLOCADO UN INPUT VÁLIDO PARA LOS tipos mas usados int double y string.
 */

public abstract class Checker{ 
    protected boolean has_res;
    protected String sujeto;
    protected String warning;
    protected final String defmissD = "El dato ingresado no forma parte del dominio";
    protected boolean status;
	protected void slave(){
		Scanner sc = new Scanner(System.in);
		sujeto = sc.nextLine();
	}
	abstract boolean check();
    public Checker(){
    }
}
