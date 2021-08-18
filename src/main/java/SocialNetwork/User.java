package SocialNetwork;

import java.util.ArrayList;
import java.util.List;

public class User implements SocialNetwork.Instagramer, SocialNetwork.Chusma {
    private String nombre;
    private String mensaje;
    private List<SocialNetwork.Chusma> followers = new ArrayList<>();

    public User(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<SocialNetwork.Chusma> getFollowers() {
        return followers;
    }

    public void addFollower(SocialNetwork.Chusma chusma) {
        this.followers.add(chusma);
    }

    public void sendMessage(String message) {
        for(SocialNetwork.Chusma seguidor : followers){
            seguidor.receiveMessage(this.getNombre(), message);
        }
    }

    @Override
    public void receiveMessage(String name, String message) {
        System.out.println("Soy " + this.nombre + " y recibí el mensaje del usuario " + name + " que dice: " + message);
    }

    public void deleteFollower(SocialNetwork.Chusma chusma) {
        followers.remove(chusma);
    }
}
