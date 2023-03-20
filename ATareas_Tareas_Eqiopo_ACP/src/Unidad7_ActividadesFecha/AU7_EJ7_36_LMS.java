package Unidad7_ActividadesFecha;

public class AU7_EJ7_36_LMS {

	public void loadProgram(int[] program) {
	    for (int i = 0; i < program.length; i++) {
	        memory[i] = program[i];
	    }
	}
	public void executeProgram() {
	    while (!halt) {
	        instructionRegister = memory[instructionCounter];
	        int opcode = instructionRegister / 100;
	        int operand = instructionRegister % 100;
	        
	        switch (opcode) {
	            case 10: // lectura de entrada
	                Scanner input = new Scanner(System.in);
	                System.out.print("Ingrese un número: ");
	                memory[operand] = input.nextInt();
	                break;
	            case 11: // escritura de salida
	                System.out.println(memory[operand]);
	                break;
	            case 20: // carga en acumulador
	                accumulator = memory[operand];
	                break;
	            case 21: // almacenamiento desde acumulador
	                memory[operand] = accumulator;
	                break;
	            case 30: // suma desde memoria
	                accumulator += memory[operand];
	                break;
	            case 31: // resta desde memoria
	                accumulator -= memory[operand];
	                break;
	            case 32: // división desde memoria
	                accumulator /= memory[operand];
	                break;
	            case 33: // multiplicación desde memoria
	                accumulator *= memory[operand];
	                break;
	            case 40: // salto a dirección
	                instructionCounter = operand;
	                break;
	            case 41: // salto a dirección si acumulador es negativo
	                if (accumulator < 0) {
	                    instructionCounter = operand;
	                }
	                break;
	            case 42: // salto a dirección si acumulador es cero
	                if (accumulator == 0) {
	                    instructionCounter = operand;
	                }
	                break;
	            case 43: // parada
	                halt = true;
	                break;
	            default:
	                System.out.println("Error: código de operación no válido");
	                halt = true;
	                break;
	        }
	        
	        instructionCounter++;
	    }
	}
}
