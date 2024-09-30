package com.dhruv.creator;

import com.dhruv.model.Message;
import com.dhruv.model.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
