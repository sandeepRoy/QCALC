package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator calculator = new StandardCalculator();
		calculator.subtract(Double.MIN_VALUE, 1000.000);
		// System.out.println(calculator.getResult());
		calculator.printResult();

		ScientificCalculator scientificCalculator = new ScientificCalculator();
		ScientificCalculator scientificCalculator1 = new ScientificCalculator();
		scientificCalculator.log(10);
		scientificCalculator.printResult();

		scientificCalculator1.add(1.0, 2.0);
		scientificCalculator1.printResult();

		LogicCalculator logicCalculator = new LogicCalculator();
		logicCalculator.OR(8, 6);
		logicCalculator.printResult();

	}
}
