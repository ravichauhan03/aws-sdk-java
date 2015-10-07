/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * 
 */
public class GetComplianceSummaryByConfigRuleResult implements Serializable, Cloneable {

    /**
     * The number of AWS Config rules that are compliant and the number that
     * are noncompliant, up to a maximum of 25 for each.
     */
    private ComplianceSummary complianceSummary;

    /**
     * The number of AWS Config rules that are compliant and the number that
     * are noncompliant, up to a maximum of 25 for each.
     *
     * @return The number of AWS Config rules that are compliant and the number that
     *         are noncompliant, up to a maximum of 25 for each.
     */
    public ComplianceSummary getComplianceSummary() {
        return complianceSummary;
    }
    
    /**
     * The number of AWS Config rules that are compliant and the number that
     * are noncompliant, up to a maximum of 25 for each.
     *
     * @param complianceSummary The number of AWS Config rules that are compliant and the number that
     *         are noncompliant, up to a maximum of 25 for each.
     */
    public void setComplianceSummary(ComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
    }
    
    /**
     * The number of AWS Config rules that are compliant and the number that
     * are noncompliant, up to a maximum of 25 for each.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param complianceSummary The number of AWS Config rules that are compliant and the number that
     *         are noncompliant, up to a maximum of 25 for each.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetComplianceSummaryByConfigRuleResult withComplianceSummary(ComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getComplianceSummary() != null) sb.append("ComplianceSummary: " + getComplianceSummary() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getComplianceSummary() == null) ? 0 : getComplianceSummary().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetComplianceSummaryByConfigRuleResult == false) return false;
        GetComplianceSummaryByConfigRuleResult other = (GetComplianceSummaryByConfigRuleResult)obj;
        
        if (other.getComplianceSummary() == null ^ this.getComplianceSummary() == null) return false;
        if (other.getComplianceSummary() != null && other.getComplianceSummary().equals(this.getComplianceSummary()) == false) return false; 
        return true;
    }
    
    @Override
    public GetComplianceSummaryByConfigRuleResult clone() {
        try {
            return (GetComplianceSummaryByConfigRuleResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    