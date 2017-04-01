package org.raphets.todayinhistoryfuxia.mvp.contact;

import org.raphets.todayinhistoryfuxia.base.BasePresent;
import org.raphets.todayinhistoryfuxia.base.BaseView;
import org.raphets.todayinhistoryfuxia.bean.Histroy;
import org.raphets.todayinhistoryfuxia.bean.Picture;

/**
 * Created by RaphetS on 2016/10/16.
 */

public class HistoryDetailContact {
    public interface View extends BaseView {
       void showData(Histroy<Picture> result);
    }

    public interface Present extends BasePresent {
        void getHistoryData(String eId);
    }
}
