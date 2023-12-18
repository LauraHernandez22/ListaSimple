
/**
 * Write a description of class UsaLista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsaLista
{
    public static void main (String[]args){
    ListaSimple lista = new ListaSimple();
    
    lista.InsertaPrimerNodo("H");
    System.out.println(lista);
    lista.InsertaAntesPrimerNodo("O");
    System.out.println(lista);
    lista.InseraAlFinal("Y");
    System.out.println(lista);
    lista.insertaEntreNodos("A", "O");
    System.out.print(lista);
    lista.intercambiarNodos("A", "Y");
    System.out.println(lista);
    lista.buscarNodo("A", "D");
    System.out.println(lista);
    lista.intercambiarNodos("D", "A");
    System.out.println(lista);
    }
}
