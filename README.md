# Title
Construction and Implementation of an Interpreter Based on Deterministic Finite Automata 

# Project Overview
The main goal of this project is to implement a DFA capable of recognizing specific languages based on predefined transition rules. It is constructed using a set of states, an initial state, final states, and transition functions. Additionally, it handles undefined transitions by introducing a trap state.

As part of the assignment, each team member designed a DFA specification that recognizes a specific language. These specifications are defined in separate files (dfa-member1.txt, dfa-member2.txt and dfa-member3.txt). Then, we wrote individual test cases to validate the correctness of each DFA, ensuring that they correctly accept or reject input strings according to the defined rules.

Throughout this assigment, we gained hands-on experience in formal language processing and automata implementation, applying theoretical concepts to practical problem-solving. By defining, testing, and refining our DFAs, we ensured their correctness and robustness, reinforcing our understanding of finite state machines and their applications.   

# Members contriubution
All team members collaborated on implementing the *DFA.java* class, ensuring that the automaton correctly processes input strings according to the given transition rules. We designed its structure, defined the states and transitions, and handled missing transitions by redirecting them to a trap state. Throughout the development, we tested multiple cases to verify that the DFA functioned as expected.

In addition, each member was responsible for defining and testing a specific DFA specification:
  **Mohamed**: Developed *dfa-member2.txt*, implementing a DFA for recognizing binary strings that contain at least three 1s, not necessarily consecutive.
  **Joel**: Developed *dfa-member1.txt*, implementing a DFA for recognizing binary strings that begin with 1 and end with 0.
  **Pau**: Developed *dfa-member3.txt*, implementing a DFA for recognizing binary strings of at least three characters where the third symbol is 0.
  
Each DFA was tested individually using predefined input cases to verify that it accepts and rejects strings correctly. 