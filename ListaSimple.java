/**
 * Write a description of class ListaSimple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaSimple
{
    Node top;
    //Métodos para los casos de inserción de nodos
        public boolean InsertaPrimerNodo(String dato){
            if (top == null){ //La lista no está vacía
               top = new Node();
               top.name = dato;
               top.next = null;
       
                return true;
             }
             else {
            return false;
            }
        }
        
        public void InsertaAntesPrimerNodo(String nombre){
            Node temp;
            temp = new Node ();
            temp.name = nombre;
            temp.next = this.top;
            this.top = temp;
            temp = null;
        }
    
        public void InseraAlFinal(String nombre){
            Node temp = new Node();
            temp.name = nombre;
            temp.next = null;
            //Node temp2;
            Node temp2 = this.top;
        
            while (temp2.next != null)
            temp2 = temp2.next;
            
            temp2.next = temp;
            temp = null;
            temp2 = null;
        }
    
        public boolean insertaEntreNodos(String nombre, String buscado){
        Node temp = new Node();
        temp.name = nombre;
        Node temp2 = this.top;
        //boolean NodoNoEncontrado = true
        while ((temp2 != null ) 
            && temp2.name.equals(buscado) ==
            false){
                temp2 = temp2.next;
            }
            
            if (temp2 != null){//Nodo buscado se encontró
                temp.next = temp2.next;
                temp2.next = temp;
                temp = null;
                temp2 = null;
                return true;
            }
            else return false;
        }
        
        //Buscar un nodo por su clave y agregar un nodo después del nodo buscado
    public void buscarNodo(String nombre, String nuevoNodoValor) {
    Node temp = this.top;

    while (temp != null) {
        if (temp.name.equals(nombre)) {
            System.out.println("Nodo encontrado, si existe");
            
            // Crear un nuevo nodo con el valor proporcionado
            Node nuevoNodo = new Node();
            nuevoNodo.name = nuevoNodoValor;

            // Insertar el nuevo nodo después del nodo encontrado
            nuevoNodo.next = temp.next;
            temp.next = nuevoNodo;

            System.out.println("Nuevo nodo agregado después del nodo encontrado");
            
            // Romper el bucle ya que ya se ha encontrado el nodo
            break;
        } else {
            System.out.println("Nodo no encontrado, no existe en la lista");
        }

        temp = temp.next;
    }
}
        
        public void imprimir(){
               for (Node temp = this.top; temp != null; temp = temp.next){
               System.out.print("[" + temp.name + "] ->");
            }
           System.out.print("[X]\n");
        }
   
        public String toString(){//Este por el momento no se utiliza pero es para imprimir una cadena, si no está devuelve la dirección de memoria donde está el objeto
            String cadAux = "";
            for (Node temp = this.top; temp != null; temp = temp.next){
                cadAux += "[" + temp.name + "]->";
            }
            cadAux += "[X]\n";
            return cadAux;
        }
    
    
        //Métodos de borrado
        public void borrarPrimerNodo(){
            this.top = this.top.next;
        }
        
        //Borrar cualquier nodo que no sea el primero
        public boolean borrarCualquierNodo(String buscado){
             Node temp = this.top;
             
                 while( (temp != null) && temp.name.equals(buscado) == false){
                     temp = temp.next;
                 }
                     if(temp != null){
                         temp.next = temp.next.next;
                         temp = null;
                         
                         return true;
                     }
                     else return false; //No se si esto vaya en el código 
        } 
        
        public boolean intercambiarNodos(String nodo1, String nodo2) {
        Node temp1 = null, temp2 = null;
        Node prevTemp1 = null, prevTemp2 = null;

        // Buscar los nodos a intercambiar y sus nodos previos
        for (Node temp = this.top; temp != null; temp = temp.next) {
            if (temp.name.equals(nodo1)) {
                temp1 = temp;
                break;
            }
            prevTemp1 = temp;
        }

        for (Node temp = this.top; temp != null; temp = temp.next) {
            if (temp.name.equals(nodo2)) {
                temp2 = temp;
                break;
            }
            prevTemp2 = temp;
        }

        // Verificar si se encontraron ambos nodos
        if (temp1 != null && temp2 != null) {
            // Intercambiar nodos
            if (prevTemp1 != null) {
                prevTemp1.next = temp2;
            } else {
                this.top = temp2;
            }

            if (prevTemp2 != null) {
                prevTemp2.next = temp1;
            } else {
                this.top = temp1;
            }

            Node temp = temp1.next;
            temp1.next = temp2.next;
            temp2.next = temp;

            return true;
        }

        return false; // No se encontraron ambos nodos especificados
    }
}
