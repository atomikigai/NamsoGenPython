package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import rc.a0;
import rc.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcd {
    private final WebView zza;
    private final a0 zzb;

    public zzcd(WebView webView, a0 a0Var) {
        this.zza = webView;
        this.zzb = a0Var;
    }

    public final void zzb(String str, String... strArr) {
        b0.q(this.zzb, null, new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
