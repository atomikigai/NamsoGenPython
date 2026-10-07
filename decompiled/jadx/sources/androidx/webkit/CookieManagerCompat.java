package androidx.webkit;

import android.webkit.CookieManager;
import androidx.webkit.internal.CookieManagerAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class CookieManagerCompat {
    private CookieManagerCompat() {
    }

    private static CookieManagerAdapter getAdapter(CookieManager cookieManager) {
        return WebViewGlueCommunicator.getCompatConverter().convertCookieManager(cookieManager);
    }

    public static List<String> getCookieInfo(CookieManager cookieManager, String str) {
        if (WebViewFeatureInternal.GET_COOKIE_INFO.isSupportedByWebView()) {
            return getAdapter(cookieManager).getCookieInfo(str);
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
