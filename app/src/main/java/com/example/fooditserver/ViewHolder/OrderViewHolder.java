package com.example.fooditserver.ViewHolder;

import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooditserver.Interface.ItemClickListener;
import com.example.fooditserver.R;

public class OrderViewHolder extends RecyclerView.ViewHolder{

    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress;

    public Button btnEdit, btnRemove, btnDetail, btnDirection;


    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);

        txtOrderAddress = (TextView)itemView.findViewById(R.id.order_address);
        txtOrderId= (TextView)itemView.findViewById(R.id.order_name);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);

        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);
        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);
        btnDetail = (Button)itemView.findViewById(R.id.btnDetail);
        btnDirection = (Button)itemView.findViewById(R.id.btnDirection);
    }

}
