package org.raphets.todayinhistoryfuxia.mvp.contact;

import org.raphets.todayinhistoryfuxia.base.BasePresent;
import org.raphets.todayinhistoryfuxia.base.BaseView;
import org.raphets.todayinhistoryfuxia.bean.GrilBean;

import java.util.List;

/**
 * Created by RaphetS on 2016/10/19.
 */

public class GrilContact {
    public interface View extends BaseView {
        void showContent(List<GrilBean> data);

        void showMoreGril(List<GrilBean> data);
    }

    public interface Present extends BasePresent {
        void getGrilList();

        void getMoreGril();
    }
}
