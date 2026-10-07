package androidx.webkit;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WebViewRenderProcessClient {
    public abstract void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

    public abstract void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);
}
