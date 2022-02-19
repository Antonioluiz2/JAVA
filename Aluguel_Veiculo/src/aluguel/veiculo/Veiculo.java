package aluguel.veiculo;

import java.util.Arrays;
//import java.util.List;
//import java.util.Collections;

public class Veiculo implements Modelo {
    private String basico;
    private String intermediario;
    private String executivo;
    private String premium;

    @Override
    public String Cabecalho() {
	System.out.println("========================================");
	System.out.println("      Programa Aluguel de Veiculos      ");
	System.out.println("========================================");
	return null;
    }

 
    public String getBasico() {
	return basico;
    }

    public void setBasico(String basico, Integer codigo) {

	String model = "Modelo way | motor" + 1.0 + "| cor preto  |" + "Valor Diario: R$" + 130.00;
	String model1 = "Modelo G3 | motor" + 1.0 + "| cor branco |" + "Valor Diario: R$" + 150.00;
	System.out.println("Os modelos Basicos são: \n" + "[" + 1 + "] " + "FIAT_UNO= " + model);
	System.out.println("[" + 2 + "] " + "VW Gol  =   " + model1);
	System.out.println("--------------------------------------");
	this.basico = basico;

    }

    public String getIntermediario() {
	return intermediario;
    }

    public void setIntermediario(String intermediario, int codigo) {
	String model = " Modelo Renagade std AT | motor" + 1.8 + "| cor preto  |" + "Valor Diario: R$" + 350.00;
	String model1 = "Modelo Dynamique | motor" + 1.6 + "| cor branco |" + "Valor Diario: R$" + 350.00;
	System.out.println("Os modelos Intermediario são: \n" + "[" + 3 + "] " + "JEEP_Renagade = " + model);
	System.out.println("[" + 4 + "] " + "Renault Duster=  " + model1);
	System.out.println("--------------------------------------");

	this.intermediario = intermediario;
    }

    public String getExecutivo() {
	return executivo;
    }

    public void setExecutivo(String executivo, int codigo) {
	String model = " Modelo SW4 | motor" + 3.0 + "| cor preto  |" + "Valor Diario: R$" + 1500.00;
	String model1 = "Modelo LTZ | motor" + 4.0 + "| cor branco |" + "Valor Diario: R$" + 1800.00;
	System.out.println("Os modelos Executivo são: \n" + "[" + 5 + "] " + "Toyota_Hilux = " + model);
	System.out.println("[" + 6 + "] " + "GM_TrailBlazer=  " + model1);
	System.out.println("--------------------------------------");

	this.executivo = executivo;
    }

    public String getPremium() {
	return premium;
    }

    public void setPremium(String premium, int codigo) {
	String model = " Modelo Turbo GT | motor" + 4.0 + "| cor preto  |" + "Valor Diario: R$" + 3500.00;
	String model1 = "Modelo Mach 1 | motor" + 5.0 + "| cor branco |" + "Valor Diario: R$" + 4000.00;
	System.out.println("Os modelos Premium são: \n" + "[" + 7 + "] " + "Porche_Cayenne = " + model);
	System.out.println("[" + 8 + "] " + "Ford_Mustang =  " + model1);
	System.out.println("--------------------------------------");

	this.premium = premium;

    }

    @Override
    public String Category() {
	System.out.println("[1] BASICO=\n  Fiat Uno – Modelo way – motor 1.0 – cor preto – 130, 00\n  "
		+ "VW Gol – Modelo G3 – motor 1.0 – cor branco – 150,00");
	System.out.println("[2] INTERMEDIARIO=\n "
		+ "Jeep Renagade – Mode\n "
		+ " Renault Duster – Modelo Dynamique – motor 1.6 - 350,00");
	System.out.println("[3] EXECUTIVO=\n Toyota Hilux – Modelo SW4 – motor 3.0 – 1500,00\n "
		+ "GM TrailBlazer – Modelo LTZ – motor 3.0 – 1800,00");
	System.out.println("[4] PREMIUM=\n Porche Cayenne – Modelo turbo GT – motor 4.0 – 3500,00\n "
		+ "Ford Mustang - Modelo Mach 1 – motor 5.0 – 4000,00");

	return null;
    }

    @Override
    public String MarcFiat() {
	String[] marcaFiat = { "Modelo way | motor" + 1.0 + "| cor preto  |" + "" + "Valor Diario: R$" + 130.00 };
	System.out.println(Arrays.toString(marcaFiat));
	return null;
    }

    @Override
    public String MarcVw() {
	String[] marcaVw = { "Modelo G3 | motor" + 1.0 + "| cor branco |" + "" + "Valor Diario: R$" + 150.00 };
	System.out.println(Arrays.toString(marcaVw));
	return null;
    }

    @Override
    public String MarcJeep() {
	String[] marcaJeep = {
		" Modelo Renagade std AT | motor" + 1.8 + "| cor preto  |" + "Valor Diario: R$" + 350.00 };
	System.out.println(Arrays.toString(marcaJeep));
	return null;
    }

    @Override
    public String MarcRenault() {
	String[] marcaRenault = { "Modelo Dynamique | motor" + 1.6 + "| cor branco |" + "Valor Diario: R$" + 350.00 };
	System.out.println(Arrays.toString(marcaRenault));
	return null;
    }

    @Override
    public String MarcToyota() {
	String[] marcaToyota = { " Modelo SW4 | motor" + 3.0 + "| cor preto  |" + "Valor Diario: R$" + 1500.00 };
	System.out.println(Arrays.toString(marcaToyota));
	return null;
    }

    @Override
    public String MarcGm() {
	String[] marcaGm = { "Modelo LTZ | motor" + 4.0 + "| cor branco |" + "Valor Diario: R$" + 1800.00 };
	System.out.println(Arrays.toString(marcaGm));
	return null;
    }

    @Override
    public String MarcPorche() {
	String[] marcaPorche = { " Modelo Turbo GT | motor" + 4.0 + "| cor preto  |" + "Valor Diario: R$" + 3500.00 };
	System.out.println(Arrays.toString(marcaPorche));
	return null;
    }

    @Override
    public String MarcForMustang() {
	String[] marcaForMustang = { "Modelo Mach 1 | motor" + 5.0 + "| cor branco |" + "Valor Diario: R$" + 4000.00 };
	System.out.println(Arrays.toString(marcaForMustang));
	return null;
    }

    @Override
    public String End() {
	System.out.println("========================================");
	System.out.println("            Fim do Programa             ");
	System.out.println("========================================");
	return null;
    }

}
