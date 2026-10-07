package x3;

import android.graphics.Bitmap;
import p4.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f10286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.Config f10288c;

    public j(e eVar) {
        this.f10286a = eVar;
    }

    @Override // x3.h
    public final void a() {
        this.f10286a.b(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f10287b == jVar.f10287b && n.b(this.f10288c, jVar.f10288c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f10287b * 31;
        Bitmap.Config config = this.f10288c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return k.c(this.f10287b, this.f10288c);
    }
}
