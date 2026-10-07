package o6;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzges;
import h6.r0;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends zzbkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f7674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzges f7676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebViewClient f7677d;

    public v(WebView webView, b bVar, zzges zzgesVar) {
        this.f7674a = webView;
        this.f7675b = bVar;
        this.f7676c = zzgesVar;
    }

    public final void a() {
        this.f7674a.evaluateJavascript(String.format(Locale.getDefault(), (String) e6.t.f3437d.f3440c.zza(zzbcn.zzjr), this.f7675b.a()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    public final WebViewClient getDelegate() {
        return this.f7677d;
    }

    @Override // com.google.android.gms.internal.ads.zzbkm, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        a();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkm, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        a();
        super.onPageStarted(webView, str, bitmap);
    }

    public final void zza() {
        WebViewClient webViewClient;
        try {
            r0 r0Var = d6.p.C.f2979c;
            int i = Build.VERSION.SDK_INT;
            WebView webView = this.f7674a;
            if (i < 26) {
                if (WebViewFeature.isFeatureSupported(WebViewFeature.GET_WEB_VIEW_CLIENT)) {
                    try {
                        webViewClient = WebViewCompat.getWebViewClient(webView);
                    } catch (RuntimeException e) {
                        d6.p.C.f2982g.zzw(e, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            webViewClient = webView.getWebViewClient();
            if (webViewClient == this) {
                return;
            }
            if (webViewClient != null) {
                this.f7677d = webViewClient;
            }
            webView.setWebViewClient(this);
            a();
        } catch (IllegalStateException unused) {
        }
    }
}
