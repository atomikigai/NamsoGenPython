package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic.l f413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.l f414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f416d;

    public x(ic.l lVar, ic.l lVar2, ic.a aVar, ic.a aVar2) {
        this.f413a = lVar;
        this.f414b = lVar2;
        this.f415c = aVar;
        this.f416d = aVar2;
    }

    public final void onBackCancelled() {
        this.f416d.a();
    }

    public final void onBackInvoked() {
        this.f415c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        jc.i.e(backEvent, "backEvent");
        this.f414b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        jc.i.e(backEvent, "backEvent");
        this.f413a.invoke(new b(backEvent));
    }
}
