//Orçamento mensal:

import java.util.Scanner;
public class OrcamentoMensal{
public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);
//Criação do Scanner;

    double resto = 0;

    System.out.println("Quantas fontes de renda você tem?");
    int x = teclado.nextInt();
//Armazenamento da quantidade de fontes de renda

    System.out.println("Quantas despesas você tem?");
    int y = teclado.nextInt();
//Armazenamente da quantidade de despesas

    double totalRenda = 0;
    double totalDespesas = 0;

      if (x <= 0 || y < 0) {
      System.out.println("Quantidade de rendas ou despesas inválida.");
      teclado.close();
      return;
}
//Verificação da validade das quantidades informadas

    double renda[] = new double[x];
    double despesas[] = new double[y];
//Cada vetor tem tamanho informado pelo usuário.

    System.out.println("Insira o valor da sua principal fonte de renda:");
    renda[0] = teclado.nextDouble();
    totalRenda += renda[0];
//Adiciona o valor da renda principal ao acumulador


    for(int aux = 1; aux < x; aux++){

       System.out.println("Insira o valor da fonte de renda" + (aux + 1) + ":");
       renda[aux] = teclado.nextDouble();
       totalRenda += renda[aux];

}

    for(int aux = 0; aux < despesas.length; aux++){
      System.out.println("Insira o valor da despesa" + (aux + 1) + ":");
      despesas[aux] = teclado.nextDouble();
      totalDespesas += despesas[aux];
}

    resto = totalRenda - totalDespesas;

    System.out.println("Total de rendas: R$ " + totalRenda);
    System.out.println("Total de despesas: R$ " + totalDespesas);
    System.out.println("Saldo restante: R$ " + resto);

    if (resto > 0) {
      System.out.println("Situação: orçamento positivo!");
    } else if (resto < 0) {
      System.out.println("Situação: orçamento negativo!");
    } else {
      System.out.println("Situação: orçamento equilibrado!");
}


teclado.close();

}
}