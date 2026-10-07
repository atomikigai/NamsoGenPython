package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import d6.p;
import e6.o3;
import e6.t;
import h6.k0;
import h6.r0;
import i6.h;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import w5.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdtt extends zzbks {
    private final zzdtw zza;
    private final zzdtr zzb;
    private final Map zzc = new HashMap();

    public zzdtt(zzdtw zzdtwVar, zzdtr zzdtrVar) {
        this.zza = zzdtwVar;
        this.zzb = zzdtrVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static o3 zzc(Map map) {
        int i;
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str = (String) map.get("ad_request");
        boolean zNextBoolean = false;
        int i10 = -1;
        String str2 = null;
        int iNextInt = 60000;
        if (str == null) {
            return new o3(8, -1L, bundle, -1, arrayList, false, -1, false, null, null, null, null, bundle2, bundle3, arrayList2, null, null, false, null, -1, null, arrayList3, 60000, null, 0, 0L);
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            i = -1;
            while (jsonReader.hasNext()) {
                try {
                    String strNextName = jsonReader.nextName();
                    switch (strNextName.hashCode()) {
                        case -1289032093:
                            if (!strNextName.equals("extras")) {
                                jsonReader.skipValue();
                            } else {
                                jsonReader.beginObject();
                                Bundle bundle4 = new Bundle();
                                while (jsonReader.hasNext()) {
                                    bundle4.putString(jsonReader.nextName(), jsonReader.nextString());
                                }
                                jsonReader.endObject();
                                bundle = bundle4;
                            }
                            break;
                        case -839117230:
                            if (!strNextName.equals("isTestDevice")) {
                                jsonReader.skipValue();
                            } else {
                                zNextBoolean = jsonReader.nextBoolean();
                            }
                            break;
                        case -733436947:
                            if (!strNextName.equals("tagForUnderAgeOfConsent")) {
                                jsonReader.skipValue();
                            } else if (!jsonReader.nextBoolean()) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            break;
                        case -99890337:
                            if (!strNextName.equals("httpTimeoutMillis")) {
                                jsonReader.skipValue();
                            } else {
                                iNextInt = jsonReader.nextInt();
                            }
                            break;
                        case 523149226:
                            if (!strNextName.equals("keywords")) {
                                jsonReader.skipValue();
                            } else {
                                jsonReader.beginArray();
                                ArrayList arrayList4 = new ArrayList();
                                while (jsonReader.hasNext()) {
                                    arrayList4.add(jsonReader.nextString());
                                }
                                jsonReader.endArray();
                                arrayList = arrayList4;
                            }
                            break;
                        case 597632527:
                            if (!strNextName.equals("maxAdContentRating")) {
                                jsonReader.skipValue();
                            } else {
                                String strNextString = jsonReader.nextString();
                                if (s.f9666b.contains(strNextString)) {
                                    str2 = strNextString;
                                }
                            }
                            break;
                        case 1411582723:
                            if (!strNextName.equals("tagForChildDirectedTreatment")) {
                                jsonReader.skipValue();
                            } else if (!jsonReader.nextBoolean()) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } catch (IOException unused) {
                    h.b("Ad Request json was malformed, parsing ended early.");
                }
            }
            jsonReader.endObject();
        } catch (IOException unused2) {
            i = -1;
        }
        o3 o3Var = new o3(8, -1L, bundle, -1, arrayList, zNextBoolean, i10, false, null, null, null, null, bundle2, bundle3, arrayList2, null, null, false, null, i, str2, arrayList3, iNextInt, null, 0, 0L);
        Bundle bundle5 = o3Var.f3382x;
        Bundle bundle6 = bundle5.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle6 == null) {
            bundle6 = o3Var.f3373c;
            bundle5.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle6);
        }
        return new o3(8, -1L, bundle6, o3Var.f3374d, o3Var.e, o3Var.f3375f, o3Var.f3376r, o3Var.f3377s, o3Var.f3378t, o3Var.f3379u, o3Var.f3380v, o3Var.f3381w, o3Var.f3382x, o3Var.f3383y, o3Var.f3384z, o3Var.A, o3Var.B, o3Var.C, o3Var.D, o3Var.E, o3Var.F, o3Var.G, o3Var.H, o3Var.I, o3Var.J, o3Var.K);
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbkt
    public final void zzf(String str) throws RemoteException {
        zzbce zzbceVar = zzbcn.zzjC;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            k0.k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            r0 r0Var = p.C.f2979c;
            HashMap mapL = r0.l(uri);
            String str2 = (String) mapL.get("action");
            if (TextUtils.isEmpty(str2)) {
                h.b("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    this.zzc.clear();
                    this.zzb.zza();
                    return;
                }
            } else if (str2.equals("dispose_all")) {
                Iterator it = this.zzc.values().iterator();
                while (it.hasNext()) {
                    ((zzdtm) it.next()).zza();
                }
                this.zzc.clear();
                return;
            }
            String str3 = (String) mapL.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j4 = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            zzdtm zzdtmVar = (zzdtm) this.zzc.get(Long.valueOf(j4));
                            if (zzdtmVar != null) {
                                zzdtmVar.zzc();
                                return;
                            } else {
                                h.b("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzf(j4);
                                return;
                            }
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            zzdtm zzdtmVar2 = (zzdtm) this.zzc.get(Long.valueOf(j4));
                            if (zzdtmVar2 != null) {
                                zzdtmVar2.zzc();
                                return;
                            } else {
                                h.b("Could not show H5 ad, object ID does not exist");
                                this.zzb.zzq(j4);
                                return;
                            }
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            zzdtm zzdtmVar3 = (zzdtm) this.zzc.get(Long.valueOf(j4));
                            if (zzdtmVar3 != null) {
                                zzdtmVar3.zzb(zzc(mapL));
                                return;
                            } else {
                                h.b("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzq(j4);
                                return;
                            }
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            if (this.zzc.size() >= ((Integer) zzbclVar2.zza(zzbcn.zzjD)).intValue()) {
                                h.g("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(j4);
                                return;
                            }
                            Map map = this.zzc;
                            Long lValueOf = Long.valueOf(j4);
                            if (map.containsKey(lValueOf)) {
                                h.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j4);
                                return;
                            }
                            String str4 = (String) mapL.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                h.g("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(j4);
                                return;
                            }
                            zzdtn zzdtnVarZzb = this.zza.zzb();
                            zzdtnVarZzb.zzb(j4);
                            zzdtnVarZzb.zza(str4);
                            this.zzc.put(lValueOf, zzdtnVarZzb.zzc().zza());
                            this.zzb.zzh(j4);
                            k0.k("Created H5 interstitial #" + j4 + " with ad unit " + str4);
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            zzdtm zzdtmVar4 = (zzdtm) this.zzc.get(Long.valueOf(j4));
                            if (zzdtmVar4 != null) {
                                zzdtmVar4.zzb(zzc(mapL));
                                return;
                            } else {
                                h.b("Could not load H5 ad, object ID does not exist");
                                this.zzb.zzf(j4);
                                return;
                            }
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Map map2 = this.zzc;
                            Long lValueOf2 = Long.valueOf(j4);
                            zzdtm zzdtmVar5 = (zzdtm) map2.get(lValueOf2);
                            if (zzdtmVar5 == null) {
                                h.b("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            zzdtmVar5.zza();
                            this.zzc.remove(lValueOf2);
                            k0.k("Disposed H5 ad #" + j4);
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            if (this.zzc.size() >= ((Integer) zzbclVar2.zza(zzbcn.zzjD)).intValue()) {
                                h.g("Could not create H5 ad, too many existing objects");
                                this.zzb.zzi(j4);
                                return;
                            }
                            Map map3 = this.zzc;
                            Long lValueOf3 = Long.valueOf(j4);
                            if (map3.containsKey(lValueOf3)) {
                                h.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j4);
                                return;
                            }
                            String str5 = (String) mapL.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                h.g("Could not create H5 ad, missing ad unit id");
                                this.zzb.zzi(j4);
                                return;
                            }
                            zzdtn zzdtnVarZzb2 = this.zza.zzb();
                            zzdtnVarZzb2.zzb(j4);
                            zzdtnVarZzb2.zza(str5);
                            this.zzc.put(lValueOf3, zzdtnVarZzb2.zzc().zzb());
                            this.zzb.zzh(j4);
                            k0.k("Created H5 rewarded #" + j4 + " with ad unit " + str5);
                            return;
                        }
                        break;
                }
                h.b("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                h.b("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
