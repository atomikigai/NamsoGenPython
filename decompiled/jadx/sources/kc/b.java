package kc;

import com.google.android.gms.common.api.internal.c1;
import java.util.Random;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f6205c = new c1(2);

    @Override // kc.a
    public final Random f() {
        Object obj = this.f6205c.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
