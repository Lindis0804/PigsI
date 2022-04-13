package com.ldh.newpig;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.util.ArrayList;

public class td_fragment_bao_cao_theo_tuan extends Fragment {
    BarChart barChart;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_theo_doi_bao_cao_theo_tuan,container,false);
        barChart  = view.findViewById(R.id.barChart);
        barChart.setMaxVisibleValueCount(40);
        setData();
        Legend l = barChart.getLegend();
        l.setFormSize(8f);
        l.setFormToTextSpace(4f);
        l.setXEntrySpace(6f);
        return view;
    }
    public void setData(){
        ArrayList<BarEntry> yValues = new ArrayList<>();

        yValues.add(new BarEntry(2,new float[]{9,14,20}));
        yValues.add(new BarEntry(3,new float[]{12,7,8}));
        yValues.add(new BarEntry(4,new float[]{5,5,14}));
        yValues.add(new BarEntry(5,new float[]{4,4,4}));
        yValues.add(new BarEntry(6,new float[]{7,7,10}));
        yValues.add(new BarEntry(7,new float[]{8,8,48}));
        yValues.add(new BarEntry(8,new float[]{12,15,12}));
        BarDataSet set1;
        set1 = new BarDataSet(yValues,"");
        set1.setDrawIcons(false);
        set1.setValueTextColor( Color.WHITE);
        set1.setValueTextSize(7);
        set1.setStackLabels(new String[]{"Số phôi đẻ","Số phôi mang thai","Số phôi sấy"});
        //set 3 màu cho stack bar
        set1.setColors(getColor());
        barChart.getLegend().setTextColor(Color.WHITE);
        // chỉnh sửa màu dữ liệu chú thích
        barChart.getXAxis().setTextColor(Color.WHITE);
        barChart.getAxisLeft().setTextColor(Color.WHITE);
        barChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        barChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(){
            @Override
            public String getFormattedValue(float value) {
                if ((int) value !=8){
                    return "T"+(int) value;
                }
                else{
                    return "CN";
                }
            }
        });
        BarData barData = new BarData(set1);
        barChart.setData(barData);
        barChart.setFitBars(true);
        barChart.invalidate();
    }
    private int[] getColor(){
        int [] colors = new int [3];
        System.arraycopy(ColorTemplate.COLORFUL_COLORS,0,colors,0,3);
        return colors;
    }
}
