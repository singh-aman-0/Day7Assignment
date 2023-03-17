Answer 1 :- Statically typed: Programming languages are referred to as "Static typed" if the
            memory of the variable is provided at the time of compilation.
            For instance, C, C++, and Java
            
            Dynamically typed: Programming languages are said to as "dynamically typed"
            if the memory for the variable is provided at the time of execution.
            Like Python, PHP, and JavaScript

Answer 2 :- A variable is the name of a memory-allocated reserved area. It may be thought of as
            the name of a memory location, in other words.
            
            While the Java programme is running, the value is held in a container.
         
            To identify the storage location, each variable needs to have a special name.

            A data type is assigned to a variable (we will learn about it after this topic).

Answer 3 :- Type variable_name = value;

            The name of a variable is variable_name. The variable can be initialised by
            supplying an equal sign and a value (initialization i.e. assigning an initial value, is
            optional). However, a Java uninitialized local variable is never given a default
            value by the compiler.

Answer 4 :- Primitive data types: The primitive data types include boolean, char, byte,
            short, int, long, float and double. 
1. boolean
2. byte
3. short
4. int
5. long
6. double
7. float
8. char

Answer 5 :- An identifier is a name given to a package, class, interface, method, or variable. All identifiers
            must have different names.

Answer 6 :- Operators in Java can be classified into 6 types:
            1. Arithmetic Operators
            2. Relational Operators
            3. Logical Operators
            4. Assignment Operators
            5. Unary Operators
            6. Bitwise Operators

Answer 7 :- Increment Operator (++)
            The increment (++) operator (also known as increment unary operator) in Java is used to increase the value of a variable by 1. Since it is a type of a unary operator, it can be          
            used with a single operand. 

            Syntax
            The syntax for increment operator is a pair of addition signs ie;
            ++x;
            x++;
           The operator can be applied either before or after the variable. Both will have the same increment of 1. However, they both have separate uses and can be categorized as the      
           following types. 
           Pre-Increment Operator
           Post-Increment Operator
examples of Increment operator


public class IncrementOperator {

	public static void main(String[] args) {

		int variable = 15;
		// after using increment operator
		variable++; 	 //  increments 1, variable = 16
		System.out.println("variable++ = " + variable);

		++variable;		//  increments 1, variable = 17
		System.out.println("++variable = " + variable);
	}
}


Decrement Operator (--)
Decrement as the name implies is used to reduce the value of a variable by 1. It is also one of the unary operator types, so it can be used with a single operand. 
Syntax
The syntax for decrement operator is a pair of negative signs ie;

--x;
x--;

Just like the increment operator, the decrement (--) operator can also be applied before and after the variable. Both will result in the same decrement of 1. They both have distinct uses and can be diverged in the further types. 
Pre-Decrement Operator
Post-Decrement Operator

example of Decrement operator 

public class PreDecrementOperator {

	public static void main(String[] args) {

		int variable = 11;
		// using preDecrement operator
		int preDecrement = --variable;

            // variable = 10
		System.out.println("variable = " + variable);
            // preDecrement = 10
		System.out.println("preDecrement = " + preDecrement);
            // preDecrement = 9
		System.out.println("--preDecrement = " + --preDecrement);  	}
}
Output
Original value of