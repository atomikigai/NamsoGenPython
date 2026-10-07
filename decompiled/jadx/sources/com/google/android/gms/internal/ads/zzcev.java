package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import i6.h;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcev extends zzfw implements zzgy {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgx zze;
    private zzgi zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzcev(String str, zzhd zzhdVar, int i, int i10, long j4, long j10) {
        super(true);
        zzdb.zzc(str);
        this.zzd = str;
        this.zze = new zzgx();
        this.zzb = i;
        this.zzc = i10;
        this.zzh = new ArrayDeque();
        this.zzq = j4;
        this.zzr = j10;
        if (zzhdVar != null) {
            zzf(zzhdVar);
        }
    }

    private final void zzl() {
        while (!this.zzh.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzh.remove()).disconnect();
            } catch (Exception e) {
                h.e("Unexpected error while disconnecting", e);
            }
        }
        this.zzg = null;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) throws zzgu {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j4 = this.zzl;
            long j10 = this.zzm;
            if (j4 - j10 == 0) {
                return -1;
            }
            long j11 = this.zzn + j10;
            long j12 = i10;
            long j13 = this.zzr;
            long j14 = j11 + j12 + j13;
            long j15 = this.zzp;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.zzo;
                if (j15 < j17) {
                    long jMin = Math.min(j17, Math.max(((this.zzq + j16) - j13) - 1, (j16 + j12) - 1));
                    zzk(j16, jMin, 2);
                    this.zzp = jMin;
                    j15 = jMin;
                }
            }
            int i11 = this.zzi.read(bArr, i, (int) Math.min(j12, ((j15 + 1) - this.zzn) - this.zzm));
            if (i11 == -1) {
                throw new EOFException();
            }
            this.zzm += (long) i11;
            zzg(i11);
            return i11;
        } catch (IOException e) {
            throw new zzgu(e, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzgu {
        this.zzf = zzgiVar;
        this.zzm = 0L;
        long j4 = zzgiVar.zze;
        long j10 = zzgiVar.zzf;
        long jMin = j10 == -1 ? this.zzq : Math.min(this.zzq, j10);
        this.zzn = j4;
        HttpURLConnection httpURLConnectionZzk = zzk(j4, (jMin + j4) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j11 = Long.parseLong(matcher.group(2));
                    long j12 = Long.parseLong(matcher.group(3));
                    long j13 = zzgiVar.zzf;
                    if (j13 != -1) {
                        this.zzl = j13;
                        this.zzo = Math.max(j11, (this.zzn + j13) - 1);
                    } else {
                        this.zzl = j12 - this.zzn;
                        this.zzo = j12 - 1;
                    }
                    this.zzp = j11;
                    this.zzj = true;
                    zzj(zzgiVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    h.d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcet(headerField, zzgiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
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
                    throw new zzgu(e, this.zzf, 2000, 3);
                }
            }
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        } catch (Throwable th) {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfw, com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j4, long j10, int i) throws zzgu {
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e) {
                    iOException = e;
                    throw new zzgu("Unable to connect to ".concat(String.valueOf(string)), iOException, this.zzf, 2000, i);
                }
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j4 + "-" + j10);
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzceu(this.zzk, headerFields, this.zzf, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e4) {
                    zzl();
                    throw new zzgu(e4, this.zzf, 2000, i);
                }
            } catch (IOException e10) {
                zzl();
                throw new zzgu("Unable to connect to ".concat(String.valueOf(string2)), e10, this.zzf, 2000, i);
            }
        } catch (IOException e11) {
            iOException = e11;
        }
    }
}
