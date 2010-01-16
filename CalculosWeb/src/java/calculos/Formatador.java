/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

import java.util.Vector;
import model.CalculoCdcVO;
import java.text.NumberFormat;

/**
 *
 * @author daniel
 */
public class Formatador {

    public String formatarSaidaCdc(String a, String b, String c) {
        double capital = Double.parseDouble(a);
        double juros = Double.parseDouble(b);
        int parcelas = Integer.parseInt(c);
        Vector<CalculoCdcVO> vet = new Vector();
        CalculoCDC calc = new CalculoCDC();
        vet = calc.calcularJurosCompostosMes(capital, juros, parcelas);
        String resultado = "- RESULTADO -";
        resultado += "\nTotal Parcelas: " + vet.get(0).getQtdParcelas();
        resultado += "\nJuros: " + vet.get(0).getJurosMes()+" %";
        resultado += "\nCapital :" + NumberFormat.getCurrencyInstance().format(vet.get(0).getValCapital());
        resultado += "\nParcela :" + NumberFormat.getCurrencyInstance().format(vet.get(0).getValParcela());
        for (int cont = 0; cont < vet.size(); cont++) {
            resultado += "\n\nParcela: " + (cont + 1);
            resultado += "\nJuros: " + NumberFormat.getCurrencyInstance().format(vet.get(cont).getValJuros());
            resultado += "\nAmortização: " + NumberFormat.getCurrencyInstance().format(vet.get(cont).getValAmortizacao());
            resultado += "\nSaldo: " + NumberFormat.getCurrencyInstance().format(vet.get(cont).getValSaldo());
        }
        return resultado;
    }
}
