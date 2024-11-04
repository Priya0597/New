package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport{
	
		public static void generateJvm(String jsonPath) {
			File f=new File("Reports\\Jvm");
			Configuration c=new Configuration(f, "FaceBook");
			List<String>l=new ArrayList();
			l.add(jsonPath);
			ReportBuilder r=new ReportBuilder(l, c);
			r.generateReports();

		}
	
	
	
	
	
}
