package org.example.domain.fish.dto;

public class WaterQualityReportDto {

    private WaterQualityOrganisationDto organisation;
    private String verdict;

    public WaterQualityOrganisationDto getOrganisation() {
        return organisation;
    }

    public void setOrganisation(WaterQualityOrganisationDto organisation) {
        this.organisation = organisation;
    }

    public String getVerdict() {
        return verdict;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

}