package com.example.szl2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {
    private int newResourceId;

    public BookAdapter(Context context, int resourceId, List<Book> cityList){
        super(context, resourceId, cityList);
        newResourceId = resourceId;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){

        Book book = getItem (position);
        View view = LayoutInflater.from (getContext ()).inflate (newResourceId, parent, false);
        TextView bookName = view.findViewById (R.id.book_name);
        ImageView bookImage = view.findViewById (R.id.book_image);

        bookName.setText (book.getName ());
        bookImage.setImageResource (book.getImageId ());
        return view;
    }

}
