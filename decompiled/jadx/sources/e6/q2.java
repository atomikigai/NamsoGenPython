package e6;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbpc;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {
    public a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w5.c f3400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w5.h[] f3401g;
    public x5.e h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w5.x f3402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f3403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w5.j f3404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3405m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbpc f3396a = new zzbpc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5.w f3398c = new w5.w();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f3399d = new p2(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3 f3397b = p3.f3389a;
    public m0 i = null;

    public q2(w5.j jVar, AttributeSet attributeSet) {
        w5.h[] hVarArrP;
        q3 q3Var;
        this.f3404l = jVar;
        new AtomicBoolean(false);
        if (attributeSet != null) {
            Context context = jVar.getContext();
            try {
                TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, w5.r.f9665a);
                String string = typedArrayObtainAttributes.getString(0);
                String string2 = typedArrayObtainAttributes.getString(1);
                boolean zIsEmpty = TextUtils.isEmpty(string);
                boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                if (!zIsEmpty && zIsEmpty2) {
                    hVarArrP = jd.d.P(string);
                } else {
                    if (!zIsEmpty || zIsEmpty2) {
                        if (zIsEmpty) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                        }
                        typedArrayObtainAttributes.recycle();
                        throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                    }
                    hVarArrP = jd.d.P(string2);
                }
                String string3 = typedArrayObtainAttributes.getString(2);
                typedArrayObtainAttributes.recycle();
                if (TextUtils.isEmpty(string3)) {
                    throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
                }
                if (hVarArrP.length != 1) {
                    throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
                }
                this.f3401g = hVarArrP;
                this.f3403k = string3;
                if (jVar.isInEditMode()) {
                    i6.d dVar = s.f3427f.f3428a;
                    w5.h hVar = this.f3401g[0];
                    if (hVar.equals(w5.h.f9654p)) {
                        q3Var = new q3("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        q3Var = new q3(context, hVar);
                        q3Var.f3414u = false;
                    }
                    dVar.getClass();
                    i6.d.e(jVar, q3Var, "Ads by Google", -16777216, -1);
                }
            } catch (IllegalArgumentException e) {
                i6.d dVar2 = s.f3427f.f3428a;
                q3 q3Var2 = new q3(context, w5.h.h);
                String message = e.getMessage();
                String message2 = e.getMessage();
                dVar2.getClass();
                if (message2 != null) {
                    i6.h.g(message2);
                }
                i6.d.e(jVar, q3Var2, message, -65536, -16777216);
            }
        }
    }

    public static q3 a(Context context, w5.h[] hVarArr) {
        for (w5.h hVar : hVarArr) {
            if (hVar.equals(w5.h.f9654p)) {
                return new q3("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        q3 q3Var = new q3(context, hVarArr);
        q3Var.f3414u = false;
        return q3Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d4 A[Catch: RemoteException -> 0x00d2, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d2, blocks: (B:28:0x009e, B:30:0x00a4, B:32:0x00b2, B:34:0x00c4, B:37:0x00d4), top: B:53:0x009e, outer: #1 }] */
    public final void b(o2 o2Var) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            m0 m0Var = this.i;
            w5.j jVar = this.f3404l;
            if (m0Var == null) {
                if (this.f3401g == null || this.f3403k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = jVar.getContext();
                q3 q3VarA = a(context, this.f3401g);
                m0 m0Var2 = "search_v2".equals(q3VarA.f3406a) ? (m0) new j(s.f3427f.f3429b, context, q3VarA, this.f3403k).d(context, false) : (m0) new h(s.f3427f.f3429b, context, q3VarA, this.f3403k, this.f3396a).d(context, false);
                this.i = m0Var2;
                m0Var2.zzD(new k3(this.f3399d));
                a aVar = this.e;
                if (aVar != null) {
                    this.i.zzC(new p(aVar));
                }
                x5.e eVar = this.h;
                if (eVar != null) {
                    this.i.zzG(new zzaza(eVar));
                }
                w5.x xVar = this.f3402j;
                if (xVar != null) {
                    this.i.zzU(new l3(xVar));
                }
                this.i.zzP(new g3());
                this.i.zzN(this.f3405m);
                m0 m0Var3 = this.i;
                if (m0Var3 != null) {
                    try {
                        q7.a aVarZzn = m0Var3.zzn();
                        if (aVarZzn != null) {
                            if (((Boolean) zzbel.zzf.zze()).booleanValue()) {
                                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                                    i6.d.f5219b.post(new a3.e(this, aVarZzn, 8, false));
                                } else {
                                    jVar.addView((View) q7.b.I(aVarZzn));
                                }
                            } else {
                                jVar.addView((View) q7.b.I(aVarZzn));
                            }
                        }
                    } catch (RemoteException e) {
                        i6.h.i("#007 Could not call remote method.", e);
                    }
                }
            }
            if (o2Var != null) {
                o2Var.f3370j = jCurrentTimeMillis;
            }
            m0 m0Var4 = this.i;
            if (m0Var4 == null) {
                throw null;
            }
            p3 p3Var = this.f3397b;
            Context context2 = jVar.getContext();
            p3Var.getClass();
            m0Var4.zzab(p3.a(context2, o2Var));
        } catch (RemoteException e4) {
            i6.h.i("#007 Could not call remote method.", e4);
        }
    }

    public final void c(a aVar) {
        try {
            this.e = aVar;
            m0 m0Var = this.i;
            if (m0Var != null) {
                m0Var.zzC(aVar != null ? new p(aVar) : null);
            }
        } catch (RemoteException e) {
            i6.h.i("#007 Could not call remote method.", e);
        }
    }

    public final void d(w5.h... hVarArr) {
        w5.j jVar = this.f3404l;
        this.f3401g = hVarArr;
        try {
            m0 m0Var = this.i;
            if (m0Var != null) {
                m0Var.zzF(a(jVar.getContext(), this.f3401g));
            }
        } catch (RemoteException e) {
            i6.h.i("#007 Could not call remote method.", e);
        }
        jVar.requestLayout();
    }

    public final void e(x5.e eVar) {
        try {
            this.h = eVar;
            m0 m0Var = this.i;
            if (m0Var != null) {
                m0Var.zzG(eVar != null ? new zzaza(eVar) : null);
            }
        } catch (RemoteException e) {
            i6.h.i("#007 Could not call remote method.", e);
        }
    }
}
