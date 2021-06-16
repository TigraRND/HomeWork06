package com.example.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcApplicationTests {
	private Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Тест сложение")
	void testSum(){
		double first = 3.0;
		double second = 7.0;
		Double expected = 10.0;

		assert calculator.sum(first, second).equals(expected);
	}

	@Test
	@DisplayName("Тест деление")
	void testDivision(){
		double first = 100.0;
		double second = 2.0;
		Double expected = 50.0;

		assert calculator.division(first, second).equals(expected);
	}

	@Test
	@DisplayName("Тест умножение")
	void testMultiplication(){
		double first = 12.0;
		double second = 2.0;
		Double expected = 24.0;

		assert calculator.multiplication(first, second).equals(expected);
	}

	@Test
	@DisplayName("Тест вычитания")
	void testSubtraction(){
		double first = 12.0;
		double second = 2.0;
		Double expected = 10.0;

		assert calculator.subtraction(first, second).equals(expected);
	}

	@Test
	@DisplayName("Тест квадратный корень")
	void testSQRT(){
		double first = 4.0;
		Double expected = 2.0;

		assert calculator.sqrt(first).equals(expected);
	}

	@Test
	@DisplayName("Тест возведение в степень")
	void testPow(){
		double base = 4.0;
		double grade = 3.0;
		Double expected = 64.0;

		assert calculator.pow(base, grade).equals(expected);
	}
}