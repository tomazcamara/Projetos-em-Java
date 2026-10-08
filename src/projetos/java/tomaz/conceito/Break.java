package projetos.java.tomaz.conceito;

public class Break {
    static void main(String[] args) {
      int valorTotal = 30000;
      for (int parcela = 1;parcela <=valorTotal;++parcela){
          int valorParcela = valorTotal / parcela;
          if (valorParcela<500){
              break;
          }
          System.out.println("Parcela: " + parcela + " R$ " + valorParcela);

      }
    }
}
