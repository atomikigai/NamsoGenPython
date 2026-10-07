package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.datastore.preferences.protobuf.c1;
import com.bumptech.glide.manager.r;
import d4.m;
import d4.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l4.a {
    public final Context C;
    public final l D;
    public final Class E;
    public final e F;
    public a G;
    public Object H;
    public ArrayList I;
    public j J;
    public j K;
    public final boolean L = true;
    public boolean M;
    public boolean N;

    static {
    }

    public j(b bVar, l lVar, Class cls, Context context) {
        l4.e eVar;
        this.D = lVar;
        this.E = cls;
        this.C = context;
        r.e eVar2 = lVar.f1878a.f1841c.f1859f;
        a aVar = (a) eVar2.get(cls);
        if (aVar == null) {
            for (Map.Entry entry : (c1) eVar2.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.G = aVar == null ? e.f1854k : aVar;
        this.F = bVar.f1841c;
        Iterator it = lVar.f1885t.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            u();
        }
        synchronized (lVar) {
            eVar = lVar.f1886u;
        }
        a(eVar);
    }

    public final j A(Object obj) {
        if (this.f6763z) {
            return clone().A(obj);
        }
        this.H = obj;
        this.M = true;
        l();
        return this;
    }

    @Override // l4.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return super.equals(jVar) && Objects.equals(this.E, jVar.E) && this.G.equals(jVar.G) && Objects.equals(this.H, jVar.H) && Objects.equals(this.I, jVar.I) && Objects.equals(this.J, jVar.J) && Objects.equals(this.K, jVar.K) && this.L == jVar.L && this.M == jVar.M;
    }

    @Override // l4.a
    public final int hashCode() {
        return n.g(this.M ? 1 : 0, n.g(this.L ? 1 : 0, n.h(n.h(n.h(n.h(n.h(n.h(n.h(super.hashCode(), this.E), this.G), this.H), this.I), this.J), this.K), null)));
    }

    public final j u() {
        if (this.f6763z) {
            return clone().u();
        }
        l();
        return this;
    }

    @Override // l4.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final j a(l4.a aVar) {
        p4.f.b(aVar);
        return (j) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final l4.c w(Object obj, m4.c cVar, l4.d dVar, a aVar, f fVar, int i, int i10, l4.a aVar2) {
        l4.d dVar2;
        l4.d bVar;
        l4.a aVar3;
        l4.c fVar2;
        f fVar3;
        if (this.K != null) {
            bVar = new l4.b(obj, dVar);
            dVar2 = bVar;
        } else {
            dVar2 = null;
            bVar = dVar;
        }
        j jVar = this.J;
        if (jVar == null) {
            Context context = this.C;
            e eVar = this.F;
            aVar3 = aVar2;
            fVar2 = new l4.f(context, eVar, obj, this.H, this.E, aVar3, i, i10, fVar, cVar, this.I, bVar, eVar.f1860g, aVar.f1836a);
        } else {
            if (this.N) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar4 = jVar.L ? aVar : jVar.G;
            if (l4.a.f(jVar.f6750a, 8)) {
                fVar3 = this.J.f6752c;
            } else {
                int iOrdinal = fVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    fVar3 = f.f1862a;
                } else if (iOrdinal == 2) {
                    fVar3 = f.f1863b;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f6752c);
                    }
                    fVar3 = f.f1864c;
                }
            }
            f fVar4 = fVar3;
            j jVar2 = this.J;
            int i11 = jVar2.f6755r;
            int i12 = jVar2.f6754f;
            if (n.i(i, i10)) {
                j jVar3 = this.J;
                if (!n.i(jVar3.f6755r, jVar3.f6754f)) {
                    i11 = aVar2.f6755r;
                    i12 = aVar2.f6754f;
                }
            }
            int i13 = i12;
            l4.g gVar = new l4.g(obj, bVar);
            Context context2 = this.C;
            l4.g gVar2 = gVar;
            e eVar2 = this.F;
            l4.f fVar5 = new l4.f(context2, eVar2, obj, this.H, this.E, aVar2, i, i10, fVar, cVar, this.I, gVar2, eVar2.f1860g, aVar.f1836a);
            this.N = true;
            j jVar4 = this.J;
            l4.c cVarW = jVar4.w(obj, cVar, gVar2, aVar4, fVar4, i11, i13, jVar4);
            this.N = false;
            gVar2.f6794c = fVar5;
            gVar2.f6795d = cVarW;
            aVar3 = aVar2;
            fVar2 = gVar2;
        }
        if (dVar2 == null) {
            return fVar2;
        }
        j jVar5 = this.K;
        int i14 = jVar5.f6755r;
        int i15 = jVar5.f6754f;
        if (n.i(i, i10)) {
            j jVar6 = this.K;
            if (!n.i(jVar6.f6755r, jVar6.f6754f)) {
                i14 = aVar3.f6755r;
                i15 = aVar3.f6754f;
            }
        }
        int i16 = i15;
        j jVar7 = this.K;
        l4.b bVar2 = dVar2;
        l4.c cVarW2 = jVar7.w(obj, cVar, bVar2, jVar7.G, jVar7.f6752c, i14, i16, jVar7);
        bVar2.f6766c = fVar2;
        bVar2.f6767d = cVarW2;
        return bVar2;
    }

    @Override // l4.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final j clone() {
        j jVar = (j) super.clone();
        jVar.G = jVar.G.clone();
        if (jVar.I != null) {
            jVar.I = new ArrayList(jVar.I);
        }
        j jVar2 = jVar.J;
        if (jVar2 != null) {
            jVar.J = jVar2.clone();
        }
        j jVar3 = jVar.K;
        if (jVar3 != null) {
            jVar.K = jVar3.clone();
        }
        return jVar;
    }

    public final void y(ImageView imageView) {
        l4.a aVarG;
        m4.c aVar;
        n.a();
        p4.f.b(imageView);
        if (!l4.a.f(this.f6750a, 2048) && imageView.getScaleType() != null) {
            switch (i.f1873a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarG = clone().g(m.f2884d, new d4.g());
                    break;
                case 2:
                    aVarG = clone().g(m.f2883c, new d4.h());
                    aVarG.A = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVarG = clone().g(m.f2882b, new t());
                    aVarG.A = true;
                    break;
                case 6:
                    aVarG = clone().g(m.f2883c, new d4.h());
                    aVarG.A = true;
                    break;
                default:
                    aVarG = this;
                    break;
            }
        } else {
            aVarG = this;
        }
        this.F.f1857c.getClass();
        Class cls = this.E;
        if (Bitmap.class.equals(cls)) {
            aVar = new m4.a(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            aVar = new m4.a(imageView, 1);
        }
        z(aVar, aVarG);
    }

    public final void z(m4.c cVar, l4.a aVar) {
        p4.f.b(cVar);
        if (!this.M) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        l4.c cVarW = w(new Object(), cVar, null, this.G, aVar.f6752c, aVar.f6755r, aVar.f6754f, aVar);
        l4.c cVarH = cVar.h();
        if (cVarW.b(cVarH) && (aVar.e || !cVarH.j())) {
            p4.f.c(cVarH, "Argument must not be null");
            if (cVarH.isRunning()) {
                return;
            }
            cVarH.h();
            return;
        }
        this.D.k(cVar);
        cVar.c(cVarW);
        l lVar = this.D;
        synchronized (lVar) {
            lVar.f1882f.f1940a.add(cVar);
            r rVar = lVar.f1881d;
            ((Set) rVar.f1938c).add(cVarW);
            if (rVar.f1937b) {
                cVarW.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) rVar.f1939d).add(cVarW);
            } else {
                cVarW.h();
            }
        }
    }
}
