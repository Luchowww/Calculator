/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package calculator;

/**
 *
 * @author edangulo
 */

/*
 * Clase Calculator implementa Single Responsibility Principle, ya que su única responsabilidad es realizar operaciones matemáticas.
 * La interfaz OperationStrategy cumple con el principio de Single Responsibility, ya que su única responsabilidad es definir el método execute.
 * 
 * Clase Calculator está abierta a la extensión y cerrada a la modificación, ya que se pueden agregar nuevas operaciones sin modificar el código existente.
 * 
 * Interfaz OperationStrategy implementa Liskov Substitution Principle, ya que las clases concretas de operaciones pueden ser reemplazadas por la interfaz OperationStrategy.
 * 
 * Interface Segregation se cumple de manera implícita, ya que la interfaz OperationStrategy tiene un solo método,
 * lo que evita que las clases que la implementan tengan que depender de métodos que no necesitan.
 * 
 * Dependency Inversion Principle se cumple, ya que la clase Calculator depende de la interfaz OperationStrategy.
 */

 interface OperationStrategy {
    double execute(double a, double b);
}

public class Calculator {
    
    public double executeOperation(double a, double b, OperationStrategy strategy) {
        return strategy.execute(a, b);
    }
    
    // Estrategias concretas
    public static class AddOperation implements OperationStrategy {
        @Override
        public double execute(double a, double b) {
            return a + b;
        }
    }
    
    public static class SubtractOperation implements OperationStrategy {
        @Override
        public double execute(double a, double b) {
            return a - b;
        }
    }
    
    public static class MultiplyOperation implements OperationStrategy {
        @Override
        public double execute(double a, double b) {
            return a * b;
        }
    }
    
    public static class DivideOperation implements OperationStrategy {
        @Override
        public double execute(double a, double b) {
            return a / b;
        }
    }

    public static class PotencyOperation implements OperationStrategy {
        @Override
        public double execute(double a, double b) {
            return Math.pow(a, b);
        }
    }
}
