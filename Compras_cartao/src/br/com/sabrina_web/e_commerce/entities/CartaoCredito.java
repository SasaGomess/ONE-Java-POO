package br.com.sabrina_web.e_commerce.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CartaoCredito {
    private double limiteCartao;
    private double saldoCartao;
    List<Compra> compras;

    public CartaoCredito(double limiteCartao){
        this.limiteCartao = limiteCartao;
        this.saldoCartao = limiteCartao;
        compras = new ArrayList<>();
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldoCartao() {
        return saldoCartao;
    }

    public boolean lancaCompra(Compra compra){

        double precoCompra = compra.calculaPrecoCompra();

        if (saldoCartao >= precoCompra ){
            compras.add(compra);
            this.saldoCartao -= precoCompra;
            return true;
        }else {
            return false;
        }
    }
    public void mostraComprasRealizadas(){
        compras.sort(Comparator
                .comparingDouble(Compra::calculaPrecoCompra));

        System.out.println("*************************");
        System.out.println("COMPRAS REALIZADAS: \n");
        compras.forEach(c -> System.out.println(c.getNome() + " - " + c.calculaPrecoCompra()));
        System.out.println("\n*************************");
    }
}
