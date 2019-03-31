package br.com.ibratec.lista3;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data() {
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void passaDia() {
			if (this.mes == 12 && this.dia >=31) {
				this.dia = 1;
				this.mes = 1;
				this.ano++;
			} else if(this.dia == 31){
				this.dia =31;
			}else{
				this.dia++;
			}
		}

	@Override
	public String toString() {
		return "Data [" + dia + "/" + mes + "/" + ano + "]";
	}

}
