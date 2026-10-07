package androidx.activity;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f417a = new y();

    public final OnBackInvokedCallback a(ic.l lVar, ic.l lVar2, ic.a aVar, ic.a aVar2) {
        jc.i.e(lVar, "onBackStarted");
        jc.i.e(lVar2, "onBackProgressed");
        jc.i.e(aVar, "onBackInvoked");
        jc.i.e(aVar2, "onBackCancelled");
        return new x(lVar, lVar2, aVar, aVar2);
    }
}
