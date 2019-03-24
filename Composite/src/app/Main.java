package app;

import interfaces.Component;
import composite.Composite;
import leaf.*;

public class Main {
    public static void main(String[] args) {
        Composite c1 = new Composite("Composite 1");
        Composite c2 = new Composite("Composite 2");
        
        Caju caju1 = new Caju("Caju", "Verde", "Pequeno");
        Caju caju2 = new Caju("Caju", "Verde", "Grande");
        Caju caju3 = new Caju("Caju", "Verde", "Pequeno");
        Manga manga1 = new Manga("Manga01", "De vêz", "Pequena");
        Manga manga2 = new Manga("Manga02", "Madura", "Grande");
        
        c1.add(caju1);
        c1.add(caju2);
        c1.add(manga1);
        c1.add(caju3);
        
        c2.add(manga2);
        c2.add(caju2);
        c2.add(c1);
        
//        c2.realizarLimpeza();
        c2.limparUmaFruta("Caju", "Verde", "Pequeno");
    }
}
