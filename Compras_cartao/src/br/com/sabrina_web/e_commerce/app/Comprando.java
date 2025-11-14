package br.com.sabrina_web.e_commerce.app;

import br.com.sabrina_web.e_commerce.entities.CartaoCredito;
import br.com.sabrina_web.e_commerce.entities.Compra;
import br.com.sabrina_web.e_commerce.entities.MenuCompras;

import java.util.Locale;
import java.util.Scanner;

public class Comprando {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        MenuCompras menu = new MenuCompras();

        CartaoCredito cartaoCredito = menu.menuCartao(sc);
        int resp = 1;

        while (resp != 0){
            Compra compra = menu.menuCompra(sc);

            boolean compraRealizada = cartaoCredito.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra foi realizada");
                System.out.println("Digite 1 para continuar / e qualquer outro numero para sair");
                resp = sc.nextInt();
            }else {
                System.out.println("Saldo Insuficiente");
                resp = 0;
            }
        }

        cartaoCredito.mostraComprasRealizadas();
        System.out.printf("Saldo do Cartão: %.2f", cartaoCredito.getSaldoCartao());

    }
}
