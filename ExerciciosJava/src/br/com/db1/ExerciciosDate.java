package br.com.db1;

public class ExerciciosDate {
	
	public boolean anoBissexto(int ano) {
        if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){
            return true;
        }
        else{
            return false;
        }
}
	
	
	
	
	
	
	
	
	

}
