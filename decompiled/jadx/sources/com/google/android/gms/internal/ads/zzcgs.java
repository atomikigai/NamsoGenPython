package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import d6.p;
import e6.t;
import h6.r0;
import h6.x;
import i6.h;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzcgs extends zzcfs {
    public zzcgs(zzcfk zzcfkVar, zzbbl zzbblVar, boolean z4, zzeea zzeeaVar) {
        super(zzcfkVar, zzbblVar, z4, new zzbsj(zzcfkVar, zzcfkVar.zzE(), new zzbbv(zzcfkVar.getContext())), null, zzeeaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzV(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcfk)) {
            h.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcfk zzcfkVar = (zzcfk) webView;
        zzbyh zzbyhVar = this.zza;
        if (zzbyhVar != null) {
            zzbyhVar.zzd(str, map, 1);
        }
        zzfsb.zza();
        zzfsh zzfshVar = zzfsh.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return zzc(str, map);
        }
        if (zzcfkVar.zzN() != null) {
            zzcfkVar.zzN().zzG();
        }
        if (zzcfkVar.zzO().zzi()) {
            str2 = (String) t.f3437d.f3440c.zza(zzbcn.zzX);
        } else if (zzcfkVar.zzaF()) {
            str2 = (String) t.f3437d.f3440c.zza(zzbcn.zzW);
        } else {
            str2 = (String) t.f3437d.f3440c.zza(zzbcn.zzV);
        }
        p pVar = p.C;
        r0 r0Var = pVar.f2979c;
        Context context = zzcfkVar.getContext();
        String str3 = zzcfkVar.zzn().f5213a;
        try {
            HashMap map2 = new HashMap();
            map2.put("User-Agent", pVar.f2979c.w(context, str3));
            map2.put("Cache-Control", "max-stale=3600");
            new x(context);
            String str4 = (String) x.a(0, str2, map2, null).get(60L, TimeUnit.SECONDS);
            if (str4 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            h.h("Could not fetch MRAID JS.", e);
            return null;
        }
    }
}
