package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzakw implements zzaki {
    private final zzed zza = new zzed();
    private final zzed zzb = new zzed();
    private final zzakv zzc = new zzakv();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i, int i10, zzakh zzakhVar, zzdg zzdgVar) {
        this.zza.zzJ(bArr, i10 + i);
        this.zza.zzL(i);
        zzed zzedVar = this.zza;
        if (zzedVar.zzb() > 0 && zzedVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzen.zzH(zzedVar, this.zzb, this.zzd)) {
                zzed zzedVar2 = this.zzb;
                zzedVar.zzJ(zzedVar2.zzN(), zzedVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzed zzedVar3 = this.zza;
            if (zzedVar3.zzb() < 3) {
                zzdgVar.zza(new zzaka(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzakv zzakvVar = this.zzc;
            int iZze = zzedVar3.zze();
            int iZzm = zzedVar3.zzm();
            int iZzq = zzedVar3.zzq();
            int iZzd = zzedVar3.zzd() + iZzq;
            zzct zzctVarZza = null;
            if (iZzd > iZze) {
                zzedVar3.zzL(iZze);
            } else {
                if (iZzm != 128) {
                    switch (iZzm) {
                        case 20:
                            zzakv.zzd(zzakvVar, zzedVar3, iZzq);
                            break;
                        case zzbbs.zzt.zzm /* 21 */:
                            zzakv.zzb(zzakvVar, zzedVar3, iZzq);
                            break;
                        case 22:
                            zzakv.zzc(zzakvVar, zzedVar3, iZzq);
                            break;
                    }
                } else {
                    zzctVarZza = zzakvVar.zza();
                    zzakvVar.zze();
                }
                zzedVar3.zzL(iZzd);
            }
            if (zzctVarZza != null) {
                arrayList.add(zzctVarZza);
            }
        }
    }
}
