/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author edangulo
 */

/*
 * Se cumple el principio de Single Responsibility, ya que la clase History tiene una única responsabilidad que es almacenar las operaciones realizadas.
 * 
 * Se cumple el principio de Open/Closed, ya que se pueden agregar nuevas operaciones sin modificar el código existente.
 */
public class History {
    
    private ArrayList<Operation> operations;

    public History() {
        this.operations = new ArrayList<>();
    }
    
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public ArrayList<Operation> getOperations() {
        ArrayList<Operation> reversedList = new ArrayList<>(operations);
        Collections.reverse(reversedList);
        return reversedList;
    }
    
}
