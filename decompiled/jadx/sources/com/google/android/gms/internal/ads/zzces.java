package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import d6.p;
import e6.t;
import h6.k0;
import h6.r0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzces extends zzcbw implements zzhd, zzlz {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzced zzc;
    private final zzyb zzd;
    private final zzcce zze;
    private final WeakReference zzf;
    private final zzvv zzg;
    private zzir zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbv zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcef zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code duplicated, block: B:22:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e6  */
    public zzces(Context context, zzcce zzcceVar, zzccf zzccfVar, Integer num) {
        final boolean z4;
        final zzgc zzgcVar;
        this.zzb = context;
        this.zze = zzcceVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzccfVar);
        zzced zzcedVar = new zzced();
        this.zzc = zzcedVar;
        zzyb zzybVar = new zzyb(context);
        this.zzd = zzybVar;
        if (k0.m()) {
            k0.k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcbw.zzD().incrementAndGet();
        zzlt zzltVar = new zzlt(context, new zzcep(this));
        zzltVar.zzb(zzybVar);
        zzltVar.zza(zzcedVar);
        zzlu zzluVarZzc = zzltVar.zzc();
        this.zzh = zzluVarZzc;
        zzluVarZzc.zzy(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzfwo.zzd(zzccfVar != null ? zzccfVar.zzr() : null).zzb("");
        this.zzp = zzccfVar != null ? zzccfVar.zzf() : 0;
        final String strW = p.C.f2979c.w(context, zzccfVar.zzn().f5213a);
        if (!this.zzj || this.zzi.limit() <= 0) {
            zzbce zzbceVar = zzbcn.zzce;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                if (!((Boolean) tVar.f3440c.zza(zzbcn.zzbW)).booleanValue()) {
                    z4 = zzcceVar.zzi ? false : true;
                }
            } else if (zzcceVar.zzi) {
            }
            final zzgc zzgcVar2 = zzcceVar.zzl ? new zzgc() { // from class: com.google.android.gms.internal.ads.zzcej
                @Override // com.google.android.gms.internal.ads.zzgc
                public final zzgd zza() {
                    return this.zza.zzW(strW, z4);
                }
            } : zzcceVar.zzh > 0 ? new zzgc() { // from class: com.google.android.gms.internal.ads.zzcek
                @Override // com.google.android.gms.internal.ads.zzgc
                public final zzgd zza() {
                    return this.zza.zzX(strW, z4);
                }
            } : new zzgc() { // from class: com.google.android.gms.internal.ads.zzcel
                @Override // com.google.android.gms.internal.ads.zzgc
                public final zzgd zza() {
                    return this.zza.zzY(strW, z4);
                }
            };
            zzgcVar = zzcceVar.zzi ? new zzgc() { // from class: com.google.android.gms.internal.ads.zzcem
                @Override // com.google.android.gms.internal.ads.zzgc
                public final zzgd zza() {
                    return this.zza.zzZ(zzgcVar2);
                }
            } : zzgcVar2;
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzi.limit()];
                this.zzi.get(bArr);
                zzgcVar = new zzgc() { // from class: com.google.android.gms.internal.ads.zzcen
                    @Override // com.google.android.gms.internal.ads.zzgc
                    public final zzgd zza() {
                        int i = zzces.zza;
                        zzgd zzgdVarZza = zzgcVar.zza();
                        byte[] bArr2 = bArr;
                        return new zzceg(new zzfy(bArr2), bArr2.length, zzgdVarZza);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzi.limit()];
            this.zzi.get(bArr2);
            zzgcVar = new zzgc() { // from class: com.google.android.gms.internal.ads.zzceh
                @Override // com.google.android.gms.internal.ads.zzgc
                public final zzgd zza() {
                    return new zzfy(bArr2);
                }
            };
        }
        this.zzg = new zzvv(zzgcVar, new zzvu(((Boolean) t.f3437d.f3440c.zza(zzbcn.zzl)).booleanValue() ? new zzacw() { // from class: com.google.android.gms.internal.ads.zzcer
            @Override // com.google.android.gms.internal.ads.zzacw
            public final /* synthetic */ zzacr[] zza(Uri uri, Map map) {
                int i = zzces.zza;
                return new zzacr[]{new zzaiy(), new zzahq(), new zzait(zzakg.zza, 32, null, null, zzfzo.zzn(), null)};
            }
        } : new zzacw() { // from class: com.google.android.gms.internal.ads.zzcei
            @Override // com.google.android.gms.internal.ads.zzacw
            public final /* synthetic */ zzacr[] zza(Uri uri, Map map) {
                int i = zzces.zza;
                return new zzacr[]{new zzaiy(), new zzahq()};
            }
        }));
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcbw.zzD().decrementAndGet();
        if (k0.m()) {
            k0.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j4 = this.zzn;
                Map mapZze = ((zzgy) this.zzs.remove(0)).zze();
                long j10 = 0;
                if (mapZze != null) {
                    for (Map.Entry entry : mapZze.entrySet()) {
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfwa.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j10 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j4 + j10;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z4) {
        zzut zzvgVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z4;
            int length = uriArr.length;
            if (length == 1) {
                zzvgVar = zzaa(uriArr[0]);
            } else {
                zzut[] zzutVarArr = new zzut[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzutVarArr[i] = zzaa(uriArr[i]);
                }
                zzvgVar = new zzvg(false, false, new zzuc(), zzutVarArr);
            }
            this.zzh.zzB(zzvgVar);
            this.zzh.zzp();
            zzcbw.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzH() {
        zzir zzirVar = this.zzh;
        if (zzirVar != null) {
            zzirVar.zzA(this);
            this.zzh.zzz();
            this.zzh = null;
            zzcbw.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzI(long j4) {
        zzi zziVar = (zzi) this.zzh;
        zziVar.zza(zziVar.zzd(), j4, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzJ(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzK(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzL(zzcbv zzcbvVar) {
        this.zzk = zzcbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzM(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzN(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzO(boolean z4) {
        this.zzh.zzq(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzQ(boolean z4) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzx();
            if (i >= 2) {
                return;
            }
            zzyb zzybVar = this.zzd;
            zzxo zzxoVarZzc = zzybVar.zzf().zzc();
            zzxoVarZzc.zzp(i, !z4);
            zzybVar.zzl(zzxoVarZzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzR(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcec zzcecVar = (zzcec) ((WeakReference) it.next()).get();
            if (zzcecVar != null) {
                zzcecVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzS(Surface surface, boolean z4) {
        zzir zzirVar = this.zzh;
        if (zzirVar != null) {
            zzirVar.zzr(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzT(float f10, boolean z4) {
        zzir zzirVar = this.zzh;
        if (zzirVar != null) {
            zzirVar.zzs(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzU() {
        this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final boolean zzV() {
        return this.zzh != null;
    }

    public final /* synthetic */ zzgd zzW(String str, boolean z4) {
        zzces zzcesVar = true != z4 ? null : this;
        zzcce zzcceVar = this.zze;
        return new zzcev(str, zzcesVar, zzcceVar.zzd, zzcceVar.zze, zzcceVar.zzm, zzcceVar.zzn);
    }

    public final /* synthetic */ zzgd zzX(String str, boolean z4) {
        zzces zzcesVar = true != z4 ? null : this;
        zzcce zzcceVar = this.zze;
        zzcec zzcecVar = new zzcec(str, zzcesVar, zzcceVar.zzd, zzcceVar.zze, zzcceVar.zzh);
        this.zzu.add(new WeakReference(zzcecVar));
        return zzcecVar;
    }

    public final /* synthetic */ zzgd zzY(String str, boolean z4) {
        zzgl zzglVar = new zzgl();
        zzglVar.zzf(str);
        zzglVar.zze(true != z4 ? null : this);
        zzglVar.zzc(this.zze.zzd);
        zzglVar.zzd(this.zze.zze);
        zzglVar.zzb(true);
        return zzglVar.zza();
    }

    public final /* synthetic */ zzgd zzZ(zzgc zzgcVar) {
        zzgd zzgdVarZza = zzgcVar.zza();
        zzceq zzceqVar = new zzceq(this);
        return new zzcef(this.zzb, zzgdVarZza, this.zzo, this.zzp, this, zzceqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zza(zzgd zzgdVar, zzgi zzgiVar, boolean z4, int i) {
        this.zzl += i;
    }

    public final zzut zzaa(Uri uri) {
        zzak zzakVar = new zzak();
        zzakVar.zzb(uri);
        zzaw zzawVarZzc = zzakVar.zzc();
        zzvv zzvvVar = this.zzg;
        zzvvVar.zza(this.zze.zzf);
        return zzvvVar.zzb(zzawVarZzc);
    }

    public final /* synthetic */ void zzab(boolean z4, long j4) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzi(z4, j4);
        }
    }

    public final /* synthetic */ zzln[] zzac(Handler handler, zzabg zzabgVar, zzpn zzpnVar, zzwu zzwuVar, zztp zztpVar) {
        zzta zztaVar = zzta.zza;
        Context context = this.zzb;
        zzrc zzrcVar = new zzrc(context, new zzsf(context), zztaVar, false, handler, zzpnVar, new zzqk(context).zzc());
        Context context2 = this.zzb;
        return new zzln[]{zzrcVar, new zzaai(context2, new zzsf(context2), zztaVar, 0L, false, handler, zzabgVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzd(zzgd zzgdVar, zzgi zzgiVar, boolean z4) {
        if (zzgdVar instanceof zzgy) {
            synchronized (this.zzq) {
                this.zzs.add((zzgy) zzgdVar);
            }
        } else if (zzgdVar instanceof zzcef) {
            this.zzt = (zzcef) zzgdVar;
            final zzccf zzccfVar = (zzccf) this.zzf.get();
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue() && zzccfVar != null && this.zzt.zzn()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = zzces.zza;
                        zzccfVar.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zze(zzlx zzlxVar, zzad zzadVar, zzhy zzhyVar) {
        zzccf zzccfVar = (zzccf) this.zzf.get();
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue() || zzccfVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzadVar.zzn;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzadVar.zzo;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzadVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzccfVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzh(zzlx zzlxVar, int i, long j4) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzj(zzlx zzlxVar, zzui zzuiVar, zzun zzunVar, IOException iOException, boolean z4) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            if (this.zze.zzj) {
                zzcbvVar.zzl("onLoadException", iOException);
            } else {
                zzcbvVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzk(zzlx zzlxVar, int i) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzl(zzlx zzlxVar, zzbi zzbiVar) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzk("onPlayerError", zzbiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzn(zzlx zzlxVar, Object obj, long j4) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzp(zzlx zzlxVar, zzad zzadVar, zzhy zzhyVar) {
        zzccf zzccfVar = (zzccf) this.zzf.get();
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue() || zzccfVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzadVar.zzw));
        map.put("bitRate", String.valueOf(zzadVar.zzj));
        map.put("resolution", zzadVar.zzu + "x" + zzadVar.zzv);
        String str = zzadVar.zzn;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzadVar.zzo;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzadVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzccfVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzq(zzlx zzlxVar, zzci zzciVar) {
        zzcbv zzcbvVar = this.zzk;
        if (zzcbvVar != null) {
            zzcbvVar.zzD(zzciVar.zzb, zzciVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzg(zzlx zzlxVar, zzun zzunVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzi(zzbp zzbpVar, zzly zzlyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzo(zzlx zzlxVar, zzhx zzhxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzb(zzgd zzgdVar, zzgi zzgiVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzhd
    public final void zzc(zzgd zzgdVar, zzgi zzgiVar, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzf(zzlx zzlxVar, int i, long j4, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzm(zzlx zzlxVar, zzbn zzbnVar, zzbn zzbnVar2, int i) {
    }
}
