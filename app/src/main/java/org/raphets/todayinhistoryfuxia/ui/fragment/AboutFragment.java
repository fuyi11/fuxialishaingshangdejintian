package org.raphets.todayinhistoryfuxia.ui.fragment;


import android.widget.ImageView;

import org.raphets.todayinhistoryfuxia.R;
import org.raphets.todayinhistoryfuxia.base.BaseFragment;
import org.raphets.todayinhistoryfuxia.http.ImageLoader;

import butterknife.BindView;

/**
 *   关于
 */
public class AboutFragment extends BaseFragment {
    @BindView(R.id.iv_pic)
    ImageView ivPic;

    private String TAG="TAG";

    @Override
    protected void initEvents() {
        ImageLoader.load(getActivity(),ivPic);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_about;
    }




}
