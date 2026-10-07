package l3;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f6659b;

    public /* synthetic */ r(WebView webView, int i) {
        this.f6658a = i;
        this.f6659b = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f6658a) {
            case 0:
                jc.i.e(webView, "v");
                jc.i.e(webResourceRequest, "request");
                this.f6659b.loadUrl(webResourceRequest.getUrl().toString());
                break;
            default:
                jc.i.e(webView, "popView");
                jc.i.e(webResourceRequest, "request");
                this.f6659b.loadUrl(webResourceRequest.getUrl().toString());
                break;
        }
        return true;
    }
}
