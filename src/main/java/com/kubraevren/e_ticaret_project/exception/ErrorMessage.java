package com.kubraevren.e_ticaret_project.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

    private MessageType messageType;
    private String offStatic;

    public String prepareErrorMessage(){
        StringBuilder builder=new StringBuilder();
        builder.append(messageType.getMessage());

        if(offStatic!=null){
            builder.append(" : " + offStatic);
        }
        return builder.toString();
    }

}
