package z2;

import android.os.Build;
import c3.i;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public static final String e = m.f("NetworkMeteredCtrlr");

    @Override // z2.c
    public final boolean a(i iVar) {
        return iVar.f1750j.f8532a == 5;
    }

    @Override // z2.c
    public final boolean b(Object obj) {
        y2.a aVar = (y2.a) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (aVar.f10537a && aVar.f10539c) ? false : true;
        }
        m.d().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !aVar.f10537a;
    }
}
