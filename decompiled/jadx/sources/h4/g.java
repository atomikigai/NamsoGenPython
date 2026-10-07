package h4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.j;
import com.bumptech.glide.l;
import d9.k;
import java.util.ArrayList;
import p4.n;
import u3.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3.d f4950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f4951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f4953d;
    public final x3.a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4955g;
    public j h;
    public e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f4957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f4958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f4959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4962p;

    public g(com.bumptech.glide.b bVar, t3.d dVar, int i, int i10, Bitmap bitmap) {
        x3.a aVar = bVar.f1839a;
        com.bumptech.glide.e eVar = bVar.f1841c;
        Context baseContext = eVar.getBaseContext();
        p4.f.c(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        l lVarC = com.bumptech.glide.b.a(baseContext).e.c(baseContext);
        Context baseContext2 = eVar.getBaseContext();
        p4.f.c(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        l lVarC2 = com.bumptech.glide.b.a(baseContext2).e.c(baseContext2);
        lVarC2.getClass();
        j jVarV = new j(lVarC2.f1878a, lVarC2, Bitmap.class, lVarC2.f1879b).a(l.f1877v).a(((l4.e) ((l4.e) ((l4.e) new l4.e().d(w3.j.f9530b)).t()).o()).h(i, i10));
        this.f4952c = new ArrayList();
        this.f4953d = lVarC;
        Handler handler = new Handler(Looper.getMainLooper(), new k(this, 2));
        this.e = aVar;
        this.f4951b = handler;
        this.h = jVarV;
        this.f4950a = dVar;
        c(c4.c.f1773b, bitmap);
    }

    public final void a() {
        int i;
        int i10;
        if (!this.f4954f || this.f4955g) {
            return;
        }
        e eVar = this.f4959m;
        if (eVar != null) {
            this.f4959m = null;
            b(eVar);
            return;
        }
        this.f4955g = true;
        t3.d dVar = this.f4950a;
        t3.b bVar = dVar.f8587l;
        int i11 = bVar.f8569c;
        if (i11 <= 0 || (i10 = dVar.f8586k) < 0) {
            i = 0;
        } else {
            i = (i10 < 0 || i10 >= i11) ? -1 : ((t3.a) bVar.e.get(i10)).i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        int i12 = (dVar.f8586k + 1) % dVar.f8587l.f8569c;
        dVar.f8586k = i12;
        this.f4957k = new e(this.f4951b, i12, jUptimeMillis);
        j jVarA = this.h.a((l4.e) new l4.e().n(new o4.d(Double.valueOf(Math.random())))).A(dVar);
        jVarA.z(this.f4957k, jVarA);
    }

    public final void b(e eVar) {
        this.f4955g = false;
        boolean z4 = this.f4956j;
        Handler handler = this.f4951b;
        if (z4) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f4954f) {
            this.f4959m = eVar;
            return;
        }
        if (eVar.f4949r != null) {
            Bitmap bitmap = this.f4958l;
            if (bitmap != null) {
                this.e.c(bitmap);
                this.f4958l = null;
            }
            e eVar2 = this.i;
            this.i = eVar;
            ArrayList arrayList = this.f4952c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    g gVar = (g) cVar.f4934a.f4933b;
                    e eVar3 = gVar.i;
                    if ((eVar3 != null ? eVar3.e : -1) == gVar.f4950a.f8587l.f8569c - 1) {
                        cVar.f4938f++;
                    }
                    int i = cVar.f4939r;
                    if (i != -1 && cVar.f4938f >= i) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(m mVar, Bitmap bitmap) {
        p4.f.c(mVar, "Argument must not be null");
        p4.f.c(bitmap, "Argument must not be null");
        this.f4958l = bitmap;
        this.h = this.h.a(new l4.e().s(mVar, true));
        this.f4960n = n.c(bitmap);
        this.f4961o = bitmap.getWidth();
        this.f4962p = bitmap.getHeight();
    }
}
