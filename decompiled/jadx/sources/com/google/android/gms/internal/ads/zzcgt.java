package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcgt extends zzcgs {
    public zzcgt(zzcfk zzcfkVar, zzbbl zzbblVar, boolean z4, zzeea zzeeaVar) {
        super(zzcfkVar, zzbblVar, z4, zzeeaVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzV(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
