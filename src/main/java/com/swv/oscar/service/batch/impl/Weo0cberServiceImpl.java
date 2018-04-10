package com.swv.oscar.service.batch.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swv.oscar.dataobject.batch.Weo0cberBO;
import com.swv.oscar.dataobject.common.BaseBO;
import com.swv.oscar.exceptions.OscarBusinessException;
import com.swv.oscar.repositories.IWeo0cberRepository;
import com.swv.oscar.service.batch.IWeo0cberService;
import com.swv.oscar.util.MappingHelper;
import com.swv.oscar.util.OscarLogger;

/*************************************************************************
 *
 * SWV CONFIDENTIAL
 * _________________________________________________________________________________
 *
 * SWV is a trademark of SWV Company.
 *
 *Copyright © 2017 SWV. All rights reserved.
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
@Service
public class Weo0cberServiceImpl implements  IWeo0cberService {

	private static final OscarLogger LOGGER = OscarLogger.create(Weo0cberServiceImpl.class);

	@Autowired
	private IWeo0cberRepository weo0cberRepository;

	public void setWeo0cberRepository(IWeo0cberRepository weo0cberRepository) {
		this.weo0cberRepository = weo0cberRepository;
	}

	String query = null;
	/**
	 * Method execute
	 * @param weo0cberBOReq
	 * @return weo0cberBOResp
	 * @throws OscarBusinessException
	 */
	public Weo0cberBO execute(BaseBO weo0cberBOReq) throws OscarBusinessException {
		LOGGER.debug("Request: "+weo0cberBOReq);
		Weo0cberBO weo0cberBOResp = null;
		try {
			weo0cberBOResp =  new Weo0cberBO();
			// Weo0cber weo0cber = (Weo0cber) weo0cberBOReq.getFirst(weo0cberBOReq.getWeo0cber());
			// WEO0CBER
			//
			// Weo0ncts weo0ncts  = new Weo0ncts();
			// weo0ncts.execute(weo0cber.getgStartTime());

			weo0cberBOReq.getGlobal().setgEndTime(MappingHelper.getCurrentTimestamp());
			query = "UPDATE WEOVRESTART_DATA2 SET  RUN_DATE = '" + MappingHelper.getFormattedDate(weo0cberBOReq.getGlobal().getgTodaysDt(),"YYYY-MM-dd") +"', START_TIME = '" + weo0cberBOReq.getGlobal().getgStartTime()+ "', END_TIME = '" + weo0cberBOReq.getGlobal().getgEndTime() + "' WHERE PROGRAM_NAME = '" + weo0cberBOReq.getGlobal().getgProgram()+"'";
			weo0cberBOResp = weo0cberRepository.executeUpdateQuery0(query);
		} catch (Exception ex) {
			LOGGER.error("Error:" + ex);
			throw new OscarBusinessException(ex);
		}
		LOGGER.debug("Response:"+weo0cberBOResp);
		return weo0cberBOResp;
	}
}