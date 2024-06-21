/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Set's the data for line-chart.
 *   Project:  Line chart.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437 
 *********************************************************************************************/



package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class MainController {
	
	@FXML LineChart <String,Number>linechart;
	
	public void btn(ActionEvent event) {
		XYChart.Series<String,Number> series=new XYChart.Series<String,Number>();
		series.getData().add(new XYChart.Data<String, Number>("JAN",200));
		series.getData().add(new XYChart.Data<String, Number>("FEB",100));
		series.getData().add(new XYChart.Data<String, Number>("MAR",20));
		series.getData().add(new XYChart.Data<String, Number>("APR",50));
		series.getData().add(new XYChart.Data<String, Number>("MAY",600));
		linechart.getData().add(series);
	}

}
