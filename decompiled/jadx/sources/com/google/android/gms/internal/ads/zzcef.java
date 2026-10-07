package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import d6.p;
import e6.t;
import h6.k0;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import n7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcef extends zzfw {
    private final Context zza;
    private final zzgd zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbax zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private m9.a zzo;
    private final AtomicLong zzp;
    private final zzceq zzq;

    public zzcef(Context context, zzgd zzgdVar, String str, int i, zzhd zzhdVar, zzceq zzceqVar) {
        super(false);
        this.zza = context;
        this.zzb = zzgdVar;
        this.zzq = zzceqVar;
        this.zzc = str;
        this.zzd = i;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue();
        zzf(zzhdVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        zzbce zzbceVar = zzbcn.zzes;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() || this.zzl) {
            return ((Boolean) tVar.f3440c.zza(zzbcn.zzet)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        int iZza = inputStream != null ? inputStream.read(bArr, i, i10) : this.zzb.zza(bArr, i, i10);
        if (this.zze && this.zzf == null) {
            return iZza;
        }
        zzg(iZza);
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v20, types: [long] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzces] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws Throwable {
        zzbau zzbauVarZzb;
        Long l2;
        boolean z4;
        boolean z10;
        long jElapsedRealtime;
        StringBuilder sb2;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r10 = 1;
        this.zzg = true;
        this.zzh = zzgiVar.zza;
        if (!this.zze) {
            zzj(zzgiVar);
        }
        this.zzi = zzbax.zza(zzgiVar.zza);
        zzbce zzbceVar = zzbcn.zzep;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgiVar.zze;
                this.zzi.zzi = zzfxf.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbauVarZzb = p.C.i.zzb(this.zzi);
            } else {
                zzbauVarZzb = null;
            }
            if (zzbauVarZzb != null && zzbauVarZzb.zze()) {
                this.zzj = zzbauVarZzb.zzd();
                this.zzl = zzbauVarZzb.zzg();
                this.zzm = zzbauVarZzb.zzf();
                this.zzn = zzbauVarZzb.zza();
                this.zzk = true;
                if (!zzr()) {
                    this.zzf = zzbauVarZzb.zzc();
                    if (this.zze) {
                        zzj(zzgiVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgiVar.zze;
            this.zzi.zzi = zzfxf.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l2 = (Long) tVar.f3440c.zza(zzbcn.zzer);
            } else {
                l2 = (Long) tVar.f3440c.zza(zzbcn.zzeq);
            }
            ?? LongValue = l2.longValue();
            p pVar = p.C;
            pVar.f2983j.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            ?? Zza = zzbbi.zza(this.zza, this.zzi);
            try {
                try {
                    zzbbj zzbbjVar = (zzbbj) Zza.get(LongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.zzj = zzbbjVar.zzd();
                        this.zzl = zzbbjVar.zzf();
                        this.zzm = zzbbjVar.zze();
                        this.zzn = zzbbjVar.zza();
                        if (!zzr()) {
                            this.zzf = zzbbjVar.zzc();
                            if (this.zze) {
                                zzj(zzgiVar);
                            }
                            pVar.f2983j.getClass();
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                            this.zzq.zza.zzab(true, jElapsedRealtime3);
                            this.zzk = true;
                            k0.k("Cache connection took " + jElapsedRealtime3 + "ms");
                            return -1L;
                        }
                        pVar.f2983j.getClass();
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(true, jElapsedRealtime4);
                        this.zzk = true;
                        sb2 = new StringBuilder("Cache connection took ");
                        sb2.append(jElapsedRealtime4);
                    } catch (InterruptedException unused) {
                        z10 = true;
                        Zza.cancel(true);
                        Thread.currentThread().interrupt();
                        p.C.f2983j.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(z10, jElapsedRealtime);
                        this.zzk = z10;
                        sb2 = new StringBuilder("Cache connection took ");
                        LongValue = z10;
                        sb2.append(jElapsedRealtime);
                    } catch (ExecutionException | TimeoutException unused2) {
                        z4 = true;
                        Zza.cancel(true);
                        p.C.f2983j.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(z4, jElapsedRealtime);
                        this.zzk = z4;
                        sb2 = new StringBuilder("Cache connection took ");
                        LongValue = z4;
                        sb2.append(jElapsedRealtime);
                    } catch (Throwable th) {
                        th = th;
                        p.C.f2983j.getClass();
                        long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(r10, jElapsedRealtime5);
                        this.zzk = r10;
                        k0.k("Cache connection took " + jElapsedRealtime5 + "ms");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10 = LongValue;
                }
            } catch (InterruptedException unused3) {
                z10 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z4 = false;
            } catch (Throwable th3) {
                th = th3;
                r10 = 0;
            }
            sb2.append("ms");
            k0.k(sb2.toString());
        }
        this.zzk = false;
        if (this.zzi != null) {
            zzgg zzggVarZza = zzgiVar.zza();
            zzggVarZza.zzd(Uri.parse(this.zzi.zza));
            zzgiVar = zzggVarZza.zze();
        }
        return this.zzb.zzb(zzgiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        boolean z4 = (this.zze && this.zzf == null) ? false : true;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            c.d(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z4) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi != null) {
            if (this.zzp.get() != -1) {
                return this.zzp.get();
            }
            synchronized (this) {
                try {
                    if (this.zzo == null) {
                        this.zzo = zzcaj.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcee
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.zza.zzm();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final Long zzm() throws Exception {
        return Long.valueOf(p.C.i.zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
