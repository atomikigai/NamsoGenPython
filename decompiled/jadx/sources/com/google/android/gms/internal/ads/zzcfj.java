package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import d6.p;
import g6.i;
import h6.r0;
import i6.h;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcfj extends WebChromeClient {
    private final zzcfk zza;

    public zzcfj(zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcfk)) {
            return webView.getContext();
        }
        zzcfk zzcfkVar = (zzcfk) webView;
        Activity activityZzi = zzcfkVar.zzi();
        return activityZzi != null ? activityZzi : zzcfkVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcfk)) {
            h.g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        i iVarZzL = ((zzcfk) webView).zzL();
        if (iVarZzL == null) {
            h.g("Tried to close an AdWebView not associated with an overlay.");
        } else {
            iVarZzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        String strC = b.c(b.e("JS: ", strMessage, " (", strSourceId, ":"), consoleMessage.lineNumber(), ")");
        if (strC.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzcfi.zza[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            h.d(strC);
        } else if (i == 2) {
            h.g(strC);
        } else if (i == 3 || i == 4 || i != 5) {
            h.f(strC);
        } else {
            h.b(strC);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z10, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j4, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
        long j12 = 5242880 - j11;
        if (j12 <= 0) {
            quotaUpdater.updateQuota(j4);
            return;
        }
        if (j4 == 0) {
            if (j10 > j12 || j10 > 1048576) {
                j10 = 0;
            }
        } else if (j10 == 0) {
            j10 = Math.min(Math.min(131072L, j12) + j4, 1048576L);
        } else {
            if (j10 <= Math.min(1048576 - j4, j12)) {
                j4 += j10;
            }
            j10 = j4;
        }
        quotaUpdater.updateQuota(j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z4;
        if (callback != null) {
            zzcfk zzcfkVar = this.zza;
            p pVar = p.C;
            r0 r0Var = pVar.f2979c;
            if (r0.a(zzcfkVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z4 = true;
            } else {
                zzcfk zzcfkVar2 = this.zza;
                r0 r0Var2 = pVar.f2979c;
                if (r0.a(zzcfkVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            callback.invoke(str, z4, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        i iVarZzL = this.zza.zzL();
        if (iVarZzL == null) {
            h.g("Could not get ad overlay when hiding custom view.");
        } else {
            iVarZzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        i iVarZzL = this.zza.zzL();
        if (iVarZzL == null) {
            h.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = iVarZzL.f4196a;
        FrameLayout frameLayout = new FrameLayout(activity);
        iVarZzL.f4201r = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        iVarZzL.f4201r.addView(view, -1, -1);
        activity.setContentView(iVarZzL.f4201r);
        iVarZzL.B = true;
        iVarZzL.f4202s = customViewCallback;
        iVarZzL.f4200f = true;
        iVarZzL.y(i);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z4) {
        d6.b bVarZzd;
        try {
            zzcfk zzcfkVar = this.zza;
            if (zzcfkVar != null && zzcfkVar.zzN() != null && this.zza.zzN().zzd() != null && (bVarZzd = this.zza.zzN().zzd()) != null && !bVarZzd.b()) {
                bVarZzd.a("window." + str + "('" + str3 + "')");
                return false;
            }
            r0 r0Var = p.C.f2979c;
            AlertDialog.Builder builderI = r0.i(context);
            builderI.setTitle(str2);
            if (z4) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builderI.setView(linearLayout).setPositiveButton(R.string.ok, new zzcfh(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzcfg(jsPromptResult)).setOnCancelListener(new zzcff(jsPromptResult)).create().show();
            } else {
                builderI.setMessage(str3).setPositiveButton(R.string.ok, new zzcfe(jsResult)).setNegativeButton(R.string.cancel, new zzcfd(jsResult)).setOnCancelListener(new zzcfc(jsResult)).create().show();
            }
            return true;
        } catch (WindowManager.BadTokenException e) {
            h.h("Fail to display Dialog.", e);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
