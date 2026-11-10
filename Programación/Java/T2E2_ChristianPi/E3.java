import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class E3 {
    public static void main(String[] args) {
        // 1. Obtener la fecha y hora actuales del sistema
        LocalDateTime ahora = LocalDateTime.now();
        
        // 2. Definir el formato deseado (Día/Mes/Año Hora:Minutos:Segundos)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        // 3. Formatear la fecha y hora
        String fechaHoraFormateada = ahora.format(formato);
        
        // 4. Mostrar el resultado por pantalla
        System.out.println("--- Fecha y Hora Actuales ---");
        System.out.println("Fecha y hora: " + fechaHoraFormateada);
    }
}
