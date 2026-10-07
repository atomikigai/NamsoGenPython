package l4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import app.namso_gen.spacehowen.R;
import d4.m;
import d4.r;
import p4.n;
import u3.h;
import u3.i;
import w3.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6750a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6753d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6757t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Resources.Theme f6762y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6763z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f6751b = j.f9532d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f6752c = com.bumptech.glide.f.f1864c;
    public boolean e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6754f = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6755r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u3.f f6756s = o4.c.f7556b;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f6758u = new i();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p4.c f6759v = new p4.c(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Class f6760w = Object.class;
    public boolean A = true;

    public static boolean f(int i, int i10) {
        return (i & i10) != 0;
    }

    public a a(a aVar) {
        if (this.f6763z) {
            return clone().a(aVar);
        }
        int i = aVar.f6750a;
        if (f(aVar.f6750a, 1048576)) {
            this.B = aVar.B;
        }
        if (f(aVar.f6750a, 4)) {
            this.f6751b = aVar.f6751b;
        }
        if (f(aVar.f6750a, 8)) {
            this.f6752c = aVar.f6752c;
        }
        if (f(aVar.f6750a, 16)) {
            this.f6750a &= -33;
        }
        if (f(aVar.f6750a, 32)) {
            this.f6750a &= -17;
        }
        if (f(aVar.f6750a, 64)) {
            this.f6753d = 0;
            this.f6750a &= -129;
        }
        if (f(aVar.f6750a, 128)) {
            this.f6753d = aVar.f6753d;
            this.f6750a &= -65;
        }
        if (f(aVar.f6750a, 256)) {
            this.e = aVar.e;
        }
        if (f(aVar.f6750a, 512)) {
            this.f6755r = aVar.f6755r;
            this.f6754f = aVar.f6754f;
        }
        if (f(aVar.f6750a, 1024)) {
            this.f6756s = aVar.f6756s;
        }
        if (f(aVar.f6750a, 4096)) {
            this.f6760w = aVar.f6760w;
        }
        if (f(aVar.f6750a, 8192)) {
            this.f6750a &= -16385;
        }
        if (f(aVar.f6750a, 16384)) {
            this.f6750a &= -8193;
        }
        if (f(aVar.f6750a, 32768)) {
            this.f6762y = aVar.f6762y;
        }
        if (f(aVar.f6750a, 131072)) {
            this.f6757t = aVar.f6757t;
        }
        if (f(aVar.f6750a, 2048)) {
            this.f6759v.putAll(aVar.f6759v);
            this.A = aVar.A;
        }
        this.f6750a |= aVar.f6750a;
        this.f6758u.f8852b.g(aVar.f6758u.f8852b);
        l();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            i iVar = new i();
            aVar.f6758u = iVar;
            iVar.f8852b.g(this.f6758u.f8852b);
            p4.c cVar = new p4.c(0);
            aVar.f6759v = cVar;
            cVar.putAll(this.f6759v);
            aVar.f6761x = false;
            aVar.f6763z = false;
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final a c(Class cls) {
        if (this.f6763z) {
            return clone().c(cls);
        }
        this.f6760w = cls;
        this.f6750a |= 4096;
        l();
        return this;
    }

    public final a d(j jVar) {
        if (this.f6763z) {
            return clone().d(jVar);
        }
        this.f6751b = jVar;
        this.f6750a |= 4;
        l();
        return this;
    }

    public final boolean e(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = n.f7811a;
        return this.f6753d == aVar.f6753d && this.e == aVar.e && this.f6754f == aVar.f6754f && this.f6755r == aVar.f6755r && this.f6757t == aVar.f6757t && this.f6751b.equals(aVar.f6751b) && this.f6752c == aVar.f6752c && this.f6758u.equals(aVar.f6758u) && this.f6759v.equals(aVar.f6759v) && this.f6760w.equals(aVar.f6760w) && this.f6756s.equals(aVar.f6756s) && n.b(this.f6762y, aVar.f6762y);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return e((a) obj);
        }
        return false;
    }

    public final a g(m mVar, d4.d dVar) {
        if (this.f6763z) {
            return clone().g(mVar, dVar);
        }
        m(m.f2886g, mVar);
        return s(dVar, false);
    }

    public final a h(int i, int i10) {
        if (this.f6763z) {
            return clone().h(i, i10);
        }
        this.f6755r = i;
        this.f6754f = i10;
        this.f6750a |= 512;
        l();
        return this;
    }

    public int hashCode() {
        char[] cArr = n.f7811a;
        return n.h(n.h(n.h(n.h(n.h(n.h(n.h(n.g(0, n.g(0, n.g(1, n.g(this.f6757t ? 1 : 0, n.g(this.f6755r, n.g(this.f6754f, n.g(this.e ? 1 : 0, n.h(n.g(0, n.h(n.g(this.f6753d, n.h(n.g(0, n.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f6751b), this.f6752c), this.f6758u), this.f6759v), this.f6760w), this.f6756s), this.f6762y);
    }

    public final a i() {
        if (this.f6763z) {
            return clone().i();
        }
        this.f6753d = R.drawable.ic_profile_placeholder;
        this.f6750a = (this.f6750a | 128) & (-65);
        l();
        return this;
    }

    public final a j() {
        if (this.f6763z) {
            return clone().j();
        }
        this.f6752c = com.bumptech.glide.f.f1865d;
        this.f6750a |= 8;
        l();
        return this;
    }

    public final a k(h hVar) {
        if (this.f6763z) {
            return clone().k(hVar);
        }
        this.f6758u.f8852b.remove(hVar);
        l();
        return this;
    }

    public final void l() {
        if (this.f6761x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a m(h hVar, Object obj) {
        if (this.f6763z) {
            return clone().m(hVar, obj);
        }
        p4.f.b(hVar);
        p4.f.b(obj);
        this.f6758u.f8852b.put(hVar, obj);
        l();
        return this;
    }

    public final a n(u3.f fVar) {
        if (this.f6763z) {
            return clone().n(fVar);
        }
        this.f6756s = fVar;
        this.f6750a |= 1024;
        l();
        return this;
    }

    public final a o() {
        if (this.f6763z) {
            return clone().o();
        }
        this.e = false;
        this.f6750a |= 256;
        l();
        return this;
    }

    public final a p(Resources.Theme theme) {
        if (this.f6763z) {
            return clone().p(theme);
        }
        this.f6762y = theme;
        if (theme != null) {
            this.f6750a |= 32768;
            return m(f4.e.f3594b, theme);
        }
        this.f6750a &= -32769;
        return k(f4.e.f3594b);
    }

    public final a q(d4.i iVar) {
        m mVar = m.f2883c;
        if (this.f6763z) {
            return clone().q(iVar);
        }
        m(m.f2886g, mVar);
        return s(iVar, true);
    }

    public final a r(Class cls, u3.m mVar, boolean z4) {
        if (this.f6763z) {
            return clone().r(cls, mVar, z4);
        }
        p4.f.b(mVar);
        this.f6759v.put(cls, mVar);
        int i = this.f6750a;
        this.f6750a = 67584 | i;
        this.A = false;
        if (z4) {
            this.f6750a = i | 198656;
            this.f6757t = true;
        }
        l();
        return this;
    }

    public final a s(u3.m mVar, boolean z4) {
        if (this.f6763z) {
            return clone().s(mVar, z4);
        }
        r rVar = new r(mVar, z4);
        r(Bitmap.class, mVar, z4);
        r(Drawable.class, rVar, z4);
        r(BitmapDrawable.class, rVar, z4);
        r(h4.c.class, new h4.d(mVar), z4);
        l();
        return this;
    }

    public final a t() {
        if (this.f6763z) {
            return clone().t();
        }
        this.B = true;
        this.f6750a |= 1048576;
        l();
        return this;
    }
}
