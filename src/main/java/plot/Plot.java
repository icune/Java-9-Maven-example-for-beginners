package plot;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
//	https://stackoverflow.com/questions/16714738/xy-plotting-with-java
public class Plot extends ApplicationFrame {
	public Plot(final String title) {

	    super(title);
	    final XYSeries series = new XYSeries("Random Data");
	    series.add(1.0, 500.2);
	    series.add(5.0, 694.1);
	    series.add(4.0, 100.0);
	    series.add(12.5, 734.4);
	    series.add(17.3, 453.2);
	    series.add(21.2, 500.2);
	    series.add(21.9, null);
	    series.add(25.6, 734.4);
	    series.add(30.0, 453.2);
	    final XYSeriesCollection data = new XYSeriesCollection(series);
	    final JFreeChart chart = ChartFactory.createXYLineChart(
	        "XY Series Demo",
	        "X", 
	        "Y", 
	        data,
	        PlotOrientation.VERTICAL,
	        true,
	        true,
	        false
	    );

	    final ChartPanel chartPanel = new ChartPanel(chart);
	    chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
	    setContentPane(chartPanel);
	}
	public void doit(){
		this.pack();
	    RefineryUtilities.centerFrameOnScreen(this);
	    this.setVisible(true);
	}
}
