package com.swv.oscar.batch;
   
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swv.oscar.dataobject.batch.Ocse157;
import com.swv.oscar.dataobject.batch.Weo2nfyr;
import com.swv.oscar.dataobject.batch.Weo2p57a;
import com.swv.oscar.dataobject.batch.Weo2p57aBO;
import com.swv.oscar.dataobject.common.Global;
import com.swv.oscar.service.batch.IWeo2p57aService;
import com.swv.oscar.util.OscarLogger;

public class Weo2p57aBatch {

	 private static final OscarLogger LOGGER = OscarLogger.create(Weo2p57aBatch.class);

   @Autowired
   IWeo2p57aService iWeo2p57aService;

   public void launchBatch() {
      ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
      long startTime = new Date().getTime();
      try {
    	  iWeo2p57aService = (IWeo2p57aService) applicationContext.getBean("iWeo2p57aService");
    	  Weo2p57aBO weo2p57aBOReq = new Weo2p57aBO();
    	  Weo2p57a weo2p57a = new Weo2p57a();
    	  Weo2nfyr weo2nfyr = new Weo2nfyr();
    	  Ocse157 ocse157 = new Ocse157();
    	  List<Weo2p57a> weo2p57aList = new LinkedList<Weo2p57a>();
    	  List<Weo2nfyr> weo2nfyrList  = new LinkedList<Weo2nfyr>();
    	  List<Ocse157> ocse157List  = new LinkedList<Ocse157>();
    	  weo2p57aList.add(weo2p57a);
    	  weo2nfyrList.add(weo2nfyr);
    	  ocse157List.add(ocse157);
    	  weo2p57aBOReq.setGlobal(new Global());
    	  weo2p57aBOReq.setWeo2p57a(weo2p57aList);
    	  weo2p57aBOReq.setWeo2nfyr(weo2nfyrList);
    	  weo2p57aBOReq.setOcse157(ocse157List);
    	  weo2p57aBOReq.getGlobal().setgProgram("BATCH");
    	  iWeo2p57aService.execute(weo2p57aBOReq);
         // Parse the XML file.
         long endTime = new Date().getTime();
         double execTime = Double.longBitsToDouble((endTime - startTime) / 1000L); // sec
         int mins = (int) (execTime / 60);
         int sec = (int) execTime % 60;
         LOGGER.info("Start Time : " + startTime);
         LOGGER.info("End Time : " + endTime);
         LOGGER.info("Exec Time : " + +mins + " mins & " + sec + " seconds");
      } catch (Exception e) {
         LOGGER.error(e);
      }
   }

   public static void main(String[] args) {
	   Weo2p57aBatch batch = new Weo2p57aBatch();
      batch.launchBatch();
   }
}
