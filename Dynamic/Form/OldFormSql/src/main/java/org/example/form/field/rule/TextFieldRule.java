package org.example.form.field.rule;

import org.example.form.dto.request.FieldDataRequest;
import org.example.form.entity.FieldTemplate;
import org.example.form.enums.FieldTypeEnum;
import org.example.form.exception.CustomException;
import org.example.form.field.operation.TextFieldOperation;

import java.util.Optional;

public class TextFieldRule extends AbstractFieldRule {

    @Override
    public Boolean check(FieldTemplate fieldTemplate, Optional<FieldDataRequest> fieldDataRequest) {
        return  fieldTemplate.getType().equals(FieldTypeEnum.TEXT_FIELD);
    }

    @Override
    public Object execute(FieldTemplate fieldTemplate, FieldDataRequest fieldDataRequest) throws CustomException {
        TextFieldOperation textFieldOperation = new TextFieldOperation(fieldTemplate, fieldDataRequest.getInput(), false);
        textFieldOperation.errorIsRequired();
        return textFieldOperation.getInput();
    }
}
