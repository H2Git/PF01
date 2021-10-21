package main;

import java.awt.BasicStroke;

import java.awt.Color;

import java.awt.Font;

import java.awt.GradientPaint;

import java.awt.Paint;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import org.jfree.chart.axis.CategoryAxis;

import org.jfree.chart.axis.CategoryLabelPositions;

import org.jfree.chart.axis.NumberAxis;

import org.jfree.chart.labels.CategoryItemLabelGenerator;

import org.jfree.chart.labels.ItemLabelAnchor;

import org.jfree.chart.labels.ItemLabelPosition;

import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;

import org.jfree.chart.plot.CategoryPlot;

import org.jfree.chart.plot.DatasetRenderingOrder;

import org.jfree.chart.plot.PlotOrientation;

import org.jfree.chart.renderer.category.BarRenderer;

import org.jfree.chart.renderer.category.CategoryItemRenderer;

import org.jfree.chart.renderer.category.LineAndShapeRenderer;

import org.jfree.chart.renderer.category.StandardBarPainter;

import org.jfree.chart.title.TextTitle;

import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.ui.GradientPaintTransformType;

import org.jfree.ui.HorizontalAlignment;

import org.jfree.ui.StandardGradientPaintTransformer;

import org.jfree.ui.TextAnchor;

/**
 * 
 * A simple demonstration application showing how to create a bar chart overlaid
 * 
 * with a line chart.
 * 
 */

public class PolylineBarChart3 {

	// Run As > Java Application 으로 실행하면 바로 확인할 수 있음.

	public static void main(final String[] args) {

//		Eg_PolylineBarChart demo = new Eg_PolylineBarChart();
//		JFreeChart chart = demo.getChart();
//
/////////////////////////////////////////////////////////////////////
////		ChartFrame frame1 = new ChartFrame("Bar Chart", chart);
////		frame1.setSize(800, 400);
////		frame1.setVisible(true);
/////////////////////////////////////////////////////////////////////
//		
//		JFrame frame = new JFrame();		
//		ChartPanel cp = new ChartPanel(chart);
//		frame.add(cp);
//		frame.setVisible(true);
//		frame.setSize(800, 400);

	}

	public JFreeChart getChart() {

		// 데이터 생성

		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset(); // bar chart 1

		DefaultCategoryDataset dataset12 = new DefaultCategoryDataset(); // bar chart 2

		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset(); // line chart 1

		DefaultCategoryDataset dataset3 = new DefaultCategoryDataset(); // line chart 2

		DefaultCategoryDataset dataset4 = new DefaultCategoryDataset(); // line chart 3

		DefaultCategoryDataset dataset5 = new DefaultCategoryDataset(); // line chart 4

		// 데이터 입력 ( 값, 범례, 카테고리 )

		// 그래프 1

		// 그래프 1

//		dataset1.addValue(1.0, "S1", "Ch1");
//
//		dataset1.addValue(4.0, "S1", "Ch2");
//
//		dataset1.addValue(3.0, "S1", "Ch3");
//
//		dataset1.addValue(5.0, "S1", "Ch4");
//
//		dataset1.addValue(5.0, "S1", "Ch5");
//
//		dataset1.addValue(7.0, "S1", "Ch6");
//
//		dataset1.addValue(7.0, "S1", "Ch7");
//
//		dataset1.addValue(8.0, "S1", "Ch8");
//
//		dataset1.addValue(0, "S1", "Ch9");
//
//		dataset1.addValue(0, "S1", "Ch10");
//
//		dataset1.addValue(0, "S1", "etc");

//		dataset1.addValue(0, "S1", "etc");

//		 그래프 2
//
//		dataset12.addValue(8, "S2", "Ch1");
//
//		dataset12.addValue(9, "S2", "Ch2");
//
//		dataset12.addValue(4, "S2", "Ch3");
//
//		dataset12.addValue(5, "S2", "Ch4");
//
//		dataset12.addValue(2, "S2", "Ch5");
//
//		dataset12.addValue(6, "S2", "Ch6");
//
//		dataset12.addValue(9, "S2", "Ch7");
//
//		dataset12.addValue(5, "S2", "Ch8");
//
//		dataset12.addValue(6.0, "S2", "Ch9");
//
//		dataset12.addValue(7, "S2", "Ch10");
//
//		dataset12.addValue(7, "S2", "etc");
//
//		dataset12.addValue(7, "S2", "etc");

		// 그래프 3

		dataset2.addValue(10.0, "Java", "Ch1");

		dataset2.addValue(11.0, "Java", "Ch2");

		dataset2.addValue(12.0, "Java", "Ch3");

		dataset2.addValue(8.0, "Java", "Ch4");

		dataset2.addValue(7.0, "Java", "Ch5");

		dataset2.addValue(6.0, "Java", "Ch6");

		dataset2.addValue(5.0, "Java", "Ch7");

		dataset2.addValue(4.0, "Java", "Ch8");

		dataset2.addValue(3.0, "Java", "Ch9");

		dataset2.addValue(2.0, "Java", "Ch10");

		dataset2.addValue(11.0, "Java", "etc");

		dataset2.addValue(10.0, "Java", "etc");

		// 그래프 4

		dataset3.addValue(9.0, "Python", "Ch1");

		dataset3.addValue(14.0, "Python", "Ch2");

		dataset3.addValue(10.0, "Python", "Ch3");

		dataset3.addValue(15.0, "Python", "Ch4");

		dataset3.addValue(16.0, "Python", "Ch5");

		dataset3.addValue(11.0, "Python", "Ch6");

		dataset3.addValue(10.0, "Python", "Ch7");

		dataset3.addValue(19.0, "Python", "Ch8");

		dataset3.addValue(11.0, "Python", "Ch9");

		dataset3.addValue(8.0, "Python", "Ch10");

		dataset3.addValue(15.0, "Python", "etc");

		dataset3.addValue(14.0, "Python", "etc");

		// 그래프 5

		dataset4.addValue(11.0, "JSP", "Ch1");

		dataset4.addValue(17.0, "JSP", "Ch2");

		dataset4.addValue(9.0, "JSP", "Ch3");

		dataset4.addValue(19.0, "JSP", "Ch4");

		dataset4.addValue(19.0, "JSP", "Ch5");

		dataset4.addValue(11.0, "JSP", "Ch6");

		dataset4.addValue(13.0, "JSP", "Ch7");

		dataset4.addValue(17.0, "JSP", "Ch8");

		dataset4.addValue(9.0, "JSP", "Ch9");

		dataset4.addValue(8.0, "JSP", "Ch10");

		dataset4.addValue(16.0, "JSP", "etc");

		dataset4.addValue(14.0, "JSP", "etc");

		// 그래프 5

		dataset5.addValue(15.0, "R", "Ch1");

		dataset5.addValue(14.0, "R", "Ch2");

		dataset5.addValue(8.0, "R", "Ch3");

		dataset5.addValue(16.0, "R", "Ch4");

		dataset5.addValue(18.0, "R", "Ch5");

		dataset5.addValue(9.0, "R", "Ch6");

		dataset5.addValue(16.0, "R", "Ch7");

		dataset5.addValue(19.0, "R", "Ch8");

		dataset5.addValue(12.0, "R", "Ch9");

		dataset5.addValue(10.0, "R", "Ch10");

		dataset5.addValue(16.0, "R", "etc");

		dataset5.addValue(14.0, "R", "etc");

		// 렌더링 생성 및 세팅

		// 렌더링 생성

		final BarRenderer renderer = new BarRenderer();

		final BarRenderer renderer12 = new BarRenderer();

		final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();

		final LineAndShapeRenderer renderer3 = new LineAndShapeRenderer();

		final LineAndShapeRenderer renderer4 = new LineAndShapeRenderer();

		final LineAndShapeRenderer renderer5 = new LineAndShapeRenderer();

		final LineAndShapeRenderer renderer6 = new LineAndShapeRenderer();

		// 공통 옵션 정의

		final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();

		final ItemLabelPosition p_center = new ItemLabelPosition(

				ItemLabelAnchor.CENTER, TextAnchor.CENTER

		);

		final ItemLabelPosition p_below = new ItemLabelPosition(

				ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT

		);

		Font f = new Font("Gulim", Font.BOLD, 14);

		Font axisF = new Font("Gulim", Font.PLAIN, 14);

		// 렌더링 세팅

		// 그래프 1

		renderer.setBaseItemLabelGenerator(generator);

		renderer.setBaseItemLabelsVisible(true);

		renderer.setBasePositiveItemLabelPosition(p_center);

		renderer.setBaseItemLabelFont(f);

//	        renderer.setGradientPaintTransformer(new StandardGradientPaintTransformer(

//	                GradientPaintTransformType.VERTICAL));

//	        renderer.setSeriesPaint(0, new GradientPaint(1.0f, 1.0f, Color.white, 0.0f, 0.0f, Color.blue));

		renderer.setSeriesPaint(0, new Color(0, 162, 255));

		// 그래프 2

		renderer12.setSeriesPaint(0, new Color(232, 168, 255));

		renderer12.setBaseItemLabelFont(f);

		renderer12.setBasePositiveItemLabelPosition(p_center);

		renderer12.setBaseItemLabelGenerator(generator);

		renderer12.setBaseItemLabelsVisible(true);

		// 그래프 3

		renderer2.setBaseItemLabelGenerator(generator);

		renderer2.setBaseItemLabelsVisible(true);

		renderer2.setBaseShapesVisible(true);

		renderer2.setDrawOutlines(true);

		renderer2.setUseFillPaint(true);

		renderer2.setBaseFillPaint(Color.WHITE);

		renderer2.setBaseItemLabelFont(f);

		renderer2.setBasePositiveItemLabelPosition(p_below);

		renderer2.setSeriesPaint(0, new Color(219, 121, 22));

		renderer2.setSeriesStroke(0, new BasicStroke(

				2.0f,

				BasicStroke.CAP_ROUND,

				BasicStroke.JOIN_ROUND,

				3.0f)

		);

		// 그래프 4

		renderer3.setBaseItemLabelGenerator(generator);

		renderer3.setBaseItemLabelsVisible(true);

		renderer3.setBaseShapesVisible(true);

		renderer3.setDrawOutlines(true);

		renderer3.setUseFillPaint(true);

		renderer3.setBaseFillPaint(Color.WHITE);

		renderer3.setBaseItemLabelFont(f);

		renderer3.setBasePositiveItemLabelPosition(p_below);

		renderer3.setSeriesPaint(0, new Color(203, 232, 107));

		renderer3.setSeriesStroke(0, new BasicStroke(

				2.0f,

				BasicStroke.CAP_ROUND,

				BasicStroke.JOIN_ROUND,

				3.0f)

		);
		// 그래프 5

		renderer4.setBaseItemLabelGenerator(generator);

		renderer4.setBaseItemLabelsVisible(true);

		renderer4.setBaseShapesVisible(true);

		renderer4.setDrawOutlines(true);

		renderer4.setUseFillPaint(true);

		renderer4.setBaseFillPaint(Color.WHITE);

		renderer4.setBaseItemLabelFont(f);

		renderer4.setBasePositiveItemLabelPosition(p_below);

		renderer4.setSeriesPaint(0, new Color(232, 107, 107));

		renderer4.setSeriesStroke(0, new BasicStroke(

				2.0f,

				BasicStroke.CAP_ROUND,

				BasicStroke.JOIN_ROUND,

				3.0f)

		);

		// plot 생성

		final CategoryPlot plot = new CategoryPlot();

		// plot 에 데이터 적재

		plot.setDataset(dataset1);

		plot.setRenderer(renderer);

		plot.setDataset(1, dataset12);

		plot.setRenderer(1, renderer12);

		plot.setDataset(2, dataset2);

		plot.setRenderer(2, renderer2);

		plot.setDataset(3, dataset3);

		plot.setRenderer(3, renderer3);

		plot.setDataset(4, dataset4);

		plot.setRenderer(4, renderer4);

		// plot 기본 설정

		plot.setOrientation(PlotOrientation.VERTICAL); // 그래프 표시 방향

		plot.setRangeGridlinesVisible(true); // X축 가이드 라인 표시여부

		plot.setDomainGridlinesVisible(true); // Y축 가이드 라인 표시여부

		// 렌더링 순서 정의 : dataset 등록 순서대로 렌더링 ( 즉, 먼저 등록한게 아래로 깔림 )

		plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);

		// X축 세팅

		plot.setDomainAxis(new CategoryAxis()); // X축 종류 설정

		plot.getDomainAxis().setTickLabelFont(axisF); // X축 눈금라벨 폰트 조정

		plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.STANDARD); // 카테고리 라벨 위치 조정

		// Y축 세팅

		plot.setRangeAxis(new NumberAxis()); // Y축 종류 설정

		plot.getRangeAxis().setTickLabelFont(axisF); // Y축 눈금라벨 폰트 조정

		// 세팅된 plot을 바탕으로 chart 생성

		final JFreeChart chart = new JFreeChart(plot);

//	        chart.setTitle("Overlaid Bar Chart"); // 차트 타이틀

//	        TextTitle copyright = new TextTitle("JFreeChart WaferMapPlot", new Font("SansSerif", Font.PLAIN, 9));

//	        copyright.setHorizontalAlignment(HorizontalAlignment.RIGHT);

//	        chart.addSubtitle(copyright);  // 차트 서브 타이틀

		return chart;

	}

}