Convert infix expression into postfix expression

*Input*:

a+b*c


*Output*:

abc*+


__*Note*__: Logic should pass all possible testcases



**Method**:
- Scan the infix expression from left to right.
- If the scanned character is an operand, output it.
- Else,
  * If the precedence of the scanned operator is greater than the precedence of the operator in the stack(or the stack is empty), push it.
  * Else, Pop the operator from the stack until the precedence of the scanned operator is less-equal to the precedence of the operator residing on the top of the stack. Push the scanned operator to the stack.
- If the scanned character is an ‘(‘, push it to the stack.
- If the scanned character is an ‘)’, pop and output from the stack until an ‘(‘ is encountered.
- Repeat steps 2-6 until infix expression is scanned.
- Pop and output from the stack until it is not empty.

