package Hoja6;

public class ssss {
	boolean esUnNumeroDeTelefonoValido(String tel){
		boolean telefono = false;
		int contador=0;

		for(int i=0;i<tel.length();i++){
			if(tel.charAt(i)!=' '&& tel.charAt(i)!='0'
					&&tel.charAt(i)!='1'&&tel.charAt(i)!='2'
					&&tel.charAt(i)!='3'&&tel.charAt(i)!='4'
					&&tel.charAt(i)!='5'&&tel.charAt(i)!='6'
					&&tel.charAt(i)!='7'&&tel.charAt(i)!='8'
					&&tel.charAt(i)!='9'){

				telefono=false;

			}else{
				if(tel.charAt(i)!=' '){
					contador++;
				}
				if(contador==9){
					telefono=true;
				}
			}


		}
		return telefono;
	}
}
