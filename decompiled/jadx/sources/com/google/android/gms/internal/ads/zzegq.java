package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d6.p;
import fd.e;
import i6.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzegq implements zzefb {
    private final Context zza;
    private final zzdgn zzb;
    private final Executor zzc;
    private final zzfes zzd;

    public zzegq(Context context, Executor executor, zzdgn zzdgnVar, zzfes zzfesVar) {
        this.zza = context;
        this.zzb = zzdgnVar;
        this.zzc = executor;
        this.zzd = zzfesVar;
    }

    private static String zzd(zzfet zzfetVar) {
        try {
            return zzfetVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        String strZzd = zzd(zzfetVar);
        final Uri uri = strZzd != null ? Uri.parse(strZzd) : null;
        return zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzego
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc(uri, zzfffVar, zzfetVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbdo.zzg(context) && !TextUtils.isEmpty(zzd(zzfetVar));
    }

    public final /* synthetic */ m9.a zzc(Uri uri, zzfff zzfffVar, zzfet zzfetVar, Object obj) throws Exception {
        try {
            Intent intent = (Intent) new e().b().f5061b;
            intent.setData(uri);
            g6.e eVar = new g6.e(intent, null);
            final zzcao zzcaoVar = new zzcao();
            zzdfk zzdfkVarZze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, null), new zzdfn(new zzdgv() { // from class: com.google.android.gms.internal.ads.zzegp
                @Override // com.google.android.gms.internal.ads.zzdgv
                public final void zza(boolean z4, Context context, zzcwz zzcwzVar) {
                    zzcao zzcaoVar2 = zzcaoVar;
                    try {
                        b9.e eVar2 = p.C.f2978b;
                        b9.e.y(context, (AdOverlayInfoParcel) zzcaoVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcaoVar.zzc(new AdOverlayInfoParcel(eVar, null, zzdfkVarZze.zza(), null, new i6.a(0, 0, false), null, null));
            this.zzd.zza();
            return zzgei.zzh(zzdfkVarZze.zzg());
        } catch (Throwable th) {
            h.e("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
