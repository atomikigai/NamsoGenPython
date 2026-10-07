package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcessClient f1235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f1236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcess f1237d;

    public /* synthetic */ e(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcessImpl webViewRenderProcessImpl, int i) {
        this.f1234a = i;
        this.f1235b = webViewRenderProcessClient;
        this.f1236c = webView;
        this.f1237d = webViewRenderProcessImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1234a) {
            case 0:
                this.f1235b.onRenderProcessResponsive(this.f1236c, this.f1237d);
                break;
            default:
                this.f1235b.onRenderProcessUnresponsive(this.f1236c, this.f1237d);
                break;
        }
    }
}
