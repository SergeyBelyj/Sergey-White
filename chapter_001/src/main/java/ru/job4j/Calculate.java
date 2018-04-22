
package ru.job4j.calculate;
/**
* Package for calculate task.
*
* @author Sergey Belyj (sergiuszbelyj@gmail.com)
* @version $Id$
* @since 0.1
*/

public class Calculate {

/**
*@return ¬озвращает значение value три раза в одну строку
*/

	public String echo(String value){
		return String.format("%s %s %s, value, value, value);
}

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		System.out.println(calc.echo("ahh"));
	}
	
}
