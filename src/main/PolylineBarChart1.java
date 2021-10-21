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

public class PolylineBarChart1 {
	

	static String loginID;


	public static void main(final String[] args) {
		
		System.out.println("student main 에서 PolylineBarChart1 으로 아이디 넘어오는지 확인 >> " + loginID);

	}

	public JFreeChart getChart() {

		// 데이터 생성

		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset(); // bar chart 1

		DefaultCategoryDataset dataset12 = new DefaultCategoryDataset(); // bar chart 2

		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset(); // line chart 1

		// 데이터 입력 ( 값, 범례, 카테고리 )

		// 그래프 1

//		dataset1.addValue(11.0, "S1", "Ch1");
//
//		dataset1.addValue(14.0, "S1", "Ch2");
//
//		dataset1.addValue(5.0, "S1", "Ch3");
//
//		dataset1.addValue(6.0, "S1", "Ch4");
//
//		dataset1.addValue(8.0, "S1", "Ch5");
//
//		dataset1.addValue(7.0, "S1", "Ch6");
//
//		dataset1.addValue(7.0, "S1", "Ch7");
//
//		dataset1.addValue(9.0, "S1", "Ch8");
//
//		dataset1.addValue(0, "S1", "Ch9");
//
//		dataset1.addValue(0, "S1", "Ch10");
//
//		dataset1.addValue(0, "S1", "etc");
//
//		dataset1.addValue(0, "S1", "etc");

		// 그래프 2

//		dataset12.addValue(0, "S2", "1월");
//
//		dataset12.addValue(0, "S2", "2월");
//
//		dataset12.addValue(0, "S2", "3월");
//
//		dataset12.addValue(0, "S2", "4월");
//
//		dataset12.addValue(0, "S2", "5월");
//
//		dataset12.addValue(0, "S2", "6월");
//
//		dataset12.addValue(0, "S2", "7월");
//
//		dataset12.addValue(0, "S2", "8월");
//
//		dataset12.addValue(6.0, "S2", "9월");
//
//		dataset12.addValue(0, "S2", "10월");
//
//		dataset12.addValue(0, "S2", "11월");
//
//		dataset12.addValue(0, "S2", "12월");

		// 그래프 3
//		
		GetScore_DAO all = new GetScore_DAO();
		int chapterScore = 0;
		String chapter = "ja0";
		// DB 에 chapter 이름이 01, 02 이렇게 되어 있는데, 이걸 1,2,3,4,5 로 바꿔주면서 간단하게 만들기
		// 통합시키기
		
		for (int i = 1; i <= 10; i++) {
			
			chapter += i;
			chapter = (chapter.equals("ja010")) ? "ja10" : chapter;
			System.out.println(chapter);
			chapterScore = all.getChapterScore(loginID, chapter);
			System.out.println(chapterScore);
			
			dataset2.addValue(chapterScore, "자바 성적", chapter);

			chapter = "ja0";
			
			
		}		
		
//		dataset2.addValue(10.0, "자바 성적", "Ch1");
//
//		dataset2.addValue(11.0, "자바 성적", "Ch2");
//
//		dataset2.addValue(12.0, "자바 성적", "Ch3");
//
//		dataset2.addValue(8.0, "자바 성적", "Ch4");
//
//		dataset2.addValue(7.0, "자바 성적", "Ch5");
//
//		dataset2.addValue(6.0, "자바 성적", "Ch6");
//
//		dataset2.addValue(5.0, "자바 성적", "Ch7");
//
//		dataset2.addValue(4.0, "자바 성적", "Ch8");
//
//		dataset2.addValue(3.0, "자바 성적", "Ch9");
//
//		dataset2.addValue(2.0, "자바 성적", "Ch10");
//
//		dataset2.addValue(11.0, "자바 성적", "etc");
//
//		dataset2.addValue(10.0, "자바 성적", "etc");

		// 렌더링 생성 및 세팅

		// 렌더링 생성

		final BarRenderer renderer = new BarRenderer();

		final BarRenderer renderer12 = new BarRenderer();

		final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();

		// 공통 옵션 정의

		final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();

		final ItemLabelPosition p_center = new ItemLabelPosition(

				ItemLabelAnchor.CENTER, TextAnchor.CENTER

		);

		final ItemLabelPosition p_below = new ItemLabelPosition(

				ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT

		);

		Font f = new Font("Gulim", Font.BOLD, 10);

		Font axisF = new Font("Gulim", Font.PLAIN, 10);

		// 렌더링 세팅

		// 그래프 1

		renderer.setBaseItemLabelGenerator(generator);

		renderer.setBaseItemLabelsVisible(true);

		renderer.setBasePositiveItemLabelPosition(p_center);

		renderer.setBaseItemLabelFont(f);

//	        renderer.setGradientPaintTransformer(new StandardGradientPaintTransformer(

//	                GradientPaintTransformType.VERTICAL));

//	        renderer.setSeriesPaint(0, new GradientPaint(1.0f, 1.0f, Color.white, 0.0f, 0.0f, Color.blue));

		renderer.setSeriesPaint(0, new Color(254, 238, 125));

		// 그래프 2

		renderer12.setSeriesPaint(0, new Color(43, 144, 217));

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

		renderer2.setSeriesPaint(0, new Color(90, 147, 103));

		renderer2.setSeriesStroke(0, new BasicStroke(

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
	