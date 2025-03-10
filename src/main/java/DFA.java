
/*A class that models DFAs. States are just strings while labels
 * are characters. 
 */

import java.util.*;

public class DFA {
    private Set<String> states; //set of states
    private String firstState; //initial state
    private Set<String> finalStates; //set of final states
    private Map<String, Map<Character, String>> transitions; //transitions
    private String trapState; //trap state
    
    /*A constructor that builds a DFA with the set of state names 
     * given as arguments. 
     */
    public DFA(String[] states) {
        this.states = new HashSet<String>(Arrays.asList(states));
        this.finalStates = new HashSet<String>();
        this.transitions = new HashMap<String, Map<Character, String>>();
        this.trapState = "TRAP";
        for (String state : states) {
            transitions.put(state, new HashMap<>());
        }
    }

    /*Establish the initial state  */
    public void setInitialState(String state) {
        if (!states.contains(state)) {
            throw new IllegalArgumentException("State " + state + " is not in the DFA! Try adding it first!!");
        }
        this.firstState = state;
    }

    /*Mark a state in the DFA as final*/
    public void addFinalState(String state) {
        if (!states.contains(state)) {
            throw new IllegalArgumentException("State " + state + " is not in the DFA! Try adding it first!!");
        }
        finalStates.add(state);
    }

    // Method that adds a transition. 
    public void addTransition(String state, Character input, String nextState) {
        if (!states.contains(state) || !states.contains(nextState)) {
            throw new IllegalArgumentException("State " + state + " or " + nextState + " is not in the DFA! Try adding them first!!");
        }
        transitions.get(state).put(input, nextState);
    }

    /*Given an input string, this method outputs tru if the DFA accepts it.
     * Otherwise it outputs false. 
     */
    public boolean accept(String input) {
        if (firstState != null) {
            String actualState = firstState;
            for (char c : input.toCharArray()) {
                if (!transitions.containsKey(actualState) || !transitions.get(actualState).containsKey(c)) {
                    //no transition defined (so, its a TRAP!)
                    actualState = trapState;
                    break;
                }
                else actualState = transitions.get(actualState).get(c);
            }
            return finalStates.contains(actualState);
        }
        
        return false; //if there is no "firstState" defined, then the DFA is not ready to accept any input.
    }

}
