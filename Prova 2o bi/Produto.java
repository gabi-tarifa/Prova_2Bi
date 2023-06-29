public class Produto extends Orcamento implements ExibirInterface{
    private String dataEntrega;
    private boolean entregue = false;

    public Produto(String dataEntrega){
        this.dataEntrega = dataEntrega;
    }

    public String getDataEntrega(){
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega){
        this.dataEntrega = dataEntrega;
    }

    public boolean getEntrege(){
        return entregue;
    }

    public void entregar () throws Exception{
        if (entregue == false){
            this.entregue = true;
        }
        else {
            
        }
    }
    /*
    @Override
    public void exibir(boolean completo){
        
    }
    */
}