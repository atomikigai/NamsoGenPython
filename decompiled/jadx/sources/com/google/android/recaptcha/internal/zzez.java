package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r7.g;
import rc.b0;
import rc.p;
import rc.q;
import rc.t1;
import ub.h;
import vb.i;
import vb.j;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzez implements zza {
    public static final zzep zza = new zzep(null);
    public p zzb;
    public zzbu zzc;
    private final WebView zzd;
    private final String zze;
    private final Context zzf;
    private final zzab zzg;
    private final zzbd zzh;
    private final zzbg zzi;
    private final zzbq zzj;
    private final Map zzk = zzfa.zza();
    private final Map zzl;
    private final Map zzm;
    private final zzfh zzn;
    private final zzeq zzo;
    private final zzbd zzp;
    private final zzt zzq;

    public zzez(WebView webView, String str, Context context, zzab zzabVar, zzbd zzbdVar, zzt zztVar, zzbg zzbgVar, zzbq zzbqVar) {
        this.zzd = webView;
        this.zze = str;
        this.zzf = context;
        this.zzg = zzabVar;
        this.zzh = zzbdVar;
        this.zzq = zztVar;
        this.zzi = zzbgVar;
        this.zzj = zzbqVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzl = linkedHashMap;
        this.zzm = linkedHashMap;
        this.zzn = zzfh.zzc();
        zzeq zzeqVar = new zzeq(this);
        this.zzo = zzeqVar;
        zzbd zzbdVarZzb = zzbdVar.zzb();
        zzbdVarZzb.zzc(zzbdVar.zzd());
        this.zzp = zzbdVarZzb;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzeqVar, "RN");
        webView.setWebViewClient(new zzeu(this));
    }

    public static final /* synthetic */ void zzl(zzez zzezVar, zzoe zzoeVar) {
        zzezVar.zzd.clearCache(true);
        zzbb zzbbVarZza = zzezVar.zzp.zza(zzne.INIT_NETWORK);
        zzbg zzbgVar = zzezVar.zzi;
        zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
        b0.q(zzezVar.zzq.zza(), null, new zzey(zzezVar, zzoeVar, zzbbVarZza, null), 3);
    }

    public static final /* synthetic */ void zzm(zzez zzezVar, String str) {
        zzbb zzbbVarZza = zzezVar.zzp.zza(zzne.LOAD_WEBVIEW);
        try {
            zzbg zzbgVar = zzezVar.zzi;
            zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
            zzezVar.zzd.loadDataWithBaseURL(zzezVar.zzg.zza(), str, "text/html", "utf-8", null);
        } catch (Exception unused) {
            zzp zzpVar = new zzp(zzn.zzc, zzl.zzag, null);
            zzezVar.zzi.zzb(zzbbVarZza, zzpVar, null);
            ((q) zzezVar.zzk()).W(zzpVar);
        }
    }

    private final zzp zzp(Exception exc, zzp zzpVar) {
        if (exc instanceof t1) {
            return new zzp(zzn.zzc, zzl.zzj, null);
        }
        return exc instanceof zzp ? (zzp) exc : zzpVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zza
    public final Object zza(String str, long j4, d dVar) {
        zzer zzerVar;
        Exception e;
        zzez zzezVar;
        zzp zzpVarZzp;
        p pVar;
        if (dVar instanceof zzer) {
            zzerVar = (zzer) dVar;
            int i = zzerVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzerVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzerVar = new zzer(this, dVar);
            }
        } else {
            zzerVar = new zzer(this, dVar);
        }
        Object objZ = zzerVar.zza;
        a aVar = a.f11555a;
        int i10 = zzerVar.zzc;
        if (i10 == 0) {
            g.G(objZ);
            try {
                zzet zzetVar = new zzet(str, this, null);
                zzerVar.zzd = this;
                zzerVar.zze = str;
                zzerVar.zzc = 1;
                objZ = b0.z(j4, zzetVar, zzerVar);
                if (objZ == aVar) {
                    return aVar;
                }
                zzezVar = this;
            } catch (Exception e4) {
                e = e4;
                zzezVar = this;
                zzpVarZzp = zzezVar.zzp(e, new zzp(zzn.zzc, zzl.zzai, e.getClass().getSimpleName()));
                pVar = (p) zzezVar.zzl.remove(str);
                if (pVar != null) {
                    ((q) pVar).W(zzpVarZzp);
                }
                return g.m(zzpVarZzp);
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzerVar.zze;
            zzezVar = zzerVar.zzd;
            try {
                g.G(objZ);
            } catch (Exception e10) {
                e = e10;
                zzpVarZzp = zzezVar.zzp(e, new zzp(zzn.zzc, zzl.zzai, e.getClass().getSimpleName()));
                pVar = (p) zzezVar.zzl.remove(str);
                if (pVar != null) {
                    ((q) pVar).W(zzpVarZzp);
                }
                return g.m(zzpVarZzp);
            }
        }
        return (zzog) objZ;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de A[LOOP:0: B:41:0x00d8->B:43:0x00de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zza
    public final Object zzb(long j4, zzoe zzoeVar, d dVar) {
        zzev zzevVar;
        Exception e;
        zzez zzezVar;
        boolean z4;
        List listD;
        Long lZza;
        zzp zzpVarZzp;
        Iterator it;
        if (dVar instanceof zzev) {
            zzevVar = (zzev) dVar;
            int i = zzevVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzevVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzevVar = new zzev(this, dVar);
            }
        } else {
            zzevVar = new zzev(this, dVar);
        }
        Object objZ = zzevVar.zzb;
        a aVar = a.f11555a;
        int i10 = zzevVar.zzd;
        if (i10 == 0) {
            g.G(objZ);
            try {
                zzbg zzbgVar = this.zzi;
                zzbb zzbbVarZza = this.zzp.zza(zzne.INIT_NATIVE);
                zzbgVar.zze.put(zzbbVarZza, new zzbf(zzbbVarZza, zzbgVar.zza, new zzac()));
                this.zzc = zzo(zzoeVar, new zzag(zzoeVar.zzf()));
                this.zzb = b0.a();
                new Integer(zzk().hashCode());
                zzew zzewVar = new zzew(this, zzoeVar, null);
                zzevVar.zze = this;
                zzevVar.zza = j4;
                zzevVar.zzd = 1;
                objZ = b0.z(j4, zzewVar, zzevVar);
                if (objZ == aVar) {
                    return aVar;
                }
                zzezVar = this;
            } catch (Exception e4) {
                e = e4;
                zzezVar = this;
                e.getMessage();
                z4 = e instanceof t1;
                if (z4) {
                    listD = j.S(zzne.INIT_TOTAL, zzne.LOAD_WEBVIEW);
                } else {
                    listD = jd.d.D(zzne.INIT_TOTAL);
                }
                lZza = zzezVar.zzo.zza();
                if (z4) {
                    if (lZza != null) {
                        if (lZza.longValue() > j4 - 2000) {
                            zzpVarZzp = zzezVar.zzp(e, new zzp(zzn.zzc, zzl.zzah, e.getClass().getSimpleName()));
                        }
                    }
                    zzpVarZzp = new zzp(zzn.zze, zzl.zzS, null);
                } else {
                    zzpVarZzp = zzezVar.zzp(e, new zzp(zzn.zzc, zzl.zzah, e.getClass().getSimpleName()));
                }
                it = listD.iterator();
                while (it.hasNext()) {
                    zzezVar.zzi.zzb(zzezVar.zzp.zza((zzne) it.next()), zzpVarZzp, null);
                }
                return g.m(zzpVarZzp.zzc());
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j4 = zzevVar.zza;
            zzezVar = zzevVar.zze;
            try {
                g.G(objZ);
            } catch (Exception e10) {
                e = e10;
                e.getMessage();
                z4 = e instanceof t1;
                if (z4) {
                    listD = j.S(zzne.INIT_TOTAL, zzne.LOAD_WEBVIEW);
                } else {
                    listD = jd.d.D(zzne.INIT_TOTAL);
                }
                lZza = zzezVar.zzo.zza();
                if (z4) {
                    if (lZza != null) {
                        if (lZza.longValue() > j4 - 2000) {
                            zzpVarZzp = zzezVar.zzp(e, new zzp(zzn.zzc, zzl.zzah, e.getClass().getSimpleName()));
                        }
                    }
                    zzpVarZzp = new zzp(zzn.zze, zzl.zzS, null);
                } else {
                    zzpVarZzp = zzezVar.zzp(e, new zzp(zzn.zzc, zzl.zzah, e.getClass().getSimpleName()));
                }
                it = listD.iterator();
                while (it.hasNext()) {
                    zzezVar.zzi.zzb(zzezVar.zzp.zza((zzne) it.next()), zzpVarZzp, null);
                }
                return g.m(zzpVarZzp.zzc());
            }
        }
        return ((h) objZ).f9068a;
    }

    public final WebView zzc() {
        return this.zzd;
    }

    public final zzbq zzf() {
        return this.zzj;
    }

    public final zzeq zzg() {
        return this.zzo;
    }

    public final p zzk() {
        p pVar = this.zzb;
        if (pVar != null) {
            return pVar;
        }
        return null;
    }

    public final zzca zzo(zzoe zzoeVar, zzag zzagVar) {
        zzcd zzcdVar = new zzcd(this.zzd, this.zzq.zzb());
        zzef zzefVar = new zzef();
        zzefVar.zzb(i.o0(zzoeVar.zzK()));
        zzcl zzclVar = new zzcl(zzcdVar, zzagVar, new zzaa());
        zzeg zzegVar = new zzeg(zzefVar, new zzed());
        zzclVar.zzf(3, this.zzf);
        zzclVar.zzf(5, zzen.class.getMethod("cs", new Object[0].getClass()));
        zzclVar.zzf(6, new zzeh(this.zzf));
        zzclVar.zzf(7, new zzej());
        zzclVar.zzf(8, new zzeo(this.zzf));
        zzclVar.zzf(9, new zzek(this.zzf));
        zzclVar.zzf(10, new zzei(this.zzf));
        return new zzca(this.zzq.zzc(), zzclVar, zzegVar, zzbt.zza());
    }
}
