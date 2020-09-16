package com.shoshonearnold.SpringPractice2.OpenClosedDemo;

public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
