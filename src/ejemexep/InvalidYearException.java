package ejemexep;
public class InvalidYearException extends Exception{
	public InvalidYearException(String mensaje){
        super(mensaje);
    }
}
//**********************************
/*Fijénse que en el constructor de la clase InvalidYearException
llamamos al constructor de Exception pasándole el mensaje
que detalla el error de la excepción producida con la palabra reservada super. 
*/
