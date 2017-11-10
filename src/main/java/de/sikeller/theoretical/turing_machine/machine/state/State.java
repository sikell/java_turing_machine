package de.sikeller.theoretical.turing_machine.machine.state;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class State implements IState {

    private String name;

}
