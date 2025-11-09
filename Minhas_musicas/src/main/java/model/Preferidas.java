package model;

import java.util.ArrayList;
import java.util.List;

public class Preferidas {

    private List<Audio> listaPreferidos;

    public Preferidas() {
        this.listaPreferidos = new ArrayList<>();
    }

    public void inclui(Audio audio){
        if (audio.getClassificao() >= 9){
            this.listaPreferidos.add(audio);
        }
    }

    public void mostraPreferidas(){
        if(!listaPreferidos.isEmpty()){
            for (Audio preferida: listaPreferidos){
                System.out.println(preferida.getTitulo() + ", é uma das minhas preferidas.");
            }
        }
    }
}
