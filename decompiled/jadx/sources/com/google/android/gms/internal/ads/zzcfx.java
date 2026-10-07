package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import d6.j;
import d6.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcfx {
    public static final zzcfk zza(final Context context, final zzche zzcheVar, final String str, final boolean z4, final boolean z10, final zzavc zzavcVar, final zzbdu zzbduVar, final i6.a aVar, zzbdc zzbdcVar, final j jVar, final d6.a aVar2, final zzbbl zzbblVar, final zzfet zzfetVar, final zzfew zzfewVar, final zzeea zzeeaVar, final zzffs zzffsVar) throws zzcfw {
        zzbcn.zza(context);
        try {
            final zzbdc zzbdcVar2 = null;
            zzfxg zzfxgVar = new zzfxg(context, zzcheVar, str, z4, z10, zzavcVar, zzbduVar, aVar, zzbdcVar2, jVar, aVar2, zzbblVar, zzfetVar, zzfewVar, zzffsVar, zzeeaVar) { // from class: com.google.android.gms.internal.ads.zzcft
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzche zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzavc zzf;
                public final /* synthetic */ zzbdu zzg;
                public final /* synthetic */ i6.a zzh;
                public final /* synthetic */ j zzi;
                public final /* synthetic */ d6.a zzj;
                public final /* synthetic */ zzbbl zzk;
                public final /* synthetic */ zzfet zzl;
                public final /* synthetic */ zzfew zzm;
                public final /* synthetic */ zzffs zzn;
                public final /* synthetic */ zzeea zzo;

                {
                    this.zzi = jVar;
                    this.zzj = aVar2;
                    this.zzk = zzbblVar;
                    this.zzl = zzfetVar;
                    this.zzm = zzfewVar;
                    this.zzn = zzffsVar;
                    this.zzo = zzeeaVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfxg
                public final Object zza() {
                    zzche zzcheVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z11 = this.zzd;
                    zzbbl zzbblVar2 = this.zzk;
                    boolean z12 = this.zze;
                    zzavc zzavcVar2 = this.zzf;
                    zzfet zzfetVar2 = this.zzl;
                    zzbdu zzbduVar2 = this.zzg;
                    j jVar2 = this.zzi;
                    zzfew zzfewVar2 = this.zzm;
                    Context context2 = this.zza;
                    i6.a aVar3 = this.zzh;
                    d6.a aVar4 = this.zzj;
                    zzffs zzffsVar2 = this.zzn;
                    zzeea zzeeaVar2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcgj.zza;
                        zzcgc zzcgcVar = new zzcgc(new zzcgj(new zzchd(context2), zzcheVar2, str2, z11, z12, zzavcVar2, zzbduVar2, aVar3, null, jVar2, aVar4, zzbblVar2, zzfetVar2, zzfewVar2, zzffsVar2));
                        p.C.e.getClass();
                        zzcgcVar.setWebViewClient(new zzcgt(zzcgcVar, zzbblVar2, z12, zzeeaVar2));
                        zzcgcVar.setWebChromeClient(new zzcfj(zzcgcVar));
                        return zzcgcVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (zzcfk) zzfxgVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcfw("Webview initialization failed.", th);
        }
    }
}
