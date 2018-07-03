package com.example.android.mycontacts;

public class Contact {
    private String mName;
    private String mPhone;
    private int  mImageID;

    public Contact(String name, String phone)
    {
        mName=name;
        mPhone=phone;
    }

    public Contact(String name, String phone,int imageID)
    {
        mName=name;
        mPhone=phone;
        mImageID=imageID;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhone()
    {
        return mPhone;
    }
    public int getImageID()
    {
        return mImageID;
    }
}
