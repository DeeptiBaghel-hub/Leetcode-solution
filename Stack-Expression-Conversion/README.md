# 🔄 Expression Conversion in Java

A collection of Java implementations for converting mathematical expressions between **Infix, Prefix, and Postfix** notations using stacks.

## 📌 Table of Contents

- [Introduction](#-introduction)
- [Expression Notations](#-expression-notations)
- [All Six Conversions](#-all-six-conversions)
- [Quick Tricks to Remember](#-quick-tricks-to-remember)
- [Operator Precedence](#-operator-precedence)
- [Time and Space Complexity](#-time-and-space-complexity)
- [Key Learnings](#-key-learnings)

## 📖 Introduction

Expression conversion is a fundamental stack-based problem in Data Structures and Algorithms (DSA).

This project covers all six conversions:

1. Infix to Postfix
2. Infix to Prefix
3. Postfix to Infix
4. Prefix to Infix
5. Postfix to Prefix
6. Prefix to Postfix

Each conversion is implemented in Java using the `Stack` data structure.

## 🧠 Expression Notations

### 1. Infix

The operator appears between the operands.

Example:
```text
A + B
```

### 2. Prefix (Polish Notation)

The operator appears before the operands.

Example:
```text
+AB
```

### 3. Postfix (Reverse Polish Notation)

The operator appears after the operands.

Example:
```text
AB+
```

## 🔁 All Six Conversions

| Conversion | Example Input | Example Output |
|---|---|---|
| Infix → Postfix | `A+B*C` | `ABC*+` |
| Infix → Prefix | `A+B*C` | `+A*BC` |
| Postfix → Infix | `AB+C*` | `((A+B)*C)` |
| Prefix → Infix | `*+AB-CD` | `((A+B)*(C-D))` |
| Postfix → Prefix | `AB+C*` | `*+ABC` |
| Prefix → Postfix | `*+AB-CD` | `AB+CD-*` |

## 💡 Quick Tricks to Remember

### Infix Conversions

**Infix → Postfix**
- Traverse from left to right.
- Send operands directly to the output.
- Use a stack for operators and parentheses.
- Pop operators according to precedence and associativity.

**Infix → Prefix**
- Reverse the infix expression.
- Swap opening and closing parentheses.
- Convert the reversed expression to postfix using the adjusted associativity rule.
- Reverse the postfix result.

### Postfix and Prefix Conversions

| Conversion | Traversal | Operand Pop Order | Expression Construction |
|---|---|---|---|
| Postfix → Infix | Left → Right | Right, Left | `(left op right)` |
| Prefix → Infix | Right → Left | Left, Right | `(left op right)` |
| Postfix → Prefix | Left → Right | Right, Left | `op + left + right` |
| Prefix → Postfix | Right → Left | Left, Right | `left + right + op` |

### Easy Memory Rule

- **Postfix:** scan left to right.
- **Prefix:** scan right to left.
- **Infix:** use operator precedence and a stack.
- **Infix → Prefix:** reverse, swap brackets, convert, reverse.
- Always preserve the correct order of the left and right operands.

## ⚖️ Operator Precedence

| Operator | Precedence | Associativity |
|---|---:|---|
| `^` | 3 (Highest) | Right to Left |
| `*`, `/` | 2 | Left to Right |
| `+`, `-` | 1 (Lowest) | Left to Right |

**Important:** Associativity matters when operators have equal precedence. For example, `A^B^C` is interpreted as `A^(B^C)`.

## ⏱️ Time and Space Complexity

Let `n` be the length of the input expression.

| Conversion | Time Complexity | Auxiliary Space |
|---|---|---|
| Infix → Postfix | O(n) | O(n) |
| Infix → Prefix | O(n) | O(n) |
| Postfix → Infix | O(n) | O(n) |
| Prefix → Infix | O(n) | O(n) |
| Postfix → Prefix | O(n) | O(n) |
| Prefix → Postfix | O(n) | O(n) |

Each character is processed a constant number of times, and the stack can hold up to O(n) elements.

## 📚 Key Learnings

- Understanding the differences between infix, prefix, and postfix expressions.
- Using stacks to solve expression-conversion problems.
- Handling operator precedence and associativity.
- Understanding why prefix and postfix conversions use different traversal directions.
- Preserving operand order when processing operators.
- Applying stack concepts to common DSA problems.

## 🛠️ Technologies Used

- **Language:** Java
- **Data Structure:** Stack
- **Concepts:** Expression Parsing, Operator Precedence, Associativity

## 🚀 How to Use

1. Clone or download this repository.
2. Open the Java source file in your preferred IDE.
3. Choose the conversion method you want to test.
4. Provide a valid expression and print the returned result.

> **Note:** The provided implementations assume valid expressions with single-character operands. Multi-digit numbers and multi-character identifiers require tokenization.

## 👨‍💻 Purpose

This project is created for DSA practice, coding interview preparation, and quick revision of stack-based expression-conversion problems.

---

⭐ If this repository helps you understand expression conversion, consider giving it a star!
