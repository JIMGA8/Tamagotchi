
package mascotas;

import java.util.Date;

public class Mascota {
    private String nombre;
    private int nivel;
    private String estado;
    private Date tiempoAburrido;
    
    public Mascota() {
        this.nivel = 0;
        this.estado = "contenta";
        this.tiempoAburrido= new Date();
    }  
    
    public Mascota(String nombre){
        this();
        this.nombre = nombre;
    }
    
public void comer() {
    switch (this.estado) {
        case "hambrienta" -> this.estado = "contenta";
        case "contenta" -> this.nivel += 1;
        case "aburrida" -> {
            if (minutosDesdeUltimoAburrimiento() > 80) {
                this.estado = "contenta";
            }
        }
        default -> System.out.println("Por favor verifique el estado de su mascota.");
    }
}

     public void jugar() {
        switch (this.estado) {
            case "contenta" -> this.nivel += 2;
            case "aburrida" -> this.estado = "contenta";
            default -> System.out.println("No puedo jugar ahora, estoy hambrienta.");
        }
    }

    public int getNivel() {
        return this.nivel;
    }
    
    public String getEstado() {
        return this.estado;
    }

    public long getTiempoAburrida() {
        return minutosDesdeUltimoAburrimiento();
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTiempoAburrida(Date tiempoAburrido) {
        this.tiempoAburrido = tiempoAburrido;
    }
    
    public long minutosDesdeUltimoAburrimiento() {
        Date ahora = new Date();
        return (ahora.getTime() - tiempoAburrido.getTime()) / (1000 * 60);
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", nivel=" + nivel + ", estado=" + estado + ", tiempoAburrido=" + tiempoAburrido + '}';
    }
    
}
