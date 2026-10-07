package r1;

import a2.e;
import a2.g;
import a2.x;
import android.net.Uri;
import android.view.InputEvent;
import jc.i;
import rc.b0;
import rc.k0;
import t1.c;
import t1.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.b f8122a;

    public a(t1.b bVar) {
        this.f8122a = bVar;
    }

    @Override // r1.b
    public m9.a b(Uri uri, InputEvent inputEvent) {
        i.e(uri, "attributionSource");
        return p3.a.c(b0.d(b0.b(k0.f8292a), new e(this, uri, inputEvent, null, 9)));
    }

    public m9.a c(t1.a aVar) {
        i.e(aVar, "deletionRequest");
        throw null;
    }

    public m9.a d() {
        return p3.a.c(b0.d(b0.b(k0.f8292a), new x(this, null, 4)));
    }

    public m9.a e(Uri uri) {
        i.e(uri, "trigger");
        return p3.a.c(b0.d(b0.b(k0.f8292a), new g(this, uri, null, 21)));
    }

    public m9.a f(c cVar) {
        i.e(cVar, "request");
        throw null;
    }

    public m9.a g(d dVar) {
        i.e(dVar, "request");
        throw null;
    }
}
