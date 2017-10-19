package com.percy.orderelement.presentation.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.percy.orderelement.presentation.adapters.listeners.OnClickListListener;
import com.percy.orderelement.R;
import com.percy.orderelement.data.model.Element;
import com.percy.orderelement.presentation.activities.ColorActivityBlue;
import com.percy.orderelement.presentation.activities.ColorActivityGreen;
import com.percy.orderelement.presentation.activities.ColorActivityRed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by percysoft on 13/10/17.
 */

public class elementAdapter extends RecyclerView.Adapter<elementAdapter.ViewHolder> implements OnClickListListener, View.OnClickListener {
    private ArrayList<Element> mDataset;
    private int var_green;
    private int var_red;
    private int var_blue;
    private String ultimo_toque_valor;
    private String penultimo_toque_valor;

    // Provide a suitable constructor (depends on the kind of dataset)
    public elementAdapter(ArrayList<Element> myDataset, int green, int red, int blue, String ultimo_toque_valor, String penultimo_toque_valor) {
        this.mDataset = myDataset;
        this.var_green = green;
        this.var_red = red;
        this.var_blue = blue;
        this.ultimo_toque_valor = ultimo_toque_valor;
        this.penultimo_toque_valor=penultimo_toque_valor;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public elementAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.element, parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new ViewHolder(v,this);

    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Element model = mDataset.get(position);
        ArrayList arrayListInt = new ArrayList<>();
        arrayListInt.add(var_blue);
        arrayListInt.add(var_green);
        arrayListInt.add(var_red);
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(arrayListInt, comparador);


        holder.setOnClickListeners();

            switch (position){
                case 0:
                    if(var_red>=3 || var_blue>=3 || var_green>=3){
                        if(var_red>var_blue && var_red>var_green){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_blue && var_red>var_green && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_red==var_blue && var_red>var_green && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_green&& var_red>var_blue && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_green&& var_red>var_blue && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_blue==var_green&& var_blue>var_red && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_blue==var_green&& var_blue>var_red && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_blue && var_red<var_green && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_blue && var_red<var_green && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }

                        if(var_red==var_green&& var_red<var_blue && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_red==var_green&& var_red<var_blue && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_blue==var_green&& var_blue<var_red && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_blue==var_green&& var_blue<var_red && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }

                        if(var_blue>var_red && var_blue>var_green){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_green>var_red && var_green>var_blue && var_red!=var_blue){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("red") && penultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("red") && penultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }

                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("blue") && penultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("blue") && penultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("green") && penultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }

                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("green") && penultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }



                    }else{

                            (holder.textView).setBackgroundColor(Color.RED);
                            break;

                    }



                case 1:
                    if(var_red>=3 || var_blue>=3 || var_green>=3){
                        if(var_red<var_blue && var_red>var_green){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_blue && var_red>var_green && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }

                        if(var_red==var_blue && var_red>var_green && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_red==var_green&& var_red>var_blue && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_red==var_green&& var_red>var_blue && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }

                        if(var_blue==var_green&& var_blue>var_red && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_blue==var_green&& var_blue>var_red && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_red==var_blue && var_red<var_green && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }

                        if(var_red==var_blue && var_red<var_green && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }

                        if(var_red==var_green&& var_red<var_blue && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_green&& var_red<var_blue && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_blue==var_green&& var_blue<var_red && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_blue==var_green&& var_blue<var_red && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }



                        if(var_red>var_blue && var_red<var_green){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_blue<var_red && var_blue>var_green){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_blue>var_red && var_blue<var_green){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_green<var_red && var_green>var_blue && var_red!=var_blue){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_green>var_red && var_green<var_blue && var_red!=var_blue){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("red") && penultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("red") && penultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("blue") && penultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }

                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("blue") && penultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }

                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("green") && penultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }

                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("green") && penultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }


                    }

                    else{
                        (holder.textView).setBackgroundColor(Color.BLUE);
                        break;
                    }
                case 2:
                    if(var_red>=3 || var_blue>=3 || var_green>=3){
                        if(var_red<var_blue && var_red<var_green){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_blue && var_red>var_green && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }

                        if(var_red==var_blue && var_red>var_green && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_green&& var_red>var_blue && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_green&& var_red>var_blue && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }

                        if(var_blue==var_green&& var_blue>var_red && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_blue==var_green&& var_blue>var_red && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_blue && var_red<var_green && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_red==var_blue && var_red<var_green && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_green&& var_red<var_blue && ultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_green&& var_red<var_blue && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }

                        if(var_blue==var_green&& var_blue<var_red && ultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_blue==var_green&& var_blue<var_red && ultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }


                        if(var_blue<var_red && var_blue<var_green){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_green<var_red && var_green<var_blue){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("red") && penultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("red") && penultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("blue") && penultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.GREEN);
                            break;
                        }

                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("blue") && penultimo_toque_valor.equals("green")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }

                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("green") && penultimo_toque_valor.equals("blue")){
                            (holder.textView).setBackgroundColor(Color.RED);
                            break;
                        }
                        if(var_red==var_blue && var_blue==var_green && ultimo_toque_valor.equals("green") && penultimo_toque_valor.equals("red")){
                            (holder.textView).setBackgroundColor(Color.BLUE);
                            break;
                        }

                    }

                    else{
                        (holder.textView).setBackgroundColor(Color.GREEN);
                        break;
                    }

                default:
                    break;
            }
        }


    @Override
    public void onClick(int position) {

    }
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    @Override
    public void onClick(View v) {

    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView;
        OnClickListListener onClickListListener;
        Context context;



        public ViewHolder(View itemView, OnClickListListener onClickListListener) {
            super(itemView);

            context = itemView.getContext();
            this.onClickListListener = onClickListListener;
            textView = (TextView)  itemView.findViewById(R.id.textView);
        }

        public void setOnClickListeners() {
            textView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            ColorDrawable corItem = (ColorDrawable) textView.getBackground();

            switch (corItem.getColor()){
                case Color.RED:
                    Intent intentRed =  new Intent(context,ColorActivityRed.class);
                    context.startActivity(intentRed);
                    break;
                case Color.GREEN:
                    Intent intentGreen =  new Intent(context,ColorActivityGreen.class);
                    context.startActivity(intentGreen);
                    break;
                case Color.BLUE:
                    Intent intentBlue =  new Intent(context,ColorActivityBlue.class);
                    context.startActivity(intentBlue);
                    break;
            }

        }
    }
}

