package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgyj extends zzgyi {
    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zza(Object obj) {
        ((zzgyt) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final void zzb(zzhcc zzhccVar, Map.Entry entry) throws IOException {
        zzgyu zzgyuVar = (zzgyu) entry.getKey();
        if (!zzgyuVar.zzc) {
            zzhca zzhcaVar = zzhca.zza;
            switch (zzgyuVar.zzb.ordinal()) {
                case 0:
                    zzhccVar.zzf(zzgyuVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zzhccVar.zzo(zzgyuVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zzhccVar.zzt(zzgyuVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zzhccVar.zzK(zzgyuVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zzhccVar.zzr(zzgyuVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zzhccVar.zzm(zzgyuVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zzhccVar.zzk(zzgyuVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zzhccVar.zzb(zzgyuVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zzhccVar.zzG(zzgyuVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zzhccVar.zzq(zzgyuVar.zza, entry.getValue(), zzhas.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zzhccVar.zzv(zzgyuVar.zza, entry.getValue(), zzhas.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zzhccVar.zzd(zzgyuVar.zza, (zzgxp) entry.getValue());
                    break;
                case 12:
                    zzhccVar.zzI(zzgyuVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zzhccVar.zzr(zzgyuVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zzhccVar.zzx(zzgyuVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zzhccVar.zzz(zzgyuVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zzhccVar.zzB(zzgyuVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zzhccVar.zzD(zzgyuVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhca zzhcaVar2 = zzhca.zza;
        switch (zzgyuVar.zzb.ordinal()) {
            case 0:
                zzhbd.zzt(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 1:
                zzhbd.zzx(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 2:
                zzhbd.zzA(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 3:
                zzhbd.zzI(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 4:
                zzhbd.zzz(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 5:
                zzhbd.zzw(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 6:
                zzhbd.zzv(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 7:
                zzhbd.zzr(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 8:
                zzhbd.zzG(zzgyuVar.zza, (List) entry.getValue(), zzhccVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzhbd.zzy(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzhas.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzhbd.zzB(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzhas.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzhbd.zzs(zzgyuVar.zza, (List) entry.getValue(), zzhccVar);
                break;
            case 12:
                zzhbd.zzH(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 13:
                zzhbd.zzz(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 14:
                zzhbd.zzC(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 15:
                zzhbd.zzD(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 16:
                zzhbd.zzE(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
            case 17:
                zzhbd.zzF(zzgyuVar.zza, (List) entry.getValue(), zzhccVar, zzgyuVar.zzd);
                break;
        }
    }
}
