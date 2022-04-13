package com.ldh.newpig;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import org.w3c.dom.Entity;

import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

public class td_frament_sl_heo_tiem_vaccine extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_theo_doi_sl_heo_tiem_vc,container,false);
        LineChart lineChart = view.findViewById(R.id.lineChart);
       // lineChart.setOnChartGestureListener();
        lineChart.setDragEnabled(true);
        lineChart.setScaleEnabled(false);
        lineChart.setMinimumWidth(1);
        ArrayList<Entry> yValues =  new ArrayList<>();

        yValues.add(new Entry(2,5));
        yValues.add(new Entry(3,24));
        yValues.add(new Entry(4,18));
        yValues.add(new Entry(5,24));
        yValues.add(new Entry(6,46));
        LineDataSet set1 = new LineDataSet(yValues,"Số lượng heo được tiêm vaccin");
        set1.setFillAlpha(100);
        //thay đổi dữ liệu trên đường line
        set1.setValueTextColor(Color.WHITE);
        set1.setColor(Color.WHITE);
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);
        LineData data = new LineData(dataSets);
        lineChart.setData(data);
        //thay đổi màu của chú thích
        lineChart.getLegend().setTextColor(Color.WHITE);
        //thay đổi data trên đường line
        lineChart.getData().setValueTextColor(Color.WHITE);
        //thay đổi màu của cột số
        YAxis leftAxis = lineChart.getAxisLeft();
        leftAxis.setTextColor(Color.WHITE);
        // thay đổi màu hàng số
        lineChart.getXAxis().setTextColor(Color.WHITE);
        //format lại giá trị Axis
       String values[] = new String [] {"2","3","4","5","6"};
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(){
            @Override
            public String getFormattedValue(float value) {
                return "10/"+(int) value;
            }
        });
        //format Lại giá trị trên line
        lineChart.getData().setValueFormatter(new IndexAxisValueFormatter(){
            @Override
            public String getFormattedValue(float value) {
                return (int) value +"";
            }
        });
        // cài đặt hiển thị cho dữ liệu hàng ngang
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        //thay đổi độ chia nhỏ nhất của line chart
        //độ chia nhỏ nhất: granularity
        xAxis.setGranularity(1f);
        return view;
    }
}
