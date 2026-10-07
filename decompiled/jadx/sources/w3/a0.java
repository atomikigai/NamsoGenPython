package w3;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements f, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f9481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f9482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f9483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f9484d;
    public volatile Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile a4.w f9485f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile d f9486r;

    public a0(g gVar, h hVar) {
        this.f9481a = gVar;
        this.f9482b = hVar;
    }

    @Override // w3.e
    public final void a(u3.f fVar, Exception exc, com.bumptech.glide.load.data.e eVar, int i) {
        this.f9482b.a(fVar, exc, eVar, this.f9485f.f182c.d());
    }

    @Override // w3.e
    public final void b(u3.f fVar, Object obj, com.bumptech.glide.load.data.e eVar, int i, u3.f fVar2) {
        this.f9482b.b(fVar, obj, eVar, this.f9485f.f182c.d(), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // w3.f
    public final boolean c() {
        boolean z4;
        if (this.e == null) {
            if (this.f9484d != null) {
            }
            this.f9484d = null;
            this.f9485f = null;
            z4 = false;
            while (!z4) {
                ArrayList arrayListB = this.f9481a.b();
                int i = this.f9483c;
                this.f9483c = i + 1;
                this.f9485f = (a4.w) arrayListB.get(i);
                if (this.f9485f == null) {
                }
            }
            return z4;
        }
        Object obj = this.e;
        this.e = null;
        try {
            if (d(obj)) {
                if (this.f9484d != null || !this.f9484d.c()) {
                    this.f9484d = null;
                    this.f9485f = null;
                    z4 = false;
                    while (!z4 && this.f9483c < this.f9481a.b().size()) {
                        ArrayList arrayListB2 = this.f9481a.b();
                        int i10 = this.f9483c;
                        this.f9483c = i10 + 1;
                        this.f9485f = (a4.w) arrayListB2.get(i10);
                        if (this.f9485f == null && (this.f9481a.f9509p.a(this.f9485f.f182c.d()) || this.f9481a.c(this.f9485f.f182c.a()) != null)) {
                            this.f9485f.f182c.e(this.f9481a.f9508o, new s5.j(this, this.f9485f, 5, false));
                            z4 = true;
                        }
                    }
                    return z4;
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
            }
        }
        return true;
    }

    @Override // w3.f
    public final void cancel() {
        a4.w wVar = this.f9485f;
        if (wVar != null) {
            wVar.f182c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th;
        int i = p4.h.f7800b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z4 = false;
        try {
            com.bumptech.glide.load.data.g gVarG = this.f9481a.f9499c.a().g(obj);
            Object objF = gVarG.f();
            u3.c cVarD = this.f9481a.d(objF);
            q5.d dVar = new q5.d(cVarD, objF, this.f9481a.i);
            u3.f fVar = this.f9485f.f180a;
            g gVar = this.f9481a;
            d dVar2 = new d(fVar, gVar.f9507n);
            y3.a aVarA = gVar.h.a();
            aVarA.b(dVar2, dVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar2 + ", data: " + obj + ", encoder: " + cVarD + ", duration: " + p4.h.a(jElapsedRealtimeNanos));
            }
            if (aVarA.i(dVar2) != null) {
                this.f9486r = dVar2;
                this.f9484d = new c(Collections.singletonList(this.f9485f.f180a), this.f9481a, this);
                this.f9485f.f182c.c();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f9486r + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f9482b.b(this.f9485f.f180a, gVarG.f(), this.f9485f.f182c, this.f9485f.f182c.d(), this.f9485f.f180a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z4 = true;
                if (z4) {
                    throw th;
                }
                this.f9485f.f182c.c();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
