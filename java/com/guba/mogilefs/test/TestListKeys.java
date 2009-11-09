/*
 * Created on Jun 27, 2005
 *
 * copyright ill.com 2005
 */
package com.guba.mogilefs.test;

import org.apache.log4j.BasicConfigurator;

import com.guba.mogilefs.MogileFS;
import com.guba.mogilefs.PooledMogileFSImpl;

/**
 * @author victor igumnov
 * 
 */
public class TestListKeys {

	//    private static Logger log = Logger.getLogger(TestMogileFS.class);

	public static void main(final String[] args) {
		BasicConfigurator.configure();

		try {
			MogileFS mfs = new PooledMogileFSImpl("fab40",
					new String[] { "fab2:6001" }, 5, 5, 10000);

			for(String key : (String[])mfs.listKeys("video:100")[0]) {
				System.out.println(key);
			}

			//log.debug("success!");

		} catch (Exception e) {
			//log.error("top level exception", e);
		}
	}

}
