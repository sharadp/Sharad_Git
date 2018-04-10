package com.swv.oscar.dataobject.batch;

import java.io.Serializable;
import java.util.List;

import com.swv.oscar.dataobject.common.BaseBO;

/*************************************************************************
 *
 * SWV CONFIDENTIAL
 * _________________________________________________________________________________
 *
 * SWV is a trademark of SWV Company.
 *
 * Copyright © 2017 SWV. All rights reserved.
 *
 * NOTICE: All information contained herein is, and remains the property of SWV
 * and its suppliers, if any. The intellectual and technical concepts contained
 * herein are proprietary to SWV and its suppliers and may be covered by U.S.
 * and Foreign Patents, patents in process, and are protected by trade secret or
 * copyright law. Dissemination of this information or reproduction of this
 * material is strictly forbidden unless prior written permission is obtained
 * from SWV.
 *
 *************************************************************************/
// Author : Generated by ATMA ®
// Revision History :
public class Weo0nenvBO extends BaseBO implements Serializable {

    private List<Weo0nenv> weo0nenv;
    public List<Weo0nenv> getWeo0nenv() {
        return weo0nenv;
    }

    public void setWeo0nenv(List<Weo0nenv> weo0nenv ) {
        this.weo0nenv = weo0nenv;
    }

    @Override
    public String toString() {
        return "Weo0nenvBO [weo0nenv =" + weo0nenv+ "]";
    }
}