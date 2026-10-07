package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import d6.p;
import h6.k0;
import h6.r0;
import i6.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzccx extends zzcbl implements TextureView.SurfaceTextureListener, zzcbv {
    private final zzccf zzc;
    private final zzccg zzd;
    private final zzcce zze;
    private zzcbk zzf;
    private Surface zzg;
    private zzcbw zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzccd zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzccx(Context context, zzccg zzccgVar, zzccf zzccfVar, boolean z4, boolean z10, zzcce zzcceVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzccfVar;
        this.zzd = zzccgVar;
        this.zzn = z4;
        this.zze = zzcceVar;
        setSurfaceTextureListener(this);
        zzccgVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z4, Integer num) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null && !z4) {
            zzcbwVar.zzP(num);
            return;
        }
        if (this.zzi == null || this.zzg == null) {
            return;
        }
        if (z4) {
            if (!zzad()) {
                h.g("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcbwVar.zzU();
                zzY();
            }
        }
        if (this.zzi.startsWith("cache:")) {
            zzcdr zzcdrVarZzp = this.zzc.zzp(this.zzi);
            if (zzcdrVarZzp instanceof zzcea) {
                zzcbw zzcbwVarZza = ((zzcea) zzcdrVarZzp).zza();
                this.zzh = zzcbwVarZza;
                zzcbwVarZza.zzP(num);
                if (!this.zzh.zzV()) {
                    h.g("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcdrVarZzp instanceof zzcdx)) {
                    h.g("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
                zzcdx zzcdxVar = (zzcdx) zzcdrVarZzp;
                String strZzF = zzF();
                ByteBuffer byteBufferZzl = zzcdxVar.zzl();
                boolean zZzm = zzcdxVar.zzm();
                String strZzk = zzcdxVar.zzk();
                if (strZzk == null) {
                    h.g("Stream cache URL is null.");
                    return;
                } else {
                    zzcbw zzcbwVarZzE = zzE(num);
                    this.zzh = zzcbwVarZzE;
                    zzcbwVarZzE.zzG(new Uri[]{Uri.parse(strZzk)}, strZzF, byteBufferZzl, zZzm);
                }
            }
        } else {
            this.zzh = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzj.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzj;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzh.zzF(uriArr, strZzF2);
        }
        this.zzh.zzL(this);
        zzZ(this.zzg, false);
        if (this.zzh.zzV()) {
            int iZzt = this.zzh.zzt();
            this.zzl = iZzt;
            if (iZzt == 3) {
                zzV();
            }
        }
    }

    private final void zzX() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcbw zzcbwVar = this.zzh;
            if (zzcbwVar != null) {
                zzcbwVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z4) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar == null) {
            h.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcbwVar.zzS(surface, z4);
        } catch (IOException e) {
            h.h("", e);
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i, int i10) {
        float f10 = i10 > 0 ? i / i10 : 1.0f;
        if (this.zzs != f10) {
            this.zzs = f10;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcbw zzcbwVar = this.zzh;
        return (zzcbwVar == null || !zzcbwVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzs;
        if (f10 != 0.0f && this.zzm == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzccd zzccdVar = this.zzm;
        if (zzccdVar != null) {
            zzccdVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        if (this.zzn) {
            zzccd zzccdVar = new zzccd(getContext());
            this.zzm = zzccdVar;
            zzccdVar.zzd(surfaceTexture, i, i10);
            this.zzm.start();
            SurfaceTexture surfaceTextureZzb = this.zzm.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i, i10);
        } else {
            zzaa();
        }
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcct
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzccd zzccdVar = this.zzm;
        if (zzccdVar != null) {
            zzccdVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i10) {
        zzccd zzccdVar = this.zzm;
        if (zzccdVar != null) {
            zzccdVar.zzc(i, i10);
        }
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcco
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(i, i10);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        k0.k("AdExoPlayerView3 window visibility changed to " + i);
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzQ(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzA(int i) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzN(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzB(int i) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzR(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        boolean z4 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzl == 4) {
            z4 = true;
        }
        this.zzi = str;
        zzW(z4, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzD(int i, int i10) {
        this.zzq = i;
        this.zzr = i10;
        zzaa();
    }

    public final zzcbw zzE(Integer num) {
        zzcce zzcceVar = this.zze;
        zzccf zzccfVar = this.zzc;
        zzces zzcesVar = new zzces(zzccfVar.getContext(), zzcceVar, zzccfVar, num);
        h.f("ExoPlayerAdapter initialized.");
        return zzcesVar;
    }

    public final String zzF() {
        zzccf zzccfVar = this.zzc;
        return p.C.f2979c.w(zzccfVar.getContext(), zzccfVar.zzn().f5213a);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z4, long j4) {
        this.zzc.zzv(z4, j4);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i, int i10) {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzj(i, i10);
        }
    }

    public final /* synthetic */ void zzP() {
        float fZza = this.zzb.zza();
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar == null) {
            h.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcbwVar.zzT(fZza, false);
        } catch (IOException e) {
            h.h("", e);
        }
    }

    public final /* synthetic */ void zzQ(int i) {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.onWindowVisibilityChanged(i);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzb() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzf() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzg() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzh() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzi(final boolean z4, final long j4) {
        if (this.zzc != null) {
            zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzJ(z4, j4);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzk(String str, Exception exc) {
        final String strZzT = zzT(str, exc);
        h.g("ExoPlayerAdapter error: ".concat(strZzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(strZzT);
            }
        });
        p.C.f2982g.zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzl(String str, Exception exc) {
        final String strZzT = zzT("onLoadException", exc);
        h.g("ExoPlayerAdapter exception: ".concat(strZzT));
        p.C.f2982g.zzv(exc, "AdExoPlayerView.onException");
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK(strZzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzm(int i) {
        if (this.zzl != i) {
            this.zzl = i;
            if (i == 3) {
                zzV();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzX();
            }
            this.zzd.zze();
            this.zzb.zzc();
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzH();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl, com.google.android.gms.internal.ads.zzcci
    public final void zzn() {
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccs
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzq(int i) {
        if (zzac()) {
            this.zzh.zzI(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzr(zzcbk zzcbkVar) {
        this.zzf = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzu(float f10, float f11) {
        zzccd zzccdVar = this.zzm;
        if (zzccdVar != null) {
            zzccdVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzv() {
        r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcck
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final Integer zzw() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzx(int i) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzy(int i) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzK(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzz(int i) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzM(i);
        }
    }
}
