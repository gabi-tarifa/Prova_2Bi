import java.util.ArrayList;
import java.util.List;

public class Orcamento implements ExibirInterface{
    private static long idBase;
    private long id;
    private List<ItemProduto> lista = new ArrayList<>();
    private double valorTotal;

    public Orcamento(){
        this.id = idBase;
    }

    public double getValorTotal(){
        return valorTotal;
    }

    public long getId(){
        return id;
    }

    public List<ItemProduto> getItens(){
        return lista;
    }
    
    public void addItem(ItemProduto itens){
        lista.add(itens);
    }
    public void removeItem(ItemProduto id){
        lista.remove(id);
    }
}