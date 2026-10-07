package com.google.android.gms.internal.ads;

import a4.b;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import d6.p;
import e6.t;
import h6.r0;
import i6.g;
import i6.h;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzebu implements zzfiv {
    protected final Context zza;
    protected final String zzb;

    public zzebu(Context context, String str, zzbwf zzbwfVar, int i) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzebt zza(zzebs zzebsVar) throws zzdwn {
        String str = zzebsVar.zza;
        int i = zzebsVar.zzb;
        Map map = zzebsVar.zzc;
        byte[] bArr = zzebsVar.zzd;
        String str2 = zzebsVar.zze;
        p.C.f2983j.getClass();
        return zzc(str, i, map, bArr, str2, SystemClock.elapsedRealtime());
    }

    public final zzebt zzc(String str, int i, Map map, byte[] bArr, String str2, long j4) throws zzdwn {
        HttpURLConnection httpURLConnection;
        URL url;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        boolean z4 = true;
        try {
            zzebt zzebtVar = new zzebt();
            h.f("SDK version: " + this.zzb);
            h.b("AdRequestServiceImpl: Sending request: " + str);
            URL url2 = new URL(str);
            HashMap map2 = new HashMap();
            int i10 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url2.openConnection();
                try {
                    try {
                        p.C.f2979c.y(this.zza, this.zzb, httpURLConnection, i);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        g gVar = new g();
                        try {
                            gVar.a(httpURLConnection, bArr);
                        } catch (Throwable th) {
                            h.e("Network request logging failed.", th);
                            p.C.f2982g.zzv(th, "HttpRequestFunction.logAdRequest");
                        }
                        int length = bArr.length;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(z4);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    c.d(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    c.d(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = null;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                            }
                        }
                        gVar.b(httpURLConnection, responseCode);
                        zzebtVar.zza = responseCode;
                        zzebtVar.zzb = map2;
                        zzebtVar.zzc = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    p pVar = p.C;
                                    r0 r0Var = pVar.f2979c;
                                    StringBuilder sb2 = new StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int i11 = inputStreamReader2.read(cArr);
                                        if (i11 == -1) {
                                            break;
                                        }
                                        sb2.append(cArr, 0, i11);
                                    }
                                    String string = sb2.toString();
                                    c.d(inputStreamReader2);
                                    if (g.c() && string != null) {
                                        gVar.d("onNetworkResponseBody", new b(string.getBytes(), 16));
                                    }
                                    zzebtVar.zzc = string;
                                    if (TextUtils.isEmpty(string)) {
                                        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfu)).booleanValue()) {
                                            throw new zzdwn(3);
                                        }
                                    }
                                    pVar.f2983j.getClass();
                                    zzebtVar.zzd = SystemClock.elapsedRealtime() - j4;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    c.d(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                h.g("Received error HTTP response code: " + responseCode);
                                throw new zzdwn(1, "Received error HTTP response code: " + responseCode);
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                h.g("No location header to follow redirect.");
                                throw new zzdwn(1, "No location header to follow redirect");
                            }
                            zzbce zzbceVar = zzbcn.zzhw;
                            t tVar = t.f3437d;
                            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e) {
                                    throw new zzdwn(1, e.getMessage(), e);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i10++;
                            if (i10 > ((Integer) tVar.f3440c.zza(zzbcn.zzfa)).intValue()) {
                                h.g("Too many redirects.");
                                throw new zzdwn(1, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            url2 = url;
                            z4 = true;
                        }
                    } catch (zzdwn e4) {
                        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhW)).booleanValue()) {
                            throw e4;
                        }
                        p.C.f2983j.getClass();
                        zzebtVar.zzd = SystemClock.elapsedRealtime() - j4;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
            httpURLConnection.disconnect();
            return zzebtVar;
        } catch (IOException e10) {
            String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e10.getMessage()));
            h.g(strConcat);
            throw new zzdwn(1, strConcat, e10);
        }
    }
}
