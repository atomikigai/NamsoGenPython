package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.webkit.ProxyConfig;
import d6.p;
import e6.t;
import i6.d;
import i6.g;
import i6.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcdu extends zzcdr {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcdu(zzccf zzccfVar) {
        super(zzccfVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            h.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfsc.zza(zzfsb.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            h.g("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            h.g("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(zzfsc.zza(zzfsb.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.internal.ads.zzcdr, com.google.android.gms.internal.ads.zzcdu] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzt(final String str) throws Throwable {
        int i;
        ?? r10;
        FileOutputStream fileOutputStream;
        boolean z4;
        long j4;
        int i10;
        int i11;
        int responseCode;
        boolean zDelete;
        ?? r11 = 0;
        r11 = 0;
        r11 = 0;
        if (this.zzg == null) {
            zzg(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.zzg;
            if (file == null) {
                i = 0;
            } else {
                i = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            zzbce zzbceVar = zzbcn.zzp;
            t tVar = t.f3437d;
            if (i <= ((Integer) tVar.f3440c.zza(zzbceVar)).intValue()) {
                File file3 = new File(zzfsc.zza(zzfsb.zza(), this.zzg, d.a(str, "MD5")));
                File fileZza = zza(file3);
                if (file3.isFile() && fileZza.isFile()) {
                    int length = (int) file3.length();
                    h.b("Stream cache hit at ".concat(String.valueOf(str)));
                    zzh(str, file3.getAbsolutePath(), length);
                    return true;
                }
                String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
                String strValueOf2 = String.valueOf(str);
                Set set = zze;
                String strConcat = strValueOf.concat(strValueOf2);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            h.g("Stream cache already in progress at " + str);
                            zzg(str, file3.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        String str2 = "error";
                        try {
                            HttpURLConnection httpURLConnectionZzn = zzfsm.zza().zzn(new zzfsx() { // from class: com.google.android.gms.internal.ads.zzcdt
                                @Override // com.google.android.gms.internal.ads.zzfsx
                                public final URLConnection zza() throws IOException {
                                    int i12 = zzcdu.zzd;
                                    zzcap zzcapVar = p.C.f2989p;
                                    int iIntValue = ((Integer) t.f3437d.f3440c.zza(zzbcn.zzJ)).intValue();
                                    URL url = new URL(str);
                                    int i13 = 0;
                                    while (true) {
                                        i13++;
                                        if (i13 > 20) {
                                            throw new IOException("Too many redirects (20)");
                                        }
                                        URLConnection uRLConnectionOpenConnection = url.openConnection();
                                        uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                        uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                            throw new IOException("Invalid protocol.");
                                        }
                                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                        g gVar = new g();
                                        gVar.a(httpURLConnection, null);
                                        httpURLConnection.setInstanceFollowRedirects(false);
                                        int responseCode2 = httpURLConnection.getResponseCode();
                                        gVar.b(httpURLConnection, responseCode2);
                                        if (responseCode2 / 100 != 3) {
                                            return httpURLConnection;
                                        }
                                        String headerField = httpURLConnection.getHeaderField("Location");
                                        if (headerField == null) {
                                            throw new IOException("Missing Location header in redirect");
                                        }
                                        URL url2 = new URL(url, headerField);
                                        String protocol = url2.getProtocol();
                                        if (protocol == null) {
                                            throw new IOException("Protocol is null");
                                        }
                                        if (!protocol.equals(ProxyConfig.MATCH_HTTP) && !protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                                            throw new IOException("Unsupported scheme: ".concat(protocol));
                                        }
                                        h.b("Redirecting to ".concat(headerField));
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    }
                                }
                            }, 265, -1);
                            if (httpURLConnectionZzn == null || (responseCode = httpURLConnectionZzn.getResponseCode()) < 400) {
                                int contentLength = httpURLConnectionZzn.getContentLength();
                                if (contentLength < 0) {
                                    h.g("Stream cache aborted, missing content-length header at " + str);
                                    zzg(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                String str3 = zzf.format(contentLength);
                                int iIntValue = ((Integer) tVar.f3440c.zza(zzbcn.zzq)).intValue();
                                if (contentLength > iIntValue) {
                                    h.g("Content length " + str3 + " exceeds limit at " + str);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("File too big for full file cache. Size: ");
                                    sb2.append(str3);
                                    zzg(str, file3.getAbsolutePath(), "sizeExceeded", sb2.toString());
                                    set.remove(strConcat);
                                    return false;
                                }
                                h.b("Caching " + str3 + " bytes from " + str);
                                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzn.getInputStream());
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                                try {
                                    FileChannel channel = fileOutputStream2.getChannel();
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                    p.C.f2983j.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    zzbce zzbceVar2 = zzbcn.zzI;
                                    long jLongValue = ((Long) tVar.f3440c.zza(zzbceVar2)).longValue();
                                    Object obj = new Object();
                                    long jLongValue2 = ((Long) tVar.f3440c.zza(zzbcn.zzH)).longValue();
                                    long j10 = Long.MIN_VALUE;
                                    int i12 = 0;
                                    while (true) {
                                        ?? r12 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                        if (r12 < 0) {
                                            fileOutputStream2.close();
                                            if (h.j(3)) {
                                                h.b("Preloaded " + zzf.format(i12) + " bytes from " + str);
                                            }
                                            file3.setReadable(true, false);
                                            if (fileZza.isFile()) {
                                                fileZza.setLastModified(System.currentTimeMillis());
                                            } else {
                                                try {
                                                    fileZza.createNewFile();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            zzh(str, file3.getAbsolutePath(), i12);
                                            zze.remove(strConcat);
                                            return true;
                                        }
                                        int i13 = i12 + r12;
                                        try {
                                            if (i13 > iIntValue) {
                                                String str4 = "File too big for full file cache. Size: " + Integer.toString(i13);
                                                throw new IOException("stream cache file size limit exceeded");
                                            }
                                            byteBufferAllocate.flip();
                                            while (channel.write(byteBufferAllocate) > 0) {
                                            }
                                            byteBufferAllocate.clear();
                                            if (System.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue2) {
                                                String str5 = "Timeout exceeded. Limit: " + Long.toString(jLongValue2) + " sec";
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            if (this.zzh) {
                                                throw new IOException("abort requested");
                                            }
                                            synchronized (obj) {
                                                try {
                                                    p.C.f2983j.getClass();
                                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                                    if (j10 + jLongValue > jElapsedRealtime) {
                                                        z4 = false;
                                                    } else {
                                                        j10 = jElapsedRealtime;
                                                        z4 = true;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    while (true) {
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                fileOutputStream = fileOutputStream2;
                                                i10 = contentLength;
                                                i11 = i13;
                                                try {
                                                    try {
                                                        j4 = jLongValue;
                                                        d.f5219b.post(new zzcdl(this, str, file3.getAbsolutePath(), i11, i10, false));
                                                    } catch (IOException e) {
                                                        e = e;
                                                    }
                                                } catch (RuntimeException e4) {
                                                    e = e4;
                                                }
                                            } else {
                                                fileOutputStream = fileOutputStream2;
                                                j4 = jLongValue;
                                                i10 = contentLength;
                                                i11 = i13;
                                            }
                                            i12 = i11;
                                            contentLength = i10;
                                            fileOutputStream2 = fileOutputStream;
                                            byteBufferAllocate = byteBufferAllocate;
                                            channel = channel;
                                            jLongValue = j4;
                                        } catch (IOException | RuntimeException e10) {
                                            e = e10;
                                            r10 = zzbceVar2;
                                            r11 = r12;
                                        }
                                        r11 = fileOutputStream;
                                        r10 = 0;
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    fileOutputStream = fileOutputStream2;
                                } catch (RuntimeException e12) {
                                    e = e12;
                                    fileOutputStream = fileOutputStream2;
                                }
                            } else {
                                str2 = "badUrl";
                                try {
                                    r10 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                    try {
                                        throw new IOException("HTTP status code " + responseCode + " at " + str);
                                    } catch (IOException e13) {
                                        e = e13;
                                    } catch (RuntimeException e14) {
                                        e = e14;
                                    }
                                } catch (IOException | RuntimeException e15) {
                                    e = e15;
                                    r10 = 0;
                                }
                            }
                        } catch (IOException | RuntimeException e16) {
                            e = e16;
                            r10 = 0;
                            r11 = 0;
                        }
                        if (e instanceof RuntimeException) {
                            p.C.f2982g.zzw(e, "VideoStreamFullFileCache.preload");
                        }
                        try {
                            r11.close();
                        } catch (IOException | NullPointerException unused2) {
                        }
                        if (this.zzh) {
                            h.f("Preload aborted for URL \"" + str + "\"");
                        } else {
                            h.h("Preload failed for URL \"" + str + "\"", e);
                        }
                        if (file3.exists() && !file3.delete()) {
                            h.g("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                        }
                        zzg(str, file3.getAbsolutePath(), str2, r10);
                        zze.remove(strConcat);
                        return false;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            File file4 = this.zzg;
            if (file4 == null) {
                break;
            }
            long j11 = Long.MAX_VALUE;
            File file5 = null;
            for (File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j11) {
                        file5 = file6;
                        j11 = jLastModified;
                    }
                }
            }
            if (file5 != null) {
                zDelete = file5.delete();
                File fileZza2 = zza(file5);
                if (fileZza2.isFile()) {
                    zDelete &= fileZza2.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        h.g("Unable to expire stream cache");
        zzg(str, null, "expireFailed", null);
        return false;
    }
}
