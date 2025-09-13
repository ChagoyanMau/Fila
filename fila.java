import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        
        System.out.println("Agregando 3 documentos:");
        cola.add("Prueba.docx");
        cola.add("Examen.pdf");
        cola.add("Lista.xlsx");
        System.out.println("Cola: " + cola);
        
        System.out.println("\nImprimiendo: " + cola.poll());
        System.out.println("Cola después: " + cola);
        
        System.out.println("\nAgregando nuevo documento");
        cola.add("ReporteFinal.doc");
        System.out.println("Cola final: " + cola);
    }
}
