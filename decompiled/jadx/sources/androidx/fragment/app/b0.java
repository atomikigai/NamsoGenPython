package androidx.fragment.app;

import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jc.h f849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f850d;
    public final /* synthetic */ Object e;

    public b0(boolean z4) {
        this.f847a = z4;
        this.f848b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ic.a, jc.h] */
    public final void a(boolean z4) {
        this.f847a = z4;
        ?? r10 = this.f849c;
        if (r10 != 0) {
            r10.a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(ProfileViewerActivity profileViewerActivity) {
        this(true);
        this.f850d = 2;
        this.e = profileViewerActivity;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(l3.t tVar, boolean z4) {
        this(z4);
        this.f850d = 1;
        this.e = tVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(i0 i0Var) {
        this(false);
        this.f850d = 0;
        this.e = i0Var;
    }
}
