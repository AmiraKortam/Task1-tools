package Entity;


import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
@Table(schema="public") 
@Entity
public class Calculation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int number1;
	private int number2;
	private char operation;
///////////////////////////
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
//////////////////////////////
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}
//////////////////////////////
	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
/////////////////////////////
    public char getOperation() {
    	return operation;
}

    public void setOperation(char operation) {
    	this.operation = operation;
}


}
