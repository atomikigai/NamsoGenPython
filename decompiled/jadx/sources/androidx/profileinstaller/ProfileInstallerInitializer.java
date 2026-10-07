package androidx.profileinstaller;

import android.content.Context;
import g.i;
import java.util.Collections;
import java.util.List;
import k2.b;
import r7.k;
import v1.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // k2.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // k2.b
    public final Object b(Context context) {
        h.a(new i(this, context.getApplicationContext()));
        return new k();
    }
}
