package hello;
import facil_c.*;
import java.util.ArrayList;

public class ComprarRopa {
  public static final String[] tallas = {"S", "M", "L"};
  public static final String[] genero = {"varon", "mujer"};
  public static final int[][] descN = {{10,12,6}, {4,12,17}};
  public static final int[][] descI = {{11,12,15}, {13,7,8}};
  public static ArrayList<Integer> tallasN = new ArrayList<>();
  public static ArrayList<Integer> tallasI = new ArrayList<>();
  public static ArrayList<Integer> genN = new ArrayList<>();
  public static ArrayList<Integer> genI = new ArrayList<>();
  public static ArrayList<Double> precioN = new ArrayList<>();
  public static ArrayList<Double> precioI = new ArrayList<>();
  public static ArrayList<Double> precioFN = new ArrayList<>();
  public static ArrayList<Double> precioFI = new ArrayList<>();
  public static void prnt(String tell){
    System.out.println(tell);
  }
  public static void main(String[] args) {
	  iChecker isure = new iChecker("Por favor ingrese un numero entero");
    sChecker ssure = new sChecker("Por favor coloque un dato adequado");
    dChecker dsure = new dChecker("Por favor ingrese un numero real");
    int numN = isure.get(10, "Ingrese la cantidad de ropa nacional que comprara: ", "Por favor que no sea mayor a 10 prendas ni menor a 0");
    //EL usuario ingresa la cantidad de ropa nacional que comprara, máximo 10 unidades
    for(int i = 1; i <= numN ; i++){
      tallasN.add(ssure.get(tallas, "Ingrese una talla(S, M, L) para la ropa nacional numero: " + i));
      precioN.add(dsure.get(20.0, 150.0, "Ingrese su precio, para la ropa nacional los precios van de 20 a 150"));
      genN.add(ssure.get(genero, "Ingrese su genero(varon, mujer) para aplicarle un descuento a su compra, por favor:"));
    }
    //El usuario ingresa la talla y el precio para cada uno, el precio para los nacionales debe estar entre 20 a 150
    prnt("Muy bien, ahora pasamos a las ropas exportadas");
    int numI = isure.get(10, "Ingrese la cantidad de ropa importada que comprara:", "Por favor, no más de 10 unidades");
    for(int i = 1; i <= numI ; i++){
      tallasI.add(ssure.get(tallas, "Ingrese una talla(S, M, L) para la ropa importada numero: " + i));
      precioI.add(dsure.get(35.0, 250.0, "Ingrese su precio, para la ropa importada los precios van de 35 a 250"));
      genI.add(ssure.get(genero, "Ingrese su genero(varon, mujer) para aplicarle un descuento a su compra, por favor:"));
    }
    //El usuario ingresa los mismos datos, pero esta vez para la ropa importada
    for(int i = 0; i < numN; i++){
      precioFN.add(precioN.get(i) * (100 - descN[genN.get(i)][tallasN.get(i)])/100);
    }
    for(int i = 0; i < numI; i++){
      precioFI.add(precioI.get(i) * (100 - descI[genI.get(i)][tallasI.get(i)])/100);
    }
    //Calculamos los precios finales para presentar el resumen
    double totalN = 0, totalI = 0;
    for(int i = 0; i < numN; i++){
      prnt("El precio final para la prenda nacional numero " + (i + 1) + "(" + tallas[tallasN.get(i)]+ ", "+ genero[genN.get(i)] + ", " + precioN.get(i) + ") es :" + precioFN.get(i));
      totalN += precioFN.get(i);
    }
    prnt("El precio total a pagar por toda la ropa nacional es: " + totalN);
    for(int i = 0; i < numI; i++){
      prnt("El precio final para la prenda importada numero " + (i + 1) + "(" + tallas[tallasI.get(i)] + ", "+ genero[genI.get(i)] + ", " + precioI.get(i) + ") es :" + precioFI.get(i));
      totalI += precioFI.get(i);
    }
    prnt("El precio total a pagar por toda la ropa importada es: " + totalI);
    prnt("Usted va a pagar en total: " + (totalI + totalN));
  }
}
