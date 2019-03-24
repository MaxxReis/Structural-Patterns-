package leaf;

import interfaces.Component;

public class Caju extends Component{
    private final String grau_maturidade;
    private final String tamanho;
    
    public Caju(String nome, String grau_maturidade, String tamanho){
        super(nome);
        this.grau_maturidade = grau_maturidade;
        this.tamanho = tamanho;
    }

    @Override
    public void realizarLimpeza() {
        System.out.println("Fruta "+this.nome+" foi limpa");
    }

    @Override
    public void limparUmaFruta(String nome, String grau_maturidade, String tamanho) {
        if(this.nome.equalsIgnoreCase(nome) && this.grau_maturidade.equalsIgnoreCase(grau_maturidade) &&
                this.tamanho.equalsIgnoreCase(tamanho))
            System.out.println("Fruta "+this.nome+" foi limpa");
        else
            System.out.println("Fruta não encontrada");
    }
    
    
}
