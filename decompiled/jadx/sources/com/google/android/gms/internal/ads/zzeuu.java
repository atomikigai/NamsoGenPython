package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.t;
import h6.n0;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeuu implements zzevz {
    private final Context zza;
    private final zzges zzb;
    private final zzffo zzc;
    private final i6.a zzd;

    public zzeuu(Context context, zzges zzgesVar, zzffo zzffoVar, i6.a aVar) {
        this.zza = context;
        this.zzb = zzgesVar;
        this.zzc = zzffoVar;
        this.zzd = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeut
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007e, B:19:0x0090, B:21:0x00a4, B:23:0x00ad, B:28:0x00cf, B:30:0x00eb, B:31:0x010f, B:33:0x011a, B:26:0x00bf, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007e, B:19:0x0090, B:21:0x00a4, B:23:0x00ad, B:28:0x00cf, B:30:0x00eb, B:31:0x010f, B:33:0x011a, B:26:0x00bf, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007e, B:19:0x0090, B:21:0x00a4, B:23:0x00ad, B:28:0x00cf, B:30:0x00eb, B:31:0x010f, B:33:0x011a, B:26:0x00bf, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00cf A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007e, B:19:0x0090, B:21:0x00a4, B:23:0x00ad, B:28:0x00cf, B:30:0x00eb, B:31:0x010f, B:33:0x011a, B:26:0x00bf, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00eb A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007e, B:19:0x0090, B:21:0x00a4, B:23:0x00ad, B:28:0x00cf, B:30:0x00eb, B:31:0x010f, B:33:0x011a, B:26:0x00bf, B:14:0x0046), top: B:37:0x0000 }] */
    public final zzeuv zzc() throws Exception {
        zzfth zzfthVar;
        boolean z4;
        boolean zZze;
        zzftm zzftmVarZzi;
        zzfti zzftiVarZza;
        try {
            Context context = this.zza;
            boolean zZzb = this.zzc.zzb();
            zzfth zzfthVar2 = new zzfth();
            zzfth zzfthVar3 = new zzfth();
            boolean zZzd = true;
            if (zZzb) {
                if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdh)).booleanValue()) {
                    return new zzeuv(true);
                }
            }
            if (!zZzb) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdd)).booleanValue()) {
                    zzfthVar2 = zzftl.zzj(context).zzh(((Long) t.f3437d.f3440c.zza(zzbcn.zzdo)).longValue(), ((n0) p.C.f2982g.zzi()).k());
                } else if (zZzb) {
                    if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdf)).booleanValue()) {
                        zzfthVar2 = zzftl.zzj(context).zzh(((Long) t.f3437d.f3440c.zza(zzbcn.zzdo)).longValue(), ((n0) p.C.f2982g.zzi()).k());
                    }
                }
            } else if (zZzb) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdf)).booleanValue()) {
                    zzfthVar2 = zzftl.zzj(context).zzh(((Long) t.f3437d.f3440c.zza(zzbcn.zzdo)).longValue(), ((n0) p.C.f2982g.zzi()).k());
                }
            }
            zzbce zzbceVar = zzbcn.zzdl;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                if (this.zzd.f5215c < ((Integer) tVar.f3440c.zza(zzbcn.zzdk)).intValue()) {
                    zzftm.zzi(context).zzj();
                }
            }
            if (zZzb) {
                if (zZzb) {
                    if (((Boolean) tVar.f3440c.zza(zzbcn.zzdg)).booleanValue()) {
                        zzftmVarZzi = zzftm.zzi(context);
                        zzftiVarZza = zzfti.zza(context);
                        if (this.zzd.f5215c >= ((Integer) tVar.f3440c.zza(zzbcn.zzdk)).intValue()) {
                            zzfthVar3 = zzftmVarZzi.zzh(((Long) tVar.f3440c.zza(zzbcn.zzdp)).longValue(), ((n0) p.C.f2982g.zzi()).k());
                            zZzd = zzftiVarZza.zzd();
                        }
                        zZze = zzftiVarZza.zze();
                        zzfthVar = zzfthVar3;
                        z4 = zZzd;
                    }
                }
                zzfthVar = zzfthVar3;
                z4 = true;
                zZze = true;
            } else {
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzde)).booleanValue()) {
                    zzftmVarZzi = zzftm.zzi(context);
                    zzftiVarZza = zzfti.zza(context);
                    if (this.zzd.f5215c >= ((Integer) tVar.f3440c.zza(zzbcn.zzdk)).intValue()) {
                        zzfthVar3 = zzftmVarZzi.zzh(((Long) tVar.f3440c.zza(zzbcn.zzdp)).longValue(), ((n0) p.C.f2982g.zzi()).k());
                        zZzd = zzftiVarZza.zzd();
                    }
                    zZze = zzftiVarZza.zze();
                    zzfthVar = zzfthVar3;
                    z4 = zZzd;
                } else {
                    if (zZzb) {
                        if (((Boolean) tVar.f3440c.zza(zzbcn.zzdg)).booleanValue()) {
                            zzftmVarZzi = zzftm.zzi(context);
                            zzftiVarZza = zzfti.zza(context);
                            if (this.zzd.f5215c >= ((Integer) tVar.f3440c.zza(zzbcn.zzdk)).intValue()) {
                                zzfthVar3 = zzftmVarZzi.zzh(((Long) tVar.f3440c.zza(zzbcn.zzdp)).longValue(), ((n0) p.C.f2982g.zzi()).k());
                                zZzd = zzftiVarZza.zzd();
                            }
                            zZze = zzftiVarZza.zze();
                            zzfthVar = zzfthVar3;
                            z4 = zZzd;
                        }
                    }
                    zzfthVar = zzfthVar3;
                    z4 = true;
                    zZze = true;
                }
            }
            return new zzeuv(zzfthVar2, zzfthVar, z4, zZze, zZzb);
        } catch (IOException e) {
            p.C.f2982g.zzw(e, "PerAppIdSignal");
            return new zzeuv(this.zzc.zzb());
        }
    }
}
