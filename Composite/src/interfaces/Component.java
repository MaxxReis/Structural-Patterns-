package interfaces;

import java.util.ArrayList;

public abstract class Component {
    protected String nome;
    protected ArrayList<Component> children;
    
    public Component(String nome){
        this.nome = nome;
        this.children = new ArrayList<>();
    }
    
    public abstract void realizarLimpeza();
    public void limparUmaFruta(String nome, String grau_maturidade, String tamanho){
    }
    
    public void add(Component fruta){
       this.children.add(fruta);
    }
    public void remove(Component fruta){
       this.children.remove(fruta);
    }
    public Component getChild(String nome_fruta){
        for (Component component : children) {
            if(component.nome == nome_fruta)
                return component;
        }
        return null;
    }
    
}
