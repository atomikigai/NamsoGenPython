package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzalo implements zzaki {
    private final zzed zza = new zzed();

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i, int i10, zzakh zzakhVar, zzdg zzdgVar) {
        zzct zzctVarZzp;
        this.zza.zzJ(bArr, i10 + i);
        this.zza.zzL(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzed zzedVar = this.zza;
            if (zzedVar.zzb() <= 0) {
                zzdgVar.zza(new zzaka(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzdb.zze(zzedVar.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            zzed zzedVar2 = this.zza;
            int iZzg = zzedVar2.zzg() - 8;
            if (zzedVar2.zzg() == 1987343459) {
                zzed zzedVar3 = this.zza;
                CharSequence charSequenceZza = null;
                zzcr zzcrVarZzb = null;
                while (iZzg > 0) {
                    zzdb.zze(iZzg >= 8, "Incomplete vtt cue box header found.");
                    int iZzg2 = zzedVar3.zzg();
                    int iZzg3 = zzedVar3.zzg();
                    int i11 = iZzg - 8;
                    int i12 = iZzg2 - 8;
                    String strZzC = zzen.zzC(zzedVar3.zzN(), zzedVar3.zzd(), i12);
                    zzedVar3.zzM(i12);
                    if (iZzg3 == 1937011815) {
                        zzcrVarZzb = zzaly.zzb(strZzC);
                    } else if (iZzg3 == 1885436268) {
                        charSequenceZza = zzaly.zza(null, strZzC.trim(), Collections.EMPTY_LIST);
                    }
                    iZzg = i11 - i12;
                }
                if (charSequenceZza == null) {
                    charSequenceZza = "";
                }
                if (zzcrVarZzb != null) {
                    zzcrVarZzb.zzl(charSequenceZza);
                    zzctVarZzp = zzcrVarZzb.zzp();
                } else {
                    zzalw zzalwVar = new zzalw();
                    zzalwVar.zzc = charSequenceZza;
                    zzctVarZzp = zzalwVar.zza().zzp();
                }
                arrayList.add(zzctVarZzp);
            } else {
                this.zza.zzM(iZzg);
            }
        }
    }
}
