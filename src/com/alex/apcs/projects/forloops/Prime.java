package com.alex.apcs.projects.forloops;

import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Prime {
	
	private int number;

	public Prime() {
		setNumber(UtilRandomNumbers.getRandomInteger(1, 1000000000));
	}

	public Prime(int number) {
		setNumber(number);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		for (int i = 0; i < number; i++) {
			if (number % i == 0)
				return true;
		}
		return false;
	}

	public String toString() {
		if (isPrime())
			return "";
		else
			return "";
	}
}