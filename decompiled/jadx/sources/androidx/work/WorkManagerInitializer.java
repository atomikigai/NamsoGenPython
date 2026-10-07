package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import k2.b;
import r7.i;
import t2.m;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1242a = m.f("WrkMgrInitializer");

    @Override // k2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // k2.b
    public final Object b(Context context) {
        m.d().a(f1242a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        j.T(context, new t2.b(new i()));
        return j.S(context);
    }
}
