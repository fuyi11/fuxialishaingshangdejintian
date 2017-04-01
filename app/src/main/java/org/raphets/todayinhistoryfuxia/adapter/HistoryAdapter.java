package org.raphets.todayinhistoryfuxia.adapter;

import android.content.Context;

import org.raphets.todayinhistoryfuxia.R;
import org.raphets.todayinhistoryfuxia.base.BaseAdapter;
import org.raphets.todayinhistoryfuxia.base.BaseViewHolder;
import org.raphets.todayinhistoryfuxia.bean.SimpleHistory;

import java.util.List;

/**
 * Created by RaphetS on 2016/10/16.
 */

public class HistoryAdapter extends BaseAdapter<SimpleHistory> {

    public HistoryAdapter(Context mContext, List<SimpleHistory> mDatas, int mLayoutId) {
        super(mContext, mDatas, mLayoutId);
    }

    @Override
    protected void convert(Context mContext, BaseViewHolder holder, SimpleHistory t) {
        holder.setText(R.id.tv_time,t.getDate())
                .setText(R.id.tv_title,t.getTitle());
    }
}
