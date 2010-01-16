/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

import java.util.Vector;
import model.CalculoCdcVO;

/**
 *
 * @author Usuario
 */
public class CalculoCDC {

    private double valJuros;
    private double valAmortizacao;
    private double valSaldo;
    private double valMontante;
    private double valParcela;

    public CalculoCDC() {
    }

    public Vector<CalculoCdcVO> calcularJurosCompostosMes(double valCapital, double juros, int qtdParcelas) {
        Vector<CalculoCdcVO> vet = new Vector();
        valMontante = valCapital * (Math.pow(1 + (juros / 100), qtdParcelas));
        valParcela = valMontante / qtdParcelas;
        valJuros = valCapital * (juros / 100);
        valAmortizacao = valParcela - valJuros;
        valSaldo = valCapital - valAmortizacao;
        CalculoCdcVO jc = new CalculoCdcVO(valCapital, valJuros, valParcela, valAmortizacao, valSaldo, juros, qtdParcelas);
        vet.add(jc);
        for (int cont = 1; cont < qtdParcelas; cont++) {
            valCapital = valSaldo;
            valJuros = valCapital * (juros / 100);
            valAmortizacao = valParcela - valJuros;
            valSaldo = valCapital - valAmortizacao;
            jc = new CalculoCdcVO(valCapital, valJuros, valParcela, valAmortizacao, valSaldo, juros, qtdParcelas);
            vet.add(jc);
        }
        return vet;
    }
}
