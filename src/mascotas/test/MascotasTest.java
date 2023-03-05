package mascotas.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import mascotas.Mascota;


public class MascotasTest {
    public static void main(String[] args) throws InterruptedException, ParseException {
       
        Mascota gato = new Mascota();
        Mascota perro = new Mascota("firulai");
        
        //Test comer
        assert(0== gato.getNivel());
        assert("contenta".equals(gato.getEstado()));
        
        gato.comer();
        assert("contenta".equals(gato.getEstado()));
        assert(1 == gato.getNivel());

        gato.setEstado("hambrienta");
        gato.comer();
        assert("contenta".equals(gato.getEstado()));

        gato.setEstado("aburrida");
        gato.comer();
        assert("aburrida".equals(gato.getEstado()));
       
       
       //Test Jugar
        assert(0 == perro.getNivel());
        assert("contenta".equals(perro.getEstado()));

        perro.jugar();
        assert(2 == perro.getNivel());
        assert("contenta".equals(perro.getEstado()));

        perro.setEstado("hambrienta");
        perro.jugar();
        assert(2 ==perro.getNivel());
        assert("hambrienta".equals(perro.getEstado()));

        perro.setEstado("aburrida");
        perro.jugar();
        assert(2 == perro.getNivel());
        assert("contenta".equals(perro.getEstado()));
    
        
        //Test Tiempo aburrido >80 min
        Mascota tigre=  new Mascota();
        assert(0 == tigre.getTiempoAburrida());
       
        String fechaString = "2023-03-05 10:12:00";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date fecha= formatter.parse(fechaString);
        
        tigre.setEstado("aburrida");
        tigre.setTiempoAburrida(fecha);
        System.out.println("los minutos de aburrimiento son "+tigre.getTiempoAburrida());
        
        tigre.comer();
        assert("contenta".equals(tigre.getEstado()));
        
    }
    
    
    
}
