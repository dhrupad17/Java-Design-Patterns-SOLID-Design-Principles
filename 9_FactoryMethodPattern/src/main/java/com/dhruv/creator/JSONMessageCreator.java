package com.dhruv.creator;

import com.dhruv.model.JSONMessage;
import com.dhruv.model.Message;

public class JSONMessageCreator extends MessageCreator{

    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}
