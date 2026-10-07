package jb;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import x9.q;
import x9.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements x9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f5755b;

    public /* synthetic */ l(q qVar, int i) {
        this.f5754a = i;
        this.f5755b = qVar;
    }

    @Override // x9.e
    public final Object d(s sVar) {
        switch (this.f5754a) {
            case 0:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f5755b, sVar);
            default:
                return new wa.c((Context) sVar.a(Context.class), ((n9.g) sVar.a(n9.g.class)).f(), sVar.b(q.a(wa.d.class)), sVar.d(ib.b.class), (Executor) sVar.f(this.f5755b));
        }
    }
}
