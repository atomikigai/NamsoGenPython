package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import d4.v;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.n f1905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f1907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f1908d;
    public volatile boolean e;

    public l(a4.n nVar, int i) {
        this.f1905a = nVar;
        this.f1906b = i;
    }

    public static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        InputStream inputStream = this.f1908d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f1907c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f1907c = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.e = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.f fVar, d dVar) {
        a4.n nVar = this.f1905a;
        int i = p4.h.f7800b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            dVar.f(f(nVar.d(), 0, null, nVar.f162b.a()));
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            dVar.b(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + p4.h.a(jElapsedRealtimeNanos));
            }
        }
    }

    public final InputStream f(URL url, int i, URL url2, Map map) throws v {
        if (i >= 5) {
            throw new v("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new v("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i10 = this.f1906b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f1907c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f1908d = this.f1907c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iB = b(this.f1907c);
                int i11 = iB / 100;
                if (i11 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f1907c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f1908d = new p4.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f1908d = httpURLConnection2.getInputStream();
                        }
                        return this.f1908d;
                    } catch (IOException e) {
                        throw new v("Failed to obtain InputStream", b(httpURLConnection2), e);
                    }
                }
                if (i11 != 3) {
                    if (iB == -1) {
                        throw new v("Http request failed", iB, null);
                    }
                    try {
                        throw new v(this.f1907c.getResponseMessage(), iB, null);
                    } catch (IOException e4) {
                        throw new v("Failed to get a response message", iB, e4);
                    }
                }
                String headerField = this.f1907c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new v("Received empty or null redirect url", iB, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    c();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e10) {
                    throw new v(u3.b.b("Bad redirect url: ", headerField), iB, e10);
                }
            } catch (IOException e11) {
                throw new v("Failed to connect or obtain data", b(this.f1907c), e11);
            }
        } catch (IOException e12) {
            throw new v("URL.openConnection threw", 0, e12);
        }
    }
}
