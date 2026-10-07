package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import e6.j2;
import e6.o3;
import e6.q3;
import e6.s;
import i6.d;
import i6.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k6.e;
import k6.f;
import k6.g;
import k6.j;
import k6.k;
import k6.l;
import k6.n;
import k6.p;
import k6.q;
import k6.r;
import k6.t;
import org.json.JSONException;
import org.json.JSONObject;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbqh extends zzbpi {
    private final Object zza;
    private zzbqj zzb;
    private zzbwu zzc;
    private q7.a zzd;
    private View zze;
    private k zzf;
    private t zzg;
    private r zzh;
    private p zzi;
    private j zzj;
    private f zzk;
    private final String zzl = "";

    public zzbqh(k6.a aVar) {
        this.zza = aVar;
    }

    private final Bundle zzV(o3 o3Var) {
        Bundle bundle;
        Bundle bundle2 = o3Var.f3382x;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzW(String str, o3 o3Var, String str2) throws RemoteException {
        h.b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (o3Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", o3Var.f3376r);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            h.e("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzX(o3 o3Var) {
        if (o3Var.f3375f) {
            return true;
        }
        d dVar = s.f3427f.f3428a;
        return d.m();
    }

    private static final String zzY(String str, o3 o3Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return o3Var.F;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzA(q7.a aVar, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof k6.a)) {
            h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        h.b("Requesting rewarded ad from adapter.");
        try {
            k6.a aVar2 = (k6.a) this.zza;
            zzbqf zzbqfVar = new zzbqf(this, zzbpmVar);
            zzW(str, o3Var, null);
            zzV(o3Var);
            zzX(o3Var);
            Location location = o3Var.f3380v;
            zzY(str, o3Var);
            aVar2.loadRewardedAd(new q(), zzbqfVar);
        } catch (Exception e) {
            h.e("", e);
            zzbpd.zza(aVar, e, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzB(o3 o3Var, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof k6.a) {
            zzA(this.zzd, o3Var, str, new zzbqk((k6.a) obj, this.zzc));
            return;
        }
        h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzC(q7.a aVar, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof k6.a)) {
            h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        h.b("Requesting rewarded interstitial ad from adapter.");
        try {
            k6.a aVar2 = (k6.a) this.zza;
            zzbqf zzbqfVar = new zzbqf(this, zzbpmVar);
            zzW(str, o3Var, null);
            zzV(o3Var);
            zzX(o3Var);
            Location location = o3Var.f3380v;
            zzY(str, o3Var);
            aVar2.loadRewardedInterstitialAd(new q(), zzbqfVar);
        } catch (Exception e) {
            zzbpd.zza(aVar, e, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzD(q7.a aVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof e) {
            try {
                ((e) obj).onPause();
            } catch (Throwable th) {
                h.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof e) {
            try {
                ((e) obj).onResume();
            } catch (Throwable th) {
                h.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzG(boolean z4) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z4);
                return;
            } catch (Throwable th) {
                h.e("", th);
                return;
            }
        }
        h.b(AbstractAdViewAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzH(q7.a aVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof k6.a) {
            h.b("Show app open ad from adapter.");
            h.d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzI() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            h.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th) {
                h.e("", th);
                throw new RemoteException();
            }
        }
        h.g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzJ(q7.a aVar) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof k6.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzI();
                return;
            } else {
                h.b("Show interstitial ad from adapter.");
                h.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        h.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzK(q7.a aVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof k6.a) {
            h.b("Show rewarded ad from adapter.");
            h.d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzL() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof k6.a) {
            h.d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final boolean zzN() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof k6.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        Object obj2 = this.zza;
        h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbpr zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbps zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final j2 zzh() {
        Object obj = this.zza;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                h.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbgs zzi() {
        zzbgt zzbgtVarZzc;
        zzbqj zzbqjVar = this.zzb;
        if (zzbqjVar == null || (zzbgtVarZzc = zzbqjVar.zzc()) == null) {
            return null;
        }
        return zzbgtVarZzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbpp zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbpv zzk() {
        t tVar;
        t tVarZza;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof k6.a) || (tVar = this.zzg) == null) {
                return null;
            }
            return new zzbqn(tVar);
        }
        zzbqj zzbqjVar = this.zzb;
        if (zzbqjVar == null || (tVarZza = zzbqjVar.zza()) == null) {
            return null;
        }
        return new zzbqn(tVarZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbru zzl() {
        Object obj = this.zza;
        if (!(obj instanceof k6.a)) {
            return null;
        }
        ((k6.a) obj).getVersionInfo();
        return zzbru.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbru zzm() {
        Object obj = this.zza;
        if (!(obj instanceof k6.a)) {
            return null;
        }
        ((k6.a) obj).getSDKVersionInfo();
        return zzbru.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final q7.a zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                h.e("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof k6.a) {
            return new b(this.zze);
        }
        h.g(MediationBannerAdapter.class.getCanonicalName() + " or " + k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof e) {
            try {
                ((e) obj).onDestroy();
            } catch (Throwable th) {
                h.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzp(q7.a aVar, o3 o3Var, String str, zzbwu zzbwuVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof k6.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = aVar;
            this.zzc = zzbwuVar;
            zzbwuVar.zzl(new b(this.zza));
            return;
        }
        Object obj2 = this.zza;
        h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzq(q7.a aVar, zzblt zzbltVar, List list) throws RemoteException {
        if (!(this.zza instanceof k6.a)) {
            throw new RemoteException();
        }
        zzbqa zzbqaVar = new zzbqa(this, zzbltVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((zzblz) it.next()).zza;
            int iHashCode = str.hashCode();
            w5.b bVar = null;
            w5.b bVar2 = w5.b.APP_OPEN_AD;
            switch (iHashCode) {
                case -1396342996:
                    if (str.equals("banner")) {
                        bVar = w5.b.BANNER;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        bVar = w5.b.NATIVE;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        bVar = w5.b.REWARDED;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        bVar = w5.b.INTERSTITIAL;
                    }
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        bVar = bVar2;
                    }
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzlz)).booleanValue()) {
                            bVar = bVar2;
                        }
                    }
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        bVar = w5.b.REWARDED_INTERSTITIAL;
                    }
                    break;
            }
            if (bVar != null) {
                arrayList.add(new b9.e(19));
            }
        }
        ((k6.a) this.zza).initialize((Context) b.I(aVar), zzbqaVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzr(q7.a aVar, zzbwu zzbwuVar, List list) throws RemoteException {
        h.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzs(o3 o3Var, String str) throws RemoteException {
        zzB(o3Var, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzt(q7.a aVar, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof k6.a)) {
            h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        h.b("Requesting app open ad from adapter.");
        try {
            k6.a aVar2 = (k6.a) this.zza;
            zzbqg zzbqgVar = new zzbqg(this, zzbpmVar);
            zzW(str, o3Var, null);
            zzV(o3Var);
            zzX(o3Var);
            Location location = o3Var.f3380v;
            zzY(str, o3Var);
            aVar2.loadAppOpenAd(new g(), zzbqgVar);
        } catch (Exception e) {
            h.e("", e);
            zzbpd.zza(aVar, e, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzu(q7.a aVar, q3 q3Var, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        zzv(aVar, q3Var, o3Var, str, null, zzbpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzv(q7.a aVar, q3 q3Var, o3 o3Var, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        w5.h hVar;
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof k6.a)) {
            h.g(MediationBannerAdapter.class.getCanonicalName() + " or " + k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        h.b("Requesting banner ad from adapter.");
        boolean z4 = q3Var.f3418y;
        int i = q3Var.f3407b;
        int i10 = q3Var.e;
        if (z4) {
            w5.h hVar2 = new w5.h(i10, i);
            hVar2.f9659d = true;
            hVar2.e = i;
            hVar = hVar2;
        } else {
            hVar = new w5.h(i10, i, q3Var.f3406a);
        }
        Object obj2 = this.zza;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = o3Var.e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j4 = o3Var.f3372b;
                zzbpy zzbpyVar = new zzbpy(j4 == -1 ? null : new Date(j4), o3Var.f3374d, hashSet, o3Var.f3380v, zzX(o3Var), o3Var.f3376r, o3Var.C, o3Var.E, zzY(str, o3Var));
                Bundle bundle = o3Var.f3382x;
                mediationBannerAdapter.requestBannerAd((Context) b.I(aVar), new zzbqj(zzbpmVar), zzW(str, o3Var, str2), hVar, zzbpyVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                h.e("", th);
                zzbpd.zza(aVar, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof k6.a) {
            try {
                zzbqb zzbqbVar = new zzbqb(this, zzbpmVar);
                zzW(str, o3Var, str2);
                zzV(o3Var);
                zzX(o3Var);
                Location location = o3Var.f3380v;
                zzY(str, o3Var);
                ((k6.a) obj2).loadBannerAd(new k6.h(), zzbqbVar);
            } catch (Throwable th2) {
                h.e("", th2);
                zzbpd.zza(aVar, th2, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzw(q7.a aVar, q3 q3Var, o3 o3Var, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof k6.a)) {
            h.g(k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        h.b("Requesting interscroller ad from adapter.");
        try {
            k6.a aVar2 = (k6.a) this.zza;
            zzbpz zzbpzVar = new zzbpz(this, zzbpmVar, aVar2);
            zzW(str, o3Var, str2);
            zzV(o3Var);
            zzX(o3Var);
            Location location = o3Var.f3380v;
            zzY(str, o3Var);
            int i = q3Var.e;
            int i10 = q3Var.f3407b;
            w5.h hVar = new w5.h(i, i10);
            hVar.f9660f = true;
            hVar.f9661g = i10;
            aVar2.loadInterscrollerAd(new k6.h(), zzbpzVar);
        } catch (Exception e) {
            h.e("", e);
            zzbpd.zza(aVar, e, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzx(q7.a aVar, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        zzy(aVar, o3Var, str, null, zzbpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzy(q7.a aVar, o3 o3Var, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof k6.a)) {
            h.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        h.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = o3Var.e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j4 = o3Var.f3372b;
                zzbpy zzbpyVar = new zzbpy(j4 == -1 ? null : new Date(j4), o3Var.f3374d, hashSet, o3Var.f3380v, zzX(o3Var), o3Var.f3376r, o3Var.C, o3Var.E, zzY(str, o3Var));
                Bundle bundle = o3Var.f3382x;
                mediationInterstitialAdapter.requestInterstitialAd((Context) b.I(aVar), new zzbqj(zzbpmVar), zzW(str, o3Var, str2), zzbpyVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                h.e("", th);
                zzbpd.zza(aVar, th, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof k6.a) {
            try {
                zzbqc zzbqcVar = new zzbqc(this, zzbpmVar);
                zzW(str, o3Var, str2);
                zzV(o3Var);
                zzX(o3Var);
                Location location = o3Var.f3380v;
                zzY(str, o3Var);
                ((k6.a) obj2).loadInterstitialAd(new l(), zzbqcVar);
            } catch (Throwable th2) {
                h.e("", th2);
                zzbpd.zza(aVar, th2, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzz(q7.a aVar, o3 o3Var, String str, String str2, zzbpm zzbpmVar, zzbfn zzbfnVar, List list) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof k6.a)) {
            h.g(MediationNativeAdapter.class.getCanonicalName() + " or " + k6.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        h.b("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = o3Var.e;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j4 = o3Var.f3372b;
                zzbqm zzbqmVar = new zzbqm(j4 == -1 ? null : new Date(j4), o3Var.f3374d, hashSet, o3Var.f3380v, zzX(o3Var), o3Var.f3376r, zzbfnVar, list, o3Var.C, o3Var.E, zzY(str, o3Var));
                Bundle bundle = o3Var.f3382x;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbqj(zzbpmVar);
                mediationNativeAdapter.requestNativeAd((Context) b.I(aVar), this.zzb, zzW(str, o3Var, str2), zzbqmVar, bundle2);
                return;
            } catch (Throwable th) {
                h.e("", th);
                zzbpd.zza(aVar, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof k6.a) {
            try {
                zzbqe zzbqeVar = new zzbqe(this, zzbpmVar);
                zzW(str, o3Var, str2);
                zzV(o3Var);
                zzX(o3Var);
                Location location = o3Var.f3380v;
                zzY(str, o3Var);
                ((k6.a) obj2).loadNativeAdMapper(new n(), zzbqeVar);
            } catch (Throwable th2) {
                h.e("", th2);
                zzbpd.zza(aVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    k6.a aVar2 = (k6.a) this.zza;
                    zzbqd zzbqdVar = new zzbqd(this, zzbpmVar);
                    zzW(str, o3Var, str2);
                    zzV(o3Var);
                    zzX(o3Var);
                    Location location2 = o3Var.f3380v;
                    zzY(str, o3Var);
                    aVar2.loadNativeAd(new n(), zzbqdVar);
                } catch (Throwable th3) {
                    h.e("", th3);
                    zzbpd.zza(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    public zzbqh(e eVar) {
        this.zza = eVar;
    }
}
