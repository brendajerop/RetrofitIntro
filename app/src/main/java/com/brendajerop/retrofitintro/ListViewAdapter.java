package com.brendajerop.retrofitintro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<GitHubRepo> {

    public ListViewAdapter(Context context, ArrayList<GitHubRepo> repos) {
        super(context, 0, repos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GitHubRepo repo = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_layout, parent, false);
        }
        TextView repoName = (TextView) convertView.findViewById(R.id.repo_name);
        repoName.setText(repo.getName());
        return convertView;

    }
}
