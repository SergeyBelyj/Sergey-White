
package ru.job4j;
/**
* Package for calculate task.
*
* @author Sergey Belyj (sergiuszbelyj@gmail.com).
* @version $Id$.
* @since 0.1.
*/

public class Calculate {


/**
     * Main.
     * @param args - args.
     */
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		System.out.println(calc.echo("ahh"));
	}
/**
* Method echo.
* @param name Your name.
* @return Echo plus your name.
*/
	public String echo(String name) {
  	  return "Echo, echo, echo : " + name;
}
	
}
