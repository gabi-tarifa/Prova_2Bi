public class ItemProduto implements ExibirInterface{
    private static long idBase;
    private long id;
    private String peca;
    private String modelo;
    private String tamanho;
    private double valor;

    public ItemProduto(String peca, String modelo, String tamanho, double valor){
        this.id = idBase++;
        this.peca = peca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    public void setPeca(String peca){
        this.peca = peca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public String getPeca(){
        return peca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getTamanho(){
        return tamanho;
    }
    public double getValor(){
        return valor;
    }
    public long getId(){
        return id;
    }
}