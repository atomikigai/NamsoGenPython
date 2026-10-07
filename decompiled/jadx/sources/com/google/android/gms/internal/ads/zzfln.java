package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import da.v;
import e6.t;
import i6.g;
import i6.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfln {
    private final zzeiv zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzffg zzf;
    private final zzffh zzg;
    private final n7.a zzh;
    private final zzavc zzi;

    public zzfln(zzeiv zzeivVar, i6.a aVar, String str, String str2, Context context, zzffg zzffgVar, zzffh zzffhVar, n7.a aVar2, zzavc zzavcVar) {
        this.zza = zzeivVar;
        this.zzb = aVar.f5213a;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzffgVar;
        this.zzg = zzffhVar;
        this.zzh = aVar2;
        this.zzi = zzavcVar;
    }

    public static final List zzf(int i, int i10, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", v.f(i10, "2.")));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j4, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzi(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return g.c() ? "fakeForAdDebugLog" : str;
    }

    private static String zzj(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfff zzfffVar, zzfet zzfetVar, List list) {
        return zzd(zzfffVar, zzfetVar, false, "", "", list);
    }

    public final List zzd(zzfff zzfffVar, zzfet zzfetVar, boolean z4, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z10 = true;
            String strZzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfffVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z4 ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfetVar != null) {
                strZzj = zzbyx.zzc(zzj(zzj(zzj(strZzj, "@gw_qdata@", zzfetVar.zzy), "@gw_adnetid@", zzfetVar.zzx), "@gw_allocid@", zzfetVar.zzw), this.zze, zzfetVar.zzW, zzfetVar.zzaw);
            }
            String strZzj2 = zzj(zzj(zzj(zzj(strZzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z11 = false;
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdD)).booleanValue() && !TextUtils.isEmpty(str)) {
                z11 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z12 = !zIsEmpty;
            if (z11) {
                z10 = z12;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzj2);
            }
            if (this.zzi.zzf(Uri.parse(strZzj2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzj2).buildUpon();
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z10) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzj2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006b A[LOOP:0: B:13:0x0065->B:15:0x006b, LOOP_END] */
    public final List zze(zzfet zzfetVar, List list, zzbwj zzbwjVar) {
        zzffg zzffgVar;
        zzfwo zzfwoVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ((b) this.zzh).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String strZzc = zzbwjVar.zzc();
            String string = Integer.toString(zzbwjVar.zzb());
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdE)).booleanValue()) {
                zzffh zzffhVar = this.zzg;
                if (zzffhVar == null) {
                    zzfwoVarZzd = zzfwo.zzc();
                } else {
                    zzffgVar = zzffhVar.zza;
                }
                str = (String) zzfwoVarZzd.zza(new zzfwh() { // from class: com.google.android.gms.internal.ads.zzfll
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        return zzfln.zzi(((zzffg) obj).zza);
                    }
                }).zzb("");
                str2 = (String) zzfwoVarZzd.zza(new zzfwh() { // from class: com.google.android.gms.internal.ads.zzflm
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        return zzfln.zzi(((zzffg) obj).zzb);
                    }
                }).zzb("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzbyx.zzc(zzj(zzj(zzj(zzj(zzj(zzj((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfetVar.zzW, zzfetVar.zzaw));
                }
                return arrayList;
            }
            zzffgVar = this.zzf;
            zzfwoVarZzd = zzfwo.zzd(zzffgVar);
            str = (String) zzfwoVarZzd.zza(new zzfwh() { // from class: com.google.android.gms.internal.ads.zzfll
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    return zzfln.zzi(((zzffg) obj).zza);
                }
            }).zzb("");
            str2 = (String) zzfwoVarZzd.zza(new zzfwh() { // from class: com.google.android.gms.internal.ads.zzflm
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object apply(Object obj) {
                    return zzfln.zzi(((zzffg) obj).zzb);
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzbyx.zzc(zzj(zzj(zzj(zzj(zzj(zzj((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfetVar.zzW, zzfetVar.zzaw));
            }
            return arrayList;
        } catch (RemoteException e) {
            h.e("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
