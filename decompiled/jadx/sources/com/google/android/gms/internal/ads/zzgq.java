package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import da.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgq extends zzfw implements zzgy {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgx zze;
    private final zzgx zzf;
    private zzgi zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    public /* synthetic */ zzgq(String str, int i, int i10, boolean z4, boolean z10, zzgx zzgxVar, zzfwr zzfwrVar, boolean z11, zzgp zzgpVar) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i10;
        this.zza = z4;
        this.zze = zzgxVar;
        this.zzf = new zzgx();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j4, long j10, boolean z4, boolean z10, Map map) throws IOException {
        StringBuilder sbL;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j4 != 0) {
            sbL = v.l("bytes=", "-", j4);
            if (j10 != -1) {
                sbL.append((j4 + j10) - 1);
            }
            string = sbL.toString();
        } else if (j10 == -1) {
            string = null;
        } else {
            j4 = 0;
            sbL = v.l("bytes=", "-", j4);
            if (j10 != -1) {
                sbL.append((j4 + j10) - 1);
            }
            string = sbL.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.zzd;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z4 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(false);
        int i10 = zzgi.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzgi zzgiVar) throws zzgu {
        if (str == null) {
            throw new zzgu("Null location redirect", zzgiVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!ProxyConfig.MATCH_HTTPS.equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new zzgu("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzgiVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzgu(v.k("Disallowed cross-protocol redirect (", url.getProtocol(), " to ", protocol, ")"), zzgiVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzgu(e, zzgiVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzdt.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) throws zzgu {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j4 = this.zzl;
            if (j4 != -1) {
                long j10 = j4 - this.zzm;
                if (j10 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j10);
            }
            InputStream inputStream = this.zzi;
            int i11 = zzen.zza;
            int i12 = inputStream.read(bArr, i, i10);
            if (i12 == -1) {
                return -1;
            }
            this.zzm += (long) i12;
            zzg(i12);
            return i12;
        } catch (IOException e) {
            zzgi zzgiVar = this.zzg;
            int i13 = zzen.zza;
            throw zzgu.zza(e, zzgiVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzgu {
        zzgq zzgqVar;
        long j4;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZzb;
        long j10;
        zzgq zzgqVar2 = this;
        zzgqVar2.zzg = zzgiVar;
        long j11 = 0;
        zzgqVar2.zzm = 0L;
        zzgqVar2.zzl = 0L;
        zzi(zzgiVar);
        try {
            URL url = new URL(zzgiVar.zza.toString());
            long j12 = zzgiVar.zze;
            long j13 = zzgiVar.zzf;
            boolean zZzb = zzgiVar.zzb(1);
            int i = 0;
            try {
                if (zzgqVar2.zza) {
                    while (true) {
                        int i10 = i + 1;
                        if (i > 20) {
                            throw new zzgu(new NoRouteToHostException("Too many redirects: " + i10), zzgiVar, 2001, 1);
                        }
                        j4 = j11;
                        zzgqVar2 = this;
                        HttpURLConnection httpURLConnectionZzk2 = zzgqVar2.zzk(url, 1, null, j12, j13, zZzb, false, zzgiVar.zzd);
                        URL url2 = url;
                        long j14 = j13;
                        zzgqVar = zzgqVar2;
                        try {
                            int responseCode = httpURLConnectionZzk2.getResponseCode();
                            String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnectionZzk = httpURLConnectionZzk2;
                                break;
                            }
                            httpURLConnectionZzk2.disconnect();
                            URL urlZzl = zzgqVar.zzl(url2, headerField, zzgiVar);
                            j13 = j14;
                            url = urlZzl;
                            i = i10;
                            j11 = j4;
                        } catch (IOException e) {
                            e = e;
                        }
                        zzgqVar.zzm();
                        throw zzgu.zza(e, zzgiVar, 1);
                    }
                }
                httpURLConnectionZzk = zzgqVar2.zzk(url, 1, null, j12, j13, zZzb, true, zzgiVar.zzd);
                zzgqVar = this;
                j4 = 0;
                zzgqVar.zzh = httpURLConnectionZzk;
                zzgqVar.zzk = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i11 = zzgqVar.zzk;
                if (i11 < 200 || i11 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (zzgqVar.zzk == 416) {
                        if (zzgiVar.zze == zzgz.zzb(httpURLConnectionZzk.getHeaderField("Content-Range"))) {
                            zzgqVar.zzj = true;
                            zzj(zzgiVar);
                            long j15 = zzgiVar.zzf;
                            return j15 != -1 ? j15 : j4;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZzb = errorStream != null ? zzgce.zzb(errorStream) : zzen.zzf;
                    } catch (IOException unused) {
                        bArrZzb = zzen.zzf;
                    }
                    zzgqVar.zzm();
                    throw new zzgw(zzgqVar.zzk, responseMessage, zzgqVar.zzk == 416 ? new zzge(2008) : null, headerFields, zzgiVar, bArrZzb);
                }
                httpURLConnectionZzk.getContentType();
                if (zzgqVar.zzk == 200) {
                    j10 = zzgiVar.zze;
                    if (j10 == j4) {
                        j10 = j4;
                    }
                } else {
                    j10 = j4;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    zzgqVar.zzl = zzgiVar.zzf;
                } else {
                    long j16 = zzgiVar.zzf;
                    if (j16 != -1) {
                        zzgqVar.zzl = j16;
                    } else {
                        long jZza = zzgz.zza(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField("Content-Range"));
                        zzgqVar.zzl = jZza != -1 ? jZza - j10 : -1L;
                    }
                }
                try {
                    zzgqVar.zzi = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        zzgqVar.zzi = new GZIPInputStream(zzgqVar.zzi);
                    }
                    zzgqVar.zzj = true;
                    zzj(zzgiVar);
                    if (j10 != j4) {
                        try {
                            byte[] bArr = new byte[4096];
                            while (j10 > j4) {
                                int iMin = (int) Math.min(j10, 4096L);
                                InputStream inputStream = zzgqVar.zzi;
                                int i12 = zzen.zza;
                                int i13 = inputStream.read(bArr, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzgu(new InterruptedIOException(), zzgiVar, 2000, 1);
                                }
                                if (i13 == -1) {
                                    throw new zzgu(zzgiVar, 2008, 1);
                                }
                                j10 -= (long) i13;
                                zzgqVar.zzg(i13);
                            }
                        } catch (IOException e4) {
                            zzgqVar.zzm();
                            if (e4 instanceof zzgu) {
                                throw ((zzgu) e4);
                            }
                            throw new zzgu(e4, zzgiVar, 2000, 1);
                        }
                    }
                    return zzgqVar.zzl;
                } catch (IOException e10) {
                    zzgqVar.zzm();
                    throw new zzgu(e10, zzgiVar, 2000, 1);
                }
            } catch (IOException e11) {
                e = e11;
                zzgqVar = this;
            }
        } catch (IOException e12) {
            e = e12;
            zzgqVar = zzgqVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws zzgu {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzgi zzgiVar = this.zzg;
                    int i = zzen.zza;
                    throw new zzgu(e, zzgiVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        } catch (Throwable th) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfw, com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzfzr.zzd() : new zzgo(httpURLConnection.getHeaderFields());
    }
}
