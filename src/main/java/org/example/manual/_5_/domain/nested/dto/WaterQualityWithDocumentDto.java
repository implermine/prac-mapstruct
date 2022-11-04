/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.example.manual._5_.domain.nested.dto;

/**
 *
 * @author Sjaak Derksen
 */
public class WaterQualityWithDocumentDto {

    private WaterQualityReportDto document;

    public WaterQualityReportDto getDocument() {
        return document;
    }

    public void setDocument(WaterQualityReportDto document) {
        this.document = document;
    }

}
