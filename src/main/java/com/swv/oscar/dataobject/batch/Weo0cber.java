package com.swv.oscar.dataobject.batch;

import java.io.Serializable;

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
public class Weo0cber implements Serializable {

    private String gStartTime;
    private String gEndTime;
    private String gTodaysDt;
    private String gProgram;
    public String getgStartTime() {
        return gStartTime;
    }

    public void setgStartTime(String gStartTime ) {
        this.gStartTime = gStartTime;
    }

    public String getgEndTime() {
        return gEndTime;
    }

    public void setgEndTime(String gEndTime ) {
        this.gEndTime = gEndTime;
    }

    public String getgTodaysDt() {
        return gTodaysDt;
    }

    public void setgTodaysDt(String gTodaysDt ) {
        this.gTodaysDt = gTodaysDt;
    }

    public String getgProgram() {
        return gProgram;
    }

    public void setgProgram(String gProgram ) {
        this.gProgram = gProgram;
    }

    @Override
    public String toString() {
        return "Weo0cber [gStartTime =" + gStartTime + " ,gEndTime =" + gEndTime + " ,gTodaysDt =" + gTodaysDt + " ,gProgram =" + gProgram+ "]";
    }
}