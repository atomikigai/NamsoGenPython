package o6;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbue;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzchk;
import com.google.android.gms.internal.ads.zzcvu;
import com.google.android.gms.internal.ads.zzdcd;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzffs;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzfjz;
import com.google.android.gms.internal.ads.zzfka;
import com.google.android.gms.internal.ads.zzfkl;
import com.google.android.gms.internal.ads.zzfko;
import com.google.android.gms.internal.ads.zzflr;
import com.google.android.gms.internal.ads.zzfwh;
import com.google.android.gms.internal.ads.zzfxf;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgdz;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzges;
import e6.o3;
import e6.q3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends zzbzg {
    public static final ArrayList R = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList S = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList T = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList U = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public final boolean A;
    public final String B;
    public final String C;
    public final i6.a E;
    public String F;
    public final String G;
    public final ArrayList H;
    public final ArrayList I;
    public final ArrayList J;
    public final ArrayList K;
    public final zzbds O;
    public final x P;
    public final b Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzchk f7622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f7623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzavc f7624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzffs f7625d;
    public final zzfgn e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzges f7626f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ScheduledExecutorService f7627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zzbue f7628s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zzdsr f7631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zzflr f7632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f7633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f7634y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f7635z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Point f7629t = new Point();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Point f7630u = new Point();
    public final AtomicInteger D = new AtomicInteger(0);
    public final AtomicBoolean L = new AtomicBoolean(false);
    public final AtomicBoolean M = new AtomicBoolean(false);
    public final AtomicInteger N = new AtomicInteger(0);

    public i(zzchk zzchkVar, Context context, zzavc zzavcVar, zzfgn zzfgnVar, zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, zzdsr zzdsrVar, zzflr zzflrVar, i6.a aVar, zzbds zzbdsVar, zzffs zzffsVar, x xVar, b bVar) {
        ArrayList arrayListP;
        this.f7622a = zzchkVar;
        this.f7623b = context;
        this.f7624c = zzavcVar;
        this.f7625d = zzffsVar;
        this.e = zzfgnVar;
        this.f7626f = zzgesVar;
        this.f7627r = scheduledExecutorService;
        this.f7631v = zzdsrVar;
        this.f7632w = zzflrVar;
        this.E = aVar;
        this.O = zzbdsVar;
        zzbce zzbceVar = zzbcn.zzgV;
        e6.t tVar = e6.t.f3437d;
        this.f7633x = ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue();
        zzbce zzbceVar2 = zzbcn.zzgU;
        zzbcl zzbclVar = tVar.f3440c;
        this.f7634y = ((Boolean) zzbclVar.zza(zzbceVar2)).booleanValue();
        this.f7635z = ((Boolean) zzbclVar.zza(zzbcn.zzgX)).booleanValue();
        this.A = ((Boolean) zzbclVar.zza(zzbcn.zzgZ)).booleanValue();
        this.B = (String) zzbclVar.zza(zzbcn.zzgY);
        this.C = (String) zzbclVar.zza(zzbcn.zzha);
        this.G = (String) zzbclVar.zza(zzbcn.zzhb);
        this.P = xVar;
        this.Q = bVar;
        if (((Boolean) zzbclVar.zza(zzbcn.zzhc)).booleanValue()) {
            this.H = P((String) zzbclVar.zza(zzbcn.zzhd));
            this.I = P((String) zzbclVar.zza(zzbcn.zzhe));
            this.J = P((String) zzbclVar.zza(zzbcn.zzhf));
            arrayListP = P((String) zzbclVar.zza(zzbcn.zzhg));
        } else {
            this.H = R;
            this.I = S;
            this.J = T;
            arrayListP = U;
        }
        this.K = arrayListP;
    }

    public static boolean N(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri O(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(string.substring(0, i) + str + "=" + str2 + "&" + string.substring(i));
    }

    public static final ArrayList P(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfxf.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static zzfkl Q(m9.a aVar, zzbzl zzbzlVar) {
        if (zzfko.zza() && ((Boolean) zzbeg.zze.zze()).booleanValue()) {
            try {
                zzfkl zzfklVarZza = ((g0) zzgei.zzp(aVar)).zza();
                zzfklVarZza.zzd(new ArrayList(Collections.singletonList(zzbzlVar.zzb)));
                o3 o3Var = zzbzlVar.zzd;
                zzfklVarZza.zzb(o3Var == null ? "" : o3Var.A);
                zzfklVarZza.zzf(zzbzlVar.zzd.f3382x);
                return zzfklVarZza;
            } catch (ExecutionException e) {
                d6.p.C.f2982g.zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            }
        }
        return null;
    }

    public final zzgdz I(final String str) {
        final zzdoc[] zzdocVarArr = new zzdoc[1];
        m9.a aVarZza = this.e.zza();
        zzgdp zzgdpVar = new zzgdp() { // from class: o6.c
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) throws JSONException {
                zzdoc zzdocVar = (zzdoc) obj;
                i iVar = this.f7598a;
                iVar.getClass();
                zzdocVarArr[0] = zzdocVar;
                Context context = iVar.f7623b;
                zzbue zzbueVar = iVar.f7628s;
                Map map = zzbueVar.zzb;
                JSONObject jSONObjectN = r7.g.N(context, map, map, zzbueVar.zza, null);
                JSONObject jSONObjectQ = r7.g.Q(iVar.f7623b, iVar.f7628s.zza);
                JSONObject jSONObjectP = r7.g.P(iVar.f7628s.zza);
                JSONObject jSONObjectO = r7.g.O(iVar.f7623b, iVar.f7628s.zza);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectN);
                jSONObject.put("ad_view_signal", jSONObjectQ);
                jSONObject.put("scroll_view_signal", jSONObjectP);
                jSONObject.put("lock_screen_signal", jSONObjectO);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", r7.g.M(null, iVar.f7623b, iVar.f7630u, iVar.f7629t));
                }
                return zzdocVar.zzg(str2, jSONObject);
            }
        };
        zzges zzgesVar = this.f7626f;
        m9.a aVarZzn = zzgei.zzn(aVarZza, zzgdpVar, zzgesVar);
        aVarZzn.addListener(new a3.e(this, zzdocVarArr, 21, false), zzgesVar);
        final int i = 0;
        zzgdz zzgdzVar = (zzgdz) zzgei.zzm((zzgdz) zzgei.zzo(zzgdz.zzu(aVarZzn), ((Integer) e6.t.f3437d.f3440c.zza(zzbcn.zzhn)).intValue(), TimeUnit.MILLISECONDS, this.f7627r), new zzfwh() { // from class: o6.g
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        ArrayList arrayList = i.R;
                        return ((JSONObject) obj).optString("nas");
                    default:
                        ArrayList arrayList2 = i.R;
                        i6.h.e("", (Exception) obj);
                        return null;
                }
            }
        }, zzgesVar);
        final int i10 = 1;
        return (zzgdz) zzgei.zze(zzgdzVar, Exception.class, new zzfwh() { // from class: o6.g
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                switch (i10) {
                    case 0:
                        ArrayList arrayList = i.R;
                        return ((JSONObject) obj).optString("nas");
                    default:
                        ArrayList arrayList2 = i.R;
                        i6.h.e("", (Exception) obj);
                        return null;
                }
            }
        }, zzgesVar);
    }

    public final void J() {
        i iVar;
        m9.a aVarZzb;
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            x xVar = this.P;
            synchronized (xVar) {
                xVar.c(true);
                xVar.c(false);
            }
            return;
        }
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkK)).booleanValue()) {
            aVarZzb = zzgei.zzk(new h0(this), zzcaj.zza);
            iVar = this;
        } else {
            iVar = this;
            aVarZzb = iVar.y(this.f7623b, null, "BANNER", null, null, new Bundle()).zzb();
        }
        zzgei.zzr(aVarZzb, new ib.c(this, 28), iVar.f7622a.zzC());
    }

    public final void K() {
        zzbce zzbceVar = zzbcn.zzjg;
        e6.t tVar = e6.t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzjj)).booleanValue()) {
                return;
            }
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzjn)).booleanValue() && this.L.getAndSet(true)) {
                return;
            }
            J();
        }
    }

    public final void L(List list, q7.a aVar, zzbtv zzbtvVar, boolean z4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        m9.a aVarZzn;
        Map map;
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzhm)).booleanValue()) {
            i6.h.g("The updating URL feature is not enabled.");
            try {
                zzbtvVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                i6.h.e("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.I;
            arrayList2 = this.H;
            if (!zHasNext) {
                break;
            } else if (N((Uri) it.next(), arrayList2, arrayList)) {
                i++;
            }
        }
        if (i > 1) {
            i6.h.g("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (N(uri, arrayList2, arrayList)) {
                o3.q qVar = new o3.q(this, uri, aVar, 5);
                zzges zzgesVar = this.f7626f;
                m9.a aVarZzb = zzgesVar.zzb(qVar);
                zzbue zzbueVar = this.f7628s;
                if (zzbueVar == null || (map = zzbueVar.zzb) == null || map.isEmpty()) {
                    i6.h.f("Asset view map is empty.");
                    aVarZzn = aVarZzb;
                } else {
                    aVarZzn = zzgei.zzn(aVarZzb, new d(this, 0), zzgesVar);
                }
            } else {
                i6.h.g("Not a Google URL: ".concat(String.valueOf(uri)));
                aVarZzn = zzgei.zzh(uri);
            }
            arrayList3.add(aVarZzn);
        }
        zzgei.zzr(zzgei.zzd(arrayList3), new h(this, zzbtvVar, z4, 1), this.f7622a.zzC());
    }

    public final void M(List list, q7.a aVar, zzbtv zzbtvVar, boolean z4) {
        Map map;
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzhm)).booleanValue()) {
            try {
                zzbtvVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                i6.h.e("", e);
                return;
            }
        }
        o3.q qVar = new o3.q(this, list, aVar, 7);
        zzges zzgesVar = this.f7626f;
        m9.a aVarZzb = zzgesVar.zzb(qVar);
        zzbue zzbueVar = this.f7628s;
        if (zzbueVar == null || (map = zzbueVar.zzb) == null || map.isEmpty()) {
            i6.h.f("Asset view map is empty.");
        } else {
            aVarZzb = zzgei.zzn(aVarZzb, new d(this, 1), zzgesVar);
        }
        zzgei.zzr(aVarZzb, new h(this, zzbtvVar, z4, 0), this.f7622a.zzC());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    public final g0 y(Context context, String str, String str2, q3 q3Var, o3 o3Var, Bundle bundle) {
        q3 q3Var2;
        zzffm zzffmVar = new zzffm();
        if ("REWARDED".equals(str2)) {
            zzffmVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzffmVar.zzp().zza(3);
        }
        f0 f0VarZzp = this.f7622a.zzp();
        zzcvu zzcvuVar = new zzcvu();
        zzcvuVar.zze(context);
        zzffmVar.zzt(str == null ? "adUnitId" : str);
        zzffmVar.zzH(o3Var == null ? new o3(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, 0L) : o3Var);
        if (q3Var == null) {
            switch (str2) {
                case "NATIVE":
                    q3Var2 = q3.h();
                    break;
                case "APP_OPEN_AD":
                    q3Var2 = q3.g();
                    break;
                case "REWARDED":
                case "REWARDED_INTERSTITIAL":
                    q3Var2 = new q3("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
                    break;
                case "BANNER":
                    q3Var2 = new q3(context, w5.h.h);
                    break;
                default:
                    q3Var2 = new q3();
                    break;
            }
        } else {
            q3Var2 = q3Var;
        }
        zzffmVar.zzs(q3Var2);
        zzffmVar.zzz(true);
        zzffmVar.zzA(bundle);
        zzcvuVar.zzi(zzffmVar.zzJ());
        f0VarZzp.zza(zzcvuVar.zzj());
        h2.a aVar = new h2.a();
        aVar.f4607a = str2;
        f0VarZzp.zzb(new k(aVar));
        new zzdcd();
        return f0VarZzp.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final q7.a zze(q7.a aVar, q7.a aVar2, String str, q7.a aVar3) {
        zzbds zzbdsVar = this.O;
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzjt)).booleanValue()) {
            return new q7.b(null);
        }
        zzbdsVar.zzg((Context) q7.b.I(aVar), (o.h) q7.b.I(aVar2), str, (o.a) q7.b.I(aVar3));
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            x xVar = this.P;
            synchronized (xVar) {
                xVar.c(true);
                xVar.c(false);
            }
        }
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            this.Q.b();
        }
        return new q7.b(zzbdsVar.zzb());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0094  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b9  */
    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(q7.a aVar, zzbzl zzbzlVar, zzbze zzbzeVar) {
        m9.a aVarZzb;
        m9.a aVarZzb2;
        Bundle bundle = new Bundle();
        zzbce zzbceVar = zzbcn.zzci;
        e6.t tVar = e6.t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            bundle.putLong(zzdrv.PUBLIC_API_CALL.zza(), zzbzlVar.zzd.K);
            da.v.t(d6.p.C.f2983j, bundle, zzdrv.DYNAMITE_ENTER.zza());
        }
        Context context = (Context) q7.b.I(aVar);
        this.f7623b = context;
        zzfka zzfkaVarZza = zzfjz.zza(context, 22);
        zzfkaVarZza.zzi();
        if ("UNKNOWN".equals(zzbzlVar.zzb)) {
            List arrayList = new ArrayList();
            zzbce zzbceVar2 = zzbcn.zzhl;
            if (!((String) zzbclVar2.zza(zzbceVar2)).isEmpty()) {
                arrayList = Arrays.asList(((String) zzbclVar2.zza(zzbceVar2)).split(","));
            }
            if (arrayList.contains(android.support.v4.media.session.a.M(zzbzlVar.zzd))) {
                m9.a aVarZzg = zzgei.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                aVarZzb = zzgei.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                aVarZzb2 = aVarZzg;
            } else if (((Boolean) zzbclVar2.zza(zzbcn.zzkK)).booleanValue()) {
                zzges zzgesVar = zzcaj.zza;
                aVarZzb2 = zzgesVar.zzb(new o3.q(this, zzbzlVar, bundle, 6));
                aVarZzb = zzgei.zzn(aVarZzb2, new f(), zzgesVar);
            } else {
                g0 g0VarY = y(this.f7623b, zzbzlVar.zza, zzbzlVar.zzb, zzbzlVar.zzc, zzbzlVar.zzd, bundle);
                m9.a aVarZzh = zzgei.zzh(g0VarY);
                aVarZzb = g0VarY.zzb();
                aVarZzb2 = aVarZzh;
            }
        } else if (((Boolean) zzbclVar2.zza(zzbcn.zzkK)).booleanValue()) {
            zzges zzgesVar2 = zzcaj.zza;
            aVarZzb2 = zzgesVar2.zzb(new o3.q(this, zzbzlVar, bundle, 6));
            aVarZzb = zzgei.zzn(aVarZzb2, new f(), zzgesVar2);
        } else {
            g0 g0VarY2 = y(this.f7623b, zzbzlVar.zza, zzbzlVar.zzb, zzbzlVar.zzc, zzbzlVar.zzd, bundle);
            m9.a aVarZzh2 = zzgei.zzh(g0VarY2);
            aVarZzb = g0VarY2.zzb();
            aVarZzb2 = aVarZzh2;
        }
        zzgei.zzr(aVarZzb, new bd.u(this, aVarZzb2, zzbzlVar, zzbzeVar, zzfkaVarZza), this.f7622a.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbue zzbueVar) {
        this.f7628s = zzbueVar;
        this.e.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(List list, q7.a aVar, zzbtv zzbtvVar) {
        L(list, aVar, zzbtvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(List list, q7.a aVar, zzbtv zzbtvVar) {
        M(list, aVar, zzbtvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(q7.a aVar) {
        zzbce zzbceVar = zzbcn.zzjf;
        e6.t tVar = e6.t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            zzbce zzbceVar2 = zzbcn.zzhk;
            if (!((Boolean) zzbclVar2.zza(zzbceVar2)).booleanValue()) {
                K();
            }
            WebView webView = (WebView) q7.b.I(aVar);
            if (webView == null) {
                i6.h.d("The webView cannot be null.");
                return;
            }
            zzges zzgesVar = zzcaj.zze;
            b bVar = this.Q;
            v vVar = new v(webView, bVar, zzgesVar);
            webView.addJavascriptInterface(new a(webView, this.f7624c, this.f7631v, this.f7632w, this.f7625d, this.P, this.Q, vVar), "gmaSdk");
            if (((Boolean) zzbclVar2.zza(zzbcn.zzjp)).booleanValue()) {
                d6.p.C.f2982g.zzs();
            }
            if (((Boolean) zzbes.zza.zze()).booleanValue()) {
                bVar.b();
                zzcaj.zzd.scheduleWithFixedDelay(new u(vVar, 1), 0L, ((Integer) zzbclVar2.zza(zzbcn.zzjq)).intValue(), TimeUnit.MILLISECONDS);
            }
            if (((Boolean) zzbclVar2.zza(zzbceVar2)).booleanValue()) {
                K();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzk(q7.a aVar) {
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzhm)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) q7.b.I(aVar);
            zzbue zzbueVar = this.f7628s;
            View view = zzbueVar == null ? null : zzbueVar.zza;
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            this.f7629t = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
            if (motionEvent.getAction() == 0) {
                this.f7630u = this.f7629t;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f7629t;
            motionEventObtain.setLocation(point.x, point.y);
            this.f7624c.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzl(List list, q7.a aVar, zzbtv zzbtvVar) {
        L(list, aVar, zzbtvVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzm(List list, q7.a aVar, zzbtv zzbtvVar) {
        M(list, aVar, zzbtvVar, false);
    }
}
