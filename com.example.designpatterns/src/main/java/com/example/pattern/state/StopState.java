/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : State 
 */

package com.example.pattern.state;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("System is in Stop State.");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}

}
