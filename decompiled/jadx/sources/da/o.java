package da;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3123b;

    public o(p pVar, long j4) {
        this.f3123b = pVar;
        this.f3122a = j4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f3122a);
        this.f3123b.f3132k.p(bundle);
        return null;
    }
}
