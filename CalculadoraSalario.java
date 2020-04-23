package br.com.maito.desafio.calculadorasalliq;

public class CalculadoraSalario {

    private double salarioInss;


    public long calcularSalarioLiquido(double salarioBase) {
        if (salarioBase < 1500)
            return 0;
        calcularInss(salarioBase);
        System.out.println(calcularInss(salarioBase));
        return Math.round(calcularInss(salarioBase));
    }

    private double calcularInss(double salarioBase) {
        if (salarioBase <= 1500)
            salarioInss = salarioBase - (salarioBase * 0.08);
        if (salarioBase > 1500 && salarioBase <= 4000) {
            salarioInss = salarioBase - (salarioBase * 0.09);
            return calcularIrrf(salarioInss);
        }
        if (salarioBase > 4000) {
            salarioInss = salarioBase - (salarioBase * 0.11);
            return calcularIrrf(salarioInss);
        }

        return salarioInss;
    }

    private double calcularIrrf(double salarioInss) {
        if (salarioInss > 3000 && salarioInss <= 6000)
            return salarioInss = salarioInss - (salarioInss * 0.075);
        if (salarioInss > 6000)
            return salarioInss = salarioInss - (salarioInss * 0.15);
        return salarioInss;
    }
}
