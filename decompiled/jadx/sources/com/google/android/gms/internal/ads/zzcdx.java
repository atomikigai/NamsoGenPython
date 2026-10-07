package com.google.android.gms.internal.ads;

import android.net.Uri;
import d6.p;
import da.v;
import e6.t;
import i6.d;
import i6.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcdx extends zzcdr implements zzhd {
    private static final AtomicInteger zzd = new AtomicInteger(0);
    private String zze;
    private final zzcce zzf;
    private boolean zzg;
    private final zzcdw zzh;
    private final zzcdb zzi;
    private ByteBuffer zzj;
    private boolean zzk;
    private final Object zzl;
    private final String zzm;
    private final int zzn;
    private boolean zzo;

    public zzcdx(zzccf zzccfVar, zzcce zzcceVar) {
        super(zzccfVar);
        this.zzf = zzcceVar;
        this.zzh = new zzcdw();
        this.zzi = new zzcdb();
        this.zzl = new Object();
        this.zzm = (String) zzfwo.zzd(zzccfVar != null ? zzccfVar.zzr() : null).zzb("");
        this.zzn = zzccfVar != null ? zzccfVar.zzf() : 0;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(d.a(str, "MD5")));
    }

    private final void zzx() {
        int iZza = (int) this.zzh.zza();
        int iZza2 = (int) this.zzi.zza(this.zzj);
        int iPosition = this.zzj.position();
        int iRound = Math.round((iPosition / iZza) * iZza2);
        int iZzs = zzcbw.zzs();
        int iZzu = zzcbw.zzu();
        String str = this.zze;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void release() {
        zzd.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzd(zzgd zzgdVar, zzgi zzgiVar, boolean z4) {
        if (zzgdVar instanceof zzgq) {
            this.zzh.zzb((zzgq) zzgdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzf() {
        this.zzg = true;
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzl) {
            try {
                ByteBuffer byteBuffer = this.zzj;
                if (byteBuffer != null && !this.zzk) {
                    byteBuffer.flip();
                    this.zzk = true;
                }
                this.zzg = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:23:0x00d3). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzt(String str) throws Throwable {
        this.zze = str;
        String str2 = "error";
        String strZzv = zzv(str);
        int i = 0;
        try {
            zzgl zzglVar = new zzgl();
            zzglVar.zzf(this.zzb);
            zzglVar.zzc(this.zzf.zzd);
            zzglVar.zzd(this.zzf.zze);
            zzglVar.zzb(true);
            zzglVar.zze(this);
            zzgd zzgdVarZza = zzglVar.zza();
            if (this.zzf.zzi) {
                zzgdVarZza = new zzccz(this.zza, zzgdVarZza, this.zzm, this.zzn, null, null);
            }
            zzgdVarZza.zzb(new zzgi(Uri.parse(str), 0L, -1L, null));
            zzccf zzccfVar = (zzccf) this.zzc.get();
            if (zzccfVar != null) {
                zzccfVar.zzt(strZzv, this);
            }
            p.C.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbce zzbceVar = zzbcn.zzI;
            t tVar = t.f3437d;
            long jLongValue = ((Long) tVar.f3440c.zza(zzbceVar)).longValue();
            long jLongValue2 = ((Long) tVar.f3440c.zza(zzbcn.zzH)).longValue();
            this.zzj = ByteBuffer.allocate(this.zzf.zzc);
            int i10 = 8192;
            byte[] bArr = new byte[8192];
            long j4 = jCurrentTimeMillis;
            while (true) {
                int iZza = zzgdVarZza.zza(bArr, i, Math.min(this.zzj.remaining(), i10));
                if (iZza == -1) {
                    this.zzo = true;
                    zzj(str, strZzv, (int) this.zzi.zza(this.zzj));
                    return true;
                }
                synchronized (this.zzl) {
                    try {
                        if (!this.zzg) {
                            str2 = null;
                            try {
                                this.zzj.put(bArr, 0, iZza);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzj.remaining() <= 0) {
                                zzx();
                                return true;
                            }
                            try {
                                if (this.zzg) {
                                    throw new IOException("Precache abort at " + this.zzj.limit() + " bytes");
                                }
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                if (jCurrentTimeMillis2 - j4 >= jLongValue) {
                                    zzx();
                                    j4 = jCurrentTimeMillis2;
                                }
                                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                                }
                                str2 = str2;
                                i10 = 8192;
                                i = 0;
                            } catch (Exception e) {
                                e = e;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str2 = str2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                str2 = str2;
                String strU = v.u(e.getClass().getCanonicalName(), ":", e.getMessage());
                h.g("Failed to preload url " + str + " Exception: " + strU);
                zzg(str, strZzv, str2, strU);
                return false;
            }
        } catch (Exception e10) {
            e = e10;
            str2 = str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzb(zzgd zzgdVar, zzgi zzgiVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzc(zzgd zzgdVar, zzgi zzgiVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zza(zzgd zzgdVar, zzgi zzgiVar, boolean z4, int i) {
    }
}
