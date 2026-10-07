package l4;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f f6794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f6795d;
    public int e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6796f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6797g;

    public g(Object obj, d dVar) {
        this.f6793b = obj;
        this.f6792a = dVar;
    }

    @Override // l4.d, l4.c
    public final boolean a() {
        boolean z4;
        synchronized (this.f6793b) {
            try {
                z4 = this.f6795d.a() || this.f6794c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // l4.c
    public final boolean b(c cVar) {
        if (!(cVar instanceof g)) {
            return false;
        }
        g gVar = (g) cVar;
        if (this.f6794c == null) {
            if (gVar.f6794c != null) {
                return false;
            }
        } else if (!this.f6794c.b(gVar.f6794c)) {
            return false;
        }
        if (this.f6795d == null) {
            return gVar.f6795d == null;
        }
        return this.f6795d.b(gVar.f6795d);
    }

    @Override // l4.c
    public final void c() {
        synchronized (this.f6793b) {
            try {
                if (!v.c(this.f6796f)) {
                    this.f6796f = 2;
                    this.f6795d.c();
                }
                if (!v.c(this.e)) {
                    this.e = 2;
                    this.f6794c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l4.c
    public final void clear() {
        synchronized (this.f6793b) {
            this.f6797g = false;
            this.e = 3;
            this.f6796f = 3;
            this.f6795d.clear();
            this.f6794c.clear();
        }
    }

    @Override // l4.d
    public final void d(c cVar) {
        synchronized (this.f6793b) {
            try {
                if (!cVar.equals(this.f6794c)) {
                    this.f6796f = 5;
                    return;
                }
                this.e = 5;
                d dVar = this.f6792a;
                if (dVar != null) {
                    dVar.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l4.d
    public final boolean e(c cVar) {
        boolean z4;
        synchronized (this.f6793b) {
            try {
                d dVar = this.f6792a;
                z4 = (dVar == null || dVar.e(this)) && cVar.equals(this.f6794c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // l4.d
    public final boolean f(c cVar) {
        boolean z4;
        synchronized (this.f6793b) {
            try {
                d dVar = this.f6792a;
                z4 = (dVar == null || dVar.f(this)) && (cVar.equals(this.f6794c) || this.e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // l4.c
    public final boolean g() {
        boolean z4;
        synchronized (this.f6793b) {
            z4 = this.e == 3;
        }
        return z4;
    }

    @Override // l4.d
    public final d getRoot() {
        d root;
        synchronized (this.f6793b) {
            try {
                d dVar = this.f6792a;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // l4.c
    public final void h() {
        synchronized (this.f6793b) {
            try {
                this.f6797g = true;
                try {
                    if (this.e != 4 && this.f6796f != 1) {
                        this.f6796f = 1;
                        this.f6795d.h();
                    }
                    if (this.f6797g && this.e != 1) {
                        this.e = 1;
                        this.f6794c.h();
                    }
                    this.f6797g = false;
                } catch (Throwable th) {
                    this.f6797g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l4.d
    public final boolean i(c cVar) {
        boolean z4;
        synchronized (this.f6793b) {
            try {
                d dVar = this.f6792a;
                z4 = (dVar == null || dVar.i(this)) && cVar.equals(this.f6794c) && this.e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // l4.c
    public final boolean isRunning() {
        boolean z4;
        synchronized (this.f6793b) {
            z4 = true;
            if (this.e != 1) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // l4.c
    public final boolean j() {
        boolean z4;
        synchronized (this.f6793b) {
            z4 = this.e == 4;
        }
        return z4;
    }

    @Override // l4.d
    public final void k(c cVar) {
        synchronized (this.f6793b) {
            try {
                if (cVar.equals(this.f6795d)) {
                    this.f6796f = 4;
                    return;
                }
                this.e = 4;
                d dVar = this.f6792a;
                if (dVar != null) {
                    dVar.k(this);
                }
                if (!v.c(this.f6796f)) {
                    this.f6795d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
