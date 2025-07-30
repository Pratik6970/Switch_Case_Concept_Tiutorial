🔄 Switch-Case in Core Java
The switch-case statement is a control flow structure used to execute different blocks of code based on the value of a single variable or expression. It serves as a more readable and efficient alternative to writing multiple if-else statements.

🔹 How It Works:
A value (called the expression) is evaluated once.

The result is compared against a set of defined values called cases.

When a match is found, the code block under that case is executed.

An optional default block can handle any unmatched values.

🔹 Key Features:
Supports data types like int, char, byte, short, enum, and String (since Java 7).

Each case must be unique and match the type of the expression.

Execution typically ends with a break to prevent "fall-through" (accidental execution of subsequent cases).

The default case is optional but recommended for completeness.

🔹 Use Cases:
Menu selection in console apps

Day-of-week handling

Command processing

Replacing long chains of if-else for single-variable conditions

✅ Improves code readability
✅ Easier maintenance compared to nested if-else
✅ Offers better performance in some scenarios
