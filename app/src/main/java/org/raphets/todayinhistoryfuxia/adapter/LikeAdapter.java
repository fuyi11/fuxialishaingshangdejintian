package org.raphets.todayinhistoryfuxia.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import org.raphets.todayinhistoryfuxia.R;
import org.raphets.todayinhistoryfuxia.base.BaseAdapter;
import org.raphets.todayinhistoryfuxia.base.BaseViewHolder;
import org.raphets.todayinhistoryfuxia.bean.HistoryLikeBean;
import org.raphets.todayinhistoryfuxia.http.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RaphetS on 2016/10/18.
 */

public class LikeAdapter extends BaseAdapter<HistoryLikeBean> {
    private List<HistoryLikeBean> mDatas;

    public LikeAdapter(Context mContext, List<HistoryLikeBean> mDatas, int mLayoutId) {
        super(mContext, mDatas, mLayoutId);
        this.mDatas=mDatas;
    }

    @Override
    protected void convert(Context context, BaseViewHolder holder, HistoryLikeBean bean) {
        holder.setText(R.id.tv_time, bean.getDate())
                .setText(R.id.tv_title, bean.getTitle());
        ImageView imageView=holder.getView(R.id.iv_pic);

        if (!TextUtils.isEmpty(bean.getImg())){
            imageView.setVisibility(View.VISIBLE);
            ImageLoader.load(context,bean.getImg(),imageView);
        }else {
          imageView.setVisibility(View.GONE);
        }
    }

    public List<HistoryLikeBean> getData(){
        return mDatas;
    }

    public void setData(List<HistoryLikeBean> data){
        this.mDatas=new ArrayList<>(data);
    }
}
