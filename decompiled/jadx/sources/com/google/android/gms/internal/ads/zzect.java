package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import d6.p;
import h6.m0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzect extends zzecu {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcvq zzd;
    private final TelephonyManager zze;
    private final zzecl zzf;
    private zzbbs.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbs.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbbs.zzaf.zzd zzdVar = zzbbs.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbs.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbbs.zzaf.zzd zzdVar2 = zzbbs.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbs.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzect(Context context, zzcvq zzcvqVar, zzecl zzeclVar, zzech zzechVar, m0 m0Var) {
        super(zzechVar, m0Var);
        this.zzc = context;
        this.zzd = zzcvqVar;
        this.zzf = zzeclVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbbs.zzab zza(zzect zzectVar, Bundle bundle) {
        zzbbs.zzab.zzb zzbVar;
        zzbbs.zzab.zza zzaVarZza = zzbbs.zzab.zza();
        int i = bundle.getInt("cnt", -2);
        int i10 = bundle.getInt("gnt", 0);
        if (i == -1) {
            zzectVar.zzg = zzbbs.zzq.ENUM_TRUE;
        } else {
            zzectVar.zzg = zzbbs.zzq.ENUM_FALSE;
            if (i == 0) {
                zzaVarZza.zzd(zzbbs.zzab.zzc.CELL);
            } else if (i != 1) {
                zzaVarZza.zzd(zzbbs.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZza.zzd(zzbbs.zzab.zzc.WIFI);
            }
            switch (i10) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbbs.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbbs.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbbs.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbbs.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZza.zzc(zzbVar);
        }
        return zzaVarZza.zzbr();
    }

    public static /* bridge */ /* synthetic */ zzbbs.zzaf.zzd zzb(zzect zzectVar, Bundle bundle) {
        return (zzbbs.zzaf.zzd) zzb.get(zzfgc.zza(zzfgc.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbbs.zzaf.zzd.UNSPECIFIED);
    }

    public static byte[] zze(zzect zzectVar, boolean z4, ArrayList arrayList, zzbbs.zzab zzabVar, zzbbs.zzaf.zzd zzdVar) {
        zzbbs.zzaf.zza.C0002zza c0002zzaZzn = zzbbs.zzaf.zza.zzn();
        c0002zzaZzn.zzn(arrayList);
        c0002zzaZzn.zzD(zzg(Settings.Global.getInt(zzectVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        p pVar = p.C;
        c0002zzaZzn.zzE(pVar.e.b(zzectVar.zzc, zzectVar.zze));
        c0002zzaZzn.zzM(zzectVar.zzf.zze());
        c0002zzaZzn.zzL(zzectVar.zzf.zzb());
        c0002zzaZzn.zzG(zzectVar.zzf.zza());
        c0002zzaZzn.zzH(zzdVar);
        c0002zzaZzn.zzJ(zzabVar);
        c0002zzaZzn.zzK(zzectVar.zzg);
        c0002zzaZzn.zzN(zzg(z4));
        c0002zzaZzn.zzP(zzectVar.zzf.zzd());
        pVar.f2983j.getClass();
        c0002zzaZzn.zzO(System.currentTimeMillis());
        c0002zzaZzn.zzQ(zzg(Settings.Global.getInt(zzectVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return c0002zzaZzn.zzbr().zzaV();
    }

    private static final zzbbs.zzq zzg(boolean z4) {
        return z4 ? zzbbs.zzq.ENUM_TRUE : zzbbs.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z4) {
        zzgei.zzr(this.zzd.zzb(new Bundle()), new zzecs(this, z4), zzcaj.zzf);
    }
}
