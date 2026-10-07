package l3;

import android.os.Message;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f6674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6675c;

    public /* synthetic */ s(WebView webView, Object obj, int i) {
        this.f6673a = i;
        this.f6674b = webView;
        this.f6675c = obj;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z10, Message message) {
        switch (this.f6673a) {
            case 0:
                jc.i.e(webView, "view");
                Object obj = message != null ? message.obj : null;
                WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
                if (webViewTransport == null) {
                    return false;
                }
                WebView webView2 = new WebView(webView.getContext());
                webView2.setWebViewClient(new r(this.f6674b, 0));
                webViewTransport.setWebView(webView2);
                message.sendToTarget();
                return true;
            default:
                jc.i.e(webView, "v");
                Object obj2 = message != null ? message.obj : null;
                WebView.WebViewTransport webViewTransport2 = obj2 instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj2 : null;
                if (webViewTransport2 == null) {
                    return false;
                }
                WebView webView3 = new WebView(webView.getContext());
                webView3.setWebViewClient(new r(this.f6674b, 1));
                webViewTransport2.setWebView(webView3);
                message.sendToTarget();
                return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        switch (this.f6673a) {
            case 0:
                if (callback != null) {
                    callback.invoke(str, false, false);
                }
                break;
            default:
                if (callback != null) {
                    callback.invoke(str, false, false);
                }
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(final PermissionRequest permissionRequest) {
        switch (this.f6673a) {
            case 0:
                jc.i.e(permissionRequest, "request");
                final int i = 0;
                ((t) this.f6675c).T().runOnUiThread(new Runnable() { // from class: l3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                permissionRequest.deny();
                                break;
                            default:
                                permissionRequest.deny();
                                break;
                        }
                    }
                });
                break;
            default:
                jc.i.e(permissionRequest, "request");
                final int i10 = 1;
                ((ProfileViewerActivity) this.f6675c).runOnUiThread(new Runnable() { // from class: l3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                permissionRequest.deny();
                                break;
                            default:
                                permissionRequest.deny();
                                break;
                        }
                    }
                });
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        ProgressBar progressBar;
        switch (this.f6673a) {
            case 0:
                super.onProgressChanged(webView, i);
                j3.d dVar = ((t) this.f6675c).f6678f0;
                if (dVar == null || (progressBar = dVar.f5681n) == null) {
                    return;
                }
                if (i >= 100) {
                    progressBar.setVisibility(8);
                    return;
                } else {
                    progressBar.setVisibility(0);
                    progressBar.setProgress(i);
                    return;
                }
            default:
                ProfileViewerActivity profileViewerActivity = (ProfileViewerActivity) this.f6675c;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    b9.j jVar = profileViewerActivity.K;
                    if (jVar != null) {
                        ((ProgressBar) jVar.f1474g).setVisibility(8);
                        return;
                    } else {
                        jc.i.i("vb");
                        throw null;
                    }
                }
                b9.j jVar2 = profileViewerActivity.K;
                if (jVar2 == null) {
                    jc.i.i("vb");
                    throw null;
                }
                ((ProgressBar) jVar2.f1474g).setVisibility(0);
                b9.j jVar3 = profileViewerActivity.K;
                if (jVar3 != null) {
                    ((ProgressBar) jVar3.f1474g).setProgress(i);
                    return;
                } else {
                    jc.i.i("vb");
                    throw null;
                }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        j3.d dVar;
        TextView textView;
        switch (this.f6673a) {
            case 0:
                jc.i.e(webView, "view");
                if (str == null || pc.g.m0(str) || (dVar = ((t) this.f6675c).f6678f0) == null || (textView = dVar.f5686s) == null) {
                    return;
                }
                textView.setText(str);
                return;
            default:
                jc.i.e(webView, "view");
                if (str == null || pc.g.m0(str)) {
                    return;
                }
                b9.j jVar = ((ProfileViewerActivity) this.f6675c).K;
                if (jVar != null) {
                    ((TextView) jVar.f1476k).setText(str);
                    return;
                } else {
                    jc.i.i("vb");
                    throw null;
                }
        }
    }
}
