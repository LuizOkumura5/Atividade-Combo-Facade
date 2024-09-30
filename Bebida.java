package engenhariasoftware;

public class Bebida extends Produto{

	private int Ml; 

    public Bebida(String descricao, double preco, int volume) {
        super(descricao, preco);
        this.Ml = volume;
    }

    public int getVolume() {
        return Ml;
    }

    @Override
    public String toString() {
        return getDescricao() + " (" + Ml + "ml) - R$ " + getPreco();
    }
}
