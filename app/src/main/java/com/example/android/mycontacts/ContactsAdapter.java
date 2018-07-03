package com.example.android.mycontacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactsAdapter extends ArrayAdapter<Contact> {

    public ContactsAdapter(Context context, ArrayList<Contact> contacts) {
        super(context, 0, contacts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View list_Item=convertView;
       if(convertView==null)
       {
           list_Item= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
       }

        TextView nameText= list_Item.findViewById(R.id.contact_name_text);
        TextView phoneText= list_Item.findViewById(R.id.contact_phone_text);
        ImageView photoImage= list_Item.findViewById(R.id.contact_photo_image);

        Contact currentContact=getItem(position);


        nameText.setText(currentContact.getName());
        phoneText.setText(currentContact.getPhone());

        if(currentContact.getImageID()!=0)
        {
            photoImage.setImageResource(currentContact.getImageID());
        }
        else
        {
            photoImage.setImageResource(R.drawable.unknown);

        }

     return   list_Item;
    }
}
