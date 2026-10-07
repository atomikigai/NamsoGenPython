package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import da.v;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaql implements zzaoz {
    private final zzaqk zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaql(zzaqk zzaqkVar, int i) {
        this.zzc = zzaqkVar;
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (((long) zzn(inputStream)) & 255) | ((((long) zzn(inputStream)) & 255) << 8) | ((((long) zzn(inputStream)) & 255) << 16) | ((((long) zzn(inputStream)) & 255) << 24) | ((((long) zzn(inputStream)) & 255) << 32) | ((((long) zzn(inputStream)) & 255) << 40) | ((((long) zzn(inputStream)) & 255) << 48) | ((((long) zzn(inputStream)) & 255) << 56);
    }

    public static String zzh(zzaqj zzaqjVar) throws IOException {
        return new String(zzm(zzaqjVar, zzf(zzaqjVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j4) throws IOException {
        outputStream.write((byte) j4);
        outputStream.write((byte) (j4 >>> 8));
        outputStream.write((byte) (j4 >>> 16));
        outputStream.write((byte) (j4 >>> 24));
        outputStream.write((byte) (j4 >>> 32));
        outputStream.write((byte) (j4 >>> 40));
        outputStream.write((byte) (j4 >>> 48));
        outputStream.write((byte) (j4 >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] zzm(zzaqj zzaqjVar, long j4) throws IOException {
        long jZza = zzaqjVar.zza();
        if (j4 >= 0 && j4 <= jZza) {
            int i = (int) j4;
            if (i == j4) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaqjVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbL = v.l("streamToBytes length=", ", maxLength=", j4);
        sbL.append(jZza);
        throw new IOException(sbL.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqi zzaqiVar) {
        if (this.zza.containsKey(str)) {
            this.zzb = (zzaqiVar.zza - ((zzaqi) this.zza.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzaqiVar.zza;
        }
        this.zza.put(str, zzaqiVar);
    }

    private final void zzp(String str) {
        zzaqi zzaqiVar = (zzaqi) this.zza.remove(str);
        if (zzaqiVar != null) {
            this.zzb -= zzaqiVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final synchronized zzaoy zza(String str) {
        zzaqi zzaqiVar = (zzaqi) this.zza.get(str);
        if (zzaqiVar == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            zzaqj zzaqjVar = new zzaqj(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                zzaqi zzaqiVarZza = zzaqi.zza(zzaqjVar);
                if (!TextUtils.equals(str, zzaqiVarZza.zzb)) {
                    zzaqb.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, zzaqiVarZza.zzb);
                    zzp(str);
                    zzaqjVar.close();
                    return null;
                }
                byte[] bArrZzm = zzm(zzaqjVar, zzaqjVar.zza());
                zzaoy zzaoyVar = new zzaoy();
                zzaoyVar.zza = bArrZzm;
                zzaoyVar.zzb = zzaqiVar.zzc;
                zzaoyVar.zzc = zzaqiVar.zzd;
                zzaoyVar.zzd = zzaqiVar.zze;
                zzaoyVar.zze = zzaqiVar.zzf;
                zzaoyVar.zzf = zzaqiVar.zzg;
                List<zzaph> list = zzaqiVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaph zzaphVar : list) {
                    treeMap.put(zzaphVar.zza(), zzaphVar.zzb());
                }
                zzaoyVar.zzg = treeMap;
                zzaoyVar.zzh = Collections.unmodifiableList(zzaqiVar.zzh);
                zzaqjVar.close();
                return zzaoyVar;
            } catch (Throwable th) {
                zzaqjVar.close();
                throw th;
            }
        } catch (IOException e) {
            zzaqb.zza("%s: %s", fileZzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final synchronized void zzb() {
        try {
            File fileZza = this.zzc.zza();
            if (fileZza.exists()) {
                File[] fileArrListFiles = fileZza.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        try {
                            long length = file.length();
                            zzaqj zzaqjVar = new zzaqj(new BufferedInputStream(new FileInputStream(file)), length);
                            try {
                                zzaqi zzaqiVarZza = zzaqi.zza(zzaqjVar);
                                zzaqiVarZza.zza = length;
                                zzo(zzaqiVarZza.zzb, zzaqiVarZza);
                                zzaqjVar.close();
                            } catch (Throwable th) {
                                zzaqjVar.close();
                                throw th;
                            }
                        } catch (IOException unused) {
                            file.delete();
                        }
                    }
                }
            } else if (!fileZza.mkdirs()) {
                zzaqb.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final synchronized void zzc(String str, boolean z4) {
        zzaoy zzaoyVarZza = zza(str);
        if (zzaoyVarZza != null) {
            zzaoyVarZza.zzf = 0L;
            zzaoyVarZza.zze = 0L;
            zzd(str, zzaoyVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final synchronized void zzd(String str, zzaoy zzaoyVar) {
        try {
            long j4 = this.zzb;
            int length = zzaoyVar.zza.length;
            long j10 = j4 + ((long) length);
            int i = this.zzd;
            if (j10 <= i || length <= i * 0.9f) {
                File fileZzg = zzg(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
                    zzaqi zzaqiVar = new zzaqi(str, zzaoyVar);
                    try {
                        zzj(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaqiVar.zzb);
                        String str2 = zzaqiVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzk(bufferedOutputStream, zzaqiVar.zzd);
                        zzk(bufferedOutputStream, zzaqiVar.zze);
                        zzk(bufferedOutputStream, zzaqiVar.zzf);
                        zzk(bufferedOutputStream, zzaqiVar.zzg);
                        List<zzaph> list = zzaqiVar.zzh;
                        if (list != null) {
                            zzj(bufferedOutputStream, list.size());
                            for (zzaph zzaphVar : list) {
                                zzl(bufferedOutputStream, zzaphVar.zza());
                                zzl(bufferedOutputStream, zzaphVar.zzb());
                            }
                        } else {
                            zzj(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzaoyVar.zza);
                        bufferedOutputStream.close();
                        zzaqiVar.zza = fileZzg.length();
                        zzo(str, zzaqiVar);
                        if (this.zzb >= this.zzd) {
                            if (zzaqb.zzb) {
                                zzaqb.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j11 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i10 = 0;
                            while (it.hasNext()) {
                                zzaqi zzaqiVar2 = (zzaqi) ((Map.Entry) it.next()).getValue();
                                if (zzg(zzaqiVar2.zzb).delete()) {
                                    this.zzb -= zzaqiVar2.zza;
                                } else {
                                    String str3 = zzaqiVar2.zzb;
                                    zzaqb.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i10++;
                                if (this.zzb < this.zzd * 0.9f) {
                                    break;
                                }
                            }
                            if (zzaqb.zzb) {
                                zzaqb.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.zzb - j11), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzaqb.zza("%s", e.toString());
                        bufferedOutputStream.close();
                        zzaqb.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzg.delete()) {
                        zzaqb.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzaqb.zza("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzb();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        zzp(str);
        if (zDelete) {
            return;
        }
        zzaqb.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzaql(File file, int i) {
        this.zzc = new zzaqh(this, file);
    }
}
