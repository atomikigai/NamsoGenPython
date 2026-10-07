package l4;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f6765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f6766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f6767d;
    public int e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6768f = 3;

    public b(Object obj, d dVar) {
        this.f6764a = obj;
        this.f6765b = dVar;
    }

    @Override // l4.d, l4.c
    public final boolean a() {
        boolean z4;
        synchronized (this.f6764a) {
            try {
                z4 = this.f6766c.a() || this.f6767d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // l4.c
    public final boolean b(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f6766c.b(bVar.f6766c) && this.f6767d.b(bVar.f6767d)) {
                return true;
            }
        }
        return false;
    }

    @Override // l4.c
    public final void c() {
        synchronized (this.f6764a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.f6766c.c();
                }
                if (this.f6768f == 1) {
                    this.f6768f = 2;
                    this.f6767d.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l4.c
    public final void clear() {
        synchronized (this.f6764a) {
            try {
                this.e = 3;
                this.f6766c.clear();
                if (this.f6768f != 3) {
                    this.f6768f = 3;
                    this.f6767d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l4.d
    public final void d(c cVar) {
        synchronized (this.f6764a) {
            try {
                if (cVar.equals(this.f6767d)) {
                    this.f6768f = 5;
                    d dVar = this.f6765b;
                    if (dVar != null) {
                        dVar.d(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f6768f != 1) {
                    this.f6768f = 1;
                    this.f6767d.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l4.d
    public final boolean e(c cVar) {
        boolean z4;
        boolean zEquals;
        int i;
        synchronized (this.f6764a) {
            d dVar = this.f6765b;
            z4 = false;
            if (dVar == null || dVar.e(this)) {
                if (this.e != 5) {
                    zEquals = cVar.equals(this.f6766c);
                } else {
                    zEquals = cVar.equals(this.f6767d) && ((i = this.f6768f) == 4 || i == 5);
                }
                if (zEquals) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    @Override // l4.d
    public final boolean f(c cVar) {
        boolean z4;
        synchronized (this.f6764a) {
            d dVar = this.f6765b;
            z4 = dVar == null || dVar.f(this);
        }
        return z4;
    }

    @Override // l4.c
    public final boolean g() {
        boolean z4;
        synchronized (this.f6764a) {
            try {
                z4 = this.e == 3 && this.f6768f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // l4.d
    public final d getRoot() {
        d root;
        synchronized (this.f6764a) {
            try {
                d dVar = this.f6765b;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // l4.c
    public final void h() {
        synchronized (this.f6764a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.f6766c.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l4.d
    public final boolean i(c cVar) {
        boolean z4;
        synchronized (this.f6764a) {
            d dVar = this.f6765b;
            z4 = (dVar == null || dVar.i(this)) && cVar.equals(this.f6766c);
        }
        return z4;
    }

    @Override // l4.c
    public final boolean isRunning() {
        boolean z4;
        synchronized (this.f6764a) {
            try {
                z4 = true;
                if (this.e != 1 && this.f6768f != 1) {
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // l4.c
    public final boolean j() {
        boolean z4;
        synchronized (this.f6764a) {
            try {
                z4 = this.e == 4 || this.f6768f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    @Override // l4.d
    public final void k(c cVar) {
        synchronized (this.f6764a) {
            try {
                if (cVar.equals(this.f6766c)) {
                    this.e = 4;
                } else if (cVar.equals(this.f6767d)) {
                    this.f6768f = 4;
                }
                d dVar = this.f6765b;
                if (dVar != null) {
                    dVar.k(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
