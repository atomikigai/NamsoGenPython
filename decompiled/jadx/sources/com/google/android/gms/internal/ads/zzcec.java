package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import i6.h;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcec extends zzfw implements zzgy {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgx zzg;
    private zzgi zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcec(String str, zzhd zzhdVar, int i, int i10, int i11) {
        super(true);
        this.zzc = new zzceb(this);
        this.zzr = new HashSet();
        zzdb.zzc(str);
        this.zzf = str;
        this.zzg = new zzgx();
        this.zzd = i;
        this.zze = i10;
        this.zzq = i11;
        if (zzhdVar != null) {
            zzf(zzhdVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                h.e("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) throws zzgu {
        try {
            if (this.zzo != this.zzm) {
                byte[] bArr2 = (byte[]) zzb.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j4 = this.zzo;
                    long j10 = this.zzm;
                    if (j4 == j10) {
                        zzb.set(bArr2);
                        break;
                    }
                    int i11 = this.zzj.read(bArr2, 0, (int) Math.min(j10 - j4, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i11;
                    zzg(i11);
                }
            }
            if (i10 == 0) {
                return 0;
            }
            long j11 = this.zzn;
            if (j11 != -1) {
                long j12 = j11 - this.zzp;
                if (j12 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j12);
            }
            int i12 = this.zzj.read(bArr, i, i10);
            if (i12 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += (long) i12;
            zzg(i12);
            return i12;
        } catch (IOException e) {
            throw new zzgu(e, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1 A[Catch: IOException -> 0x003f, TryCatch #2 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x0087, B:24:0x00a1, B:25:0x00b3, B:26:0x00b8, B:28:0x00c1, B:29:0x00c8, B:42:0x00f0, B:95:0x022d, B:97:0x0238, B:99:0x0249, B:102:0x0252, B:103:0x0261, B:105:0x0268, B:106:0x026f, B:107:0x0270, B:108:0x0286), top: B:115:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238 A[Catch: IOException -> 0x003f, TryCatch #2 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x0087, B:24:0x00a1, B:25:0x00b3, B:26:0x00b8, B:28:0x00c1, B:29:0x00c8, B:42:0x00f0, B:95:0x022d, B:97:0x0238, B:99:0x0249, B:102:0x0252, B:103:0x0261, B:105:0x0268, B:106:0x026f, B:107:0x0270, B:108:0x0286), top: B:115:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzgu {
        long j4;
        int responseCode;
        String headerField;
        String protocol;
        long j10;
        long jMax;
        this.zzh = zzgiVar;
        long j11 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzgiVar.zza.toString());
            long j12 = zzgiVar.zze;
            long j13 = zzgiVar.zzf;
            boolean zZzb = zzgiVar.zzb(1);
            int i = 0;
            while (true) {
                int i10 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i10);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Map.Entry entry : this.zzg.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j12 == j11) {
                    if (j13 != -1) {
                        j4 = j11;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                    if (!zZzb) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzgw zzgwVar = new zzgw(this.zzl, null, null, headerFields, zzgiVar, zzen.zzf);
                                if (this.zzl != 416) {
                                    throw zzgwVar;
                                }
                                zzgwVar.initCause(new zzge(2008));
                                throw zzgwVar;
                            }
                            if (responseCode2 == 200) {
                                j10 = zzgiVar.zze;
                                if (j10 == j11) {
                                    j10 = j11;
                                }
                            } else {
                                j10 = j11;
                            }
                            this.zzm = j10;
                            if (zzgiVar.zzb(1)) {
                                this.zzn = zzgiVar.zzf;
                            } else {
                                long j14 = zzgiVar.zzf;
                                if (j14 != -1) {
                                    this.zzn = j14;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (TextUtils.isEmpty(headerField2)) {
                                        jMax = -1;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField2);
                                        } catch (NumberFormatException unused) {
                                            h.d("Unexpected Content-Length [" + headerField2 + "]");
                                            jMax = -1;
                                        }
                                    }
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        Matcher matcher = zza.matcher(headerField3);
                                        if (matcher.find()) {
                                            try {
                                                long j15 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < j11) {
                                                    jMax = j15;
                                                } else if (jMax != j15) {
                                                    h.g("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                                    jMax = Math.max(jMax, j15);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                h.d("Unexpected Content-Range [" + headerField3 + "]");
                                            }
                                        }
                                    }
                                    this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzj(zzgiVar);
                                return this.zzn;
                            } catch (IOException e) {
                                zzn();
                                throw new zzgu(e, zzgiVar, 2000, 1);
                            }
                        } catch (IOException e4) {
                            zzn();
                            throw new zzgu("Unable to connect to ".concat(String.valueOf(zzgiVar.zza.toString())), e4, zzgiVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!ProxyConfig.MATCH_HTTPS.equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i10;
                    j11 = j11;
                } else {
                    j4 = j12;
                }
                String string = "bytes=" + j4 + "-";
                if (j13 != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append((j4 + j13) - 1);
                    string = sb2.toString();
                }
                httpURLConnection.setRequestProperty("Range", string);
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                if (!zZzb) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!ProxyConfig.MATCH_HTTPS.equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i = i10;
                j11 = j11;
            }
        } catch (IOException e10) {
            throw new zzgu("Unable to connect to ".concat(String.valueOf(zzgiVar.zza.toString())), e10, zzgiVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws zzgu {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                int i = zzen.zza;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgu(e, this.zzh, 2000, 3);
                }
            }
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        } catch (Throwable th) {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfw, com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i) {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e) {
                    h.h("Failed to update receive buffer size.", e);
                }
            }
        }
    }
}
