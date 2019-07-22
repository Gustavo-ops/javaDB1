package com.db1.db1start;
public class Texto{
	private final String PALAVRA3 = "Gustavo Fatega";
	private String palavra1;
	private String palavra2[];
	private String maiusculo;
	private String minusculo;
	private String iniciaisMeuNome;
	private String aluno;
	
	public Texto(String palavra1, String palavra2) {
		this.palavra1 = palavra1;
		this.palavra2[0]= palavra2;
	}
	public String maiusculo() {
		if(palavra1!=null) {
			String maiusculo = palavra1.toUpperCase();
			return maiusculo;
		}
		return "nao ha string";
	}
	public String minusculo() {
		if(palavra1!=null) {
		return palavra1.toLowerCase();
		}
		return "nao ha string";
	}
	public int tamanhoDB1Start() {
		int tamanhop = "DB1Start".length();
		return tamanhop;
		}
	public int tamanhoDB1StartComEspacos() {
		int tamanhop = " DB1Start ".length();
		return tamanhop;
		}
	public int tamanhoDB1StartSemEspacos() {
		String tamanhop1[] = " DB1Start ".trim().split(" ");
		int tamanhop2 = tamanhop1.length;
		return tamanhop2;
		}
	public String[] iniciaisMeuNome() {
		String meuNome[] = palavra2;
		String iniciais[];
		iniciais=new String[4];
		int i;
		for(i=0;i<4;i++) {
		iniciais[i]=meuNome[i];
		}
		return iniciais;
		}
	public String[] quaseFinalDoNome() {
		String meuNome[] = palavra2;
		String fim[];
		fim=new String[30];
		int i;
		for(i=2;i<palavra2.length;i++) {
		fim[i]=meuNome[i];
		}
		return fim;
		} 
	public String[] finalDoNome() {
		String meuNome[] = palavra2;
		String fim[];
		fim=new String[4];
		int i;
		for(i=(palavra2.length-4);i<palavra2.length;i++) {
		fim[i]=meuNome[i];
		}
		return fim;
		}
	public String aluno() {
		String meuNome = PALAVRA3;
		char condicionador;
		int i, contador=0;
		for(i=0;i<meuNome.length();i++) {
		condicionador = meuNome.charAt(i);
		if(condicionador==' ') {
		i=meuNome.length();
		}else {
		contador++;
		}
		}
		String meuSobrenome = meuNome.substring(contador);
		String concat = String.valueOf("Aluno") + String.valueOf(meuSobrenome);
		return concat;
		}
	public String[] frutas(String[] args) {
		String frutas, maisFrutas, maca, melancia, banana;
		String result[] = null;
		frutas = new String("Banana, Maçã, Melancia");
		char condicionador;
		int i, contador=0, contador2=0;
		for(i=0;i<frutas.length();i++) {
		condicionador = frutas.charAt(i);
		if(condicionador==' ') {
		i=frutas.length();
		}else {
		contador++;
		}
		}
		banana = new String(frutas.substring(0,(contador-1)));
		maisFrutas = new String(frutas.substring(contador+1));
		for(i=0;i<maisFrutas.length();i++) {
		condicionador = maisFrutas.charAt(i);
		if(condicionador==' ') {
		i=maisFrutas.length();
		}else {
		contador2++;
		}
		}
		maca = new String(maisFrutas.substring((contador+1),(contador2-1)));
		melancia = new String(maisFrutas.substring(contador2+1));
		result[0] = new String(banana);
		result[1] = new String(maca);
		result[2] = new String(melancia);
		return result;
		}

}
