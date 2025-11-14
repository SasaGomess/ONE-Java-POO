package br.com.sabrina_web.e_commerce.entities;

import java.util.Scanner;

public class MenuCompras {
    public Compra menuCompra(Scanner sc){
        sc.nextLine();
        System.out.println("Digite a descricao do produto");
        String descricao = sc.nextLine();
        System.out.println("Digite o valor do produto");
        double valorProduto = sc.nextDouble();
        System.out.println("Digite a quantidade do produto");
        int valorQuantidade = sc.nextInt();
        return new Compra(descricao, valorProduto, valorQuantidade);
    }
    public CartaoCredito menuCartao(Scanner sc){
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        return new CartaoCredito(limite);
    }

}
