# **Construction and Implementation of an Interpreter Based on Deterministic Finite Automata**

## **Project Overview**
The goal of this project is to implement a **Deterministic Finite Automaton (DFA)** capable of recognizing specific languages based on predefined transition rules. The DFA is constructed using a set of states, an initial state, final states, and transition functions. Additionally, undefined transitions are handled by redirecting them to a trap state.

As part of the assignment, each team member designed a unique DFA specification that recognizes a specific language. These specifications are stored in separate files:  
- `dfa-member1.txt`  
- `dfa-member2.txt`  
- `dfa-member3.txt`  

To ensure correctness, we wrote individual test cases for each DFA, verifying that they accept or reject input strings as expected.

This assignment provided valuable hands-on experience in formal language processing and automata implementation. By defining, testing, and refining our DFAs, we reinforced our understanding of **finite state machines** and their real-world applications.

## **Members' Contribution**
All team members collaborated on implementing the `DFA.java` class, ensuring that the automaton correctly processes input strings according to the given transition rules. We designed its structure, defined the states and transitions, and handled missing transitions by redirecting them to a trap state. Throughout development, we tested multiple cases to verify that the DFA functioned as expected.

Additionally, each member was responsible for defining and testing a specific DFA specification:

- **Joel**: Developed `dfa-member1.txt`, implementing a DFA that recognizes binary strings that **begin with `1` and end with `0`**.  
- **Mohamed**: Developed `dfa-member2.txt`, implementing a DFA that recognizes binary strings that **contain at least three `1`s**, not necessarily consecutive.  
- **Pau**: Developed `dfa-member3.txt`, implementing a DFA that recognizes binary strings with **at least three characters where the third symbol is `0`**.  

Each DFA was tested individually using predefined input cases to ensure that they correctly accept or reject strings.
