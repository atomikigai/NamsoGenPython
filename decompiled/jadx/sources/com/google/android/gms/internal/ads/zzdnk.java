package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import d6.p;
import e6.j2;
import i6.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import q7.b;
import r.e;
import r.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdnk extends zzbgr {
    private final Context zza;
    private final zzdiy zzb;
    private zzdjy zzc;
    private zzdit zzd;

    public zzdnk(Context context, zzdiy zzdiyVar, zzdjy zzdjyVar, zzdit zzditVar) {
        this.zza = context;
        this.zzb = zzdiyVar;
        this.zzc = zzdjyVar;
        this.zzd = zzditVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final j2 zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbfv zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e) {
            p.C.f2982g.zzw(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbfy zzg(String str) {
        return (zzbfy) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final q7.a zzh() {
        return new b(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final List zzk() {
        try {
            k kVarZzh = this.zzb.zzh();
            k kVarZzi = this.zzb.zzi();
            String[] strArr = new String[kVarZzh.f8100c + kVarZzi.f8100c];
            int i = 0;
            for (int i10 = 0; i10 < kVarZzh.f8100c; i10++) {
                strArr[i] = (String) kVarZzh.f(i10);
                i++;
            }
            for (int i11 = 0; i11 < kVarZzi.f8100c; i11++) {
                strArr[i] = (String) kVarZzi.f(i11);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            p.C.f2982g.zzw(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzl() {
        zzdit zzditVar = this.zzd;
        if (zzditVar != null) {
            zzditVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzm() {
        try {
            String strZzC = this.zzb.zzC();
            if (Objects.equals(strZzC, "Google")) {
                h.g("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(strZzC)) {
                h.g("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            zzdit zzditVar = this.zzd;
            if (zzditVar != null) {
                zzditVar.zzf(strZzC, false);
            }
        } catch (NullPointerException e) {
            p.C.f2982g.zzw(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzn(String str) {
        zzdit zzditVar = this.zzd;
        if (zzditVar != null) {
            zzditVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzo() {
        zzdit zzditVar = this.zzd;
        if (zzditVar != null) {
            zzditVar.zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzp(q7.a aVar) {
        zzdit zzditVar;
        Object objI = b.I(aVar);
        if (!(objI instanceof View) || this.zzb.zzu() == null || (zzditVar = this.zzd) == null) {
            return;
        }
        zzditVar.zzK((View) objI);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzq() {
        zzdit zzditVar = this.zzd;
        return (zzditVar == null || zzditVar.zzX()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzr(q7.a aVar) {
        zzdjy zzdjyVar;
        Object objI = b.I(aVar);
        if (!(objI instanceof ViewGroup) || (zzdjyVar = this.zzc) == null || !zzdjyVar.zzf((ViewGroup) objI)) {
            return false;
        }
        this.zzb.zzq().zzar(new zzdnj(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzs(q7.a aVar) {
        zzdjy zzdjyVar;
        Object objI = b.I(aVar);
        if (!(objI instanceof ViewGroup) || (zzdjyVar = this.zzc) == null || !zzdjyVar.zzg((ViewGroup) objI)) {
            return false;
        }
        this.zzb.zzs().zzar(new zzdnj(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzt() {
        zzeew zzeewVarZzu = this.zzb.zzu();
        if (zzeewVarZzu == null) {
            h.g("Trying to start OMID session before creation.");
            return false;
        }
        p.C.f2997x.zzk(zzeewVarZzu.zza());
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new e(0));
        return true;
    }
}
