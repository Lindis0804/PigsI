package com.ldh.newpig;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class td_fragment extends Fragment {
    PieChart pieChart,pieChart1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_bao_cao,container,false);
//        int [] colors = {R.color.cyan,R.color.light_blue};
//     pieChart = view.findViewById(R.id.pieChart);
//     ArrayList<PieEntry> foodList = new ArrayList<>();
//     foodList.add(new PieEntry((float) 63.59,"Cám con cò"));
//     foodList.add(new PieEntry((float) 36.41,"Cám CP"));
//     PieDataSet pieDataSet = new PieDataSet(foodList,"");
//     pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
//     pieDataSet.setValueTextColor(Color.WHITE);
//     PieData pieData = new PieData(pieDataSet);
//     pieChart.setData(pieData);
//     pieChart.getDescription().setEnabled(false);
//     pieChart.setCenterText("Tỉ lệ sử dụng thức ăn");
//     pieChart.setDrawEntryLabels(false);
//     pieChart.getLegend().setTextColor(Color.WHITE);
//     pieChart.animate();
//     //  pieChart.setDrawHoleEnabled(false);
//
//
//        pieChart1 = view.findViewById(R.id.pieChart1);
//        ArrayList<PieEntry> foods = new ArrayList<>();
//        foods.add(new PieEntry(65,"Cám con cò"));
//        foods.add(new PieEntry(35,"Cám CP"));
//        PieDataSet pieDataSet1 = new PieDataSet(foods,"");
//        pieDataSet1.setValueTextColor(Color.WHITE);
//        pieDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);
//        PieData pieData1 = new PieData(pieDataSet1);
//        pieChart1.setData(pieData1);
//        pieChart1.getLegend().setTextColor(Color.WHITE);
//        pieChart1.setDrawHoleEnabled(false);
//        pieChart1.setDrawEntryLabels(false);
//        pieChart1.animate();

        return view;
    }
}
