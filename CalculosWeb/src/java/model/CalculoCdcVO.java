/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Usuario
 */
public class CalculoCdcVO {
    private double valCapital;
    private double valJuros;
    private double valParcela;
    private double valAmortizacao;
    private double valSaldo;
    private double jurosMes;
    private int qtdParcelas;

    public CalculoCdcVO(double valCapital, double valJuros, double valParcela, double valAmortizacao, double valSaldo, double jurosMes, int qtdParcelas) {
        this.valCapital = valCapital;
        this.valJuros = valJuros;
        this.valParcela = valParcela;
        this.valAmortizacao = valAmortizacao;
        this.valSaldo = valSaldo;
        this.jurosMes = jurosMes;
        this.qtdParcelas = qtdParcelas;
    }

    public CalculoCdcVO() {
    }

    public double getJurosMes() {
        return jurosMes;
    }

    public void setJurosMes(double jurosMes) {
        this.jurosMes = jurosMes;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public double getValAmortizacao() {
        return valAmortizacao;
    }

    public void setValAmortizacao(double valAmortizacao) {
        this.valAmortizacao = valAmortizacao;
    }

    public double getValCapital() {
        return valCapital;
    }

    public void setValCapital(double valCapital) {
        this.valCapital = valCapital;
    }

    public double getValJuros() {
        return valJuros;
    }

    public void setValJuros(double valJuros) {
        this.valJuros = valJuros;
    }

    public double getValParcela() {
        return valParcela;
    }

    public void setValParcela(double valParcela) {
        this.valParcela = valParcela;
    }

    public double getValSaldo() {
        return valSaldo;
    }

    public void setValSaldo(double valSaldo) {
        this.valSaldo = valSaldo;
    }


}
