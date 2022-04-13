package com.ldh.newpig;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class td_fragment_qldt extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        BarChart barChart;
        View view = inflater.inflate(R.layout.fragment_theo_doi_qldt,container,false);
        barChart = view.findViewById(R.id.barChart);
        ArrayList<BarEntry> profitList = new ArrayList<>();
        profitList.add(new BarEntry(2,446));
        profitList.add(new BarEntry(3,258));
        profitList.add(new BarEntry(4,382));
        profitList.add(new BarEntry(5,458));
        profitList.add(new BarEntry(6,413));
        profitList.add(new BarEntry(7,307));
        profitList.add(new BarEntry(8,432));
        BarDataSet barDataSet = new BarDataSet(profitList,"");
        int [] colors = new int [] {R.color.green,R.color.blood_red,R.color.green,R.color.cyan,R.color.cyan,R.color.cyan,R.color.cyan};
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        Log.v("TAG",ColorTemplate.COLORFUL_COLORS+"");
        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(0.9f);
        barChart.setData(barData);
        String [] days = new String[] {"T2","T3","T4","T5","T6","T7","T8"};
        XAxis xAxis = barChart.getXAxis();
        xAxis.setTextColor(Color.WHITE);
        xAxis.setValueFormatter(new MyXAxisValueFormatter(days));
        barChart.animate();
        barChart.getBarData().setValueTextColor(Color.WHITE);
        return view;
    }
    public class MyXAxisValueFormatter extends ValueFormatter implements IAxisValueFormatter{
        private String [] mValues;

        public MyXAxisValueFormatter(String[] mValues) {
            this.mValues = mValues;
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            return mValues[(int)value];
        }
    }
}
