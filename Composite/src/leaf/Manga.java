package leaf;

import interfaces.Component;

public class Manga extends Component{
    private final String grau_maturidade;
    private final String tamanho;
    
    public Manga(String nome, String grau_maturidade, String tamanho){
        super(nome);
        this.grau_maturidade = grau_maturidade;
        this.tamanho = tamanho;
    }

    @Override
    public void realizarLimpeza() {
        System.out.println("Fruta "+this.nome+" foi limpa");
    }
}