package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import e6.j2;
import e6.v2;
import i6.h;
import java.util.Collections;
import java.util.List;
import q7.b;
import r.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdiy {
    private int zza;
    private j2 zzb;
    private zzbfr zzc;
    private View zzd;
    private List zze;
    private v2 zzg;
    private Bundle zzh;
    private zzcfk zzi;
    private zzcfk zzj;
    private zzcfk zzk;
    private zzeew zzl;
    private m9.a zzm;
    private zzcao zzn;
    private View zzo;
    private View zzp;
    private q7.a zzq;
    private double zzr;
    private zzbfy zzs;
    private zzbfy zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final k zzv = new k(0);
    private final k zzw = new k(0);
    private List zzf = Collections.EMPTY_LIST;

    public static zzdiy zzag(zzbpr zzbprVar) {
        try {
            zzdix zzdixVarZzak = zzak(zzbprVar.zzg(), null);
            zzbfr zzbfrVarZzh = zzbprVar.zzh();
            View view = (View) zzam(zzbprVar.zzj());
            String strZzo = zzbprVar.zzo();
            List listZzr = zzbprVar.zzr();
            String strZzm = zzbprVar.zzm();
            Bundle bundleZzf = zzbprVar.zzf();
            String strZzn = zzbprVar.zzn();
            View view2 = (View) zzam(zzbprVar.zzk());
            q7.a aVarZzl = zzbprVar.zzl();
            String strZzq = zzbprVar.zzq();
            String strZzp = zzbprVar.zzp();
            double dZze = zzbprVar.zze();
            zzbfy zzbfyVarZzi = zzbprVar.zzi();
            try {
                zzdiy zzdiyVar = new zzdiy();
                zzdiyVar.zza = 2;
                zzdiyVar.zzb = zzdixVarZzak;
                zzdiyVar.zzc = zzbfrVarZzh;
                zzdiyVar.zzd = view;
                zzdiyVar.zzZ("headline", strZzo);
                zzdiyVar.zze = listZzr;
                zzdiyVar.zzZ("body", strZzm);
                zzdiyVar.zzh = bundleZzf;
                zzdiyVar.zzZ("call_to_action", strZzn);
                zzdiyVar.zzo = view2;
                zzdiyVar.zzq = aVarZzl;
                zzdiyVar.zzZ("store", strZzq);
                zzdiyVar.zzZ("price", strZzp);
                zzdiyVar.zzr = dZze;
                zzdiyVar.zzs = zzbfyVarZzi;
                return zzdiyVar;
            } catch (RemoteException e) {
                e = e;
                h.h("Failed to get native ad from app install ad mapper", e);
                return 0;
            }
        } catch (RemoteException e4) {
            e = e4;
        }
    }

    public static zzdiy zzah(zzbps zzbpsVar) {
        try {
            zzdix zzdixVarZzak = zzak(zzbpsVar.zzf(), null);
            zzbfr zzbfrVarZzg = zzbpsVar.zzg();
            View view = (View) zzam(zzbpsVar.zzi());
            String strZzo = zzbpsVar.zzo();
            List listZzp = zzbpsVar.zzp();
            String strZzm = zzbpsVar.zzm();
            Bundle bundleZze = zzbpsVar.zze();
            String strZzn = zzbpsVar.zzn();
            View view2 = (View) zzam(zzbpsVar.zzj());
            q7.a aVarZzk = zzbpsVar.zzk();
            String strZzl = zzbpsVar.zzl();
            zzbfy zzbfyVarZzh = zzbpsVar.zzh();
            zzdiy zzdiyVar = new zzdiy();
            zzdiyVar.zza = 1;
            zzdiyVar.zzb = zzdixVarZzak;
            zzdiyVar.zzc = zzbfrVarZzg;
            zzdiyVar.zzd = view;
            zzdiyVar.zzZ("headline", strZzo);
            zzdiyVar.zze = listZzp;
            zzdiyVar.zzZ("body", strZzm);
            zzdiyVar.zzh = bundleZze;
            zzdiyVar.zzZ("call_to_action", strZzn);
            zzdiyVar.zzo = view2;
            zzdiyVar.zzq = aVarZzk;
            zzdiyVar.zzZ("advertiser", strZzl);
            zzdiyVar.zzt = zzbfyVarZzh;
            return zzdiyVar;
        } catch (RemoteException e) {
            h.h("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdiy zzai(zzbpr zzbprVar) {
        try {
            return zzal(zzak(zzbprVar.zzg(), null), zzbprVar.zzh(), (View) zzam(zzbprVar.zzj()), zzbprVar.zzo(), zzbprVar.zzr(), zzbprVar.zzm(), zzbprVar.zzf(), zzbprVar.zzn(), (View) zzam(zzbprVar.zzk()), zzbprVar.zzl(), zzbprVar.zzq(), zzbprVar.zzp(), zzbprVar.zze(), zzbprVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            h.h("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdiy zzaj(zzbps zzbpsVar) {
        try {
            return zzal(zzak(zzbpsVar.zzf(), null), zzbpsVar.zzg(), (View) zzam(zzbpsVar.zzi()), zzbpsVar.zzo(), zzbpsVar.zzp(), zzbpsVar.zzm(), zzbpsVar.zze(), zzbpsVar.zzn(), (View) zzam(zzbpsVar.zzj()), zzbpsVar.zzk(), null, null, -1.0d, zzbpsVar.zzh(), zzbpsVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            h.h("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdix zzak(j2 j2Var, zzbpv zzbpvVar) {
        if (j2Var == null) {
            return null;
        }
        return new zzdix(j2Var, zzbpvVar);
    }

    private static zzdiy zzal(j2 j2Var, zzbfr zzbfrVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, q7.a aVar, String str4, String str5, double d10, zzbfy zzbfyVar, String str6, float f10) {
        zzdiy zzdiyVar = new zzdiy();
        zzdiyVar.zza = 6;
        zzdiyVar.zzb = j2Var;
        zzdiyVar.zzc = zzbfrVar;
        zzdiyVar.zzd = view;
        zzdiyVar.zzZ("headline", str);
        zzdiyVar.zze = list;
        zzdiyVar.zzZ("body", str2);
        zzdiyVar.zzh = bundle;
        zzdiyVar.zzZ("call_to_action", str3);
        zzdiyVar.zzo = view2;
        zzdiyVar.zzq = aVar;
        zzdiyVar.zzZ("store", str4);
        zzdiyVar.zzZ("price", str5);
        zzdiyVar.zzr = d10;
        zzdiyVar.zzs = zzbfyVar;
        zzdiyVar.zzZ("advertiser", str6);
        zzdiyVar.zzR(f10);
        return zzdiyVar;
    }

    private static Object zzam(q7.a aVar) {
        if (aVar == null) {
            return null;
        }
        return b.I(aVar);
    }

    public static zzdiy zzt(zzbpv zzbpvVar) {
        try {
            return zzal(zzak(zzbpvVar.zzj(), zzbpvVar), zzbpvVar.zzk(), (View) zzam(zzbpvVar.zzm()), zzbpvVar.zzs(), zzbpvVar.zzv(), zzbpvVar.zzq(), zzbpvVar.zzi(), zzbpvVar.zzr(), (View) zzam(zzbpvVar.zzn()), zzbpvVar.zzo(), zzbpvVar.zzu(), zzbpvVar.zzt(), zzbpvVar.zze(), zzbpvVar.zzl(), zzbpvVar.zzp(), zzbpvVar.zzf());
        } catch (RemoteException e) {
            h.h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        try {
            zzcfk zzcfkVar = this.zzi;
            if (zzcfkVar != null) {
                zzcfkVar.destroy();
                this.zzi = null;
            }
            zzcfk zzcfkVar2 = this.zzj;
            if (zzcfkVar2 != null) {
                zzcfkVar2.destroy();
                this.zzj = null;
            }
            zzcfk zzcfkVar3 = this.zzk;
            if (zzcfkVar3 != null) {
                zzcfkVar3.destroy();
                this.zzk = null;
            }
            m9.a aVar = this.zzm;
            if (aVar != null) {
                aVar.cancel(false);
                this.zzm = null;
            }
            zzcao zzcaoVar = this.zzn;
            if (zzcaoVar != null) {
                zzcaoVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzJ(zzbfr zzbfrVar) {
        this.zzc = zzbfrVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(v2 v2Var) {
        this.zzg = v2Var;
    }

    public final synchronized void zzM(zzbfy zzbfyVar) {
        this.zzs = zzbfyVar;
    }

    public final synchronized void zzN(String str, zzbfl zzbflVar) {
        try {
            if (zzbflVar == null) {
                this.zzv.remove(str);
            } else {
                this.zzv.put(str, zzbflVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzO(zzcfk zzcfkVar) {
        this.zzj = zzcfkVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbfy zzbfyVar) {
        this.zzt = zzbfyVar;
    }

    public final synchronized void zzR(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcfk zzcfkVar) {
        this.zzk = zzcfkVar;
    }

    public final synchronized void zzU(m9.a aVar) {
        this.zzm = aVar;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzeew zzeewVar) {
        this.zzl = zzeewVar;
    }

    public final synchronized void zzX(zzcao zzcaoVar) {
        this.zzn = zzcaoVar;
    }

    public final synchronized void zzY(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzZ(String str, String str2) {
        try {
            if (str2 == null) {
                this.zzw.remove(str);
            } else {
                this.zzw.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(j2 j2Var) {
        this.zzb = j2Var;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcfk zzcfkVar) {
        this.zzi = zzcfkVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized k zzh() {
        return this.zzv;
    }

    public final synchronized k zzi() {
        return this.zzw;
    }

    public final synchronized j2 zzj() {
        return this.zzb;
    }

    public final synchronized v2 zzk() {
        return this.zzg;
    }

    public final synchronized zzbfr zzl() {
        return this.zzc;
    }

    public final zzbfy zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbfx.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbfy zzn() {
        return this.zzs;
    }

    public final synchronized zzbfy zzo() {
        return this.zzt;
    }

    public final synchronized zzcao zzp() {
        return this.zzn;
    }

    public final synchronized zzcfk zzq() {
        return this.zzj;
    }

    public final synchronized zzcfk zzr() {
        return this.zzk;
    }

    public final synchronized zzcfk zzs() {
        return this.zzi;
    }

    public final synchronized zzeew zzu() {
        return this.zzl;
    }

    public final synchronized q7.a zzv() {
        return this.zzq;
    }

    public final synchronized m9.a zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
