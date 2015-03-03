package br.com.infnet.control;

public class Estado implements CharSequence {

	char[] ch;

	public char charAt(int arg0) {
		return ch[arg0];
	}

	public int length() {
		return ch.length;
	}

	public CharSequence subSequence(int arg0, int arg1) {
		String s = "";
		for (int contador = arg0; contador < arg1; contador++) {
			s += ch[contador];
		}
		return s;
	}

	public static void main(String[] args) {

	}

}
