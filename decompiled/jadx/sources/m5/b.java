package m5;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.a f7063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u5.a f7064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7065d;

    public b(Context context, u5.a aVar, u5.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f7062a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f7063b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f7064c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f7065d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f7062a.equals(bVar.f7062a) && this.f7063b.equals(bVar.f7063b) && this.f7064c.equals(bVar.f7064c) && this.f7065d.equals(bVar.f7065d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f7062a.hashCode() ^ 1000003) * 1000003) ^ this.f7063b.hashCode()) * 1000003) ^ this.f7064c.hashCode()) * 1000003) ^ this.f7065d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f7062a);
        sb2.append(", wallClock=");
        sb2.append(this.f7063b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f7064c);
        sb2.append(", backendName=");
        return q1.a.m(sb2, this.f7065d, "}");
    }
}
