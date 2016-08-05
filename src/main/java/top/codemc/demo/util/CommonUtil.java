package top.codemc.demo.util;

import com.vivavideo.mobile.xypayapi.XYPayService;
import com.vivavideo.mobile.xypaycore.service.XYPayServiceImpl;

/**
 * Created by xiyoumc on 16/8/4.
 */
public class CommonUtil {

    public static XYPayService getPayService() {
        return new XYPayServiceImpl();
    }
}
