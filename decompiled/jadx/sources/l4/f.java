package l4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import da.v;
import g.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4.h;
import p4.n;
import u3.i;
import w3.j;
import w3.k;
import w3.t;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c, m4.b {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q4.e f6770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f6772d;
    public final Context e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.e f6773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6774g;
    public final Class h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.bumptech.glide.f f6777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m4.c f6778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f6779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n4.a f6780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f6781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x f6782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q5.d f6783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile k f6785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f6786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f6787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f6788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6790y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6791z;

    public f(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, a aVar, int i, int i10, com.bumptech.glide.f fVar, m4.c cVar, ArrayList arrayList, d dVar, k kVar, n4.a aVar2) {
        b0 b0Var = p4.f.f7797a;
        this.f6769a = C ? String.valueOf(hashCode()) : null;
        this.f6770b = new q4.e();
        this.f6771c = obj;
        this.e = context;
        this.f6773f = eVar;
        this.f6774g = obj2;
        this.h = cls;
        this.i = aVar;
        this.f6775j = i;
        this.f6776k = i10;
        this.f6777l = fVar;
        this.f6778m = cVar;
        this.f6779n = arrayList;
        this.f6772d = dVar;
        this.f6785t = kVar;
        this.f6780o = aVar2;
        this.f6781p = b0Var;
        this.B = 1;
        if (this.A == null && ((Map) eVar.h.f188b).containsKey(com.bumptech.glide.d.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // l4.c
    public final boolean a() {
        boolean z4;
        synchronized (this.f6771c) {
            z4 = this.B == 4;
        }
        return z4;
    }

    @Override // l4.c
    public final boolean b(c cVar) {
        int i;
        int i10;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.f fVar;
        int size;
        int i11;
        int i12;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.f fVar2;
        int size2;
        boolean zEquals;
        boolean zE;
        if (!(cVar instanceof f)) {
            return false;
        }
        synchronized (this.f6771c) {
            try {
                i = this.f6775j;
                i10 = this.f6776k;
                obj = this.f6774g;
                cls = this.h;
                aVar = this.i;
                fVar = this.f6777l;
                List list = this.f6779n;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar3 = (f) cVar;
        synchronized (fVar3.f6771c) {
            try {
                i11 = fVar3.f6775j;
                i12 = fVar3.f6776k;
                obj2 = fVar3.f6774g;
                cls2 = fVar3.h;
                aVar2 = fVar3.i;
                fVar2 = fVar3.f6777l;
                List list2 = fVar3.f6779n;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i == i11 && i10 == i12) {
            char[] cArr = n.f7811a;
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (aVar == null) {
                    zE = aVar2 == null;
                } else {
                    zE = aVar.e(aVar2);
                }
                if (zE && fVar == fVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l4.c
    public final void c() {
        synchronized (this.f6771c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l4.c
    public final void clear() {
        synchronized (this.f6771c) {
            try {
                if (this.f6791z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f6770b.a();
                if (this.B == 6) {
                    return;
                }
                d();
                x xVar = this.f6782q;
                if (xVar != null) {
                    this.f6782q = null;
                } else {
                    xVar = null;
                }
                d dVar = this.f6772d;
                if (dVar == null || dVar.i(this)) {
                    this.f6778m.i(e());
                }
                this.B = 6;
                if (xVar != null) {
                    this.f6785t.getClass();
                    k.f(xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f6791z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f6770b.a();
        this.f6778m.g(this);
        q5.d dVar = this.f6783r;
        if (dVar != null) {
            synchronized (((k) dVar.f8041c)) {
                ((w3.n) dVar.f8039a).h((f) dVar.f8040b);
            }
            this.f6783r = null;
        }
    }

    public final Drawable e() {
        if (this.f6787v == null) {
            a aVar = this.i;
            aVar.getClass();
            this.f6787v = null;
            int i = aVar.f6753d;
            if (i > 0) {
                Resources.Theme theme = aVar.f6762y;
                Context context = this.e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f6787v = p3.a.l(context, context, i, theme);
            }
        }
        return this.f6787v;
    }

    public final void f(String str) {
        StringBuilder sbC = u.e.c(str, " this: ");
        sbC.append(this.f6769a);
        Log.v("GlideRequest", sbC.toString());
    }

    @Override // l4.c
    public final boolean g() {
        boolean z4;
        synchronized (this.f6771c) {
            z4 = this.B == 6;
        }
        return z4;
    }

    @Override // l4.c
    public final void h() {
        synchronized (this.f6771c) {
            try {
                if (this.f6791z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f6770b.a();
                int i = h.f7800b;
                this.f6784s = SystemClock.elapsedRealtimeNanos();
                if (this.f6774g == null) {
                    if (n.i(this.f6775j, this.f6776k)) {
                        this.f6789x = this.f6775j;
                        this.f6790y = this.f6776k;
                    }
                    if (this.f6788w == null) {
                        this.i.getClass();
                        this.f6788w = null;
                    }
                    i(new t("Received null model"), this.f6788w == null ? 5 : 3);
                    return;
                }
                int i10 = this.B;
                if (i10 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i10 == 4) {
                    k(this.f6782q, 5, false);
                    return;
                }
                List list = this.f6779n;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.B = 3;
                if (n.i(this.f6775j, this.f6776k)) {
                    m(this.f6775j, this.f6776k);
                } else {
                    this.f6778m.a(this);
                }
                int i11 = this.B;
                if (i11 == 2 || i11 == 3) {
                    d dVar = this.f6772d;
                    if (dVar == null || dVar.e(this)) {
                        this.f6778m.f(e());
                    }
                }
                if (C) {
                    f("finished run method in " + h.a(this.f6784s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(t tVar, int i) {
        Drawable drawableE;
        this.f6770b.a();
        synchronized (this.f6771c) {
            try {
                tVar.getClass();
                int i10 = this.f6773f.i;
                if (i10 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f6774g + "] with dimensions [" + this.f6789x + "x" + this.f6790y + "]", tVar);
                    if (i10 <= 4) {
                        tVar.d();
                    }
                }
                this.f6783r = null;
                this.B = 5;
                d dVar = this.f6772d;
                if (dVar != null) {
                    dVar.d(this);
                }
                boolean z4 = true;
                this.f6791z = true;
                try {
                    List list = this.f6779n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            d dVar2 = this.f6772d;
                            if (dVar2 == null) {
                                throw null;
                            }
                            dVar2.getRoot().a();
                            throw null;
                        }
                    }
                    d dVar3 = this.f6772d;
                    if (dVar3 != null && !dVar3.e(this)) {
                        z4 = false;
                    }
                    if (z4) {
                        if (this.f6774g == null) {
                            if (this.f6788w == null) {
                                this.i.getClass();
                                this.f6788w = null;
                            }
                            drawableE = this.f6788w;
                        } else {
                            drawableE = null;
                        }
                        if (drawableE == null) {
                            if (this.f6786u == null) {
                                this.i.getClass();
                                this.f6786u = null;
                            }
                            drawableE = this.f6786u;
                        }
                        if (drawableE == null) {
                            drawableE = e();
                        }
                        this.f6778m.d(drawableE);
                    }
                    this.f6791z = false;
                } catch (Throwable th) {
                    this.f6791z = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l4.c
    public final boolean isRunning() {
        boolean z4;
        synchronized (this.f6771c) {
            int i = this.B;
            z4 = i == 2 || i == 3;
        }
        return z4;
    }

    @Override // l4.c
    public final boolean j() {
        boolean z4;
        synchronized (this.f6771c) {
            z4 = this.B == 4;
        }
        return z4;
    }

    public final void k(x xVar, int i, boolean z4) {
        this.f6770b.a();
        x xVar2 = null;
        try {
            synchronized (this.f6771c) {
                try {
                    this.f6783r = null;
                    if (xVar == null) {
                        i(new t("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = xVar.get();
                    try {
                        if (obj == null || !this.h.isAssignableFrom(obj.getClass())) {
                            this.f6782q = null;
                            StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                            sb2.append(this.h);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(xVar);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            i(new t(sb2.toString()), 5);
                        } else {
                            d dVar = this.f6772d;
                            if (dVar == null || dVar.f(this)) {
                                l(xVar, obj, i);
                                return;
                            } else {
                                this.f6782q = null;
                                this.B = 4;
                            }
                        }
                        this.f6785t.getClass();
                        k.f(xVar);
                    } catch (Throwable th) {
                        xVar2 = xVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (xVar2 != null) {
                this.f6785t.getClass();
                k.f(xVar2);
            }
            throw th3;
        }
    }

    public final void l(x xVar, Object obj, int i) {
        d dVar = this.f6772d;
        if (dVar != null) {
            dVar.getRoot().a();
        }
        this.B = 4;
        this.f6782q = xVar;
        if (this.f6773f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + v.y(i) + " for " + this.f6774g + " with size [" + this.f6789x + "x" + this.f6790y + "] in " + h.a(this.f6784s) + " ms");
        }
        if (dVar != null) {
            dVar.k(this);
        }
        this.f6791z = true;
        try {
            List list = this.f6779n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f6780o.getClass();
            this.f6778m.b(obj);
            this.f6791z = false;
        } catch (Throwable th) {
            this.f6791z = false;
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(int i, int i10) throws Throwable {
        Object obj;
        f fVar = this;
        int iRound = i;
        fVar.f6770b.a();
        Object obj2 = fVar.f6771c;
        synchronized (obj2) {
            try {
                try {
                    boolean z4 = C;
                    if (z4) {
                        fVar.f("Got onSizeReady in " + h.a(fVar.f6784s));
                    }
                    if (fVar.B == 3) {
                        fVar.B = 2;
                        fVar.i.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        fVar.f6789x = iRound;
                        fVar.f6790y = i10 == Integer.MIN_VALUE ? i10 : Math.round(1.0f * i10);
                        if (z4) {
                            fVar.f("finished setup for calling load in " + h.a(fVar.f6784s));
                        }
                        k kVar = fVar.f6785t;
                        com.bumptech.glide.e eVar = fVar.f6773f;
                        Object obj3 = fVar.f6774g;
                        a aVar = fVar.i;
                        u3.f fVar2 = aVar.f6756s;
                        try {
                            int i11 = fVar.f6789x;
                            int i12 = fVar.f6790y;
                            Class cls = aVar.f6760w;
                            try {
                                Class cls2 = fVar.h;
                                com.bumptech.glide.f fVar3 = fVar.f6777l;
                                j jVar = aVar.f6751b;
                                try {
                                    p4.c cVar = aVar.f6759v;
                                    boolean z10 = aVar.f6757t;
                                    boolean z11 = aVar.A;
                                    try {
                                        i iVar = aVar.f6758u;
                                        boolean z12 = aVar.e;
                                        boolean z13 = aVar.B;
                                        b0 b0Var = fVar.f6781p;
                                        Object obj4 = obj2;
                                        try {
                                            fVar.f6783r = kVar.a(eVar, obj3, fVar2, i11, i12, cls, cls2, fVar3, jVar, cVar, z10, z11, iVar, z12, z13, fVar, b0Var);
                                            if (fVar.B != 2) {
                                                fVar.f6783r = null;
                                            }
                                            if (z4) {
                                                fVar.f("finished onSizeReady in " + h.a(fVar.f6784s));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = obj2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj = obj2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = fVar;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = obj2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f6771c) {
            obj = this.f6774g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
