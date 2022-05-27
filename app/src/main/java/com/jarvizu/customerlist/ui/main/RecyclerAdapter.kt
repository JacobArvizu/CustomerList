package com.jarvizu.customerlist.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customerlist.R
import com.google.android.material.textview.MaterialTextView

class RecyclerAdapter(customerList: MutableList<Customer>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var customerList: List<Customer> = customerList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemFirstName.text = customerList[position].firstName
        holder.itemLastName.text = customerList[position].lastName
        holder.itemPhoneNumber.text = customerList[position].phoneNumber
        holder.itemAddress.text = customerList[position].address
        holder.itemCity.text = customerList[position].city
        holder.itemState.text = customerList[position].state
    }

    override fun getItemCount(): Int {
        return customerList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemFirstName: MaterialTextView
        var itemLastName: MaterialTextView
        var itemPhoneNumber: MaterialTextView
        var itemAddress: MaterialTextView
        var itemCity: MaterialTextView
        var itemState: MaterialTextView

        var itemLabelFirstName: MaterialTextView
        var itemLabelLastName: MaterialTextView
        var itemLabelPhoneNumber: MaterialTextView
        var itemLabelAddress: MaterialTextView
        var itemLabelCity: MaterialTextView
        var itemLabelState: MaterialTextView

        init {
            itemFirstName = itemView.findViewById(R.id.txtFirstName)
            itemLastName = itemView.findViewById(R.id.txtLastName)
            itemPhoneNumber = itemView.findViewById(R.id.txtPhoneNumber)
            itemAddress = itemView.findViewById(R.id.txtAddress)
            itemCity = itemView.findViewById(R.id.txtCity)
            itemState = itemView.findViewById(R.id.txtState)

            itemLabelFirstName = itemView.findViewById(R.id.lblFirstName)
            itemLabelLastName = itemView.findViewById(R.id.lblLastName)
            itemLabelPhoneNumber = itemView.findViewById(R.id.lblPhoneNumber)
            itemLabelAddress = itemView.findViewById(R.id.lblAddress)
            itemLabelCity = itemView.findViewById(R.id.lblCity)
            itemLabelState = itemView.findViewById(R.id.lblState)

        }
    }
}