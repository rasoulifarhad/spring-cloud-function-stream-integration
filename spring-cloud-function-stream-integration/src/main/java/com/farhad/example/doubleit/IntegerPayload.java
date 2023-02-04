package com.farhad.example.doubleit;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of", onConstructor_ = @JsonCreator)
public class IntegerPayload {
    
    private Integer integer;

}
