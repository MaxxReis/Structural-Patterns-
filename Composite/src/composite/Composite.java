package composite;

import interfaces.Component;
import java.util.ArrayList;

public class Composite extends Component{
    private String nome_composite;

    public Composite(String nome){
        super(nome);
    }

    @Override
    public void add(Component fruta) {
        super.add(fruta); 
    }

    @Override
    public void remove(Component fruta) {
        super.remove(fruta); 
    }

    @Override
    public Component getChild(String nome_fruta) {
        return super.getChild(nome_fruta); 
    }
       
    @Override
    public void realizarLimpeza(){         
        for (int i = 0; i < this.children.size(); i++) {
            this.children.get(i).realizarLimpeza();
        }
    }

    @Override
    public void limparUmaFruta(String nome, String grau_maturidade, String tamanho) {
        for (Component component : children) {
            component.limparUmaFruta(nome, grau_maturidade, tamanho);
        }
    }
    
    
}
