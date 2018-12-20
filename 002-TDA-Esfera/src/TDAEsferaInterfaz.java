/**
 *
 * @author Akin Ramirez
 */
public class TDAEsferaInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TDAEsferaImplementacion esferita = new TDAEsferaImplementacion(4);
        System.out.println("Radio: " + esferita.getRadio());
        System.out.println("Diametro: " + esferita.getDiametro());
        System.out.println("Circuferencia: " + esferita.getCircuferencia());
        System.out.println("Area: " + esferita.getArea());
        System.out.println("Volument: " + esferita.getVolumen());
    }   
}
