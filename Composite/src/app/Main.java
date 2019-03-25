package app;

import interfaces.Component;
import composite.Composite;
import leaf.*;

public class Main {
    public static void main(String[] args) {
        Composite c1 = new Composite("Composite 1");
        Composite c2 = new Composite("Composite 2");
        
        Fruta caju1 = new Fruta("Caju", "Verde", "Pequeno");
        Fruta caju2 = new Fruta("Caju", "Verde", "Grande");
        Fruta caju3 = new Fruta("Caju", "Verde", "Pequeno");
        Fruta manga1 = new Fruta("Manga01", "De vêz", "Pequena");
        Fruta manga2 = new Fruta("Manga02", "Madura", "Grande");
        
        c1.add(caju1);
        c1.add(caju2);
        c1.add(manga1);
        c1.add(caju3);
        
        c2.add(manga2);
        c2.add(caju2);
        c2.add(c1);
        c2.add(caju3);
        
        c2.realizarLimpeza();
        System.out.println("Limpeza de uma fruta");
        c2.limparUmaFruta("Caju", "Verde", "Pequeno");
    }
}
