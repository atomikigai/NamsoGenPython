package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import e6.j2;
import e6.o3;
import e6.q3;
import e6.s;
import i6.d;
import i6.h;
import java.util.Iterator;
import k6.f;
import k6.g;
import k6.k;
import k6.l;
import k6.n;
import k6.p;
import k6.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbrs extends zzbre {
    private final RtbAdapter zza;
    private k zzb;
    private p zzc;
    private f zzd;
    private String zze = "";

    public zzbrs(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(o3 o3Var) {
        Bundle bundle;
        Bundle bundle2 = o3Var.f3382x;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        h.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            h.e("", e);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(o3 o3Var) {
        if (o3Var.f3375f) {
            return true;
        }
        d dVar = s.f3427f.f3428a;
        return d.m();
    }

    private static final String zzy(String str, o3 o3Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return o3Var.F;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final j2 zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbru zzf() throws RemoteException {
        this.zza.getVersionInfo();
        return zzbru.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbru zzg() throws RemoteException {
        this.zza.getSDKVersionInfo();
        return zzbru.zza(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (((java.lang.Boolean) e6.t.f3437d.f3440c.zza(com.google.android.gms.internal.ads.zzbcn.zzlz)).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r4.equals("app_open") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r4.equals("interstitial") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r4.equals("rewarded") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r4.equals("native") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r4.equals("banner") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        new java.util.ArrayList().add(new b9.e(19));
        r8 = (android.content.Context) q7.b.I(r3);
        new w5.h(r7.e, r7.f3407b, r7.f3406a);
        r6.collectSignals(new m6.a(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r4.equals("rewarded_interstitial") != false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbrf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(q7.a r3, java.lang.String r4, android.os.Bundle r5, android.os.Bundle r6, e6.q3 r7, com.google.android.gms.internal.ads.zzbri r8) throws android.os.RemoteException {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzbrq r5 = new com.google.android.gms.internal.ads.zzbrq     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2, r8)     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r6 = r2.zza     // Catch: java.lang.Throwable -> L36
            b9.e r8 = new b9.e     // Catch: java.lang.Throwable -> L36
            int r0 = r4.hashCode()     // Catch: java.lang.Throwable -> L36
            switch(r0) {
                case -1396342996: goto L5c;
                case -1052618729: goto L53;
                case -239580146: goto L4a;
                case 604727084: goto L41;
                case 1167692200: goto L38;
                case 1778294298: goto L1b;
                case 1911491517: goto L12;
                default: goto L10;
            }
        L10:
            goto L8b
        L12:
            java.lang.String r0 = "rewarded_interstitial"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L1b:
            java.lang.String r0 = "app_open_ad"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            com.google.android.gms.internal.ads.zzbce r4 = com.google.android.gms.internal.ads.zzbcn.zzlz     // Catch: java.lang.Throwable -> L36
            e6.t r0 = e6.t.f3437d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbcl r0 = r0.f3440c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r0.zza(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L36
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L8b
            goto L64
        L36:
            r4 = move-exception
            goto L93
        L38:
            java.lang.String r0 = "app_open"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L41:
            java.lang.String r0 = "interstitial"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L4a:
            java.lang.String r0 = "rewarded"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L53:
            java.lang.String r0 = "native"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
            goto L64
        L5c:
            java.lang.String r0 = "banner"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L8b
        L64:
            r4 = 19
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            r4.add(r8)     // Catch: java.lang.Throwable -> L36
            m6.a r4 = new m6.a     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = q7.b.I(r3)     // Catch: java.lang.Throwable -> L36
            android.content.Context r8 = (android.content.Context) r8     // Catch: java.lang.Throwable -> L36
            int r8 = r7.e     // Catch: java.lang.Throwable -> L36
            int r0 = r7.f3407b     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = r7.f3406a     // Catch: java.lang.Throwable -> L36
            w5.h r1 = new w5.h     // Catch: java.lang.Throwable -> L36
            r1.<init>(r8, r0, r7)     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            r6.collectSignals(r4, r5)     // Catch: java.lang.Throwable -> L36
            return
        L8b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "Internal Error"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L36
            throw r4     // Catch: java.lang.Throwable -> L36
        L93:
            java.lang.String r5 = "Error generating signals for RTB"
            i6.h.e(r5, r4)
            java.lang.String r5 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.zzbpd.zza(r3, r4, r5)
            android.os.RemoteException r3 = new android.os.RemoteException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbrs.zzh(q7.a, java.lang.String, android.os.Bundle, android.os.Bundle, e6.q3, com.google.android.gms.internal.ads.zzbri):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzi(String str, String str2, o3 o3Var, q7.a aVar, zzbqq zzbqqVar, zzbpm zzbpmVar) throws RemoteException {
        try {
            zzbrp zzbrpVar = new zzbrp(this, zzbqqVar, zzbpmVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(o3Var);
            zzx(o3Var);
            Location location = o3Var.f3380v;
            zzy(str2, o3Var);
            rtbAdapter.loadRtbAppOpenAd(new g(), zzbrpVar);
        } catch (Throwable th) {
            h.e("Adapter failed to render app open ad.", th);
            zzbpd.zza(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzj(String str, String str2, o3 o3Var, q7.a aVar, zzbqt zzbqtVar, zzbpm zzbpmVar, q3 q3Var) throws RemoteException {
        try {
            zzbrk zzbrkVar = new zzbrk(this, zzbqtVar, zzbpmVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(o3Var);
            zzx(o3Var);
            Location location = o3Var.f3380v;
            zzy(str2, o3Var);
            new w5.h(q3Var.e, q3Var.f3407b, q3Var.f3406a);
            rtbAdapter.loadRtbBannerAd(new k6.h(), zzbrkVar);
        } catch (Throwable th) {
            h.e("Adapter failed to render banner ad.", th);
            zzbpd.zza(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzk(String str, String str2, o3 o3Var, q7.a aVar, zzbqt zzbqtVar, zzbpm zzbpmVar, q3 q3Var) throws RemoteException {
        try {
            zzbrl zzbrlVar = new zzbrl(this, zzbqtVar, zzbpmVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(o3Var);
            zzx(o3Var);
            Location location = o3Var.f3380v;
            zzy(str2, o3Var);
            new w5.h(q3Var.e, q3Var.f3407b, q3Var.f3406a);
            rtbAdapter.loadRtbInterscrollerAd(new k6.h(), zzbrlVar);
        } catch (Throwable th) {
            h.e("Adapter failed to render interscroller ad.", th);
            zzbpd.zza(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzl(String str, String str2, o3 o3Var, q7.a aVar, zzbqw zzbqwVar, zzbpm zzbpmVar) throws RemoteException {
        try {
            zzbrm zzbrmVar = new zzbrm(this, zzbqwVar, zzbpmVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(o3Var);
            zzx(o3Var);
            Location location = o3Var.f3380v;
            zzy(str2, o3Var);
            rtbAdapter.loadRtbInterstitialAd(new l(), zzbrmVar);
        } catch (Throwable th) {
            h.e("Adapter failed to render interstitial ad.", th);
            zzbpd.zza(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzm(String str, String str2, o3 o3Var, q7.a aVar, zzbqz zzbqzVar, zzbpm zzbpmVar) throws RemoteException {
        zzn(str, str2, o3Var, aVar, zzbqzVar, zzbpmVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzn(String str, String str2, o3 o3Var, q7.a aVar, zzbqz zzbqzVar, zzbpm zzbpmVar, zzbfn zzbfnVar) throws RemoteException {
        try {
            zzbrn zzbrnVar = new zzbrn(this, zzbqzVar, zzbpmVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(o3Var);
            zzx(o3Var);
            Location location = o3Var.f3380v;
            zzy(str2, o3Var);
            rtbAdapter.loadRtbNativeAdMapper(new n(), zzbrnVar);
        } catch (Throwable th) {
            h.e("Adapter failed to render native ad.", th);
            zzbpd.zza(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                zzbro zzbroVar = new zzbro(this, zzbqzVar, zzbpmVar);
                RtbAdapter rtbAdapter2 = this.zza;
                zzw(str2);
                zzv(o3Var);
                zzx(o3Var);
                Location location2 = o3Var.f3380v;
                zzy(str2, o3Var);
                rtbAdapter2.loadRtbNativeAd(new n(), zzbroVar);
            } catch (Throwable th2) {
                h.e("Adapter failed to render native ad.", th2);
                zzbpd.zza(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzo(String str, String str2, o3 o3Var, q7.a aVar, zzbrc zzbrcVar, zzbpm zzbpmVar) throws RemoteException {
        try {
            zzbrr zzbrrVar = new zzbrr(this, zzbrcVar, zzbpmVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(o3Var);
            zzx(o3Var);
            Location location = o3Var.f3380v;
            zzy(str2, o3Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new q(), zzbrrVar);
        } catch (Throwable th) {
            h.e("Adapter failed to render rewarded interstitial ad.", th);
            zzbpd.zza(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzp(String str, String str2, o3 o3Var, q7.a aVar, zzbrc zzbrcVar, zzbpm zzbpmVar) throws RemoteException {
        try {
            zzbrr zzbrrVar = new zzbrr(this, zzbrcVar, zzbpmVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(o3Var);
            zzx(o3Var);
            Location location = o3Var.f3380v;
            zzy(str2, o3Var);
            rtbAdapter.loadRtbRewardedAd(new q(), zzbrrVar);
        } catch (Throwable th) {
            h.e("Adapter failed to render rewarded ad.", th);
            zzbpd.zza(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzr(q7.a aVar) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzs(q7.a aVar) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzt(q7.a aVar) throws RemoteException {
        return false;
    }
}
