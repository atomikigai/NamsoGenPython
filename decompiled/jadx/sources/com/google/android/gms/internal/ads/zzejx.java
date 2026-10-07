package com.google.android.gms.internal.ads;

import android.content.Context;
import b9.e;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d6.i;
import d6.p;
import e6.t;
import h6.r0;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzejx implements zzdgv {
    private final Context zza;
    private final zzdpn zzb;
    private final zzffo zzc;
    private final i6.a zzd;
    private final zzfet zze;
    private final m9.a zzf;
    private final zzcfk zzg;
    private final zzbju zzh;
    private final boolean zzi;
    private final zzeea zzj;
    private final zzdsh zzk;

    public zzejx(Context context, zzdpn zzdpnVar, zzffo zzffoVar, i6.a aVar, zzfet zzfetVar, m9.a aVar2, zzcfk zzcfkVar, zzbju zzbjuVar, boolean z4, zzeea zzeeaVar, zzdsh zzdshVar) {
        this.zza = context;
        this.zzb = zzdpnVar;
        this.zzc = zzffoVar;
        this.zzd = aVar;
        this.zze = zzfetVar;
        this.zzf = aVar2;
        this.zzg = zzcfkVar;
        this.zzh = zzbjuVar;
        this.zzi = z4;
        this.zzj = zzeeaVar;
        this.zzk = zzdshVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zza(boolean z4, Context context, zzcwz zzcwzVar) {
        zzcfk zzcfkVar;
        zzcfk zzcfkVar2;
        boolean zZze;
        float fZza;
        zzdos zzdosVar = (zzdos) zzgei.zzq(this.zzf);
        try {
            zzfet zzfetVar = this.zze;
            if (this.zzg.zzaG()) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaU)).booleanValue()) {
                    final zzcfk zzcfkVarZza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbkj.zzb(zzcfkVarZza, zzdosVar.zzg());
                    final zzdpr zzdprVar = new zzdpr();
                    zzdprVar.zza(this.zza, zzcfkVarZza.zzF());
                    zzdosVar.zzl().zzi(zzcfkVarZza, true, this.zzi ? this.zzh : null, this.zzk.zza());
                    zzcfkVarZza.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzejv
                        @Override // com.google.android.gms.internal.ads.zzcha
                        public final void zza(boolean z10, int i, String str, String str2) {
                            zzdprVar.zzb();
                            zzcfk zzcfkVar3 = zzcfkVarZza;
                            zzcfkVar3.zzab();
                            zzcfkVar3.zzN().zzr();
                        }
                    });
                    zzcfkVarZza.zzN().zzI(new zzchb() { // from class: com.google.android.gms.internal.ads.zzejw
                        @Override // com.google.android.gms.internal.ads.zzchb
                        public final void zza() {
                            zzcfkVarZza.zzaa();
                        }
                    });
                    zzfey zzfeyVar = zzfetVar.zzs;
                    zzcfkVarZza.zzae(zzfeyVar.zzb, zzfeyVar.zza, null);
                    zzcfkVar = zzcfkVarZza;
                } else {
                    zzcfkVar2 = this.zzg;
                }
                zzcfkVar.zzaq(true);
                if (this.zzi) {
                    zZze = this.zzh.zze(false);
                } else {
                    zZze = false;
                }
                r0 r0Var = p.C.f2979c;
                Context context2 = this.zza;
                boolean z10 = this.zzi;
                boolean zG = r0.g(context2);
                boolean zZzd = z10 ? this.zzh.zzd() : false;
                if (this.zzi) {
                    fZza = this.zzh.zza();
                } else {
                    fZza = 0.0f;
                }
                float f10 = fZza;
                zzfet zzfetVar2 = this.zze;
                i iVar = new i(zZze, zG, zZzd, f10, z4, zzfetVar2.zzO, zzfetVar2.zzP);
                if (zzcwzVar != null) {
                    zzcwzVar.zzf();
                }
                zzdgk zzdgkVarZzh = zzdosVar.zzh();
                zzfet zzfetVar3 = this.zze;
                i6.a aVar = this.zzd;
                int i = zzfetVar3.zzQ;
                String str = zzfetVar3.zzB;
                zzfey zzfeyVar2 = zzfetVar3.zzs;
                e.y(context, new AdOverlayInfoParcel(zzdgkVarZzh, zzcfkVar, i, aVar, str, iVar, zzfeyVar2.zzb, zzfeyVar2.zza, this.zzc.zzf, zzcwzVar, zzfetVar3.zzai ? this.zzj : null), true);
            }
            zzcfkVar2 = this.zzg;
            zzcfkVar = zzcfkVar2;
            zzcfkVar.zzaq(true);
            if (this.zzi) {
                zZze = this.zzh.zze(false);
            } else {
                zZze = false;
            }
            r0 r0Var2 = p.C.f2979c;
            Context context3 = this.zza;
            boolean z11 = this.zzi;
            boolean zG2 = r0.g(context3);
            if (z11) {
            }
            if (this.zzi) {
                fZza = this.zzh.zza();
            } else {
                fZza = 0.0f;
            }
            float f11 = fZza;
            zzfet zzfetVar4 = this.zze;
            i iVar2 = new i(zZze, zG2, zZzd, f11, z4, zzfetVar4.zzO, zzfetVar4.zzP);
            if (zzcwzVar != null) {
                zzcwzVar.zzf();
            }
            zzdgk zzdgkVarZzh2 = zzdosVar.zzh();
            zzfet zzfetVar5 = this.zze;
            i6.a aVar2 = this.zzd;
            int i10 = zzfetVar5.zzQ;
            String str2 = zzfetVar5.zzB;
            zzfey zzfeyVar3 = zzfetVar5.zzs;
            e.y(context, new AdOverlayInfoParcel(zzdgkVarZzh2, zzcfkVar, i10, aVar2, str2, iVar2, zzfeyVar3.zzb, zzfeyVar3.zza, this.zzc.zzf, zzcwzVar, zzfetVar5.zzai ? this.zzj : null), true);
        } catch (zzcfw e) {
            h.e("", e);
        }
    }
}
