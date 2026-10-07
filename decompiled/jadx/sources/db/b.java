package db;

import aa.c;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3177a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return i0.m(this.f3177a, ((b) obj).f3177a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3177a});
    }

    public final String toString() {
        c cVar = new c(this);
        cVar.b(this.f3177a, "token");
        return cVar.toString();
    }
}
