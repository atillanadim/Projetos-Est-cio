class Main {
  public static void main(String[] args) {
    public class maquinaCafe {
      int acucarDisponivel; 
        
      void fazercafe(int quantidadeAcucar){
        if(acucarDisponivel < quantidadeAcucar){
          System.out.println("Não há açucar suficiente para fazer café.");
    }
        else{
          acucarDisponivel-= quantidadeAcucar;
          System.out.println("Fazendo cafezinho com "+ quantidadeAcucar+"gramas de açucar.");
        }
  }
      
    }
  }
}