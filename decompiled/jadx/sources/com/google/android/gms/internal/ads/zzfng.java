package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfng implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzfnh zza;

    public zzfng(zzfnh zzfnhVar) {
        this.zza = zzfnhVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z4, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                zzfnh.zzd(this.zza, string2);
            } else if (string.equals("finishSession")) {
                zzfnh.zzb(this.zza, string2);
            } else {
                zzfmt.zza.getClass();
            }
        } catch (JSONException e) {
            zzfoo.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
