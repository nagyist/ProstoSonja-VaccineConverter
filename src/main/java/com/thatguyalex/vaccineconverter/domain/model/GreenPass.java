package com.thatguyalex.vaccineconverter.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GreenPass {

    private String dataPayload;
    private String dataId;
    private String firstName, lastName;
    private String dosesNeeded, dosesGiven;
    private String dateOfBirth, dateOfPass;
    private String vaccineType;

}
